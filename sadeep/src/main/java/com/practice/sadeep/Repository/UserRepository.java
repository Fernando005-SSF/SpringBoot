package com.practice.sadeep.Repository;

import com.practice.sadeep.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
