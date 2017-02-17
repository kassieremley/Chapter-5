/**
 * 
 */
package switches;
import javax.swing.JOptionPane;
public class studentScannerSwitch {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int studentNumber;
    
    String studentString;
    studentString = (String)JOptionPane.showInputDialog(null, "Please scan the student ID >>>", "Enter User ID",
   JOptionPane.QUESTION_MESSAGE, null,null,"");
      studentNumber = Integer.parseInt(studentString);
       
      if (studentNumber >=100000 || studentNumber <=400000)
      {
    	  switch(studentNumber)
    	  {
    	  case 274896:
    		  JOptionPane.showMessageDialog(null, "Andrew McKenzie");
    	  case 274885:
    		  JOptionPane.showMessageDialog(null, "Charles Carlstrom");
    	  case 316282:
    		  JOptionPane.showMessageDialog(null, "Ress Alzahrani");
    	  case 274884:
    		  JOptionPane.showMessageDialog(null, "Tatyana Vaughn");
    	  case 133778:
    		  JOptionPane.showMessageDialog(null, "Nick Hasson");
    	  case 131457:
    		  JOptionPane.showMessageDialog(null, "Kassie Remley");
    	  case 137412:
    		  JOptionPane.showMessageDialog(null, "Sebastion Frick");
    	  case 131147:
    		  JOptionPane.showMessageDialog(null, "Zach Dorris");
    	  case 274887:
    		  JOptionPane.showMessageDialog(null, "Chase Kress");
    	  case 133225:
    		  JOptionPane.showMessageDialog(null, "Isaiah Ponciano");
    	  case 137428:
    		  JOptionPane.showMessageDialog(null, "Mason Hancock");
 
    	  }
    	}
    	  

	}

}
