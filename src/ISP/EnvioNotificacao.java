package ISP;

public class EnvioNotificacao implements Notificacao {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Notificação enviada: " + mensagem);
    }
}