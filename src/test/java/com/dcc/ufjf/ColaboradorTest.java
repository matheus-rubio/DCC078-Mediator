package com.dcc.ufjf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColaboradorTest {

    @Test
    void deveTestarFuncionamentoDoMetodoReceberMensagem() {
        Colaborador remetente = new Colaborador("Alice");
        Colaborador destinatario = new Colaborador("Bob");

        assertEquals("Colaborador Bob recebeu a mensagem: Mensagem de Alice: Vamos agendar uma reunião.",
                remetente.enviarMensagem("Vamos agendar uma reunião.", destinatario));
    }
}
