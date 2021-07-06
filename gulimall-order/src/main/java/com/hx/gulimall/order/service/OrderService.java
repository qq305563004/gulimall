package com.hx.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hx.common.utils.PageUtils;
import com.hx.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * ????
 *
 * @author huangxing
 * @email 305563004@qq.com
 * @date 2021-07-06 17:48:37
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

