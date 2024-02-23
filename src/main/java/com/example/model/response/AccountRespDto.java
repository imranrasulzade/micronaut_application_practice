package com.example.model.response;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Data;

//@Introspected
@Serdeable
@Data
public class AccountRespDto {
    private Integer id;
    private String name;
    private String surname;
    private Integer status;
}
