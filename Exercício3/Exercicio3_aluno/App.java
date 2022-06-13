package Exercicio3_aluno;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int escolha = 0;

        Restaurante r = new Restaurante();
        Mesa m = new Mesa();
        Conta c = new Conta();

        r.adicionarPrato("Strogonoff", 10);
        r.adicionarPrato("Batata", 20);
        r.adicionarPrato("Filé à Parmegiana", 30);
        r.adicionarPrato("Lasanha", 40);

        m.setGarcom("Felipe");
        m.setConta(c);
        m.setAberta(true);

        r.adicionarMesa(m);

        c.adicionarPedido("Strogonoff", 10, 1);
        c.adicionarPedido("Batata", 20, 1);
        c.adicionarPedido("File à Parmegiana", 30, 1);
        do {
            System.out.println(
                    "1 - Buscar prato;\n2 - Verificar disponibilidade de mesa;\n3 - Solicitar conta;\n4 - Sair.");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                r.pesquisarPrato("Prato 1");
                    break;
                case 2:
                r.mesaIsDisponivel(m);
                    
                    break;
                case 3:
                r.solicitarConta(m);
                    break;
            }
            
        } while (escolha != 4);
        if(escolha==4){
            System.out.println("\nObrigada pela Preferência!");
        }
        entrada.close();
    }
}
    
