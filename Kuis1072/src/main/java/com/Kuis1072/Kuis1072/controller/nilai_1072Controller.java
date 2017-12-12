/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1072.Kuis1072.controller;

import com.Kuis1072.Kuis1072.entity.nilai_1072;
import com.Kuis1072.Kuis1072.service.nilai_1072Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Mahasiswa 33
 */

@RestController
@RequestMapping("/nilai_1072")
public class nilai_1072Controller {
    @Autowired
    private nilai_1072Service nilai_1072Service;

    @RequestMapping(method = RequestMethod.POST)
    public nilai_1072 insert(@RequestBody nilai_1072 nilai_1072) {
        return nilai_1072Service.insert(nilai_1072);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public nilai_1072 update(@RequestBody nilai_1072 nilai_1072) {
        return nilai_1072Service.update(nilai_1072);
    }

   
}

