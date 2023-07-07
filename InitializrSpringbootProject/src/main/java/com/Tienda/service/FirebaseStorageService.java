/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda.service;

import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author JordanStevenChavarri
 */
public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    final String BucketName = "techshop-14882.appspot.com";
    
    final String rutaSuperiorStorage = "techshop";
    
    final String rutaJsonFile = "firebase";
    
    final String archivoJsonFile = "techshop-14882-firebase-adminsdk-5tjsa-85308f9509";
}
