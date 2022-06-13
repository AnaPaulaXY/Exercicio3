package Exercicio3_professor;

import java.util.ArrayList;
import java.util.Iterator;

public class Comissao {
    private ArrayList<Membro> membros;
    private String portaria;

    public Comissao(String portaria){
        this.membros = new ArrayList<>();
        this.portaria = portaria;
    }
    public String getPortaria() {
        return this.portaria;
    }
    public Membro buscarMembroPeloNome(String nomeBusca){
        Iterator<Membro> it = this.membros.iterator();

        while(it.hasNext()){
            Membro membroItem = it.next();
            //Retorna se o nome do Membro contém nomeBusca
           if(membroItem.getNome().contains(nomeBusca)){
               return membroItem;
           }
        }

        return null;
    
    public void adicionarMembro(Membro novoMembro){
        this.membros.add(novoMembro);
    }
    public void listarTodosMembros(){          
        System.out.println("------- Lista ---------");

        Iterator<Membro> it = this.membros.iterator();

        while(it.hasNext()){
            Membro membroItem = it.next();
            System.out.println(membroItem);
        }
    }
}
