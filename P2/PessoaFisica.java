public final class PessoaFisica extends Cliente{
    private EstadoCivil estadoCivil;

    public PessoaFisica(String cpfCnpj, Segmentos segmento, boolean vendaRealizada, EstadoCivil estadoCivil) {
        super(cpfCnpj, segmento, vendaRealizada);
    }


    // toString, setters, getters e construtor
}