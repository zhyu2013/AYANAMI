package com.whoiszxl.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.whoiszxl.product.entity.Product;
import com.whoiszxl.product.entity.Spu;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author author
 * @since 2020-03-20
 */
public interface SpuService extends IService<Spu> {

    /**
     * 新增商品
     * @param product
     */
    void add(Product product);
}
