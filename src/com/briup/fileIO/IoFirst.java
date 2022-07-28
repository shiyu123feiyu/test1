package com.briup.fileIO;

import java.io.*;

/**
 * @Author: king
 * @Date: 2022/7/28 10:34
 * @Description:
 */
/**
 * IO流
 * 从控制台输入，和从控制台输出
 */
public class IoFirst {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String len = "";
            byte[] buff = new byte[1024];

            int i = 0 ;

        while((len=br.readLine())!=null){
            i++;
            System.out.println(len+" "+i);
        }

        br.close();





    }
}
