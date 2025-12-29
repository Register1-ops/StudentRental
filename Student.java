public class Student extends User{
    private String universityName;
    private String studentId;
    
    public Student(int id, String name, String email, String passwordHash, String universityName, String studentId){
        super(id, name, email, passwordHash);
        this.universityName = universityName;
        this.studentId = studentId;
    }

    public String getUniversityName(){
        return universityName;
    }
    public void setUniversityName(){
        this.universityName = universityName;
    }

    public String getStudentId(){
        return studentId;
    }
    public void setStudentId(){
        this.studentId = studentId;
    }

    @Override
    public String getRole(){
        return "STUDENT";
    }

}