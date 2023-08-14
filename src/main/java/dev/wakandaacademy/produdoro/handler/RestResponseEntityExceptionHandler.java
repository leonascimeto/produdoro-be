package dev.wakandaacademy.produdoro.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.log4j.Log4j2;

@RestControllerAdvice
@Log4j2
public class RestResponseEntityExceptionHandler {
	public ResponseEntity<ErrorApiResponse> handlerGenericException(Exception ex){
		log.error("Exception", ex);
		return ResponseEntity
				.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(ErrorApiResponse.builder()
						.description("INTERNAL SERVER ERROR")
						.message("POR FAVOR INFORME AO ADMINISTRADO DO SISTEMA")
						.build());
	}
}
