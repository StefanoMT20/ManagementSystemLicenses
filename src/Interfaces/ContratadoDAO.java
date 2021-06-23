package Interfaces;

import java.util.List;

import clases.Contratados;

public interface ContratadoDAO {
	public int save(Contratados bean);
	public int update(Contratados bean);
	public int delete(int cod);
	public List<Contratados> ListAll();
	
	// consulta gaaaa
	public List<Contratados> ListAllBanco(int codBanco);
}
