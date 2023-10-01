package com.example.E_Commerce.repo;

import com.example.E_Commerce.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<Users,Integer> {
}
