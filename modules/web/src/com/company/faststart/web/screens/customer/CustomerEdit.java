package com.company.faststart.web.screens.customer;

import com.company.faststart.entity.Order;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.faststart.entity.Customer;

import javax.inject.Inject;


@UiController("faststart_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {

    @Inject
    private CollectionLoader<Order> ordersDl;

    @Subscribe
    protected void onBeforeShow(BeforeShowEvent event) {
        ordersDl.setParameter("customer", getEditedEntity());
        getScreenData().loadAll();
    }
}