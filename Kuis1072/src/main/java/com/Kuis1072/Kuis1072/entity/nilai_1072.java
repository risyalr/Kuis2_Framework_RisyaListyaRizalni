/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1072.Kuis1072.entity;

import java.io.Serializable;
import static java.util.Collections.list;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 *
 * @author Mahasiswa 33
 */
@Entity
@Table(name = "nilai_1072")
public class nilai_1072 implements Serializable { 
    @Column(length = 255, nullable = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_nilai;
    @Column(length = 100, nullable = false, unique = true)
    private String nama;
    @Column(length = 255, nullable = true)
    private double nilai;
    @Column(length = 255, nullable = true)
    @OneToMany(mappedBy="owner")
    private List <cv_1072> cv_1072;
     /**
     * @return the id
     */
    public Long getId() {
        return id_nilai;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id_nilai = id_nilai;
    }

    /**
     * @return the name
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param name the name to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the price
     */
    public double getNilai() {
        return nilai;
    }

    /**
     * @param price the price to set
     */
    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

   
    /**
     * @return the category
     */
   
    
}