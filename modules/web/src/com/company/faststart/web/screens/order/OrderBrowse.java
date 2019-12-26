package com.company.faststart.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.faststart.entity.Order;

@UiController("faststart_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}