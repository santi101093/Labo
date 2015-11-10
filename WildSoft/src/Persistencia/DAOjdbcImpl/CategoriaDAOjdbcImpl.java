package Persistencia.DAOjdbcImpl;

import Negocio.Modelo.Categoria;
import Persistencia.Conector.ConectorMySQL;
import Persistencia.DAO.CategoriaDAO;

public class CategoriaDAOjdbcImpl implements CategoriaDAO{

	private ConectorMySQL conex = new ConectorMySQL();
	@Override
	public boolean guardar_categoria_producto(Categoria c) {
		  String SentenciaSQL = "INSERT INTO tipo_producto (TP_nombre) VALUES ("+
					"'"+	c.getNombre()	+"')";
			    
		return conex.Insertar(SentenciaSQL);
	}
	@Override
	public boolean guardar_categoria_materia(Categoria c) {
		String SentenciaSQL = "INSERT INTO categoria_mp (CA_nombre) VALUES ("+
				"'"+	c.getNombre()	+"')";
		    
	return conex.Insertar(SentenciaSQL);
	}
	
	public boolean eliminar_categoria_materia(Categoria c){
		String SentenciaSQL = "delete from categoria_mp where CA_nombre= '"+ c.getNombre() +"';";
		    
		return conex.Insertar(SentenciaSQL);
	}

	public boolean eliminar_categoria_producto(Categoria c){
		String SentenciaSQL = "delete from tipo_producto where TP_nombre= '"+ c.getNombre() +"';";
		    
		return conex.Insertar(SentenciaSQL);
	}
}
