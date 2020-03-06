package com.hwua.mapper;

import com.hwua.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ProductMapper {
    List<Product> queryAllProducts()throws Exception;
    Integer addProduct(Product product)throws Exception;
}
