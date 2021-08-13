package com.hyeon.board_0805.repository;

import com.hyeon.board_0805.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
