package cn.how2j.util;

import cn.how2j.client.ProductClientFeign;
import cn.how2j.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ProductClientFeignHystrix implements ProductClientFeign {
    @Override
    public List<Product> listProdcuts() {
        List<Product> result = new ArrayList<>();
        result.add(new Product(0,"产品数据微服务不可用",0));
        return result;
    }
}
