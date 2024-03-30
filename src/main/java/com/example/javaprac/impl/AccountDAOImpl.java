package com.example.javaprac.impl;

import com.example.javaprac.DAO.AccountDAO;
import com.example.javaprac.models.Account;
import com.example.javaprac.models.BankAccType;
import com.example.javaprac.models.Client;
import com.example.javaprac.models.Operation;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public class AccountDAOImpl extends CommonDAOImpl<Account, Long> implements AccountDAO {

    public AccountDAOImpl(){
        super(Account.class);
    }

    @Override
    public List <Account> GetWithFilter(String fieldName, int value_){

        try (Session session = sessionFactory.openSession()) {
            String query = "from Account  where " + fieldName + "= :value_";
            Transaction t = session.beginTransaction();
            List<Account> listOperations = session
                    .createQuery(query, Account.class)
                    .setParameter("value_", value_)
                    .getResultList();
            t.commit();
            return listOperations;
        }
    }

    @Override
    public List<Account> GetWithFilterBalanceRange(int lo, int hi) {
        try (Session session = sessionFactory.openSession()) {
            String query = "from Account  where curbalance" + " between :lo and :hi";
            Transaction t = session.beginTransaction();
            List<Account> listOperations = session
                    .createQuery(query, Account.class)
                    .setParameter("lo", lo)
                    .setParameter("hi", hi)
                    .getResultList();
            t.commit();
            return listOperations;
        }
    }

    @Override
    public List<Account> GetWithFilterBalanceFree(String sign_, int value_) {
        try (Session session = sessionFactory.openSession()) {
            String query = "from Account  where curbalance" + sign_ + " :value_";
            Transaction t = session.beginTransaction();
            List<Account> listOperations = session
                    .createQuery(query, Account.class)
                    .setParameter("value_", value_)
                    .getResultList();
            t.commit();
            return listOperations;
        }
    }
}

