package com.example.enums;

public enum TipoConta {
    ADMIN("Lead"),
    MOD("Admin"),
    USER("Guest");
    private final String tipoConta;
    TipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
}
