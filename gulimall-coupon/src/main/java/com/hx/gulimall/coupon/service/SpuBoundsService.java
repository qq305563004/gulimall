package com.hx.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hx.common.utils.PageUtils;
import com.hx.gulimall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * ??Ʒspu???????
 *
 * @author huangxing
 * @email 305563004@qq.com
 * @date 2021-07-06 17:24:12
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

