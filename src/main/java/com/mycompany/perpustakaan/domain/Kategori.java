/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.perpustakaan.domain;

/**
 *
 * Domain/Entitas dari table m_kategori
 * @author Angga Hantara
 */



public class Kategori {
    
    private Integer kategori_id;
    private String kode_kategori;
    private String nama_kategori;
    
    /**
     * @param Long id  : id kategori
     * @param String kode  : kode kategori
     * @param String nama  : nama kategori
     */
    public Kategori(Integer id, String kode, String nama){
        this.kategori_id = id;
        this.kode_kategori = kode;
        this.nama_kategori = nama;

    }
    
    public Kategori (){}

    /**
     * @return the kategori_id
     */
    public Integer getKategori_id() {
        return kategori_id;
    }

    /**
     * @param kategori_id the kategori_id to set
     */
    public void setKategori_id(int kategori_id) {
        this.kategori_id = kategori_id;
    }

    /**
     * @return the kode_kategori
     */
    public String getKode_kategori() {
        return kode_kategori;
    }

    /**
     * @param kode_kategori the kode_kategori to set
     */
    public void setKode_kategori(String kode_kategori) {
        this.kode_kategori = kode_kategori;
    }

    /**
     * @return the nama_kategori
     */
    public String getNama_kategori() {
        return nama_kategori;
    }

    /**
     * @param nama_kategori the nama_kategori to set
     */
    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }
    
}
