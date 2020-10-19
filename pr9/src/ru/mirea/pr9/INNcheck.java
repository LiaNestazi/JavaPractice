package ru.mirea.pr9;

import java.util.ArrayList;
import java.util.Scanner;

public class INNcheck {
    private String FIO;
    private String INN;
    private ArrayList<String> INNBase;
    public INNcheck(){
        INNBase=new ArrayList<String>();
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setINN(String INN) {
        this.INN = INN;
    }

    public String getFIO() {
        return FIO;
    }

    public void setINNBase(ArrayList<String> INNBase) {
        this.INNBase = INNBase;
    }

    public String getINN() {
        return INN;
    }

    public ArrayList<String> getINNBase() {
        return INNBase;
    }

    public boolean findINN(String INN){
        for (String str:INNBase){
            if (str.equals(INN)){
                return true;
            }
        }
        return false;
    }

    public boolean isValidINNNumber(String INN){
        if (findINN(INN)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        INNcheck ch=new INNcheck();
        ch.getINNBase().add("406465783425");
        ch.getINNBase().add("406465725684");
        ch.getINNBase().add("406465702458");
        ch.getINNBase().add("406465712036");
        ch.setFIO(scan.nextLine());
        ch.setINN(scan.nextLine());
        try {
            if (ch.getINN().length()!=12){
                throw new BadINNSizeException("Wrong INN length - there must be 12 symbols:"+ch.getINN());
            }
            if (!ch.isValidINNNumber(ch.getINN()))
                throw new BadINNException("Invalid INN number:"+ch.getINN());
        } catch(BadINNException | BadINNSizeException e){
            System.out.print(e.getMessage());
        }
    }
}
