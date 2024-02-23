package com.example.service.impl;

import com.example.exception.NotFoundException;
import com.example.mapper.AccountMapper;
import com.example.model.request.AccountReqDto;
import com.example.model.response.AccountRespDto;
import com.example.repository.AccountRepository;
import com.example.service.AccountService;

import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Singleton
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    private final AccountMapper accountMapper;

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
