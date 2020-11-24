package ru.mirea.pr14;

import java.util.Scanner;

public class PhoneNumber {
    private String phoneNum;
    public PhoneNumber(String num){
        StringBuilder result;
        if (num.charAt(0)=='+'){
            result=new StringBuilder("+");
            StringBuilder str=new StringBuilder(num);
            int code=str.length()-4-3*2;
            String buf=str.substring(1,code);
            result.append(buf).append(" ");
            buf=str.substring(code,code+3);
            result.append(buf).append(" ");
            buf=str.substring(code+3,code+6);
            result.append(buf).append(" ");
            buf=str.substring(code+6,str.length());
            result.append(buf);
        }
        else {
            result=new StringBuilder("+7 ");
            StringBuilder str=new StringBuilder(num);
            String buf=str.substring(1,4);
            result.append(buf).append(" ");
            buf=str.substring(4,7);
            result.append(buf).append(" ");
            buf=str.substring(7,str.length());
            result.append(buf);
        }
        phoneNum=result.toString();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String num=scan.nextLine();
        PhoneNumber pn=new PhoneNumber(num);
        System.out.println(pn.getPhoneNum());
    }
}
