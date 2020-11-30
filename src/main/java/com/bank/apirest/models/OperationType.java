package com.bank.apirest.models;

import java.util.Arrays;

public enum OperationType {
    COMPRA_A_VISTA(1, "Compra a Vista"),
    COMPRA_PARCELADA(2, "Compra Parcelada"),
    SAQUE(3, "Saque"),
    PAGAMENTO(4, "Pagamento");

    private final Integer id;

    private final String description;

    OperationType(final Integer id, final String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public static OperationType getById(Integer id) throws Exception {
        OperationType operationType = Arrays.stream(OperationType.values())
                .filter(op -> op.getId().equals(id))
                .findAny()
                .orElseThrow(() -> new Exception("The operation type reported does not exist Please report a valid operation type (1-COMPRA A VISTA, 2-COMPRA PARCELADA, 3-SAQUE, 4-PAGAMENTO)"));

        return operationType;
    }
}
