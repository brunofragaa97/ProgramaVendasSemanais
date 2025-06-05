
import javax.swing.JOptionPane;


//Programa simples feito para aprimoramento de lógica.
//O programa coleta dados das vendas feitas para cada dia da semana, calcula a média de venda semanal,
//mostra um top ranking, mostra o melhor dia de venda, mostra o pior dia de venda, ordenação foi feita manualmente com
//o algoritmo bubble sort.

public class Main {
    public static void main(String[] args) {

        String[] diasSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"};
        double[] valores = new double [7];
        double media = 0 ;

        for(int i = 0; i < 7; i++){
            valores[i] = Double.parseDouble(JOptionPane.showInputDialog
                    ("Digite o valor das vendas de " + diasSemana[i] + ": "));
            media += valores[i];
        }
        media = media / valores.length;

               /* ordenação dos valores bubble sort */
        for(int i = 0; i < valores.length - 1; i++) {
            for(int j = 0; j < valores.length - 1 - i; j++){
                if(valores[j] < valores[j + 1]){
                    double valorTemporario = valores[j];
                    String valorTemporario2 = diasSemana[j];
                    diasSemana[j] = diasSemana[j+1];
                    diasSemana[j+1] = valorTemporario2;
                    valores[j] = valores[j+1];
                    valores[j+1] = valorTemporario;
                }
            }
        }

        System.out.println(
                "Valor da média semanal: " + media + "\n" +
                        "Melhor dia: " + diasSemana[0] + " ( " + valores[0] + " ) \n" +
                        "Pior dia: " + diasSemana[diasSemana.length-1]+ " ( " + valores[valores.length-1] + " )");

        System.out.println("\nRanking de vendas (maior para menor): " );

        System.out.println("::::::::::::::Top Ranking Vendas::::::::::::::");
        for(int i = 0; i < valores.length; i++){
            System.out.println("Dia da semana: " + diasSemana[i] + " | Valor Vendido: " + valores[i]);
        }
        }

}