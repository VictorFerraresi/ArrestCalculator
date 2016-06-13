package br.com.calculator.model;


public class Crime{
    private String artigo;
    private String nome; 
    private int tempo;
    private Natureza natureza;

    //Construtores
    public Crime() {
    }

    public Crime(String artigo, String nome, int tempo, Natureza natureza) {
        this.artigo = artigo;
        this.nome = nome;
        this.tempo = tempo;
        this.natureza = natureza;
    }        
    
    //Getters e Setters
    public String getArtigo() { return artigo; }   
    public void setArtigo(String artigo) { this.artigo = artigo; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getTempo() { return tempo; }
    public void setTempo(int tempo) { this.tempo = tempo; }
    public Natureza getNatureza() { return natureza; }
    public void setNatureza(Natureza natureza) { this.natureza = natureza; }

    
    //Métodos Sobrecarregados

    @Override
    public String toString() {
        return "Crime{" + "artigo=" + artigo + ", nome=" + nome + ", tempo=" + tempo + ", natureza=" + natureza + '}';
    }    
        
}
