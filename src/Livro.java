public class Livro{
    private String nome;
    private String ano;
    private int avaliacao;
    public Livro (){}

    public void Livro(String nome, String ano, int avaliacao){
        this.nome = nome;
        this.ano = ano;
        this.avaliacao = avaliacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", ano='" + ano + '\'' +
                ", avaliacao=" + avaliacao +
                '}';
    }
}