package ru.mirea.pr9.var2;

public class LabClassDriver {
    public void run(Student[] list){
        LabClass sort=new LabClass();
        sort.quickSort(list,0,list.length-1);
    }
}
