package com.cesde.aivastudio.model.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConfiguracionVideo {

    @Column(nullable = false, length = 20)
    private String resolucion;

    @Column(nullable = false, length = 20)
    private String formato;

    @Column(nullable = false)
    private Integer duracion;

    @Column(nullable = false, length = 20)
    private String relacionAspecto;
}