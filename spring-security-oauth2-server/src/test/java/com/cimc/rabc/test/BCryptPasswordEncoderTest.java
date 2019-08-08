package com.cimc.rabc.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author chenz
 * @create 2019-08-08 22:46
 */
public class BCryptPasswordEncoderTest {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}
