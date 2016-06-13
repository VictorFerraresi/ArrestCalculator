package br.com.calculator.parser;

import br.com.calculator.model.Crime;
import br.com.calculator.model.Natureza;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class XMLManager {
    
    private Document doc;

    public XMLManager(File file) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(file);
        } catch (SAXException | IOException | ParserConfigurationException ex) {
            Logger.getLogger(XMLManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Crime parseCrime(Element element){
        String artigo = element.getElementsByTagName("artigo").item(0).getTextContent();
        String nome = element.getElementsByTagName("nome").item(0).getTextContent();        
        int tempo = Integer.parseInt(element.getElementsByTagName("tempo").item(0).getTextContent());
        String natureza = element.getElementsByTagName("natureza").item(0).getTextContent();                  
                
        Crime c = new Crime(artigo, nome, tempo, Natureza.valueOf(natureza));
        return c;
    }
    
    public void saveCrimes(List<Crime> crimes) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document docSave = db.newDocument();
            
            Element root = docSave.createElement("crimes");
            docSave.appendChild(root);
            for (Crime c : crimes) {
                
                Element crime = docSave.createElement("crime");
                root.appendChild(crime);

                Element artigo = docSave.createElement("artigo");
                artigo.appendChild(docSave.createTextNode(String.valueOf(c.getArtigo())));
                crime.appendChild(artigo);

                Element nome = docSave.createElement("nome");
                nome.appendChild(docSave.createTextNode(String.valueOf(c.getNome())));
                crime.appendChild(nome);
                
                Element tempo = docSave.createElement("tempo");
                tempo.appendChild(docSave.createTextNode(String.valueOf(c.getTempo())));
                crime.appendChild(tempo);
                
                Element natureza = docSave.createElement("natureza");
                String naturezaStr = Natureza.toEnum(c.getNatureza().toString());
                natureza.appendChild(docSave.createTextNode(String.valueOf(naturezaStr)));
                crime.appendChild(natureza);

            }

            TransformerFactory tranFactory = TransformerFactory.newInstance();
            Transformer aTransformer = tranFactory.newTransformer();

            aTransformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            aTransformer.setOutputProperty(OutputKeys.VERSION, "1.0");

            aTransformer.setOutputProperty(
                    "{http://xml.apache.org/xslt}indent-amount", "4");
            
            aTransformer.setOutputProperty(OutputKeys.INDENT, "yes");
            
            aTransformer.setOutputProperty(OutputKeys.STANDALONE, "yes");

            DOMSource source = new DOMSource(docSave);
            try {
                FileWriter fos = new FileWriter("C:\\temp\\crimes.xml");
                StreamResult result = new StreamResult(fos);
                aTransformer.transform(source, result);

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (TransformerException ex) {
            System.out.println("Erro ao salvar o documento");
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XMLManager.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    public Document getDoc() {
        return doc;
    }        
    
}
