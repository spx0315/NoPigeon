package com.no_pigeon_date.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users", schema = "dateportable")
public class UsersEntity {
    private int uid;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String password;
    private String sex;
    private Integer level;
    private Integer exp;
    private Integer creditscore;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uid")
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "username")
    public String getNickname() {
        return username;
    }

    public void setNickname(String nickname) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "level")
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Basic
    @Column(name = "exp")
    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    @Basic
    @Column(name = "creditscore")
    public Integer getCreditscore() {
        return creditscore;
    }

    public void setCreditscore(Integer creditscore) {
        this.creditscore = creditscore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return uid == that.uid &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(level, that.level) &&
                Objects.equals(exp, that.exp) &&
                Objects.equals(creditscore, that.creditscore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, username, password, sex, level, exp, creditscore);
    }
}
