package com.lucas.sda.kids.model;

import javax.persistence.*;

@Entity
@Table (name="tests_exercises")

public class TestsExercises {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tests_ex_seq_gen")
    @SequenceGenerator( name = "tests_ex_seq_gen", sequenceName = "tests_ex_seq", allocationSize = 1)

    @Column(name="id_tests")
    private Integer idTests;

    @Column (name="id_ex")
    private Integer idEx;
}
