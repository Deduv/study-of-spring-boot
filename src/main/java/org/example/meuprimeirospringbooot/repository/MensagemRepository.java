package org.example.meuprimeirospringbooot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {

    public String obterMensagem() {
        return "Olá do repositorio";
    }
}
