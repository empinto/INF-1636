import javax.swing.*;
import java.awt.*;

public class MeuJFrame extends JFrame {
	public final int LARG_DEFAULT = 400;
	public final int ALT_DEFAULT = 300;
	
	public MeuJFrame() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		int sl = screenSize.width;
		int sa = screenSize.height;
		int x = sl/2 - LARG_DEFAULT/2;
		int y = sa/2 - ALT_DEFAULT/2;
		
		setBounds(x, y, LARG_DEFAULT, ALT_DEFAULT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		getContentPane().add(new MeuJPanel());
	}
}
