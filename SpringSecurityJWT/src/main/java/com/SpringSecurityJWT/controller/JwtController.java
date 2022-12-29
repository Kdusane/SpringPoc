package com.SpringSecurityJWT.controller;

import com.SpringSecurityJWT.Services.JwtUserDetailServices;
import com.SpringSecurityJWT.config.JwtUtill;
import com.SpringSecurityJWT.model.JwtToken;
import com.SpringSecurityJWT.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
public class JwtController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtill jwtUtill;

    @Autowired
    private JwtUserDetailServices jwtUserDetailServices;

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody Users users) throws Exception {

        authenticate(users.getUsername(), users.getPassword());

        final UserDetails userDetails = jwtUserDetailServices
                .loadUserByUsername(users.getUsername());

        final String token = jwtUtill.generateToken(userDetails);

        return ResponseEntity.ok(new JwtToken(token));
    }

    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }
}
