package com.everis.msyankimovements.Controller;

import com.everis.msyankimovements.Data.AddMovemets;
import com.everis.msyankimovements.Data.MessageFrom;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/yankiMovements")
public class MovementController {

  private Mono<Object> BindingResultErrors(BindingResult bindinResult) {
    String msg = "";

    for (int i = 0; i < bindinResult.getAllErrors().size(); i++) msg =
      bindinResult.getAllErrors().stream().findFirst().get().getDefaultMessage();

    return Mono.just(new MessageFrom(msg));
  }

  @GetMapping("/")
  public Mono<Object> findAll() {
    return Mono.just(new MessageFrom("HOLAAAA"));
  }

  @PostMapping("/save")
  public Mono<Object> save(@RequestBody @Valid AddMovemets model, BindingResult bindinResult) {
    if (bindinResult.hasErrors()) return BindingResultErrors(bindinResult);

    return Mono.just(new MessageFrom("HOLAAAA"));
  }
}
