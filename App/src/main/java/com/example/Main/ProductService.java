package com.example.Main;

//import com.example.App.dto.*;
import com.example.dto.*;
import com.example.models.QuantityAttribute;
import org.springframework.web.multipart.MultipartFile;

public interface  ProductService {

    MinimalRes createProduct(ProductsDto productsDto);
    MinimalRes addQAttribute(AddAttributeDto addAttributeDto, MultipartFile file);
    ExtendedRes findById(Long id);
    ExtendedRes updateById(ProductsDto productsDto);
    ExtendedRes findAll();
    MinimalRes deleteById(Long id);
    ExtendedRes getProductQAttributes(Long productId);
    ExtendedRes updateProductQAttById(QuantityAttribute attribute);
    MinimalRes addOffer(OfferDto offerDto);
    ExtendedRes getDisplayProducts();
}