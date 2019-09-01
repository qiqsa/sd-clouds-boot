package com.cloud.service.impl;

import com.cloud.service.UserService;
import com.cloud.user.entity.User;
import com.cloud.user.entity.dto.UserDto;
import com.cloud.user.repostitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Qi.qingshan on 2019/9/1
 * 业务逻辑实现
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public Page<User> getPage(Pageable pageable) {
        return this.userRepository.findAll(pageable);
    }

    @Override
    public User load(Long id) {
        return this.userRepository.getOne(id);
    }

    @Override
    @Transactional
    public User save(UserDto userDto) {
        User user = new User();
        user.setNickname(userDto.getNickname());
        user.setAvatar(userDto.getAvatar());
        return this.userRepository.save(user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        this.userRepository.deleteById(id);
    }
}
