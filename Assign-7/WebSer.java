/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author DELL
 */
@WebService(serviceName = "WebSer")
public class WebSer {
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "addition")
    public int addition(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
        return num1 + num2;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "subtraction")
    public int subtraction(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
        return num1 - num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplication")
    public double multiplication(@WebParam(name = "num1") double num1, @WebParam(name = "num2") double num2) {
        //TODO write your implementation code here:
        return num1 * num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "division")
    public double division(@WebParam(name = "num1") double num1, @WebParam(name = "num2") double num2) {
        //TODO write your implementation code here:
        return num1 / num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "interest")
    public double interest(@WebParam(name = "principal") double principal, @WebParam(name = "time") double time, @WebParam(name = "rate") double rate) {
        //TODO write your implementation code here:
        return (principal * time * rate) / 100;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String name) {
        //TODO write your implementation code here:
        return "Hello " + name;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "milesTokm")
    public double milesTokm(@WebParam(name = "miles") double miles) {
        //TODO write your implementation code here:
        return miles * 1.609;
    }
    
}