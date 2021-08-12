package cn.how2j.service;

import cn.how2j.client.ProductClientFeign;
import cn.how2j.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductClientFeign productClientFeign;
    public List<Product> listProducts(){
      return  productClientFeign.listProdcuts();
    }
}
