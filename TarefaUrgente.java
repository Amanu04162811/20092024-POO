public class TarefaUrgente extends Tarefa implements Notificacao {
    private String razaoUrgencia;

    public TarefaUrgente(String titulo, String descricao, String prazo, String razaoUrgencia) {
        super(titulo, descricao, prazo, 5);
        this.razaoUrgencia = razaoUrgencia;
    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Notificação: A tarefa \"" + getTitulo() + "\" é urgente!");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Razão da Urgência: " + this.razaoUrgencia);
        System.out.println("Tipo: Urgente");
    }
}

// @alanveloso