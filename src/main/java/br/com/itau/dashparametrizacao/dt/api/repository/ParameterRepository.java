package br.com.itau.dashparametrizacao.dt.api.repository;

import br.com.itau.dashparametrizacao.dt.api.model.Parameter;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import reactor.core.publisher.Mono;

public interface ParameterRepository extends ReactiveCassandraRepository<Parameter, Integer> {
    @AllowFiltering
    Mono<Parameter> getById(int id);
}