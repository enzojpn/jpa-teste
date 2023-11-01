package com.example.jpatestes.controller;

import com.example.jpatestes.model.EnderecoPedido;
import com.example.jpatestes.model.Pedido;
import com.example.jpatestes.model.StatusPedido;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping
    public String hello() throws Exception{
        logger.info("tteste");
        EnderecoPedido ep =   new EnderecoPedido();
        ep.setBairro("santat");
        ep.setLogradouro("rtua etaia");
        ep.setNumero("235");
        Pedido p = new Pedido();
        p.setEnderecoPedido(ep);
        p.setStatus(StatusPedido.AGUARDANDO);
        p.setNotaFiscalId(2);
        p.setTotal(new BigDecimal(12));


                ObjectMapper mapper = new ObjectMapper();
           String json = mapper.writeValueAsString(p);

        System.out.println(json);

        return "hello";
    }

}
