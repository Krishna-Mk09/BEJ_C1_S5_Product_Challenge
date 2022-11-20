/*
 * Author Name : M.Krishna.
 * Date: 20-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp.BEJ_C1_S5_Product_Challenge.Service;

import com.niit.jdp.BEJ_C1_S5_Product_Challenge.Domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product saveProduct(Product product);

    boolean deleteProduct(int productId);

    List<Product> fetchAllProducts();

    Optional<Product> fetchProductById(int movieId);

    void updateProduct(int mid, Product product);
}
