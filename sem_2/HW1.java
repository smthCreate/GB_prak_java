package sem_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
public class HW1 {
    public static void main(String[] args) throws IOException {
        //String path = "C:\\Users\\user\\Geekbrains\\Java\\sem_2\\string.json";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\user\\Geekbrains\\Java\\sem_2\\string.txt"));
            String line;
            StringBuilder sb = new StringBuilder();
            StringBuilder new_sb = new StringBuilder();
            new_sb.append("select * from students where ");
            while((line=br.readLine())!=null){
                sb.append(line);
            }
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i)!='{' & sb.charAt(i)!='}'){
                    if (sb.charAt(i)==':'){
                        new_sb.append("=");
                    } else {
                        if (sb.charAt(i)=='"'){
                            if (sb.charAt(i-1)==':'||sb.charAt(i+1)==',') {
                                new_sb.append(sb.charAt(i));
                            }
                        } else{new_sb.append(sb.charAt(i));}
                    }
                }
            }
            System.out.println(new_sb);
            
            
        } catch (Exception e){
            e.printStackTrace();
            //System.out.println("catch");
        } finally {
            try{
                br.close();
            } catch(IOException e){
                System.out.println("Error"+e);
            }
        }
        
        
    
    }
     
}
