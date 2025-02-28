package org.ecom.firsttest;

import java.util.Properties;

public class SysList {
    public static void main(String[] args) {

        Properties properties=System.getProperties();

        System.out.println(properties.getProperty("user.dir"));


    }
}
