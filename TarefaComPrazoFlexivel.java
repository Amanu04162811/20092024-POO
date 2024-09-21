public class TarefaComPrazoFlexivel extends Tarefa {
    private int diasFlexibilidade;

    public TarefaComPrazoFlexivel(String titulo, String descricao, String prazo, int prioridade, int diasFlexibilidade) {
        super(titulo, descricao, prazo, prioridade);
        this.diasFlexibilidade = diasFlexibilidade;
    }

    public void setDiasFlexibilidade(int diasFlexibilidade) {
        this.diasFlexibilidade = diasFlexibilidade;
    }

    public int getDiasFlexibilidade() {
        return this.diasFlexibilidade;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Dias de flexibilidade: " + this.diasFlexibilidade);
        System.out.println("Tipo: Com Prazo Flexível");
    }
}