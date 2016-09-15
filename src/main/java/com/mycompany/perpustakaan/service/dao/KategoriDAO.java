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

@Component
public class KategoriDAO {

	// Dummy database. Initialize with some dummy values.
	private static List<Kategori> daftarkategori;
	{
		daftarkategori = new ArrayList();
		daftarkategori.add(new Kategori(1, "K001", "Matematika"));
		daftarkategori.add(new Kategori(2, "K002", "IPS"));
		daftarkategori.add(new Kategori(3, "K003", "Komputer"));
		
	}

	/**
	 * Returns list of daftarkategori from dummy database.
	 * 
	 * @return list of kategori
	 */
	public List list() {
		return daftarkategori;
	}

	/**
	 * Return kategori object for given id from dummy database. If kategori is
	 * not found for id, returns null.
	 * 
	 * @param id
	 *            kategori id
	 * @return kategori object for given id
	 */
	public Kategori get(int id) {

		for (Kategori c : daftarkategori) {
			if (c.getKategori_id().equals(id)) {
				return c;
			}
		}
		return null;
	}

	/**
	 * Create new kategori in dummy database. Updates the id and insert new
	 * kategori in list.
	 * 
	 * @param kategori
	 *            kategori object
	 * @return kategori object with updated id
	 */
	public Kategori create(Kategori kategori) {
                kategori.setKategori_id(3);
		daftarkategori.add(kategori);
		return kategori;
	}

	/**
	 * Delete the kategori object from dummy database. If customer not found for
	 * given id, returns null.
	 * 
	 * @param id
	 *            the kategori id
	 * @return id of deleted kategori object
	 */
	public Integer delete(int id) {

		for (Kategori c : daftarkategori) {
			if (c.getKategori_id().equals(id)) {
				daftarkategori.remove(c);
				return id;
			}
		}

		return null;
	}

	/**
	 * Update the Kategori object for given id in dummy database. If Kategori
	 * not exists, returns null
	 * 
	 * @param id
	 * @param kategori
	 * @return kategori object with id
	 */
	public Kategori update(int id, Kategori kategori) {

		for (Kategori c : daftarkategori) {
			if (c.getKategori_id().equals(id)) {
				kategori.setKategori_id(c.getKategori_id());
				daftarkategori.remove(c);
                                daftarkategori.add(kategori);
				return kategori;
			}
		}

		return null;
	}

}