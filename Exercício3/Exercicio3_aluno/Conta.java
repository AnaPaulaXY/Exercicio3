package Exercicio3_aluno;

import java.util.ArrayList;
import java.util.Iterator;

public class Conta {
    private ArrayList<String> pratos;
    private double valor;

    public Conta() {
        pratos = new ArrayList<>();
    }

    public void adicionarPedido(String prato, double valor, int quant){
        pratos.add(prato);
        atualizaValor(valor*quant);
    }

    private void atualizaValor(double valorP){
        this.valor += valorP;
    }

    public void mostrarPratos(){
        Iterator<String> it = pratos.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public double getValor() {
        return valor;
    }
    
}
    
