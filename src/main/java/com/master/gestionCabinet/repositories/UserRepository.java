package com.master.gestionCabinet.repositories;

 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.master.gestionCabinet.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
     
}
