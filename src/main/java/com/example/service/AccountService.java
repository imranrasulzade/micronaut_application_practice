package com.example.service;

import com.example.entity.Account;
import com.example.model.request.AccountReqDto;
import com.example.model.response.AccountRespDto;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public interface AccountService {

    AccountRespDto getById(Integer id);

    void add(AccountReqDto account);

    List<AccountRespDto> get();
}
