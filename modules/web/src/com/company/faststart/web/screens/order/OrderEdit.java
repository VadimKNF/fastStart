package com.company.faststart.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.faststart.entity.Order;

@UiController("faststart_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
}