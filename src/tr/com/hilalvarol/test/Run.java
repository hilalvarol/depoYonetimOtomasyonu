package tr.com.hilalvarol.test;

import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import tr.com.hilalvarol.dal.UrunlerDAL;
import tr.com.hilalvarol.fe.AnaPencereFE;
import tr.com.hilalvarol.fe.LoginFE;

public class Run {

	
	public static void main(String[] args) {
		
		try {
			for(LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if("Nimbus".equals(info.getName())) {
						UIManager.setLookAndFeel(info.getClassName());
						break;
				}
			}
		}catch (Exception e) {
			// If Nimbus is not available, you can set the GUI to another look and feel.
		}
	
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
		   // new AnaPencereFE();
		          new LoginFE();	
		          }
		});
	}

}
