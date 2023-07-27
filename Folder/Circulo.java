public class Circulo {
    public Ponto ponto;
    private double raio;

    //c) (1,2pt) Explique se há a necessidade de se aplicar o encapsulamento em algum atributo.
    //Se sim, crie os métodos de acesso (getter) e modificação (setter). Justifique a sua
    //resposta.
    //Setter e getter no raio, ele deve ser double. Raio deve ser maior que 0.

    public boolean setRaio(double raio){
        if (raio > 0) {
            this.raio = raio;
            return true;
        }
        return false;
    }

    public double getRaio(){
        return raio;
    }

    // d) Crie um método construtor para essa classe que inicializa seus atributos internos
    //de acordo com os parâmetros passados.
//Método construtor deve estar coerente com os atributos da classe e utilizar o setter
//para definir o raio. O raio deve estar private.
    public Circulo(Ponto ponto,double raio){
        setRaio(raio);
        this.ponto = ponto;
    }

//    e) Crie dois métodos denominados calcularArea e calcularPerimetro. Esses métodos
//são chamados através de uma instância e retornam a área e o perímetro de um círculo,
//respectivamente. A área é dada por πr^2 e o perímetro é dado por 2πr.

    public double calcularArea(){
        return 3.14 * raio * raio;
    }

    public double calcularPerimetro(){
        return 2 * 3.14 * raio;
    }


//   f) Crie um método que indique se dois círculos se interceptam, ou seja, se eles se
//“encostam” em algum ponto. O método é um método estático que recebe como argumento
//dois Círculos e retorna a variável booleana true se os círculos se interceptam ou false,
//caso contrário. A imagem abaixo mostra um exemplo onde dois círculos estão se
//interceptando.

    public static boolean interceptam(Circulo c1, Circulo c2){
            double dist = Math.sqrt(Math.pow((c2.ponto.x - c1.ponto.x), 2) + Math.pow((c2.ponto.y - c1.ponto.y), 2));
            if (dist<=c1.raio + c2.raio)
                return true;
            return false;
    }
}
