package edu.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.learning.dto.UserInfo;

@Repository
public interface UserInfoRepo extends JpaRepository<UserInfo, Integer>  {

}
