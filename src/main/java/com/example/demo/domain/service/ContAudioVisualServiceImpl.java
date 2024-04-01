package com.example.demo.domain.service;

import com.example.demo.domain.repository.ContAudioVisualRepository;
import com.example.demo.persistence.ContAudioVisual;
import com.example.demo.persistence.dtos.ContAudioVisualDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ContAudioVisualServiceImpl implements ServiceInterface<ContAudioVisualDTO>{

    private final ContAudioVisualRepository contAudioVisualRepository;

    public ContAudioVisualServiceImpl(ContAudioVisualRepository contAudioVisualRepository) {
        this.contAudioVisualRepository = contAudioVisualRepository;
    }

    @Override
    public List<ContAudioVisualDTO> getAll() {
        return contAudioVisualRepository.findAll().stream()
                .map(ContAudioVisual:: toDTO)
                .toList();
    }

    @Override
    public List<ContAudioVisualDTO> getById(Integer id) {
        return contAudioVisualRepository.findById(id).stream()
                .map(ContAudioVisual:: toDTO)
                .toList();
    }

    @Override
    public List<ContAudioVisualDTO> save(ContAudioVisualDTO contAudioVisualDTO) {
        return null;
    }

    @Override
    public void delete(Integer id) {
        Optional<ContAudioVisual> optionalContAudioVisual = contAudioVisualRepository.findById(id);

        if (optionalContAudioVisual.isPresent()) {
            contAudioVisualRepository.deleteById(id);
            System.out.println("¡¡ Contenido audio visual eliminado !!");
        } else {
            throw new Error("Contenido audio visual no encontrado con ID " + id);
        }
    }

    @Override
    public void update(Integer id, ContAudioVisualDTO contAudioVisualDTO) {

    }


}
