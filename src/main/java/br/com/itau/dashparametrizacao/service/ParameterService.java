package br.com.itau.dashparametrizacao.service;

import br.com.itau.dashparametrizacao.model.Parameter;
import br.com.itau.dashparametrizacao.repository.ParameterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ParameterService {

    @Autowired
    private ParameterRepository parameterRepository;

    public Flux<Parameter> getAllParameters() {
        Flux<Parameter> parameters =  parameterRepository.findAll();
        return parameters;
    }

    public void save(Parameter parameter) {
        parameterRepository.insert(parameter).subscribe();
    }

    public Mono<Parameter> getByName(String name) {
        return parameterRepository.getByName(name);
    }
}
