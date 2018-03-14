package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.vo.OrderVo;

import java.util.Map;

public interface IOrderService {
    // portal
    ServerResponse pay(Long orderNo, Integer userId, String path);
    ServerResponse aliCallback(Map<String, String> params);
    ServerResponse queryOrderPayStatus(Integer userId,Long orderNo);

    ServerResponse createOrder(Integer userId, Integer shippingId); // TODO 返回值
    ServerResponse getOrderCartProduct(Integer userId); // TODO
    ServerResponse<OrderVo> getOrderDetail(Integer userId, Long orderNo); // 根据订单号获取订单视图对象详细
    ServerResponse<String> cancel(Integer userId, Long orderNo);

    ServerResponse<PageInfo> getOrderList(Integer userId, int pageNum, int pageSize);

    // back-end
    ServerResponse<PageInfo> manageList(int pageNum, int pageSize);
    ServerResponse<PageInfo> manageSearch(Long orderNo, int pageNum, int pageSize);
    ServerResponse<OrderVo> manageDetail(Long orderNo);
    ServerResponse<String> manageSendGoods(Long orderNo);
}
