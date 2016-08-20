package com.example.han.compass.utils;

/**
 * Created by han on 16. 8. 21..
 */
/**
 * Created by Administrator on 2016-08-20.
 */
public class Repo {
    String _id, profile, accessToken,name ;

    public String getAccessToken() {
        return accessToken;
    }
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    public String getProfile() {
        return profile;
    }
    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }
}