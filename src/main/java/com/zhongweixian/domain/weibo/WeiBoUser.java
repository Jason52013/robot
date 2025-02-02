package com.zhongweixian.domain.weibo;

import java.io.Serializable;

public class WeiBoUser implements Serializable {

    private Long id;
    private String usercard;
    private String nikename;
    private String address;
    private String cookie;
    private String clientId;


    /**
     * 粉丝
     */
    private Long fans;
    /**
     * 关注
     */
    private Long follow;
    /**
     * 微博
     */
    private Long weibo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsercard() {
        return usercard;
    }

    public void setUsercard(String usercard) {
        this.usercard = usercard;
    }

    public String getNikename() {
        return nikename;
    }

    public void setNikename(String nikename) {
        this.nikename = nikename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getFans() {
        return fans;
    }

    public void setFans(Long fans) {
        this.fans = fans;
    }

    public Long getFollow() {
        return follow;
    }

    public void setFollow(Long follow) {
        this.follow = follow;
    }

    public Long getWeibo() {
        return weibo;
    }

    public void setWeibo(Long weibo) {
        this.weibo = weibo;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "WeiBoUser{" +
                "id=" + id +
                ", usercard='" + usercard + '\'' +
                ", nikename='" + nikename + '\'' +
                ", address='" + address + '\'' +
                ", fans=" + fans +
                ", follow=" + follow +
                ", weibo=" + weibo +
                '}';
    }
}