package br.com.calculator.controller;

import br.com.calculator.main.ArrestCalculator;
import br.com.calculator.model.Crime;
import br.com.calculator.parser.XMLManager;
import br.com.calculator.view.CriarCrime;
import br.com.calculator.view.EditarCrime;
import br.com.calculator.view.EditarCrimes;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class CrimeController {
    public static void loadCrimes() throws SAXException, IOException, ParserConfigurationException{
        ArrestCalculator.setCrimes(new ArrayList<>());
        
        XMLManager xmlm = new XMLManager(new File("C:\\temp\\crimes.xml"));
        
        Element raiz = xmlm.getDoc().getDocumentElement();
        
        NodeList crimes = raiz.getElementsByTagName("crime");
        for (int i = 0; i < crimes.getLength(); i++) {
            Element currentNode = (Element)crimes.item(i);
            if(currentNode.getNodeType() == Node.ELEMENT_NODE) {            
                Crime c = xmlm.parseCrime(currentNode);
                ArrestCalculator.addCrime(c);
            }
        }
    }
    
    public static int calculateTotalTime(JCheckBox[] checkBoxList, Crime[] crimeCorrespondente){  
        int total = 0;
        for(int i = 0; i < checkBoxList.length; i++){
            if(checkBoxList[i].isSelected()){
                total += crimeCorrespondente[i].getTempo();
            }
        }        
        return total;
    }

    public static void resetarCrimes(JCheckBox[] checkBoxList) {
        for(int i = 0; i < checkBoxList.length; i++){
            checkBoxList[i].setSelected(false);
        }
    }

    public static void telaEditarCrimes() {
        EditarCrimes editarCrimes = new EditarCrimes(); 
    }

    public static Crime findCrimeByFormattedName(String name) {
        Crime c = null;
        List<Crime> crimes = ArrestCalculator.getCrimes();
        
        for (Crime crime : crimes) {
            String toCheck = crime.getArtigo() + " - " + crime.getNome();
            if(toCheck.equals(name)){
                c = crime;
            }
        }
        return c;
    }
    
    public static Crime findCrimeByName(String name) {
        Crime c = null;
        List<Crime> crimes = ArrestCalculator.getCrimes();
        
        for (Crime crime : crimes) {            
            if(crime.getNome().equals(name)){
                c = crime;
            }
        }
        return c;
    }
    
    public static Crime findCrimeByArtigo(String artigo) {
        Crime c = null;
        List<Crime> crimes = ArrestCalculator.getCrimes();
        
        for (Crime crime : crimes) {            
            if(crime.getArtigo().equals(artigo)){
                c = crime;
            }
        }
        return c;
    }

    public static void telaEditarCrime(Crime selecionado) {
        EditarCrime editarCrime = new EditarCrime(selecionado);  
    }
    
    public static void telaCriarCrime() {        
        CriarCrime criarCrime = new CriarCrime();  
    }
}
