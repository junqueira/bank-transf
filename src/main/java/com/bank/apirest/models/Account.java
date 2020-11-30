package com.bank.apirest.models;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "TB_ACCOUNT")
public class Account {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "Id of Item")
    @Id
    //private String id;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @ApiModelProperty(value = "Number of document")
    //@Indexed(name = "documentNumber")
    private String documentNumber;

//    public String getDocumentNumber() {
//        return nome;
//    }

//    public void setDocumentNumber(String nome) {
//        this.nome = nome;
//    }
}
