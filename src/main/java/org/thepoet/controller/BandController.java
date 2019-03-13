package org.thepoet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thepoet.model.Band;
import org.thepoet.service.spec.BandService;

import java.util.List;

/**
 * @author Oguzhan Dogan <dogan_oguzhan@hotmail.com>
 */
@RestController
public class BandController {

    @Autowired
    private BandService bandService;

    @GetMapping("/list")
    public List<Band> getBandList() {
        return bandService.getBandList();
    }
}