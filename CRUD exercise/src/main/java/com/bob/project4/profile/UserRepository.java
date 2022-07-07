package com.bob.project4.profile;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bob.project4.profile.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
  List<UserEntity> findByName(String name);

  List<UserEntity> findByEmail(String email);

}
