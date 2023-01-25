package Menus;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import fileIO.FileManagement;

public class OptionM implements ActionListener{
	
	JFrame frame = new JFrame("Game Options");  
    JPanel panel = new JPanel();  
    public static boolean isChange = false;
    JButton button = new JButton();
    JLabel label = new JLabel("Word Database");  
    JTextField field = new JTextField(10);
    JLabel bg = new JLabel("Background Color"); 
    String colorName[] = {"None","RED","GREEN","BLACK","BLUE","YELLOW","WHITE"};
    JComboBox bgColor = new JComboBox(colorName);
    JButton ok = new JButton("OK");
    JButton apply = new JButton("Apply");
    JButton cancel = new JButton("Cancel");
    
    	JPanel gridForRows = new JPanel();
		JPanel topRow  = new JPanel();
		JPanel medRow = new JPanel();
		JPanel bottomRow = new JPanel();
		
		FileManagement fm = new FileManagement();
		String fileT = fm.file; 
		private final GamePlay gp;
		JFileChooser j = new JFileChooser(new File(fileT));
		
		
  OptionM(GamePlay gp){
	   this.gp = gp;
	   panel.setLayout(new FlowLayout());
      field.setText("C:\\\\\\\\Users\\\\\\\\Jonathan\\\\\\\\eclipse-workspace\\\\\\\\AssignmentJava\\\\\\\\src\\\\\\\\file.db");
      gridForRows.setLayout(new GridLayout(3, 0, 3, 3)); //(rows, cols(0 means auto), xpadding, ypadding)
      topRow.setLayout(new FlowLayout());
      medRow.setLayout(new FlowLayout());
      bottomRow.setLayout(new FlowLayout());
      button.setText("Change");  
      topRow.add(label);  
      topRow.add(field); 
      topRow.add(button);  
      medRow.add(bg);
      medRow.add(bgColor);
      bottomRow.add(ok);
      bottomRow.add(apply);
      bottomRow.add(cancel);
      panel.setLayout(new FlowLayout());
      gridForRows.add(topRow);
      gridForRows.add(medRow);
      gridForRows.add(bottomRow);
      panel.add(gridForRows);
      frame.add(panel);  
      frame.setSize(400, 200);  
      frame.setLocationRelativeTo(null);  
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
      frame.setVisible(true);  
      button.addActionListener(this);
      apply.addActionListener(this);
      ok.addActionListener(this);
      cancel.addActionListener(this);
      
      
  }

@Override
public void actionPerformed(ActionEvent e) {
	
	
	// TODO Auto-generated method stub
	
	
	if(e.getSource()==button) {
		// Open the save dialog
		FileNameExtensionFilter restrict = new FileNameExtensionFilter(".db", "db");
       j.addChoosableFileFilter(restrict);
       System.out.println("new file" + fileT);
       int r = j.showOpenDialog(null);
       String sf = j.getSelectedFile().toString();
       // if the user selects a file
       if (r == JFileChooser.APPROVE_OPTION)

       {
           // set the label to the path of the selected file
           field.setText(j.getSelectedFile().getAbsolutePath());
           fm.openFile(sf);
           System.out.println("new file"+sf);
           fileT = sf;
   		System.out.println(fileT);
   		isChange=true;
       }

	}
	
	if(e.getSource()== apply) {
		
		frame.dispose();
		//String sf = j.getSelectedFile().toString();
		//System.out.println(sf);
       //fileT = sf;
		System.out.println(fileT);
	 String SelectedValue = bgColor.getSelectedItem().toString();
	switch (SelectedValue){
	    case "RED" :
	    	gp.medRow.setBackground(Color.red);
	    	gp.gridForRows.setBackground(Color.red);
	    	gp.topRow.setBackground(Color.red);
	    	gp.bottomRow.setBackground(Color.red);
	    	gp.guessRow.setBackground(Color.red);
	    	gp.entireGameBoard.setBackground(Color.red);
	    	gp.hangmanHolder.setBackground(Color.red);
	        System.out.print(SelectedValue);
	        break;
	    case "YELLOW" :
	    	gp.medRow.setBackground(Color.yellow);
	    	gp.gridForRows.setBackground(Color.yellow);
	    	gp.topRow.setBackground(Color.yellow);
	    	gp.bottomRow.setBackground(Color.yellow);
	    	gp.guessRow.setBackground(Color.yellow);
	    	gp.entireGameBoard.setBackground(Color.yellow);
	    	gp.hangmanHolder.setBackground(Color.yellow);
	    	System.out.print(SelectedValue);
	        break;
	    case "BLUE" :
	    	gp.medRow.setBackground(Color.blue);
	    	gp.gridForRows.setBackground(Color.blue);
	    	gp.topRow.setBackground(Color.blue);
	    	gp.bottomRow.setBackground(Color.blue);
	    	gp.guessRow.setBackground(Color.blue);
	    	gp.entireGameBoard.setBackground(Color.blue);
	    	gp.hangmanHolder.setBackground(Color.blue);
	    	System.out.print(SelectedValue);
	        break;
	
	    case "GREEN" :
	    	gp.medRow.setBackground(Color.green);
	    	gp.gridForRows.setBackground(Color.green);
	    	gp.topRow.setBackground(Color.green);
	    	gp.bottomRow.setBackground(Color.green);
	    	gp.guessRow.setBackground(Color.green);
	    	gp.entireGameBoard.setBackground(Color.green);
	    	gp.hangmanHolder.setBackground(Color.green);
	    	System.out.print(SelectedValue);
	        break;
	    case "BLACK" :
	    	gp.medRow.setBackground(Color.black);
	    	gp.gridForRows.setBackground(Color.black);
	    	gp.topRow.setBackground(Color.black);
	    	gp.bottomRow.setBackground(Color.black);
	    	gp.guessRow.setBackground(Color.black);
	    	gp.entireGameBoard.setBackground(Color.black);
	    	gp.hangmanHolder.setBackground(Color.black);
	    	System.out.print(SelectedValue);
	        break;
	    case "WHITE" :
	    	gp.medRow.setBackground(Color.white);
	    	gp.gridForRows.setBackground(Color.white);
	    	gp.topRow.setBackground(Color.white);
	    	gp.bottomRow.setBackground(Color.white);
	    	gp.guessRow.setBackground(Color.white);
	    	gp.entireGameBoard.setBackground(Color.white);
	    	gp.hangmanHolder.setBackground(Color.white);
	    	System.out.print(SelectedValue);
	        break;
	    case "None" :
	    	gp.medRow.setBackground(Color.decode("#e6e8e8"));
	    	gp.gridForRows.setBackground(Color.decode("#e6e8e8"));
	    	gp.topRow.setBackground(Color.decode("#e6e8e8"));
	    	gp.bottomRow.setBackground(Color.decode("#e6e8e8"));
	    	gp.guessRow.setBackground(Color.decode("#e6e8e8"));
	    	gp.entireGameBoard.setBackground(Color.decode("#e6e8e8"));
	    	gp.hangmanHolder.setBackground(Color.decode("#e6e8e8"));
	    	System.out.print(SelectedValue);
	        break;
	
	    default:
	    	//System.out.print(SelectedValue);
	}
	
}
	if(e.getSource()==cancel) {
		frame.dispose();
	}
	if(e.getSource() == ok)
	{
		frame.dispose();
	}
		
	}

}
