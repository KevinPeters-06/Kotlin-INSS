package treinamento.calcularinss.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.BAD_REQUEST)
class RequisicaoRuimException: RuntimeException("O recurso não está adequado")