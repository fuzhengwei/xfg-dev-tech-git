package cn.bugstack.xfg.dev.tech.test;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Slf4j
public class ApiTest {

    public static void  main(String[] args) {
        Integer x=111 ;
        System.out.println( x) ;
    }

    public void vo2dto(){
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("1","1");
    }

}


