public class Percurso {
    private String caminho;

    public Percurso(String caminho){
        setCaminho(caminho);
    }
    public String getCaminho(){
        return caminho;
    }

    public boolean setCaminho(String caminho){
        caminho = caminho.trim().toUpperCase();
        if (caminho.matches("[CB]+")){
            this.caminho = caminho;
            return true;
        }
        return false;
    }

    public boolean nivelMar(){
        int altitude=0;
        for (char passo : caminho.toCharArray()){
            if (passo == 'C')
                altitude++;
            else if (passo == 'B')
                altitude--;
        }
        return altitude == 0;
    }

    public int picoMaisAlto(){
        int picoMaisAlto=0, altitude=0;
        for (char passo : caminho.toCharArray()){
            if (passo == 'C'){
                altitude++;
                if (picoMaisAlto < altitude)
                    picoMaisAlto = altitude;
            }
            else if (passo == 'B')
                altitude--;
        }

        return picoMaisAlto;
    }

    public int numeroPicos(){
        int numeroPicos=0;
        for (int i =0; i < caminho.length();i++){
            if (caminho.charAt(i) == 'C' && caminho.charAt(i+1) == 'B')
                numeroPicos++;
        }

        return numeroPicos;
    }

    public void passoPico(){
        int picos=0;
        int passos=0;

        for (int i=0; i<caminho.length();i++){
            passos++;
            if (caminho.charAt(i)== 'C' && caminho.charAt(i+1) == 'B'){
                picos++;
                System.out.println(picos+" alcançado no passo "+ passos);
            }
        }
    }
}
