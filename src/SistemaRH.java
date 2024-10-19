public class SistemaRH {
    public static void main(String[] args) throws Exception {
        Funcionario gerente = new Gerente("Junior");
        Funcionario desenvolvedor = new Desenvolvedor("Heder");

        System.out.println(gerente.nome);
        System.out.println(gerente.descreverResponsabilidade());
        System.out.println(gerente.calcularSalario());
        System.out.println("=-=-=-=-=-=-=-=-=-=");
        System.out.println(desenvolvedor.nome);
        System.out.println(desenvolvedor.descreverResponsabilidade());
        System.out.println(desenvolvedor.calcularSalario());
    }
}
