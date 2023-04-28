
import java.util.Random;
import java.util.Scanner;

public class VoadoresMain {

    public static RepositorioDeVoadores voadores = new RepositorioDeVoadores();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        for(int i = 0; i < 10; i++){
            int aleatorio = r.nextInt(4);
            switch(aleatorio){
                case 0:
                    voadores.adicionaVoador(new GalinhaVoadora());
                    break;
                case 1:
                    System.out.println("Digite a gasolina inicial!");
                    double gasosa = Double.parseDouble(scan.nextLine());
                    voadores.adicionaVoador(new Aviao(gasosa));
                    break;
                case 2:
                    System.out.println("Digite o tipo do drone:");
                    String tipo = scan.nextLine();
                    voadores.adicionaVoador(new Drone(tipo));
                    break;
                case 3:
                    System.out.println("Digite a cor da Líbelula:");
                    String cor = scan.nextLine();
                    voadores.adicionaVoador(new Libelula(cor));
                    break;
            }
            //=> Chamadas Polimórficas
            voadores.getVoador(i).voar();
            voadores.getVoador(i).planar();
            voadores.getVoador(i).pousar();
        }

    }

}