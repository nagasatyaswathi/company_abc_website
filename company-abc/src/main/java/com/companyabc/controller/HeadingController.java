package com.companyabc.controller;

import com.companyabc.model.Heading;
import com.companyabc.repository.HeadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class HeadingController {

    @Autowired
    private HeadingRepository headingRepository;

    @GetMapping("/heading")
    public Optional<Heading> getHeading() {
        return headingRepository.findById(1L);
    }

    @PostMapping("/heading")
    public Heading updateHeading(@RequestBody Heading heading) {
        heading.setId(1L);
        return headingRepository.save(heading);
    }
}
