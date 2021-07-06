package com.hx.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hx.common.utils.PageUtils;
import com.hx.gulimall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author huangxing
 * @email 305563004@qq.com
 * @date 2021-07-06 17:57:04
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

