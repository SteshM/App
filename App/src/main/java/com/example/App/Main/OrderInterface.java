package com.example.App.Main;


import com.example.App.dto.CartItemRequest;
import com.example.App.dto.ExtendedRes;
import com.example.App.dto.MinimalRes;
import com.example.App.dto.OrderDto;

public interface OrderInterface {
    public MinimalRes placeOrder(OrderDto orderDto);
    public ExtendedRes getOrderItemDetails(Long orderId);
    public MinimalRes addCartItem(CartItemRequest cartItem);
    public ExtendedRes getCartItems();
    public MinimalRes deleteCartItem(Long cartItemId);
    public ExtendedRes getRetailerAndOrders(Long retailerId);
    public ExtendedRes retailerGetHisOrders();
    public ExtendedRes getDepotOrders(Long depotId);
    public ExtendedRes getMyDepotOrders();
    public ExtendedRes getMyDepotAssignedOrders();
    public ExtendedRes getMyDepotUnAssignedOrders();
    public ExtendedRes getMyCartItemsCount();
    //public Customer confirmOrder();
}
