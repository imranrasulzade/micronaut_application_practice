package com.example.service.impl;

import com.example.exception.NotFoundException;
import com.example.mapper.AccountMapper;
import com.example.model.request.AccountReqDto;
import com.example.model.response.AccountRespDto;
import com.example.repository.AccountRepository;
import com.example.service.AccountService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class AccountServiceImpl implements AccountService {
    @Inject
    private AccountRepository accountRepository;
    @Inject
    private AccountMapper accountMapper;

    @Override
    public AccountRespDto getById(Integer id) {
        return accountRepository.findById(id)
                .map(accountMapper::toRespDto)
                .orElseThrow(() -> new NotFoundException("User not found"));
    }

    @Override
    public void add(AccountReqDto account) {
        accountRepository.save(accountMapper.toEntity(account));
    }

    @Override
    public List<AccountRespDto> get() {
        return accountRepository.findAll().stream().map(accountMapper::toRespDto).toList();
    }
}
