package com.ingenieriasoftware.contactos.cucumber.stepdefs;

import com.ingenieriasoftware.contactos.Contacts2App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Contacts2App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
