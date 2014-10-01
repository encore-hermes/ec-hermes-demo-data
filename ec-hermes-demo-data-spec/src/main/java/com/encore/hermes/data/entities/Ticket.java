package com.encore.hermes.data.entities;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Ticket entity
 * @author krishnath
 *
 */
public class Ticket implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private TicketType type;
	private BigDecimal amount;
	public TicketType getType() {
		return type;
	}
	public void setType(TicketType type) {
		this.type = type;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
