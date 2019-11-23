package exercicio.liberty;

import projeto.Hotel;
import projeto.Quarto;

public interface IFacade {
	public Hotel cadastrarHoteis();
	public Quarto pesquisarQuarto();
	public Reserva fazerReserva();
	public Double calcularValorDasHospedagens();
}
