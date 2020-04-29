package br.com.itau.dashparametrizacao.dt.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table
public class Parameter {
    @PrimaryKey
    private int id;
    private String name;
    private String description;
    private String application;
    private Type type;
    private String key;
    private String value;
}
