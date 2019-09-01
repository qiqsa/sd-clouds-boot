package com.cloud.user.api;

import com.cloud.service.UserService;
import com.cloud.user.entity.User;
import com.cloud.user.entity.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Qi.qingshan on 2019/9/1
 */
@RestController
@RequestMapping("/users")
public class UserEndpoint {
    @Autowired
    private UserService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<UserDto> findAll(Pageable pageable) {
        Page<User> page = this.service.getPage(pageable);
        if (null != page) {
            //转换为Dto对象
/*            return page.getContent().stream().map((user) -> {
                return new UserDto();
            }).collect(Collectors.toList());*/
            List<UserDto> dtos = new ArrayList<>();
            for (User user : page) {
                dtos.add(new UserDto(user));
            }
            return dtos;
        }
        return Collections.EMPTY_LIST;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserDto detailUser(@PathVariable Long id) {
        User user = this.service.load(id);
        return (null != user) ? new UserDto(user) : null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public UserDto update(@PathVariable Long id, @RequestBody UserDto userDto) {
        userDto.setId(id);
        User user = this.service.save(userDto);
        return (null != user) ? new UserDto(user) : null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable Long id) {
        this.service.delete(id);
        return true;
    }
}
