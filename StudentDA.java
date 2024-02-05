import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDA{
    private List<Student> studentList;
    //set getter method 
    public List<Student> getStudentList(){
        return studentList;
    }

    //set contructor 
    public StudentDA(String blockCode) throws FileNotFoundException{
        studentList = new ArrayList<>();
        Scanner blockSectionStudentFile = new Scanner(new FileReader("BlockSectionStudentFile.csv"));
        
        while(blockSectionStudentFile.hasNext()){
            String blockSectionRaw = blockSectionStudentFile.nextLine();
            String[] blockSectionArray = new String[2];

            blockSectionArray = blockSectionRaw.split(",");
            
            if(blockSectionArray[0].trim().equals(blockCode)){
                Scanner studentFile = new Scanner(new FileReader("StudentFile.csv"));
                while(studentFile.hasNext()){
                    String studentRaw = studentFile.nextLine();
                    String[] studentArray = new String[3];
                    studentArray = studentRaw.split(",");
    
    
                    if(blockSectionArray[1].trim().equals(studentArray[0].trim())){
                        Student student = new Student();
                        student.setStudentNo(studentArray[0].trim());
                        student.setLastName(studentArray[1].trim());
                        student.setFirstName(studentArray[2].trim());
    
                        studentList.add(student);
    
                    }
                }
                studentFile.close();
            }
        }
        blockSectionStudentFile.close();
    }
}