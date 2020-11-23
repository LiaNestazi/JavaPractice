package ru.mirea.pr9.var2;


public class LabClass {
    Student[] list=new Student[1];
    public interface Comparator<Student>{
        boolean compare(Student a, Student b);
    }
    public static class StudentsComparator implements LabClass.Comparator<Student> {
        public boolean compare(Student a, Student b){
            return a.getGrade()>b.getGrade();
        }
    }
    static LabClass.StudentsComparator comparator=new LabClass.StudentsComparator();
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
    void clone(Student[] bigArray, Student[] smallArray){
        int i=0;
        for (Student s:smallArray){
            bigArray[i]=s;
            i++;
        }
    }
    void clear(){
        list=new Student[1];
    }
}
