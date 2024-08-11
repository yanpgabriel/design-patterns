package dev.yanpgabriel.patterns.structural;

public class Decorator {
    public static void main(String[] args) {
        Notificacao notificacao = null;

        notificacao = new NotificacaoEmail(notificacao);
        notificacao = new NotificacaoSMS(notificacao);

        notificacao.notificar("Olá, mundo!");
        System.out.println(notificacao.empacotar("Olá, mundo!"));
        System.out.println(notificacao.transformar("Olá, mundo!"));
    }
}

abstract class Notificacao {
    Notificacao source;
    Notificacao(Notificacao source) {
        this.source = source;
    }
    public void notificar(String mensagem) {
        if (source != null) {
            source.notificar(mensagem);
        }
    }
    public String empacotar(String mensagem) {
        if (source != null) {
            return source.empacotar(mensagem);
        }
        return mensagem;
    }
    public String transformar(String mensagem) {
        if (source != null) {
            return source.transformar(mensagem);
        }
        return mensagem;
    }
}

class NotificacaoEmail extends Notificacao {
    NotificacaoEmail(Notificacao source) {
        super(source);
    }
    @Override
    public void notificar(String mensagem) {
        super.notificar(mensagem);
        System.out.println("Enviando email: " + mensagem);
    }
    @Override
    public String empacotar(String mensagem) {
        return "<email>" + super.empacotar(mensagem) + "</email>";
    }

    @Override
    public String transformar(String mensagem) {
        return super.transformar("{email}" + mensagem + "{/email}");
    }
}

class NotificacaoSMS extends Notificacao {
    NotificacaoSMS(Notificacao source) {
        super(source);
    }
    @Override
    public void notificar(String mensagem) {
        super.notificar(mensagem);
        System.out.println("Enviando SMS: " + mensagem);
    }
    @Override
    public String empacotar(String mensagem) {
        return "<sms>" + super.empacotar(mensagem) + "</sms>";
    }

    @Override
    public String transformar(String mensagem) {
        return super.transformar("{sms}" + mensagem + "{/sms}");
    }
}

