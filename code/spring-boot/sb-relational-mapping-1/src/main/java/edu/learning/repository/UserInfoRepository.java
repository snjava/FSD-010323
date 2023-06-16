package edu.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.learning.entity.UserInfo;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
}
