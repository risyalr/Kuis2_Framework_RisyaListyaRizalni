/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1072.Kuis1072.controller;

import com.Kuis1072.Kuis1072.entity.cv_1072;
import com.Kuis1072.Kuis1072.service.cv_1072Service;
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
@RequestMapping("/cv_1072")
public class cv_1072Controller {
    @Autowired
    private cv_1072Service cv_1072Service;

    @RequestMapping(method = RequestMethod.POST)
    public cv_1072 insert (@RequestBody cv_1072 cv_1072) {
        return cv_1072Service.insert(cv_1072);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public cv_1072 update(@RequestBody cv_1072 cv_1072) {
        return cv_1072Service.update(cv_1072);
    }

}
