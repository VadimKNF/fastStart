package com.company.faststart.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.faststart.entity.Customer;

@UiController("faststart_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}