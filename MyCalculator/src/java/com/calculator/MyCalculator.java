/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author madhushan
 */
@WebService(serviceName = "MyCalculator")
public class MyCalculator {

    /**
     * This is a sample web service operation
     
     */
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "a") int a,@WebParam(name = "b") int b) {
        return a;
        
    }
}
