package com.hx.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hx.gulimall.product.entity.BrandEntity;
import com.hx.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity b = new BrandEntity();
//        b.setDescript("华为！！！");
//        b.setName("华为");
//        brandService.save(b);
//        System.out.println("成功!!!");
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 3));
        list.forEach((item)->{
            System.out.println(item);
        });
    }

}
