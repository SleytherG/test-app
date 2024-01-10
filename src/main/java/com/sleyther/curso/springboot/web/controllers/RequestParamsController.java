package com.sleyther.curso.springboot.web.controllers;

import com.sleyther.curso.springboot.web.dto.ParamDTO;
import com.sleyther.curso.springboot.web.dto.ParamMixDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

  @GetMapping("/foo")
  public ParamDTO foo(@RequestParam(required = false, defaultValue = "Hola que tal") String message) {
    ParamDTO param = new ParamDTO();

    param.setMessage(message != null ? message : "Hola");
    return param;
  }

  @GetMapping("/bar")
  public ParamMixDTO bar(@RequestParam String text, @RequestParam Integer code) {
    ParamMixDTO params = new ParamMixDTO();
    params.setMessage(text);
    params.setCode(code);
    return params;
  }

  @GetMapping("/request")
  public ParamMixDTO request(HttpServletRequest request) {
    ParamMixDTO params = new ParamMixDTO();
    int code = 0;
    try {
      code = Integer.parseInt(request.getParameter("code"));
    }catch (NumberFormatException e) {

    }
    params.setCode(code);
    params.setMessage(request.getParameter("message"));

    return params;
  }
}
