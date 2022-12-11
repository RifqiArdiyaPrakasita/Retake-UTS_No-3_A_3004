/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectmahasiswa_3004;

/**
 *
 * @author ASUS
 */
public class Mahasiswa_3004 {
    String nim_3004;
    String nama_3004;
    String Jurusan_3004;
    int ipk_3004;
    
    public Mahasiswa_3004(){
        
    }
    
    public Mahasiswa_3004(String nim_3004, String nama_3004, String Jurusan_3004, int ipk_3004){
        this.nim_3004 = nim_3004;
        this.nama_3004 = nama_3004;
        this.Jurusan_3004 = Jurusan_3004;
        this.ipk_3004 = ipk_3004;
    }
    
    public void tampilDataMhs(){
        System.out.println("nim : " + nim_3004);
        System.out.println("nama: " + nama_3004);
        System.out.println("Jurusan : " + Jurusan_3004);
        System.out.println("ipk : " + ipk_3004);
    }

}
