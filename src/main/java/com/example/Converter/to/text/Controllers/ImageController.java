package com.example.Converter.to.text.Controllers;

import com.example.Converter.to.text.Models.ImageRequest;
import com.example.Converter.to.text.Services.TextGraphicsConverterService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ImageController {
    TextGraphicsConverterService service;
    public ImageController(TextGraphicsConverterService service){
        this.service = service;
    }

    @PostMapping("/image")
    public String getImage(@RequestBody ImageRequest imageRequest) {
        try{
            return service.convert(imageRequest.getUrl());
        } catch (Exception s){
            return null;
        }
    }
}
