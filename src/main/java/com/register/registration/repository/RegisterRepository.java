package com.register.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.register.registration.model.RegistrationBean;

@Repository
public interface RegisterRepository extends JpaRepository<RegistrationBean, Integer>{

}
