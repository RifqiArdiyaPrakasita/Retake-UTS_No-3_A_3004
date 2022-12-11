/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectmahasiswa_3004;

/**
 *
 * @author ASUS
 */
public class StudentStaff_3004 extends Mahasiswa_3004 implements iPendapatan_3004 {

    int unitKerja_3004;
    int jamKerja_3004;
    double totalPendapatan_3004;

    public StudentStaff_3004() {

    }

    public StudentStaff_3004(String nim, String nama, String Jurusan, int ipk,
            int unitKerja, int jamKerja) {
        super(nim, nama, Jurusan, ipk);
        this.unitKerja_3004 = unitKerja_3004;
        this.jamKerja_3004 = jamKerja_3004;
    }
    
    public void tampilDataMhs(){
        super.tampilDataMhs();
        infostuden();
    }
    
    public void infostuden(){
        System.out.println("unitKerja : " + unitKerja_3004);
        System.out.println("jamKerja : " + jamKerja_3004);
    }

    @Override
    public double totalPendapatan_3004() {
        return totalPendapatan_3004 = (int) (jamKerja_3004 * 30000);
    }
}
