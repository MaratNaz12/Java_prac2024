package com.example.javaprac.models;
import jakarta.annotation.Nonnull;
import lombok.*;

import jakarta.persistence.*;

import java.sql.Timestamp;


@Entity
@Table(name = "bankacctype")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BankAccType implements CommonEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
    private Long id;

    @Column(nullable = false, name="name" )
    private String name;

    @Column(nullable = false, name="profit" )
    private Double profit;

    @Column(nullable = false, name="dayperiod" )
    private Long dayperiod;

    @Column(nullable = false, name="maxdebit" )
    private Long maxdebit;

    @Column(nullable = false, name="mindebit" )
    private Long mindebit;

    @Column(nullable = false, name="maxdaccrual" )
    private Long maxaccruel;

    @Column(nullable = false, name="minaccrual" )
    private Long minaccrual;
}
