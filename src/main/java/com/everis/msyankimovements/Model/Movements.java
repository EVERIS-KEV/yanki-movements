package com.everis.msyankimovements.Model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Movements implements Serializable {

  private static final long serialVersionUID = 7156526077883281623L;
  private static final LocalDateTime dateCreated = LocalDateTime.now(ZoneId.of("America/Lima"));

  private String numberPhoneEmisor;
  private String numberPhoneReceptor;
  private Double amount;
}
