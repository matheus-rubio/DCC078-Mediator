package com.dcc.ufjf;

public class Colaborador extends Pessoa {

    public Colaborador(String nome) {
        super(nome);
    }

    public String receberMensagem(String mensagem) {
        return "Colaborador " + getNome() + " recebeu a mensagem: " + mensagem;
    }

    public String enviarMensagem(String mensagem, Colaborador destinatario) {
        return Mediador.getInstancia().enviarMensagem(mensagem, this, destinatario);
    }
}
