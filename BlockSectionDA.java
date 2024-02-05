import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class BlockSectionDA{
    private List<BlockSection> blockSectionList;

    public List<BlockSection> getBlockSectionList(){
        return blockSectionList;
    }
    //create contructor - set initial action of an object
    public BlockSectionDA() throws FileNotFoundException{

        blockSectionList = new ArrayList<>();

        Scanner blockFile = new Scanner(new FileReader("BlockFile.csv"));

        while(blockFile.hasNext()){
            BlockSection blockSection = new BlockSection();
           
            String blockSectionRaw = blockFile.nextLine();
            String[] blockSectionArray = new String[2];
            blockSectionArray = blockSectionRaw.split(",");

            //set the value for the  block setion object 
            blockSection.setBlockCode(blockSectionArray[0].trim());
            blockSection.setAdviser(blockSectionArray[1].trim());

            StudentDA studentDA = new StudentDA(blockSection.getBlockCode());
            blockSection.setStudentList(studentDA.getStudentList());
            blockSectionList.add(blockSection);
        }

        blockFile.close();

    }


    
}