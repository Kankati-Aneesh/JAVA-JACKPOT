class student{
    int roll;
    String name;
    int marks;
}
public class arrobj {

    public static void main(String[] args) {
        student s1 = new student();
        s1.roll = 56;
        s1.name = "aneesh";
        s1.marks = 100;

         student s2 = new student();
        s2.roll = 56;
        s2.name = "aneesh";
        s2.marks = 100;

         student s3 = new student();
        s3.roll = 56;
        s3.name = "aneesh";
        s3.marks = 100;

        student students[] = new student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        System.out.println(s1);
        /*  for(student stud:students){
            System.out.println(stud.name+":"+stud.roll);
        }*/
        for(int i =0;i<students.length;i++){

            System.out.println(students[i].name+":"+students[i].roll);

        }
    }
    
}
