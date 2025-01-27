package com.Programming.product.service.controller;

import com.Programming.product.service.dto.ProductRequest;
import com.Programming.product.service.dto.ProductResponse;
import com.Programming.product.service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class productController {
    private final ProductService productService;
@PostMapping
@ResponseStatus(HttpStatus.CREATED)

    public void createProduct(@RequestBody ProductRequest productRequest) {
      productService.createProduct(productRequest);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProduct()
{
   return productService.getAllProducts();

 }
  }
