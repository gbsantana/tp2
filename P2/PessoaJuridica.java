public final class PessoaJuridica extends Cliente{
    private PorteDaEmpresa porteDaEmpresa;
    private String inscricaoEstadual;
    private String razaoSocial;
    public PessoaJuridica(String cpfCnpj, Segmentos segmento, boolean vendaRealizada,PorteDaEmpresa porteDaEmpresa,String inscricaoEstadual, String razaoSocial) {
        super(cpfCnpj, segmento, vendaRealizada);
    }
    // toString, setters, getters e construtor
}
