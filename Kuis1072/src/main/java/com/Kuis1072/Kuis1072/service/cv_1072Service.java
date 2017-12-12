/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1072.Kuis1072.service;

import com.Kuis1072.Kuis1072.entity.cv_1072;
import com.Kuis1072.Kuis1072.repo.cv_1072Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mahasiswa 33
 */
@Service("cv_1072Service")
@Transactional
public class cv_1072Service {

    @Autowired
    private cv_1072Repo repo;

    public cv_1072 insert(cv_1072 cv_1072) {
        return repo.save(cv_1072);
    }
    
    public cv_1072 update(cv_1072 cv_1072) {
        return repo.save(cv_1072);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public cv_1072 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<cv_1072> getAll(){
        return repo.findAllcv_1072();
    }
}
