package sem_2;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class HW2 {
    public static void main(String[] args) throws IOException{
        int[] array = new int[] {1,2,2,3,45,5,32,2,4,55};
        Logger logger = Logger.getLogger(HW2.class.getName());
        // logger.setLevel(Level.INFO);
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);  
        
        for (int i = 1; i < array.length+1; i++) {
            System.out.println("LOG");
            
            logger.info("тестовое логирование");
            if (array[i]<array[i-1]){
                int temporar = array[i];
                array[i] = array[i-1];
                array[i-1] = temporar;
            }
        }       
    }
    
    
}
