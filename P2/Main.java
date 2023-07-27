public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario("Laura");
// Cria dois clientes de exemplo.
        PessoaJuridica pj = new PessoaJuridica("111111111111111111111", Segmentos.Esportes, false, PorteDaEmpresa.PEQUENA, "123123", "Empresa LTDA");
        PessoaFisica pf = new PessoaFisica("999999999999",Segmentos.Marketing, true, EstadoCivil.Casado);
// Mesmo CPF, outros atributos diferentes
        PessoaFisica pf2 = new PessoaFisica("999999999999", Segmentos.Jornalismo, false, EstadoCivil.Solteiro);
        inventario.adicionarCliente(pj);
        inventario.adicionarCliente(pf);
// Imprime primeiro PF e depois PJ
        inventario.imprimirClientes();
        System.out.println("Pós-remoção:");
        inventario.removerCliente(pf2);
        inventario.imprimirClientes();
    }
}
