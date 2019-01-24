package Main;

import java.awt.Component;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class ComboRenderer extends JComboBox implements TableCellRenderer {
	
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean isFocus, int row, int col) {
		this.addItem("Projets");
		this.addItem("Devoirs Maisons");
		this.addItem("Nourrit ton cerveau");
		this.addItem("Méditation");
		this.addItem("Planning");
		return this;
	}

}