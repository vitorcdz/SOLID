package DIP;

public class SistemaNotificacao {
    private Notificacao notificacao;

    public SistemaNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void enviarNotificacao(String mensagem) {
        notificacao.enviar(mensagem);
    }
}