public class TarefaComAlerta extends Tarefa implements Notificacao {
    public TarefaComAlerta(String titulo, String descricao, String prazo, int prioridade) {
        super(titulo, descricao, prazo, prioridade);
        enviarNotificacao();
    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Alerta: A tarefa \"" + getTitulo() + "\" foi criada!");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Esta tarefa também envia alertas.");
    }
}

// @alanveloso