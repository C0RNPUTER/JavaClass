package org.dimigo.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BasicException {
    public static void main(String[] args) {
        try {
            uncheckedException(null);
            checkedException();
            String id = null;
            validate(id);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void validate(String id) throws Exception {
        try{
            if (id == null || "".equals(id)) {
                Exception e = new Exception("ID를 입력");
                throw e;
            } else if (id.length() < 8) {
                throw new Exception("8자 이상 입력");
            }
        }catch(Exception e){
            throw e;
        }
    }

    private static void uncheckedException(String s) {
        try {
            System.out.println(s.length());
        } catch (NullPointerException npe){
            System.out.println("아 입력하라규");
        }   catch(NumberFormatException nfe) {
            System.out.println("아 숫자 아니라규");
        }   catch (Exception e) {
            e.printStackTrace();
        }
    }

    //컴파일러가 예외처리를 요구함
    private static void checkedException(){
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("input.txt")
            );
            String str;
            while ((str = br.readLine()) != null){
                System.out.println(str);
            }
        } catch(FileNotFoundException fne){
            System.out.println("파일 없다 ㅇㄱㅇ");
        } catch (IOException ie) {
            System.out.println("파이 읽는다 오류남");
        }
    }
}
