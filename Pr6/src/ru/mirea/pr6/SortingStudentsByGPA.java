package ru.mirea.pr6;

import java.util.Scanner;

public class SortingStudentsByGPA {
    public interface Comparator<Student>{
        boolean compare(Student a, Student b);
    }
    public static class StudentsComparator implements Comparator<Student>{
        public boolean compare(Student a, Student b){
            return a.getGrade()>b.getGrade();
        }
    }
    static StudentsComparator comparator=new StudentsComparator();
    int partition(Student list[], int low, int high) {
        Student base = list[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (!comparator.compare(list[j],base)) {
                i++;
                Student temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }
        Student temp = list[i + 1];
        list[i + 1] = list[high];
        list[high] = temp;
        return i + 1;
    }
    void quickSort(Student list[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(list, low, high);
            quickSort(list, low, pi-1);
            quickSort(list, pi+1, high);
        }
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Input number of students: ");
        int n;
        if (scan.hasNextInt())
            n=scan.nextInt();
        else {
            System.out.println("You didn't input integer number.");
            return;
        }
        scan.nextLine();
        Student[] list=new Student[n];
        String name;
        int grade;
        for (int i=0;i<n;i++){
            System.out.print("Input student name: ");
            if (scan.hasNextLine())
                name=scan.nextLine();
            else {
                System.out.println("There is no line to read.");
                return;
            }
            System.out.print("Input student grade: ");
            if (scan.hasNextInt())
                grade=scan.nextInt();
            else{
                System.out.println("There is no integer number to read.");
                return;
            }
            scan.nextLine();
            list[i]=new Student(name,grade);
        }
        SortingStudentsByGPA sort=new SortingStudentsByGPA();
        sort.quickSort(list,0,n-1);
        for (int i=0;i<n;i++)
            System.out.println(list[i]);
    }
}
