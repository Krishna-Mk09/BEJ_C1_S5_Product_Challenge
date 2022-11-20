/*
 * Author Name : M.Krishna.
 * Date: 20-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp.BEJ_C1_S5_Product_Challenge.Reposiory;

import com.niit.jdp.BEJ_C1_S5_Product_Challenge.Domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
