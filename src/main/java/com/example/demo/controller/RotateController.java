package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RotateController {

  @PostMapping("/rotator/encode")
  public String encode(
    @Parameter(description = "Text text to be encoded.")
    @RequestParam String text
  ) {
    return text;
  }

  @PostMapping("/rotator/decode")
  public String decode(
      @Parameter(description = "Text text to be decoded.")
      @RequestParam String text
  ) {
    return text;
  }
}
