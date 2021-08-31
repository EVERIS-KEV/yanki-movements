package com.everis.msyankimovements;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class MsYankiMovementsApplication {

  public static void main(String[] args) {
    SpringApplication.run(MsYankiMovementsApplication.class, args);
    log.info("SERVICIO DE MOVMIENTOS YANKI-DEMO HABILITADOS");
  }
}
