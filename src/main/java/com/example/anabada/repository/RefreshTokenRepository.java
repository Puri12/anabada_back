package com.example.anabada.repository;


import com.example.anabada.domain.Member;
import com.example.anabada.domain.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
  Optional<RefreshToken> findByMember(Member member);
}
