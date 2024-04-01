package com.example.demo.controller;


import com.example.demo.domain.service.ContAudioVisualServiceImpl;
import com.example.demo.persistence.dtos.ContAudioVisualDTO;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/ContAudioVisualController")
@PreAuthorize("hasRole('ADMIN')")
@SecurityRequirement(name = "bearerAuth")
public class ContAudioVisualController {
    private final ContAudioVisualServiceImpl contAudioVisualService;

    @Autowired
    public ContAudioVisualController(ContAudioVisualServiceImpl contAudioVisualService) {
        this.contAudioVisualService = contAudioVisualService;
    }

    @GetMapping("/getAll")
    public List<ContAudioVisualDTO> getAll() {
        return contAudioVisualService.getAll();
    }

    @GetMapping("/getById/{id}")
    public List<ContAudioVisualDTO> getById(@PathVariable Integer id) {
        return contAudioVisualService.getById(id);
    }

    @PostMapping
    public List<ContAudioVisualDTO> save(@RequestBody ContAudioVisualDTO contAudioVisualDTO) {
        return contAudioVisualService.save(contAudioVisualDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        contAudioVisualService.delete(id);
    }

}
