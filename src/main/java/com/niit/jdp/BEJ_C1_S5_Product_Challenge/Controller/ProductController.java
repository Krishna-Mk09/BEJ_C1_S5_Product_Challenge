/*
 * Author Name : M.Krishna.
 * Date: 18-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp.BEJ_C1_S5_Product_Challenge.Controller;

import com.niit.jdp.BEJ_C1_S5_Product_Challenge.Domain.Product;
import com.niit.jdp.BEJ_C1_S5_Product_Challenge.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vi")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/insertProduct")
    public ResponseEntity<?> saveFunction(@RequestBody Product product) {
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }


    @GetMapping("/fetchAllProducts")
    public ResponseEntity<?> fetchFunction() {
        return new ResponseEntity<>(productService.fetchAllProducts(), HttpStatus.OK);
    }


    @DeleteMapping("/deleteById/{productId}")
    public ResponseEntity<?> deleteFunction(@PathVariable int productId) {
        productService.deleteProduct(productId);
        return new ResponseEntity<>("deleted", HttpStatus.CREATED);
    }


    @GetMapping("/getById/{productId}")
    public ResponseEntity<?> getByIdFunction(@PathVariable int productId) {
        productService.fetchProductById(productId);
        return new ResponseEntity<>(productService.fetchProductById(productId), HttpStatus.OK);
    }


    @PutMapping("/updateById/{productId}")
    public ResponseEntity<?> updateByIdFunction(@PathVariable int productId, @RequestBody Product product) {
        productService.updateProduct(productId, product);
        return new ResponseEntity<>("product Record Updated", HttpStatus.OK);
    }
}

