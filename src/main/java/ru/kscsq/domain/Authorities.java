package ru.kscsq.domain;

import org.springframework.security.core.GrantedAuthority;

public class Authorities implements GrantedAuthority {

    private static final long serialVersionUID = -256245634567365243L;

    private String username;
    private String authority;

    public Authorities(String username, String authority) {
        this.username = username;
        this.authority = authority;
    }

    @Override
    public String getAuthority() {

        return this.authority;
    }

    public String getUsername() {
        return username;
    }
}
