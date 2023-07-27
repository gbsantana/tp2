import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        boolean check = false;

        do {
            System.out.print("Caminho: ");
            String caminho = k.nextLine();
            Percurso c = new Percurso(caminho);
            if (!c.setCaminho(caminho))
                System.out.println("Pode colocar apenas C e B");
            else{
                if (c.nivelMar())
                    System.out.println("Link, voce retornou ao nivel do mar");
                else
                    System.out.println("Nao retornou ao nivel do Mar");
                System.out.println(c.numeroPicos()+" picos foram visitados");
                System.out.println("O ponto de altitude mais alto alcançado foi "+ c.picoMaisAlto());
                c.passoPico();
            }
        }while (!check);

    }
}
