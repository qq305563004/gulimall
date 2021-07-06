package com.hx.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu????ֵ
 * 
 * @author huangxing
 * @email 305563004@qq.com
 * @date 2021-07-06 16:49:05
 */
@Data
@TableName("pms_product_attr_value")
public class ProductAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ??Ʒid
	 */
	private Long spuId;
	/**
	 * ????id
	 */
	private Long attrId;
	/**
	 * ??????
	 */
	private String attrName;
	/**
	 * ????ֵ
	 */
	private String attrValue;
	/**
	 * ˳?
	 */
	private Integer attrSort;
	/**
	 * ????չʾ???Ƿ?չʾ?ڽ????ϣ?0-?? 1-?ǡ?
	 */
	private Integer quickShow;

}
