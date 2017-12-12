/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1072.Kuis1072.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 *
 * @author Mahasiswa 33
 */
@Entity
@Table(name = "cv_1072")
public class cv_1072 implements Serializable { 
    @Column(length = 255, nullable = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cv;
    @Column(length = 100, nullable = false, unique = true)
    private String nama;
    @Column(length = 255, nullable = true)
    private String tempat_tanggal_lahir;
    @Column(length = 255, nullable = true)
    private String jenis_kelamin;
    @Column(length = 255, nullable = true)
    private String agama;
    @Column(length = 255, nullable = true)
    private String status;
    @Column(length = 255, nullable = true)
    private String alamat;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn (name="id_nilai")
    private nilai_1072 owner;
    
     public Long getId() {
        return id_cv;
    }

    public void setId(Long id) {
        this.id_cv = id_cv;
    }


    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

     public String getTempat_tanggal_lahir() {
        return tempat_tanggal_lahir;
    }
    

    public void setTempat_tanggal_lahir(String tempat_tanggal_lahir) {
        this.tempat_tanggal_lahir = tempat_tanggal_lahir;
    }

   
    
    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

   
    public String getJenis_kelamin() {
        return jenis_kelamin;
    }
    
  
    public void setAgama(String agama) {
        this.agama = agama;
    }

   
    public String getAgama() {
        return agama;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

   
    public String getStatus() {
        return status;
    }
    
 
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

   
    public String getAlamat() {
        return alamat;
    }

}


