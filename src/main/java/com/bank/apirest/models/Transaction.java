package com.bank.apirest.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_TRANSACTION")
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    //private Account account;
    private long account;

    @NotNull
    private OperationType operationType;

    @NotNull
    private BigDecimal amount;

    @NotNull
    private LocalDateTime eventDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public String getAccount() {
//        return nome;
//    }

//    public void setAccount(String nome) {
//        this.nome = nome;
//    }
//
//    public BigDecimal getQuantidade() {
//        return quantidade;
//    }
//
//    public void setQuantidade(BigDecimal quantidade) {
//        this.quantidade = quantidade;
//    }
//
//    public BigDecimal getValor() {
//        return valor;
//    }
//
//    public void setValor(BigDecimal valor) {
//        this.valor = valor;
//    }


}
