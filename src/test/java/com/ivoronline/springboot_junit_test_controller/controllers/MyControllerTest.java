package com.ivoronline.springboot_junit_test_controller.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyControllerTest {

  @Autowired MyController myController;

  @Test
  void hello() {
    String result = myController.hello();
    assertEquals("Hello from Controller", result);
  }

}