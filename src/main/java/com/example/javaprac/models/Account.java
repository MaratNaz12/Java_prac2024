package com.example.javaprac.models;
import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.annotation.Nonnull;
import lombok.*;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Dictionary;


@Entity
@Table(name = "account")
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Account implements CommonEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
    private Long id;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    @ToString.Exclude
    @NonNull
    private Client client_id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "office_id")
    @ToString.Exclude
    @NonNull
    private Office office_id;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bankacctype_id")
    @ToString.Exclude
    @NonNull
    private BankAccType bankacctype_id;


    @Column(nullable = false, name="curperiod")
    private  Long curperiod;

    @Column(nullable = false, name="curaccum")
    private  Long curaccum;


    @Column(nullable = false, name="curbalance")
    private  Long curbalance;


}
