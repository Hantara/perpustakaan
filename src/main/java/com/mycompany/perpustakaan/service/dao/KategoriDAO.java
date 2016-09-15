/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.perpustakaan.service.dao;

/**
 * Kelas DAO untuk menangani ACCES ke table Kategori
 * @author Angga Hantara
 */

import com.mycompany.perpustakaan.domain.Kategori;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Component;

public class KategoriDAO {
    // Dummy database. Initialize with some dummy values.
	static HashMap<Integer,Kategori> kategoryIdMap=getkategoryIdMap();


        public KategoriDAO() {
         super();

         if(kategoryIdMap==null)
         {
          kategoryIdMap=new HashMap<Integer,Kategori>();
         // Creating some objects of Country while initializing
          Kategori mtk=new Kategori(1, "K001","Matematika");
          Kategori ipa=new Kategori(2, "K002","IPS");
          Kategori ips=new Kategori(3, "K003","IPA");
          Kategori komputer=new Kategori(4, "K004","Komputer");


          kategoryIdMap.put(1,mtk);
          kategoryIdMap.put(4,komputer);
          kategoryIdMap.put(3,ips);
          kategoryIdMap.put(2,ipa);
         }
        }
        
        // Utility method to get max id
        public static int getMaxId()
        {   int max=0;
        for (int id:kategoryIdMap.keySet()) {  
         if(max<=id)
          max=id;

        }  
        return max;
        }
        
        
	/**
	 * Return Kategori object for given id from dummy database. Kembalikan daftar kategori
	 * 
	 * 
	 * @return Kategori object for given id
	 */
	public List<Kategori> getAllKategori()
        {
         List<Kategori> daftarkategori = new ArrayList<Kategori>(kategoryIdMap.values());
         return daftarkategori;
        }
        
        
        /**
	 * Return Kategori object for given id from dummy database. .
	 * 
	 * @param id
	 *            Kategori id
	 * @return Kategori object for given id
	 */
        public Kategori getKategori(int id)
        {
         Kategori kategori= kategoryIdMap.get(id);
         return kategori;
        }
        
        
        public Kategori addKategori(Kategori kat)
        {
         kat.setKategori_id(getMaxId()+1);
         kategoryIdMap.put(kat.getKategori_id(), kat);
         return kat;
        }

        public Kategori updateKategori(Kategori kat)
        {
         if(kat.getKategori_id()==0){
          return null;
         }
         kategoryIdMap.put(kat.getKategori_id(), kat);
         return kat;

        }
        
        public boolean deleteKategori(int id)  
        {  
         Kategori kategori = kategoryIdMap.get(id);
         kategoryIdMap.remove(id);
         if(kategoryIdMap.get(id) == null){
             return false;
         }else{
             return true;
         }
         
        }  

        
        public static HashMap<Integer, Kategori> getkategoryIdMap() {
            return kategoryIdMap;
       }
        
}
