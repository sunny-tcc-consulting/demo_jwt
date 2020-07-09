package com.tcc.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.util.HashSet;
import java.util.Set;

@Service
public class JwtUserDetailsService implements UserDetailsService {


    public JwtUserDetailsService() {
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	String encodedPassword = passwordEncoder.encode("password");
	return User.withUsername(username).password(encodedPassword).roles("myrole").build();
    }
}
