package Exercicio3_professor;

public class App {
    public static void main(String[] args) throws Exception {
        //Criando um membro
        Membro membro1 = new Membro("Ana Paula", "BP", 12345);
        Membro membro2 = new Membro("Tais", "BP", 54321);
        Membro membro3 = new Membro("Eduardo", "BP", 45678);
        System.out.println(membro1);

        //Criando uma nova comissão
        Comissao comissaoCEIC = new Comissao("Portaria n° 8081 de 23 de Maio de 2022");
        //Adicionando membros na comissão
        comissaoCEIC.adicionarMembro(membro1);
        comissaoCEIC.adicionarMembro(membro2);
        comissaoCEIC.adicionarMembro(membro3);

        //Busca um membro pelo nome
        System.out.println(
            comissaoCEIC.buscarMembroPeloNome("Ana Paula")
        );

        //Listar todos os membros da CEIC
        comissaoCEIC.listarTodosMembros();
    }
}