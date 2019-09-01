package com.cloud.service;

import com.cloud.user.entity.User;
import com.cloud.user.entity.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by Qi.qingshan on 2019/9/1
 * 业务逻辑层
 */
public interface UserService {

    /**
     * 获取用户分页数据
     * @param pageable 分页参数
     * @return
     */
    Page<User> getPage(Pageable pageable);

    /**
     * 获取指定用户信息
     * @param id
     * @return
     */
    User load(Long id);

    /**
     * 保存用户
     * @param userDto
     * @return
     */
    User save(UserDto userDto);

    /**
     * 删除用户
     * @param id
     */
    void delete(Long id);
}
