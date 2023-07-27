public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(new Ponto(0,0), 3.5);
        Circulo c2 = new Circulo(new Ponto(1,1), 4);
        double area = c.calcularArea();
        double perimetro = c.calcularPerimetro();
        System.out.println(area);
        System.out.println(perimetro);
        System.out.println(Circulo.interceptam(c, c2));
    }
}
