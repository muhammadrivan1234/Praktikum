import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author komputer 16
 */
public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\komputer 16\\Documents\\PBO22A\\src\\CVSReader\\new_students.csv";
        
        Scanner sc = new Scanner(System.in);
        boolean addData = true;            
                
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))){
            while (addData){
                System.out.print("Masukkan data [NIM,NAMA,UMUR,PRODI] : ");
                String data = sc.nextLine();
                
                bw.write(data);
                bw.newLine();
                
                System.out.print("Apakah Ingin Menambahkan lagi? (y/n): ");
                String response = sc.nextLine();
                if(!response.equalsIgnoreCase("y")) {
                    addData = false;
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}