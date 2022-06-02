package com.saraya.services;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class LoginService {
    public String getLoggedInUsername(){
        Object principal = SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();
        if (principal instanceof UserDetails){
            return ((UserDetails) principal).getUsername();
        }

        return principal.toString();
    }
}
