package br.com.calculator.main;

import br.com.calculator.controller.CrimeController;
import br.com.calculator.model.Crime;
import br.com.calculator.view.MenuPrincipal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class ArrestCalculator {
    private static List<Crime> crimes;
    
    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {     
        crimes = new ArrayList<>();
        CrimeController.loadCrimes();
        
        iniciaMenuPrincipal();
    }

    public static List<Crime> getCrimes() { return ArrestCalculator.crimes; }
    public static void setCrimes(List<Crime> crimes) { ArrestCalculator.crimes = crimes; } 
    public static void addCrime(Crime c) { ArrestCalculator.crimes.add(c); }
    public static void removeCrime(Crime c){ ArrestCalculator.crimes.remove(c); }

    public static void iniciaMenuPrincipal() {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
    }
}
