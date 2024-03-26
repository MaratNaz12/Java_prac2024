package com.example.javaprac.DAO;

import com.example.javaprac.models.Account;
import com.example.javaprac.models.BankAccType;
import com.example.javaprac.models.Client;
import com.example.javaprac.models.ContactInfo;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

public interface AccountDAO extends CommonDAO<Account, Long> {
    enum BalanceFilterEnum {
        Greater,
        Lower
    }


    List<Account> FilterBalance(BalanceFilterEnum sign, Long balance);
    List<Account> FilterType(BankAccType acctype);
    List<Account> FilterByClient(Client client_id);

}