public abstract class Cliente implements Comparable {
    private String nome;
    private String cpfCnpj;
    private Segmentos segmento;
    private boolean vendaRealizada;

    public Cliente(String cpfCnpj, Segmentos segmento, boolean vendaRealizada) {
        setCpfCnpj(cpfCnpj);
        this.segmento = segmento;
        this.vendaRealizada = vendaRealizada;
    }

    @Override
    public int compareTo(Object obj){
        Cliente c = (Cliente) obj;
        // Se o tamanho da String é menor, é um CPF. Deve vir primeiro na ordenação
        if(this.cpfCnpj.length() < c.getCpfCnpj().length()){
            return -1;
        } else if (this.cpfCnpj.length() > c.getCpfCnpj().length()) {
            return 1;
        } else { // Se eles são do mesmo tamanho, basta utilizar a comparação padrão de Strings

            return this.cpfCnpj.compareTo(c.getCpfCnpj());
        }
    }
    @Override
    public boolean equals(Object obj){
        Cliente cliente = (Cliente) obj;
        // Mesma lógica do anterior. Para verificar se dois cliente são iguais,
        // comparamos apenar o atributo cpfCnpj como String.
        return this.cpfCnpj.equals(cliente.getCpfCnpj());
    }

// toString, setters, getters e construtor

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Segmentos getSegmento() {
        return segmento;
    }

    public void setSegmento(Segmentos segmento) {
        this.segmento = segmento;
    }

    public boolean isVendaRealizada() {
        return vendaRealizada;
    }

    public void setVendaRealizada(boolean vendaRealizada) {
        this.vendaRealizada = vendaRealizada;
    }
}
