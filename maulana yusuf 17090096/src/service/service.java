package service;

import java.util.*;
import entity.*;
/**
 *
 * @author haris
 */
public class service {
    
    private static List<handphone> data = new LinkedList<handphone>();
    
    public void addData(handphone hp) {
        data.add(hp);
        System.out.println("Selamat Data Telah diSimpan");
    }
    
    public void updateData(handphone hp){
        int index = data.indexOf(hp);
        if (index >= 0 ) {
        
        data.set(index, hp);
        System.out.println("Selamat Data Telah diUbah");
        }
    }
    
    public void deleteData(String id){
        int idx = data.indexOf(new handphone(id, "", ""));
        if(idx >=0) {
            data.remove(idx);
            System.out.println("Selamat Data Telah diHapus");
        }
    }
    
    public void showAllData() {
        int i=1;
        System.out.println("\nData Dalam Daftar");
        for(handphone hp : data) {
            System.out.println("data ke-"+ i++);
            System.out.println("ID : " + hp.getId());
            System.out.println("Nama : " + hp.getNama());
            System.out.println("MERK : " + hp.setMerk());
        }
    }
}
