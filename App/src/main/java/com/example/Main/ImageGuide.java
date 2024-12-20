package com.example.Main;


import com.example.dto.ExtendedRes;
import com.example.dto.ImageDeleteDto;
import com.example.dto.MinimalRes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface ImageGuide {
    public MinimalRes uploadProfilePic(MultipartFile file);
    public MinimalRes uploadDepotPic(Long depotId, MultipartFile file);
    public MinimalRes updateProductAttributePic(Long qattid,MultipartFile file);
    public ResponseEntity<byte[]> getLocalImage(String who, String imageName);
    public ExtendedRes getProfilePic();
    public ExtendedRes getTruckImages(Long truckId);
    public ExtendedRes getShopImages(Long shopId);
    public MinimalRes deleteShopImages(ImageDeleteDto imageDeleteDto);
    public MinimalRes deleteTruckImages(ImageDeleteDto imageDeleteDto);
}