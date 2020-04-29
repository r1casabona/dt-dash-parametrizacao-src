package br.com.itau.dashparametrizacao.dt.api.service;

import br.com.itau.dashparametrizacao.dt.api.repository.ParameterRepository;
import br.com.itau.dashparametrizacao.dt.api.model.Parameter;
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

    public Mono<Parameter> getById(int id) {
        return parameterRepository.getById(id);
    }
}
