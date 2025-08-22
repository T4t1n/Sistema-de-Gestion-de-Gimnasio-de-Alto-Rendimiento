/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.t4t1n.fitgmsport;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author cmjyt
 */
public class test {
    
    public static void main(String[] args) {
        String input = "Trabajo físico intensivo";
        String withoutAccent = StringUtils.stripAccents(input.toUpperCase().replaceAll("\\s", ""));
        System.out.println(withoutAccent);
        
    }
    
}
