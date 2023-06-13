package main_pack;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JScrollPane;
import javax.swing.JTextField;

import manager.StudentDatabase;

public abstract class BasicFrame {
	public JFrame frame;
	
	public JLabel welcomeLabel, idLabel, nameLabel, genderLabel, chineseLabel, mathLabel, englishLabel, computerLabel, iconLabel;
	
	public JTextField idField, nameField, genderField, chineseField, mathField, englishField, computerField;
	
	public JButton saveButton, findButton, updateButton, deleteButton, helpButton, showAllButton, statButton, saveToFileButton, loadFromFileButton;
	
	public JPanel iconPanel; 
	
	public ArrayList<StudentDatabase> StudentDatabases;
}
