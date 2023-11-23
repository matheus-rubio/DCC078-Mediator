package com.dcc.ufjf;

public class Mediador {

    private static Mediador instancia = new Mediador();

    private Mediador() {}

    public static Mediador getInstancia() {
        return instancia;
    }

    public String enviarMensagem(String mensagem, Colaborador remetente, Colaborador destinatario) {
        return destinatario.receberMensagem("Mensagem de " + remetente.getNome() + ": " + mensagem);
    }
}
