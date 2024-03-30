package com.example.javaprac.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.annotation.Nonnull;
import lombok.*;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Dictionary;


@Entity
@Table(name = "operation")
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Operation implements CommonEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
    private Long id;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    @ToString.Exclude
    @NonNull
    private Account toacc;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    @ToString.Exclude
    @NonNull
    private Account fromacc;


    @Column(nullable = false, name="sum")
    private  Long sum;

    @Column(nullable = false, name="dayperiod" )
    private Timestamp operationtime;


}

