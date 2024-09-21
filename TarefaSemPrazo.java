public class TarefaSemPrazo extends Tarefa {

    public TarefaSemPrazo(String titulo, String descricao) {
        super(titulo, descricao, null, 0); // Sem prazo definido
    }

    @Override
    public long calcularDiasRestantes() {
        return -1; // Indicando que não há prazo
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Sem Prazo");
    }
}