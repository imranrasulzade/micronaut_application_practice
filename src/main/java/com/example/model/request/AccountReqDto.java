package com.example.model.request;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

//@Introspected
@Serdeable
@Data
public class AccountReqDto {

    @Schema(hidden = true)
    private Integer id;
    private String name;
    private String surname;
    private Integer status;
}
