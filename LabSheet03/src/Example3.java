import javax.swing.JOptionPane;

public class Example3 {

	public static void main(String[] args) {
		//input weight from user
		double weight = Double.parseDouble(
				JOptionPane.showInputDialog("Input Weight"));
		double height = Double.parseDouble(
				JOptionPane.showInputDialog("Input Height"));
		height = height/100;
		double bm1 = weight/(height*height);
		//Check conditional and declare meaning of BMI
		String BmiCate;
		if(bm1 <18.5) BmiCate ="Underweight";
		else if (bm1<25) BmiCate="Normal-weight";
		else if (bm1<30) BmiCate="Overweight";
		else BmiCate ="Obersity";
			
		
		JOptionPane.showMessageDialog(null, "BMI = "+String.format("%.2f",bm1)
				+"\nYou're "+BmiCate,"BMI",JOptionPane.WARNING_MESSAGE);
	}

}
