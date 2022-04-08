package basic;
import java.util.Scanner;
public class Assignment1Q9 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        Student[] students = new Student[3];
        for(int i=0,j=1;i<3;i++,j++){
            System.out.println("Marks of Student "+j+" in subjects A,B,C");
            int subA = rd.nextInt();
            int subB = rd.nextInt();
            int subC = rd.nextInt();
            students[i]=new Student(subA,subB,subC);
        }

        //Printing Output
        Student obj = new Student(0,0,0);
        System.out.println(obj.studentsTotalMarksInAllSubjects(students));
        System.out.println(obj.studentsAverageMarksInAllSubjects(students));
        System.out.println(obj.subjectATotalByStudents(obj.subjectWiseMarks(students,"A")));
        System.out.println(obj.subjectAAverageByStudents(obj.subjectWiseMarks(students,"A")));
        System.out.println(obj.subjectATotalByStudents(obj.subjectWiseMarks(students,"B")));
        System.out.println(obj.subjectAAverageByStudents(obj.subjectWiseMarks(students,"B")));
        System.out.println(obj.subjectATotalByStudents(obj.subjectWiseMarks(students,"C")));
        System.out.println(obj.subjectAAverageByStudents(obj.subjectWiseMarks(students,"C")));


    }
}

class Student{
    private int subjectA,subjectB,subjectC;
    Student(int subjectA,int subjectB,int subjectC){
        this.subjectA=subjectA;
        this.subjectB=subjectB;
        this.subjectC=subjectC;
    }

    public int studentsTotalMarksInAllSubjects(Student[] students){
        int total=0;
        for(int i=0;i<3;i++){
            total+=students[i].subjectA+students[i].subjectB+students[i].subjectC;
        }
        return total;
    }
    public double studentsAverageMarksInAllSubjects(Student[] students){
        double total=0;
        for(int i=0;i<3;i++){
            total+=students[i].subjectA+students[i].subjectB+students[i].subjectC;
        }
        return total/3;
    }
    public int[] subjectWiseMarks(Student[] students, String subjectName){
        int[] arr = new int[3];
        if(subjectName.equals("A")){
            arr[0]=students[0].subjectA;
            arr[1]=students[1].subjectA;
            arr[2]=students[2].subjectA;
        }
        else if(subjectName.equals("B")){
            arr[0]=students[0].subjectB;
            arr[1]=students[1].subjectB;
            arr[2]=students[2].subjectB;
        }
        else if(subjectName.equals("C")){
            arr[0]=students[0].subjectC;
            arr[1]=students[1].subjectC;
            arr[2]=students[2].subjectC;
        }
        return arr;
    }
    public int subjectATotalByStudents(int[] marks){
        return marks[0]+marks[1]+marks[2];
    }
    public int subjectBTotalByStudents(int[] marks){
        return marks[0]+marks[1]+marks[2];
    }
    public int subjectCTotalByStudents(int[] marks){
        return marks[0]+marks[1]+marks[2];
    }
    public double subjectAAverageByStudents(int[] marks){
        return (marks[0]+marks[1]+marks[2])/3;
    }
    public double subjectBAverageByStudents(int[] marks){
        return (marks[0]+marks[1]+marks[2])/3;
    }
    public double subjectCAverageByStudents(int[] marks){
        return (marks[0]+marks[1]+marks[2])/3;
    }
}