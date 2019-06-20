package com.lucas.sda.kids.model;

import javax.persistence.*;

@Entity
@Table (name = "users_answers")
public class UsersAnswers {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userAnswers_seq_gen")
    @SequenceGenerator( name = "userAnswers_seq_gen", sequenceName = "userAnswers_seq", allocationSize = 1)
    private Integer id;

    @Column(name="test_id")
    private Integer testId;

    @Column (name="id_ex")
    private Integer idEx;

    @Column (name="user_val")
    private Integer userVal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public Integer getIdEx() {
        return idEx;
    }

    public void setIdEx(Integer idEx) {
        this.idEx = idEx;
    }

    public Integer getUserVal() {
        return userVal;
    }

    public void setUserVal(Integer userVal) {
        this.userVal = userVal;
    }
}
