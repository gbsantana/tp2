public class Ponto {
    public double x;
    public double y;

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public static double Distancia(Ponto p1, Ponto p2){
        double dist = Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
        return dist;
    }

    //a) Na classe apresentada temos o uso de diversas variáveis: this.x, this.y, x, y, p1, p2
    //e dist. Classifique cada variável quanto ao seu escopo (de instância, local ou estática) e
    //quanto ao seu tipo (primitivo ou referência).

    // this.x e this.y são instância e primitivo
    // x e y são local e primitivo
    // p1 e p2 são local e referências
    // dist é local e primitivo




}
