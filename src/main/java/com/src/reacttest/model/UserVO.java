package com.src.reacttest.model;

import java.util.HashMap;

import com.google.gson.JsonObject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

/** 
 * @Class UserVO
 * @Description 관리자정보 객체
 * 
 * @author 박종현
 * 
 */
@Getter
@Setter
@ToString
@Entity(name="USER_INFO")
public class UserVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seq;         // 일련번호
    @NonNull
    private String userId;      // 사용자아이디
    @NonNull
    private String userPwd;      // 사용자비밀번호
    @NonNull
    private String userNm;      // 사용자명
    @NonNull
    private String userGrant;   // 사용자 권한
    private String celph;       // 전화번호
    private String email;       // 이메일
    private String cretDate;    // 생성일자
    private String cretTime;    // 생성시간
    private String chgDate;     // 수정일자
    private String chgTime;     // 수정시간

    public HashMap<String, Object> toHashMap(){
        HashMap<String,Object> retMap = new HashMap<String,Object>();
        retMap.put("seq",this.getSeq());
        retMap.put("userId",this.getUserId());
        retMap.put("userPwd",this.getUserPwd());
        retMap.put("userNm",this.getUserNm());
        retMap.put("celph",this.getCelph());
        retMap.put("email",this.getEmail());
        retMap.put("cretDate",this.getCretDate());
        retMap.put("cretTime",this.getCretTime());
        retMap.put("chgDate",this.getChgDate());
        retMap.put("chgTime",this.getChgTime());
        return retMap;
    }

    public void fromHashMap(HashMap<String,Object> reqMap){
        if(reqMap.containsKey("seq")){
            this.setSeq(Integer.parseInt(String.valueOf(reqMap.get("seq"))));
        }
        this.setUserId(String.valueOf(reqMap.get("userId")));
        this.setUserPwd(String.valueOf(reqMap.get("userPwd")));
        this.setUserNm(String.valueOf(reqMap.get("userNm")));
        this.setCelph(String.valueOf(reqMap.get("celph")));
        this.setEmail(String.valueOf(reqMap.get("email")));
        this.setCretDate(String.valueOf(reqMap.get("cretDate")));
        this.setCretTime(String.valueOf(reqMap.get("cretTime")));
        this.setChgDate(String.valueOf(reqMap.get("chgDate")));
        this.setChgTime(String.valueOf(reqMap.get("chgTime")));
    }

    public JsonObject toJsonObj() throws Exception{
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty("seq", this.getSeq());
        jsonObj.addProperty("userId",this.getUserId());
        jsonObj.addProperty("userPwd",this.getUserPwd());
        jsonObj.addProperty("userNm",this.getUserNm());
        jsonObj.addProperty("celph",this.getCelph());
        jsonObj.addProperty("email",this.getEmail());
        jsonObj.addProperty("cretDate",this.getCretDate());
        jsonObj.addProperty("cretTime",this.getCretTime());
        jsonObj.addProperty("chgDate",this.getChgDate());
        jsonObj.addProperty("chgTime",this.getChgTime());
        return jsonObj;
    }

    public void fromJsonObj(JsonObject jsonObj) throws Exception{
        if(jsonObj.has("seq")){
            this.setSeq(Integer.parseInt(String.valueOf(jsonObj.get("seq"))));
        }
        this.setUserId(String.valueOf(jsonObj.get("userId")));
        this.setUserPwd(String.valueOf(jsonObj.get("userPwd")));
        this.setUserNm(String.valueOf(jsonObj.get("userNm")));
        this.setCelph(String.valueOf(jsonObj.get("celph")));
        this.setEmail(String.valueOf(jsonObj.get("email")));
        this.setCretDate(String.valueOf(jsonObj.get("cretDate")));
        this.setCretTime(String.valueOf(jsonObj.get("cretTime")));
        this.setChgDate(String.valueOf(jsonObj.get("chgDate")));
        this.setChgTime(String.valueOf(jsonObj.get("chgTime")));
    }
}
