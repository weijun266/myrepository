package com.example.add_on_myapplication.demo;

import com.example.add_on_myapplication.MyComponent;
import com.google.gwt.user.client.ui.KeyboardListener;
import com.google.gwt.user.client.ui.KeyboardListenerAdapter;
import com.google.gwt.user.client.ui.Widget;

import java.lang.reflect.Method;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import test.TextFieldExtension;

@Theme("demo")
@Title("MyComponent Add-on Demo")
@SuppressWarnings("serial")
public class DemoUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = DemoUI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {

		// Initialize our new UI component
		final MyComponent component = new MyComponent();

		// Show it in the middle of the screen
		final VerticalLayout layout = new VerticalLayout();
//
//		layout.setStyleName("demoContentLayout");
//		layout.setSizeFull();
//		layout.setMargin(false);
//		layout.setSpacing(false);
//		layout.addComponent(component);
//		layout.setComponentAlignment(component, Alignment.MIDDLE_CENTER);
		TextField textField = new TextField();
		new TextFieldExtension(textField);
		textField.setCaption("testKeyDown");
		layout.addComponent(textField);
		setContent(layout);
	}
}
