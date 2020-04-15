package trabalhopoo;

import java.util.Scanner;



public class TrabalhoPOO {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            
            System.out.println("Iremos iniciar a " +(i+1) +"º partida da rodada:");
            System.out.print("Digite o nome do time de casa:");
            String local = teclado.next();
            System.out.print("Agora o nome do time Visitante:");
            String visi = teclado.next();
            Partida jogo= new Partida(local,visi);
        }
                
    }
    
}
