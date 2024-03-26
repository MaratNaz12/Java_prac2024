package com.example.javaprac.impl;

import com.example.javaprac.DAO.AccountDAO;
import com.example.javaprac.models.Account;
import com.example.javaprac.models.BankAccType;
import com.example.javaprac.models.Client;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDAOImpl extends CommonDAOImpl<Account, Long> implements AccountDAO {

    public AccountDAOImpl(){
        super(Account.class);
    }
    @Override
    public List<Account> FilterBalance(BalanceFilterEnum sign, Long balance) {
        try (Session session = sessionFactory.openSession()) {
            if (sign == BalanceFilterEnum.Greater) {
                Query<Account> query = session.createQuery("FROM Account WHERE curbalance >= :balance", Account.class)
                        .setParameter("balance", balance);
                List<Account> resultList = query.getResultList();
                return resultList.isEmpty() ? null : resultList;
            } else {
                Query<Account> query = session.createQuery("FROM Account WHERE curbalance <= :balance", Account.class)
                        .setParameter("balance", balance);
                List<Account> resultList = query.getResultList();
                return resultList.isEmpty() ? null : resultList;
            }
        }
    }


    @Override
    public List<Account> FilterType(BankAccType acctype) {
        try (Session session = sessionFactory.openSession()) {
            Query<Account> query = session.createQuery("FROM Account WHERE bankacctype_id = :acctype", Account.class)
                    .setParameter("acctype", acctype);
            List<Account> resultList = query.getResultList();
            return resultList.isEmpty() ? null : resultList;
        }
    }

    @Override
    public List<Account> FilterByClient(Client client_id){
        try (Session session = sessionFactory.openSession()) {
            Query<Account> query = session.createQuery("FROM Account WHERE client_id = :client_id", Account.class)
                    .setParameter("client_id", client_id);
            List<Account> resultList = query.getResultList();
            return resultList.isEmpty() ? null : resultList;
        }

    }


    private String likeExpr(String param) {
        return "%" + param + "%";
    }
}
