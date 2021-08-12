package cn.how2j.web;

import cn.how2j.pojo.Product;
import cn.how2j.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("products")
    public Object products(Model model){
        List<Product> ps= productService.listProducts();
        model.addAttribute("ps",ps);
        return "products";
    }
}
