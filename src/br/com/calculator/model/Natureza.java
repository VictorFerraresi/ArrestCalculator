package br.com.calculator.model;

public enum Natureza {
    PESSOA, PATRIMONIO, MORAL, ADMINISTRACAO, PAZ, SAUDE, DEPENDENTES, TRANSITO, ARMAS;
    
    @Override    
    public String toString() {   
        String toReturn = "NULL";
        switch(name()){
            case "PESSOA":
                toReturn =  "Dos Crimes Contra a Pessoa";
                break;       
            case "PATRIMONIO":
                toReturn =  "Dos Crimes Contra o Patrimônio";
                break;   
            case "MORAL":
                toReturn =  "Dos Crimes Contra a Dignidade Moral e Sexual";
                break;   
            case "ADMINISTRACAO":
                toReturn =  "Dos Crimes Contra a Administração Pública";
                break;   
            case "PAZ":
                toReturn =  "Dos Crimes Contra a Paz Pública";
                break;   
            case "SAUDE":
                toReturn =  "Dos Crimes Contra a Saúde Pública";
                break;
            case "DEPENDENTES":
                toReturn =  "Dos Crimes Contra Dependentes do Estado";
                break;   
            case "TRANSITO":
                toReturn =  "Dos Crimes de Trânsito";
                break;  
            case "ARMAS":
                toReturn =  "Dos Crimes de Armas de Fogo";
                break;  
        }
        
        return toReturn;
    }
    
    public static String toEnum(String toEnum){
        String toReturn = "NULL";
        switch(toEnum){
            case "Dos Crimes Contra a Pessoa":
                toReturn =  "PESSOA";
                break;       
            case "Dos Crimes Contra o Patrimônio":
                toReturn =  "PATRIMONIO";
                break;   
            case "Dos Crimes Contra a Dignidade Moral e Sexual":
                toReturn =  "MORAL";
                break;   
            case "Dos Crimes Contra a Administração Pública":
                toReturn =  "ADMINISTRACAO";
                break;   
            case "Dos Crimes Contra a Paz Pública":
                toReturn =  "PAZ";
                break;   
            case "Dos Crimes Contra a Saúde Pública":
                toReturn =  "SAUDE";
                break;
            case "Dos Crimes Contra Dependentes do Estado":
                toReturn =  "DEPENDENTES";
                break;   
            case "Dos Crimes de Trânsito":
                toReturn =  "TRANSITO";
                break;  
            case "Dos Crimes de Armas de Fogo":
                toReturn =  "ARMAS";
                break;  
        }
        
        return toReturn;
    }
}
