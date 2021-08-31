package com.everis.msyankimovements.Data;

import javax.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddMovemets {

  @NotBlank(message = "El campo número no debe estar vacio.")
  @Size(min = 9, message = "El número celular debe tener mas de 9 carácteres.")
  private String numberPhoneEmisor;

  @NotBlank(message = "El campo número no debe estar vacio.")
  @Size(min = 9, message = "El número celular debe tener mas de 9 carácteres.")
  private String numberPhoneReceptor;

  private Double amount;
}
