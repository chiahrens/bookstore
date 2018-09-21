package com.walmart;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;

/*
@XmlRootElement ( name = "test", namespace = "http://www.myserviceapi.com" )
@XmlType ( name = "test", namespace = "http://www.myserviceapi.com", 
    propOrder = { "name"} )
@XmlAccessorType ( XmlAccessType.FIELD )
*/
public class TestObject implements java.io.Serializable{
    private String name;
    public TestObject(){}
    public TestObject(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}