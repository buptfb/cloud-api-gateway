package com.cloud.security.entity;


import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Table(name = "sys_user_security")
@Entity
@Where(clause = " del_flag = 0 ")
@Data
public class SysUserSecurity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;


    @Column(name = "username")
    private String username;


    @Column(name = "password")
    private String password;


    @Column(name = "enable")
    private boolean enable;


}
