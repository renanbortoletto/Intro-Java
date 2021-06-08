// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 Atributos - Caracteristicas


    // 3.2 Métodos e Funções
    public static void main(String[] args) {
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um Hardware ou Software

        // Utilizar a classe Scanner do Java para ler a escolha do usuario no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U  D E  O P Ç O E S");
        System.out.println("c - Calcular Area Modo Curto");
        System.out.println("d - Contar ate Dez");
        System.out.println("e - Calcular Area Modo Extenso");
        System.out.println("i - If Simples");
        System.out.println("r - Contagem Regressiva de 10 a 0");
        System.out.println("Digite a opcao desejada: ");
        String opcao = scanner.next();

        // Switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software

        //String opcao = "curto";

        switch (opcao) {
            case "i":
            case "I":
                System.out.println("Voce escolheu executar o metodo ifSimples");
                ifSimples();
                break;
            case "d":
            case "D":
                System.out.println("Voce escolheu executar o metodo Contar ate Dez");
                contarAteDez();
                break;
            case "c":
            case "C":
                System.out.println("Voce escolheu executar o metodo calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "e":
            case "E":
                System.out.println("Voce escolheu executar o metodo calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            case "r":
            case "R":
                System.out.println("Voce escolheu executar o metodo Contagem Regressiva");
                contagemRegressiva();
                break;
            default:
                System.out.println("Voce escolheu outro valor que nao tem uma açao associada");
                break;

        }


    }

    public static void ifSimples() {
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um Hardware ou Software

        // if = se
        // else = senao

        String modo = "curto";

        if (modo == "curto") {
            calcularAreaModoCurto();
        } else {
            calcularAreaModoExtenso();

        }



    calcularAreaModoCurto();

    calcularAreaModoExtenso();

}

    public static void calcularAreaModoCurto(){
        System.out.println("Calculo de Areas Modo Curto");

        // Calculo de area - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a area é de " + largura * comprimento + " m²");
    }

    public static void calcularAreaModoExtenso(){

        System.out.println("Calculo de Areas Modo Extenso");

        // Calculo de area - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 4
        comprimento = 6; // comprimento recebe 3

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a area é de " + resultado + " m²");
    }
public static void contarAteDez(){

        // Loops ou Repetiçoes
        // for = repeticao incondicional
        System.out.println("Contagem crescente");

        for(int numero = 1; numero <= 10; numero++){
            System.out.println(numero);
        }
}

    public static void contagemRegressiva(){
        System.out.println("Contagem Regressiva");

        for (int numero = 10; numero > -1; numero--){
            System.out.println(numero);
        }
    }
    }

