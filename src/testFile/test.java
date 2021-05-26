package testFile;

import java.io.File;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Max_Win_Pro\\Desktop\\a.txt");
        //System.out.println(f.canRead());
        //System.out.println(f.canWrite());
        File f2 = new File("C:\\Users\\Max_Win_Pro\\Desktop\\b.txt");
        //System.out.println(f2.createNewFile());
        //System.out.println(f2.delete());
        //if(f2.exists()){
         //   System.out.println(f2.delete());

        //}else{
           // System.out.println(f2.createNewFile());
        //}
        System.out.println(f == f2);
        System.out.println(f.equals(f2));;
        System.out.println(f2.getAbsolutePath());
    }
}
