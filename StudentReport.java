import java.io.FileNotFoundException;



public class StudentReport{
    public static void main(String[] args) throws FileNotFoundException{
       
        BlockSectionDA blockSectionDA = new BlockSectionDA();

        for(BlockSection blockSection : blockSectionDA.getBlockSectionList()){
            System.out.println(blockSection.getBlockCode()+  " " +
                                blockSection.getAdviser() );
                            
            for(Student student : blockSection.getStudentList()){
                System.out.println("\t"+student.getStudentNo() + "\t"+ 
                                    student.getLastName() + "\t" +
                                    student.getFirstName());
            }
           
        }
    }
}