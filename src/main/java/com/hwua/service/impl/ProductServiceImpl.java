package com.hwua.service.impl;

import com.hwua.mapper.ProductMapper;
import com.hwua.pojo.Product;
import com.hwua.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> queryAllProducts() throws Exception {
        return productMapper.queryAllProducts();
    }

    @Override
    public Integer addProduct(Product product) throws Exception {
        return productMapper.addProduct(product);
    }
}
