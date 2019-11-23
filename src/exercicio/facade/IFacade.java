package exercicio.facade;

import java.util.Collection;
import java.util.Date;

public interface IFacade {

	public Cliente cadastrarCliente(String name, String endereco);
	public Veiculo cadastrarVeiculo(String placa, String modelo, String cor);
	public Float locarVeiculo(Cliente cliente, Veiculo veiculo, Date inicio, Date fim);
	public Collection<Veiculo> listarVeiculosDisponiveis(Date inicio, Date fim);
}
