package com.pb.criconet.model.AcademyModel;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

public class AttendanceReport implements Serializable {
    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMid_name() {
        return mid_name;
    }

    public void setMid_name(String mid_name) {
        this.mid_name = mid_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAttendance_date() {
        return attendance_date;
    }

    public void setAttendance_date(String attendance_date) {
        this.attendance_date = attendance_date;
    }

    public String getAttendance_status() {
        return attendance_status;
    }

    public void setAttendance_status(String attendance_status) {
        this.attendance_status = attendance_status;
    }

    String user_id = "";
    String name = "";
    String username = "";
    String first_name = "";
    String last_name = "";
    String mid_name = "";
    String avatar = "";
    String attendance_date = "";
    String attendance_status = "";

    public AttendanceReport(JSONObject jsonObject){
        if(jsonObject.has("user_id")){
            try {
                this.user_id = jsonObject.getString("user_id");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if(jsonObject.has("name")){
            try {
                this.name = jsonObject.getString("name");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if(jsonObject.has("username")){
            try {
                this.username = jsonObject.getString("username");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if(jsonObject.has("first_name")){
            try {
                this.first_name = jsonObject.getString("first_name");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if(jsonObject.has("last_name")){
            try {
                this.last_name = jsonObject.getString("last_name");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if(jsonObject.has("mid_name")){
            try {
                this.mid_name = jsonObject.getString("mid_name");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if(jsonObject.has("avatar")){
            try {
                this.avatar = jsonObject.getString("avatar");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if(jsonObject.has("attendance_date")){
            try {
                this.attendance_date = jsonObject.getString("attendance_date");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if(jsonObject.has("attendance_status")){
            try {
                this.attendance_status = jsonObject.getString("attendance_status");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

    }

}
