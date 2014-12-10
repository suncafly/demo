package com.suncafly.daemon;

public class EngineLauncher { 
    public static void main(String[] args) {
        System.out.println(decision());
    }
    static boolean decision() {
        try {
            return true;
        } finally {
            return false;
        }
    } 
}