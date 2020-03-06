package com.hwua.service;

import com.hwua.pojo.Product;

import java.util.List;

public interface IProductService {
    List<Product> queryAllProducts()throws Exception;
    Integer addProduct(Product product)throws Exception;
}
