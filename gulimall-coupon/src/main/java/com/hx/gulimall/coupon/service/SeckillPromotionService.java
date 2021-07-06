package com.hx.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hx.common.utils.PageUtils;
import com.hx.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * ??ɱ?
 *
 * @author huangxing
 * @email 305563004@qq.com
 * @date 2021-07-06 17:24:12
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

