package com.cloud.user.repostitory;

import com.cloud.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Qi.qingshan on 2019/9/1
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
