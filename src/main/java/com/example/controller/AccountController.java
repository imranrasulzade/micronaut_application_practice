package com.example.controller;

import com.example.model.request.AccountReqDto;
import com.example.model.response.AccountRespDto;
import com.example.service.AccountService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;

import lombok.RequiredArgsConstructor;


@Controller("/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;
    @Get("/{id}")
    public AccountRespDto getById(@PathVariable Integer id) {
        return accountService.getById(id);
    }

    @Post
    @Status(value = HttpStatus.CREATED)
    public void add(@Body AccountReqDto account) {
        accountService.add(account);
    }


    @Get
    public HttpResponse<?> get(){
        return HttpResponse.ok().body(accountService.get());}

}
