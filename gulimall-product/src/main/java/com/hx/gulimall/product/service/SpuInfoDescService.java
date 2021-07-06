package com.hx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hx.common.utils.PageUtils;
import com.hx.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu??Ϣ???
 *
 * @author huangxing
 * @email 305563004@qq.com
 * @date 2021-07-06 16:49:05
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

