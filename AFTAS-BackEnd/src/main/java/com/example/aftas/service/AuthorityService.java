package com.example.aftas.service;

import com.example.aftas.enums.AuthorityEnum;
import com.example.aftas.model.Authority;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

public interface AuthorityService {
    List<Authority> getAllByName(List<AuthorityEnum> authorities);
    Optional<Authority> getByName(String authorityEnum);

    Optional<Authority> getById(Long id);
}

