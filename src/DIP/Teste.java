package DIP;

public class Teste {
    static void main() {

        SistemaNotificacao email = new SistemaNotificacao(new NotificacaoEmail());

        email.enviarNotificacao("Enviando Email");

        SistemaNotificacao sms = new SistemaNotificacao(new NotificacaoSMS());

        sms.enviarNotificacao("Enviando SMS");

        SistemaNotificacao whatsapp = new SistemaNotificacao(new NotificacaoWhatsApp());

        whatsapp.enviarNotificacao("Enviando WhatsApp");
    }
}
