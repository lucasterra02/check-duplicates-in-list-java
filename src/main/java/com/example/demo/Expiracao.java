package com.example.demo;

import java.math.BigDecimal;
import java.util.Date;

public class Expiracao {

	private Long id;

	private Long transacaoId;

	private BigDecimal qtdePontos;

	private Date dataCriacaoRegistro;

	private Date dataOriginalPonto;

	private Date dataExpiracaoPonto;

	private Date dataHoraCriacao;

	private Date dataHoraAlteracao;

	private String usuarioCriacao;

	private String usuarioAlteracao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTransacaoId() {
		return transacaoId;
	}

	public void setTransacaoId(Long transacaoId) {
		this.transacaoId = transacaoId;
	}

	public BigDecimal getQtdePontos() {
		return qtdePontos;
	}

	public void setQtdePontos(BigDecimal qtdePontos) {
		this.qtdePontos = qtdePontos;
	}

	public Date getDataCriacaoRegistro() {
		return dataCriacaoRegistro;
	}

	public void setDataCriacaoRegistro(Date dataCriacaoRegistro) {
		this.dataCriacaoRegistro = dataCriacaoRegistro;
	}

	public Date getDataOriginalPonto() {
		return dataOriginalPonto;
	}

	public void setDataOriginalPonto(Date dataOriginalPonto) {
		this.dataOriginalPonto = dataOriginalPonto;
	}

	public Date getDataExpiracaoPonto() {
		return dataExpiracaoPonto;
	}

	public void setDataExpiracaoPonto(Date dataExpiracaoPonto) {
		this.dataExpiracaoPonto = dataExpiracaoPonto;
	}

	public Date getDataHoraCriacao() {
		return dataHoraCriacao;
	}

	public void setDataHoraCriacao(Date dataHoraCriacao) {
		this.dataHoraCriacao = dataHoraCriacao;
	}

	public Date getDataHoraAlteracao() {
		return dataHoraAlteracao;
	}

	public void setDataHoraAlteracao(Date dataHoraAlteracao) {
		this.dataHoraAlteracao = dataHoraAlteracao;
	}

	public String getUsuarioCriacao() {
		return usuarioCriacao;
	}

	public void setUsuarioCriacao(String usuarioCriacao) {
		this.usuarioCriacao = usuarioCriacao;
	}

	public String getUsuarioAlteracao() {
		return usuarioAlteracao;
	}

	public void setUsuarioAlteracao(String usuarioAlteracao) {
		this.usuarioAlteracao = usuarioAlteracao;
	}

}
