import java.io.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author komputer 16
 */
public class FileMerge {
     public static void main(String[] args) {
        String[] files = {
            "C:\\Users\\komputer 16\\Documents\\PBO22A\\src\\CVSReader\\students.csv",
            "C:\\Users\\komputer 16\\Documents\\PBO22A\\src\\CVSReader\\new_students.csv"
        };
        String mergedFile = "C:\\Users\\komputer 16\\Documents\\PBO22A\\src\\CVSReader\\merge_students.csv";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile))){
            for (String file : files){
                try (BufferedReader br = new BufferedReader(new FileReader(file))){
                    String line;
                    while ((line = br.readLine()) != null){
                        bw.write(line);
                        bw.newLine();
                    }
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
    

