package trabalhopoo;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Abner
 */
public final class Partida{
    private String timeVisitante;
    private String timeLocal;
    private int scoreV;
    private int scoreL;
    private Date dataPartida;
    public Time tum = new Time();
    public Time tdois = new Time();
    Scanner teclado = new Scanner(System.in);
    
    public Partida(String l, String v){
        
        System.out.println("Preparando o jogo!");
        //setando o nome em cada componente
        tum.setNome(l);
        tdois.setNome(v);
        pl();//pula linha adicionando ______________________________
        tum.listar();//Status do time
        pl();//pula linha adicionando ______________________________
        tdois.listar();//Status do time
        pl();
        System.out.println("*** Pronto para iniciar a partida?");
        String t = teclado.next();
        if("".equals(t) || "sim".equals(t)){
            System.out.println("Inicio da partida");
            this.iniPartida();
            this.mostraPartida();
            this.fimPartida();
            pl();
            tum.listar();
            pl();
            tdois.listar();
            pl();
        }
        else{
            pl();
            escr("Partida Cancelada!");
        }
        
    }
    
    public void pl(){//pula linha adicionando ______________________________
           System.out.println("__________________________________________");
        
    }
    public void escr(String i){//Escreve qualquer valor em String
        System.out.println(i);
    }
    
    public void iniPartida(){//Random dos gols para cada time
        Random g = new Random();
        this.scoreL = g.nextInt(4);
        this.scoreV = g.nextInt(4);
    }
    public void mostraPartida(){//exibe o placar
        System.out.println(tum.getNome() +" " +this.scoreL +" x " +this.scoreV +" " +tdois.getNome());
    }
    public void fimPartida(){// Distribui os pontos 
        if(this.scoreL > this.scoreV){
            tum.vitoria();
            tdois.derrota();
        }else if(this.scoreL < this.scoreV){
            tdois.vitoria();
            tum.derrota();
        }else{
            tum.empate();
            tdois.empate();
        }
    }
    public int getScoreL() {
        return this.scoreL;
    }
    public void setScoreL(int scoreL) {
        this.scoreL = scoreL;
    }

    public int getScoreV() {
        return this.scoreV;
    }
    public void setScoreV(int scoreV) {
        this.scoreV = scoreV;
    }
    //------------------------------------------

  
}
