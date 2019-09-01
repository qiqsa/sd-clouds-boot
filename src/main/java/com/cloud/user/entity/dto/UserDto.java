package com.cloud.user.entity.dto;

import com.cloud.user.entity.User;

import java.io.Serializable;

/**
 * Created by Qi.qingshan on 2019/9/1
 * 数据传输对象（Data Transfer Object），用来处理跨进程或网络传输数据聚合容器，对象中只包含属性，不包含业务逻辑
 */
public class UserDto implements Serializable {
    public UserDto() {
    }

    public UserDto(User user) {
        this.id = user.getId();
        this.avatar = user.getAvatar();
        this.nickname = user.getNickname();
    }

    private static final long serialVersionUID = 8630118430378280336L;

    private Long id;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户头像
     */
    private String avatar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
