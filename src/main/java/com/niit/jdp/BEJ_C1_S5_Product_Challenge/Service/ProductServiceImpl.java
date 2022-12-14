/*
 * Author Name : M.Krishna.
 * Date: 20-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp.BEJ_C1_S5_Product_Challenge.Service;

import com.niit.jdp.BEJ_C1_S5_Product_Challenge.Domain.Product;
import com.niit.jdp.BEJ_C1_S5_Product_Challenge.Reposiory.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements ProductService {
    private  ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public boolean deleteProduct(int productId) {
        productRepository.deleteById(productId);
        return true;
    }

    @Override
    public List<Product> fetchAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Optional<Product> fetchProductById(int productId) {
        return productRepository.findById(productId);
    }

    @Override
    public void updateProduct(int productId, Product product) {
        productRepository.save(product);
    }
}
