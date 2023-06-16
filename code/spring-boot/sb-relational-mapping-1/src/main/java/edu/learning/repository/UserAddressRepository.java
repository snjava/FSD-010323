package edu.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.learning.entity.UserAddress;

@Repository
public interface UserAddressRepository extends JpaRepository<UserAddress, Integer> {

}
