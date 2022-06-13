package Exercicio3_professor;

public class Membro {

    private String nome;
    private String campus;
    private int prontuario;

    public Membro(String nome, String campus, int prontuario) {
        this.nome = nome;
        this.campus = campus;
        this.prontuario = prontuario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCampus() {
        return campus;
    }
    public void setCampus(String campus) {
        this.campus = campus;
    }
    public int getProntuario() {
        return prontuario;
    }
    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }
    @Override
    public String toString() {
        // Ex: Servidor Fulano de Tal - BP0000-1
        String servidorStr = "Servidor " + this.nome + " - "+ formatarProntuario();
        return servidorStr;
    }
    private String formatarProntuario() {
        //pegar o último caracter da String
        String prontuarioStr = String.valueOf(this.prontuario);
        //IFSP.charAt(3); Resultado: P
        char ultimoNum = prontuarioStr.charAt(prontuarioStr.length() -1);
        //colocar um traço antes dele
        String digito = "-" + ultimoNum;
        //IFSP.substring(0,2) Resultado: IFS, retorna do 0 até 2;
        prontuarioStr = prontuarioStr.substring(0,prontuarioStr.length() -1);
        //concatenar essa String com o campus e o seu digito
        return this.campus + prontuarioStr + digito;
    }
}
    
