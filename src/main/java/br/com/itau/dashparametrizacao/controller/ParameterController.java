package br.com.itau.dashparametrizacao.controller;

import br.com.itau.dashparametrizacao.model.Parameter;
import br.com.itau.dashparametrizacao.service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("parameters")
public class ParameterController {

    @Autowired
    private ParameterService parameterService;

    @GetMapping("/")
    public Flux<Parameter> getAllEmployees() {
        Flux<Parameter> patameters = parameterService.getAllParameters();
        return patameters;
    }

    @GetMapping("/{name}")
    public Mono<Parameter> getByName(@PathVariable String name) {
        Mono<Parameter> patameters = parameterService.getByName(name);
        return patameters;
    }

    @PostMapping("/create")
    public void add(@RequestBody Parameter parameter) {
        parameterService.save(parameter);
    }

    @PutMapping("/{id}")
    public void save(@PathVariable("id") UUID id, @RequestBody Parameter parameter) {
        parameterService.save(parameter);
    }
}
