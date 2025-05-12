package br.com.alurafood.pagamentos.dto;

import java.math.BigDecimal;

import br.com.alurafood.pagamentos.model.Status;
import lombok.Data;

@Data
public class PagamentoDto {

    private Long id;
    private BigDecimal valor;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;
    private Status status;
    private Long pedidoId;
    private Long formaDePagamentoId;

}
