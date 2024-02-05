public class Student {
    private String studentNo;
    private String lastName;
    private String firstName;

    public void setStudentNo(String studentNo){
        this.studentNo = studentNo;
    } 

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }
    
    public String getStudentNo(){
        return studentNo;
    }
}