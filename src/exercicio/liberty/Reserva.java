package exercicio.liberty;

import projeto.Hotel;
import projeto.Quarto;

public class Reserva implements IFacade{
	private Reserva INSTANCE = new Reserva();
	
	Reserva() {
		this.INSTANCE = new Reserva();
	}
	
	@Override
	public Hotel cadastrarHoteis() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Quarto pesquisarQuarto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reserva fazerReserva() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calcularValorDasHospedagens() {
		// TODO Auto-generated method stub
		return null;
	}
}
