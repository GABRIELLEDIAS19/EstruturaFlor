import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    //fazer um programa que lê um valor inteiro N e depois N números inteiros. 
    //Ao final, mostre a soma dos N lidos.

 
    System.out.println("Digite quantos numeros serão somados");
    
    int N = sc.nextInt();
    int soma = 0;
    for(int i = N; i > 0; i--) {
      System.out.println("O número a ser somado: ");
      int y = sc.nextInt();
      soma += y;
    }
    System.out.println("A soma dos numeros é : " + soma);


      

    //for(int i = 0;  i < 5; i++ ) {
     // System.out.println(i);
   // }

   // for(int j = 4; j >= 0; j--) {
   // System.out.println(j);
//}

    //for(início; condição; incremento) {
    // comandos
    //}
    sc.close();
  }
}