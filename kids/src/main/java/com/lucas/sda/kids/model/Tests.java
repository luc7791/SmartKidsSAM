package com.lucas.sda.kids.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tests")

public class Tests {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tests_seq_gen")
    @SequenceGenerator( name = "tests_seq_gen", sequenceName = "tests_seq", allocationSize = 1)

        private Integer idtest;

        @Column (name = "user_id")
        private String userId;

        @Column (name = "categ_id")
        private String categId;

        private Integer score;

        private Date date;


}
