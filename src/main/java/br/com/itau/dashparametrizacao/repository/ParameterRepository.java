package br.com.itau.dashparametrizacao.repository;

import br.com.itau.dashparametrizacao.model.Parameter;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import reactor.core.publisher.Mono;

public interface ParameterRepository extends ReactiveCassandraRepository<Parameter, Integer> {
    @AllowFiltering
    Mono<Parameter> getByName(String name);
}