import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //fazer gerador de numeros aleatorios
    //Lista de jogos,seu preços e se sao antigos ou nao(perguntar o ano de lançamento do jogo
    //Calculadora
    public static void main(String[] args) {
        //o valor retornado pelo método não está sendo armazenado ou utilizado de alguma forma.
        // Se você quiser usar o número gerado, você pode atribuir o resultado a uma variável.
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lnumeros = new ArrayList<>();
        Random rnd = new Random();
        int escolha = scan.nextInt();
        switch (escolha){
                case 1:
                  System.out.println("Quantos numeros voce quer sortear?");
                  int nsorteado = scan.nextInt();
                  for(int i = 0; i < nsorteado; i++){
                    int  n1sorteado = rnd.nextInt(100);
                    lnumeros.add(nsorteado);
                    //aprender a usar esse add tambem!
                    // Ele é muito útil para quando for fazer esse tipo de programa de adicionar algo!
                  }
                  System.out.println(lnumeros);
        }





    }
}