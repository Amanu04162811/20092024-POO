public class TarefaSemPrazo extends Tarefa {

    public TarefaSemPrazo(String titulo, String descricao) {
        super(titulo, descricao, "", 0);
    }

    @Override
    public long calcularDiasRestantes() {
        return -1;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Sem Prazo");
    }
}

// @alanveloso