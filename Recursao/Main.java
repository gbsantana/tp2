import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        boolean check = false;

        do {
            try{
                System.out.print("N: ");
                int n = k.nextInt();
                System.out.println("A soma de "+n+" eh: "+ Recursao.soma(n));
                System.out.println("O fatorial de "+n+" eh: "+ Recursao.fatorial(n));
                System.out.println("A seguencia de Fibonacci de "+n+" eh: "+ Recursao.fibonacci(n));

                check = true;
            }catch(InputMismatchException e){
                System.out.println("Entrada invalida, precisa ser do tipo int");
                k.nextLine();
            }catch (Exception e){
                System.out.println(e.getMessage());
                k.nextLine();
            }
        }while(!check);

        k.nextLine();
        System.out.print("\nPalavra: ");
        String s = k.nextLine();
        if (Recursao.palindroma(s))
            System.out.println("Eh palindroma!");
        else
            System.out.println("Nao eh palindroma!");
    }
}
