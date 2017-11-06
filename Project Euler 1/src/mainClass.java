import javax.swing.JOptionPane;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long total = 0;
		for (int n=0; n<1000; n++){
			System.out.println(n);
			if (n%3 == 0 || n%5 == 0){
				total += n;
			}
			else{
				total += 0;
			}
		}
		JOptionPane.showMessageDialog(null,total);
	}

}
