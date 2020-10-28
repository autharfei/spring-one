package com.qf.fei.bean;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;
import lombok.Data;

import java.util.List;

@Data
public class User {

    private String username;
    private String password;
    private Address address;
    private List<Integer> list;

    public void method(){
        this.username = "sb";
        System.out.println("method");
}
}
