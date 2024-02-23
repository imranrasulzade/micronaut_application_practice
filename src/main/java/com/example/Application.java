package com.example;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

//@SecurityScheme(
//        name = "openid",
//        type = SecuritySchemeType.HTTP,
//        scheme = "bearer",
//        bearerFormat = "jwt"
//)
@OpenAPIDefinition(
        info = @Info(
                title = "api gateway",
                version = "0.0",
                description = "just description",
                license = @License(name = "license", url = "https://google.com"),
                contact = @Contact(url = "https://github.com/imranrasulzade", name = "imran", email = "rasulzade002@gmail.com")
        )
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}