/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectmahasiswa_3004;

/**
 *
 * @author ASUS
 */
public class Asprak_3004 extends Mahasiswa_3004 implements iPendapatan_3004{
    String MKasistensi_3004;
    int jmlhPertemuan_3004;
    double totalPendapatan_3004;

    public Asprak_3004(){
        
    }
    
    public Asprak_3004(String nim, String nama, String Jurusan, int ipk, 
            String MKasistensi, int jmlhPertemuan){
        super(nim,nama,Jurusan,ipk);
        this.MKasistensi_3004 = MKasistensi_3004;
        this.jmlhPertemuan_3004 = jmlhPertemuan_3004;
        
    }
    
    public void infoAsprak(){
        System.out.println("MKasistensi : " + MKasistensi_3004);
        System.out.println("jmlhPertemuan : " + jmlhPertemuan_3004);
    }
    
    public void tampilDataMhs(){
        super.tampilDataMhs();
        infoAsprak();
    }
    
    public double totalPendapatan_3004(){
        return totalPendapatan_3004 = (double) (jmlhPertemuan_3004 * 50000);
    }
}