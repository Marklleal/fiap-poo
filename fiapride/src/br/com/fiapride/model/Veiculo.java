package br.com.fiapride.model;

public class Veiculo {
    private String placa;
    private String modelo;
    private String tipoVeiculo;
    private int capacidade;

    public Veiculo(String placa, String modelo, String tipoVeiculo, int capacidade) {
        this.setPlaca(placa);
        this.setModelo(modelo);
        this.setTipoVeiculo(tipoVeiculo);
        this.setCapacidade(capacidade);    
        System.out.println(
            "Registro inicial: Um " + getModelo() + 
            " gerado com a placa " + getPlaca()
        );
    }
    
    public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public void atualizaCapacidade(int novaCapacidade) {
	    if (novaCapacidade < 1 || novaCapacidade > 4) {
			System.out.println("Não é possível configurar esta nova capacidade do veículo.\nSetado para 1 por padrão.");
			setCapacidade(1);
		} else {
		    setCapacidade(novaCapacidade);
		}
	}
}

