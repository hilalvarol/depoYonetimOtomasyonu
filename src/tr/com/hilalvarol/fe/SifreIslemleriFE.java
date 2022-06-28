package tr.com.hilalvarol.fe;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import tr.com.hilalvarol.dal.AccountsDAL;
import tr.com.hilalvarol.dal.KategoriDAL;
import tr.com.hilalvarol.dal.PersonelDAL;
import tr.com.hilalvarol.dal.YetkilerDAL;
import tr.com.hilalvarol.interfaces.FeInterfaces;
import tr.com.hilalvarol.types.AccountsEntity;
import tr.com.hilalvarol.types.PersonelEntity;
import tr.com.hilalvarol.types.YetkilerEntity;

public class SifreIslemleriFE extends JDialog implements FeInterfaces {

	public SifreIslemleriFE() {
		initPencere();
	}

	@Override
	public void initPencere() {
		JPanel panel = initPanel();

		panel.setBorder(BorderFactory.createTitledBorder("�ifre Belirleme ��lemleri"));
		add(panel);
		setTitle("�ifre Belirleme ��lemleri");
		pack();
		setModalityType(DEFAULT_MODALITY_TYPE);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(HIDE_ON_CLOSE); 
		
	}

	@Override
	public JPanel initPanel() {
        JPanel panel = new JPanel(new GridLayout(5,2));
		
        JLabel personelLabel = new JLabel("Personel Se�:", JLabel.RIGHT);
		panel.add(personelLabel);
		JComboBox personelBox = new JComboBox(new PersonelDAL().GetAll().toArray());
		panel.add(personelBox);
		JLabel yetkiLabel = new JLabel("Yetki Se�:", JLabel.RIGHT);
		panel.add(yetkiLabel);
		JComboBox yetkiBox = new JComboBox(new YetkilerDAL().GetAll().toArray());
	    panel.add(yetkiBox);
	    JLabel passwordLabel = new JLabel("�ifre Belirle:", JLabel.RIGHT);
	    panel.add(passwordLabel);
	    JPasswordField passField = new JPasswordField(10);	
	    panel.add(passField);
	    JLabel passTekrarLabel = new JLabel("�ifre Tekrar:", JLabel.RIGHT);
	    panel.add(passTekrarLabel);
	    JPasswordField passTekrarField = new JPasswordField(10);
	    panel.add(passTekrarField);
	    

		JButton kaydetButton = new JButton("Kaydet");
		panel.add(kaydetButton);
		JButton iptalButton = new JButton("�ptal");
		panel.add(iptalButton); 
		
		iptalButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
			}
		});
		
        kaydetButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AccountsEntity entity = new AccountsEntity();
				PersonelEntity pEntity = (PersonelEntity) personelBox.getSelectedItem();
				YetkilerEntity yEntity = (YetkilerEntity) yetkiBox.getSelectedItem();
				
				
				if(passField.getText().equals(passTekrarField.getText())) {
					
					entity.setPersonelId(pEntity.getId());
					entity.setYetkiId(yEntity.getId());
					entity.setSifre(passField.getText());
					
					new AccountsDAL().Insert(entity);
					JOptionPane.showMessageDialog(null, pEntity.getAdiSoyadi() + " adl� ki�iye " +yEntity.getAdi()+ " yetkisi ba�ar�l� bir �ekilde atanm��t�r.");
					
				}
				else {
					JOptionPane.showMessageDialog(null, "�ifreler uyu�muyor tekrar kontrol ediniz");
				}
				
			}
		});
		
		return panel;
	}

	@Override
	public JMenuBar initBar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JTabbedPane initTabs() {
		// TODO Auto-generated method stub
		return null;
	}

}
