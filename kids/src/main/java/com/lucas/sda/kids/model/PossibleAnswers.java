package com.lucas.sda.kids.model;

import javax.persistence.*;

@Entity
@Table (name = "possible_answers")

public class PossibleAnswers {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "possible_answ_seq_gen")
    @SequenceGenerator( name = "possible_answ_seq_gen", sequenceName = "possible_answ_seq", allocationSize = 1)

    private Integer id;

    @Column (name="id_ex")
    private Integer idEx;

    private Integer val1;
    private Integer val2;
    private Integer val3;
    private Integer val4;
    private Integer val5;

    @Column (name="correct_val")
    private Integer correctVal;

    private Boolean flag;


}
