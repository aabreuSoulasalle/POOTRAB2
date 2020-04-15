package trabalhopoo;

/**
 *
 * @author Abner
 */
public class Time {
    private String nome;
    private int qtdVitorias;
    private int qtdEmpates;
    private int qtdDerrotas;
    private int pontos;
    
    public Time(){
        this.pontos = 0;
        this.qtdDerrotas = 0;
        this.qtdEmpates = 0;
        this.qtdVitorias = 0;
    }
    
    public void listar(){
        System.out.println("Status");
        System.out.println("Time: " +this.getNome());
        System.out.println("Vitorias: " +this.getQtdVitorias());
        System.out.println("Empates: " +this.getQtdEmpates());
        System.out.println("Vitorias: " +this.getQtdDerrotas());
        System.out.println("Pontos: " +this.getPontos());
    }
    public void vitoria(){
        this.setPontos(3);
        this.setQtdVitorias(1);
    }
    public void derrota(){
        this.setPontos(0);
        this.setQtdDerrotas(1);
    }
    public void empate(){
        this.setPontos(1);
        this.setQtdEmpates(1);
    }
    
    
    /*-------------Getter and Setter--------------*/
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return this.pontos;
    }
    public void setPontos(int Pontos) {
        this.pontos = Pontos;
    }

    public int getQtdDerrotas() {
        return this.qtdDerrotas;
    }
    public void setQtdDerrotas(int qtdDerrotas) {
        this.qtdDerrotas = qtdDerrotas;
    }

    public int getQtdEmpates() {
        return this.qtdEmpates;
    }
    public void setQtdEmpates(int qtdEmpates) {
        this.qtdEmpates = qtdEmpates;
    }

    public int getQtdVitorias() {
        return this.qtdVitorias;
    }

    public void setQtdVitorias(int qtdVitorias) {
        this.qtdVitorias = qtdVitorias;
    }
      
}
