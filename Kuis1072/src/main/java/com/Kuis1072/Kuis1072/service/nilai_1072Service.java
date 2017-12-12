/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1072.Kuis1072.service;

import com.Kuis1072.Kuis1072.entity.nilai_1072;
import com.Kuis1072.Kuis1072.repo.nilai_1072Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Mahasiswa 33
 */
@Service("nilai_1072Service")
@Transactional
public class nilai_1072Service {
      @Autowired
    private nilai_1072Repo repo;

    public nilai_1072 insert(nilai_1072 nilai_1072) {
        return repo.save(nilai_1072);
    }
    
    public nilai_1072 update(nilai_1072 nilai_1072) {
        return repo.save(nilai_1072);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public nilai_1072 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<nilai_1072> getAll(){
        return repo.findAllnilai_1072();
    }
}
