package listaex2;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author 60000092
 */
public class ListaEx2 {

    static Scanner scanner = new Scanner(System.in);
    static Calendar calendar = Calendar.getInstance();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ex4
        PizzaCalculator();
        //ex3  
        pagamento();
        //ex2
        Peso();
        //ex1
        aparecerMes();

    }

    private static void aparecerMes() {
        int numberMes;
        int numberMesAtual = (calendar.get(Calendar.MONTH) + 1);

        System.out.println("informe o numero do mes: ");
        numberMes = scanner.nextInt();

        if (numberMes > 0 || numberMes < 13) {
            if (numberMes == numberMesAtual) {
                System.out.println(numberMesAtual + "E o mes atual");
            } else if (numberMes < numberMesAtual) {
                System.out.println("Mes ja passou");
            } else {
                System.out.println("Mes futuro");
            }
        } else {
            System.out.println("valor invalido");
        }
    }

    private static void Peso() {
        float peso, altura;
        String sexo, H, M;
        float resultado;
        System.out.println("informe a altura do usuario: ");
        altura = scanner.nextFloat();

        System.out.println("informe o peso do usuario: ");
        peso = scanner.nextFloat();

        System.out.println("informe o sexo: ");
        sexo = scanner.next();

        if (!"H".equals(sexo)) {
            resultado = (float) ((72.7 * altura) - 58);
            System.out.println(resultado);
        } else if (!"M".equals(sexo)) {
            resultado = (float) ((62.1 * altura) - 44.7);
            System.out.println(resultado);
        } else {
            System.out.println("opcao invalida");
        }

    }

    private static void pagamento() {
        float valor = 200.50f;
        int opcoes;
        
        System.out.println(" 1 - A vista com 10% de desconto\n"
                + "2 - A prazo, 1 parcela  com 8% de desconto\n"
                + "3 - A prazo, 5 parcelas sem desconto ou acréscimos\n"
                + "4 - A prazo, 10 parcelas com acréscimo  de 5% no valor total. \nescolha uma opção");
        
        opcoes = scanner.nextInt();

        float resultado;

        switch (opcoes) {
            case 1: 
                resultado = (valor - (valor * 10 )/100);
                System.out.println("valor com 10% de desconto e: " + resultado);
            case 2:
                resultado = (valor - (valor * 8)/100);
                System.out.println("valor A prazo, 1 parcela 8% de desconto " + resultado);
            case 3:
                resultado = (valor / 5);
                System.out.println("A prazo, 5 parcelas sem desconto ou acréscimos " + resultado);
            case 4:
                resultado = ((valor + (valor * 5)/100 )/10);
                System.out.println("A prazo, 10 parcelas com acréscimo  de 5%" + resultado);
                break; 
            default:
                System.out.println("opcao invalida burro");
        }

    }
    private static void PizzaCalculator(){

        System.out.print("Digite a quantidade de pessoas: ");
        int quantidadePessoas = scanner.nextInt();

        System.out.print("Digite o tamanho da pizza (broto, pequena, média, grande): ");
        String tamanhoPizza = scanner.next().toLowerCase();


        int pessoasPorPizza;
        switch (tamanhoPizza) {
            case "broto":
                pessoasPorPizza = 1;
                break;
            case "pequena":
                pessoasPorPizza = 2;
                break;
            case "media":
                pessoasPorPizza = 3;
                break;
            case "grande":
                pessoasPorPizza = 4;
                break;
            default:
                System.out.println("Tamanho de pizza inválido.");
                return;
        }

        int quantidadePizzas = (int) Math.ceil((double) quantidadePessoas / pessoasPorPizza);

        System.out.println("Você precisará de " + quantidadePizzas + " pizzas de tamanho " + tamanhoPizza + ".");
    }
}

