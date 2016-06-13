package br.com.calculator.parser;

import br.com.calculator.model.Crime;
import br.com.calculator.model.Natureza;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
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

    public Document getDoc() {
        return doc;
    }        
    
}
