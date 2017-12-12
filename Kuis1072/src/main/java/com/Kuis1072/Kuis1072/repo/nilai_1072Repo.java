/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1072.Kuis1072.repo;

import com.Kuis1072.Kuis1072.entity.nilai_1072;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Mahasiswa 33
 */
public interface nilai_1072Repo extends CrudRepository<nilai_1072, Long> {

    @Query("select n from nilai_1072 n")
    public List<nilai_1072> findAllnilai_1072();
}