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
@RequiredArgsConstructor
@AllArgsConstructor
public class BankAccType implements CommonEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
    private Long id;

    @Column(nullable = false, name="name" )
    @NonNull
    private String name;

    @Column(nullable = false, name="profit" )
    @NonNull
    private Long profit;

    @Column(nullable = false, name="dayperiod" )
    @NonNull
    private Timestamp dayperiod;

    @Column(nullable = false, name="maxdebit" )
    @NonNull
    private Long maxdebit;

    @Column(nullable = false, name="mindebit" )
    @NonNull
    private Long mindebit;

    @Column(nullable = false, name="maxdaccrual" )
    @NonNull
    private Long maxaccruel;

    @Column(nullable = false, name="minaccrual" )
    @NonNull
    private Long minaccrual;
}
