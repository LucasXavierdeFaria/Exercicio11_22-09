public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;

    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    // Método para calcular quantos anos bissextos a pessoa já viveu
    public int calcularAnosBissextos() {
        int anosBissextos = 0;
        int anoAtual = java.time.Year.now().getValue(); // Pega o ano atual do sistema
        int anoNascimento = anoAtual - idade;

        for (int ano = anoNascimento; ano <= anoAtual; ano++) {
            if (isAnoBissexto(ano)) {
                anosBissextos++;
            }
        }

        return anosBissextos;
    }

    // Método auxiliar para verificar se um ano é bissexto
    private boolean isAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // Método para exibir as informações da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissão: " + profissao);
        System.out.println("Anos bissextos vividos: " + calcularAnosBissextos());
    }
}
