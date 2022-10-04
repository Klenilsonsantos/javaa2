import java.util.Scanner;

public class Aula {

    public static void main( String[] args){


        Scanner scan = new Scanner(System.in);

        System.out.println("digite o seu sexo: 1 para masculino, 2 para feminino.");

        //String sexo = (scan.nextInt() == 1 ? "masculino" : "feminino"); //operador ternario
        
        int inputSexo = scan.nextInt();
        String sexo;

        switch (inputSexo) {
            case 1: {
                sexo = "masculino";
                
                break;
            }
            case 2 : {
                sexo = "femino";
                break;
            }
        
            default: sexo = "outros";
                
        }

        System.out.println("o sexo escolhido é: "+sexo);
    }
    //     System.out.println("digite a n1!");
    //     double n1 = scan.nextDouble();
    //     System.out.println("digite a n2!");
    //     double n2 = scan.nextDouble();
    //    System.out.println("digite a n3!");
    //     double n3 = scan.nextDouble();


    //     double total = n1 + n2 + n3;
    //     double media = total / 3;
        
         
    //     if(media >=70) {
    //         System.out.println("voce esta aprovado!");
    //     }else{
    //             System.out.println("voce esta de exame!");
                
    //         }
        

        
   
        // String nome = " Clenilson";
        // int idade =22;

        // System.out.println(nome);
        // // System.out.println(idade);
        // double valorA = 10.5;
        // double valorB =10.8;

        // double soma = valorA + valorB;
        // System.out.println(soma);

        // double multiplicacao = valorA * valorB;
        // // System.out.println(multiplicacao);
        // double n1 = 80;
        // double n2 = 70;
        // double n3 = 50;
    }
    

    