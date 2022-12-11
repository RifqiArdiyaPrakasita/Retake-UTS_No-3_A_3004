/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectmahasiswa_3004;

/**
 *
 * @author ASUS
 */
public class ProjectMahasiswa_3004 {

    public static void main(String[] args) {
        Asprak_3004 A = new Asprak_3004("21103004", "rifqi", "Sistem Informasi", 3, "PBO", 12);
        A.tampilDataMhs();
        System.out.println("Total : " + A.totalPendapatan_3004());
        System.out.println("");

        StudentStaff_3004 B = new StudentStaff_3004("21103019", "danu", "Sistem Informasi", 4, 2, 8);
        B.tampilDataMhs();
        System.out.println("Total : " + B.totalPendapatan_3004());
        System.out.println("");
    }
}
