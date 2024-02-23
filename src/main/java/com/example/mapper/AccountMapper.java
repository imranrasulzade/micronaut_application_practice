package com.example.mapper;

import com.example.entity.Account;
import com.example.model.request.AccountReqDto;
import com.example.model.response.AccountRespDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "jsr330")
public abstract class AccountMapper {
    public abstract Account toEntity(AccountReqDto accountReqDto);
    public abstract AccountRespDto toRespDto(Account account);


}
