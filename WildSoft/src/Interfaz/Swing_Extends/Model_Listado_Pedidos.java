package Interfaz.Swing_Extends;

import java.util.Date;

import javax.swing.table.DefaultTableModel;

public class Model_Listado_Pedidos extends DefaultTableModel {

	public Model_Listado_Pedidos(){
		// Poner las columnas en el modelo de la tabla
		setColumnIdentifiers(new String[] { "Nro Pedido", "Cliente", "Fecha", "Entregar a las", " Delivery", "Estado", "Total"});
	}


	public boolean isCellEditable(int row, int column) {
		return false;
	}
	

	@SuppressWarnings("unchecked")
	public Class<Object> getColumnClass(int columnIndex) {
		Class<Object>[] columnTypes = new Class[] {Integer.class, String.class, String.class, String.class, Boolean.class , String.class, String.class};
		return columnTypes[columnIndex];
	};

}//----> Fin
