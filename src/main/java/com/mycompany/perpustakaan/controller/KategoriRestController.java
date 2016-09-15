/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.perpustakaan.controller;

/**
 * Class REST kategori kontroller
 *
 * @author Angga Hantara
 */
import com.mycompany.perpustakaan.domain.Kategori;
import com.mycompany.perpustakaan.service.dao.KategoriDAO;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KategoriRestController {

    @Autowired
    private KategoriDAO kategoridao;

    
    
    
    @GetMapping("/daftarkategori")
    public List getKategoris() {
        return kategoridao.list();
    }

    @GetMapping("/daftarkategori/{id}")
    public ResponseEntity getKategori(@PathVariable("id") int id) {

        Kategori kategori = kategoridao.get(id);
        if (kategori == null) {
            return new ResponseEntity("No Kategori found for ID " + id, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(kategori, HttpStatus.OK);
    }

    @PostMapping(value = "/daftarkategori")
    public ResponseEntity createKategori(@RequestBody Kategori kategori) {

        kategoridao.create(kategori);

        return new ResponseEntity(kategori, HttpStatus.OK);
    }

    @DeleteMapping("/daftarkategori/{id}")
    public ResponseEntity deleteKategori(@PathVariable int id) {

        if (null == kategoridao.delete(id)) {
            return new ResponseEntity("No Kategori found for ID " + id, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(id, HttpStatus.OK);

    }

    @PutMapping("/daftarkategori/{id}")
    public ResponseEntity updateKategori(@PathVariable int id, @RequestBody Kategori kategori) {
        kategori = kategoridao.update(id, kategori);

        if (null == kategori) {
            return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(kategori, HttpStatus.OK);
    }
}
