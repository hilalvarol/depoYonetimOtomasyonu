package tr.com.hilalvarol.dal;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import tr.com.hilalvarol.core.ObjectHelper;
import tr.com.hilalvarol.interfaces.DALInterfaces;
import tr.com.hilalvarol.types.MusteriEntity;

public class MusteriDAL extends ObjectHelper implements DALInterfaces<MusteriEntity>{

	@Override
	public void Insert(MusteriEntity entity) {
Connection connection = getConnection();
		
		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate("INSERT INTO Musteri(AdiSoyadi, Telefon, Adres, SehirId) VALUES ('" +entity.getAdiSoyadi()
			+ "','" + entity.getTelefon() + "','"+ entity.getAdres() +"','"+ entity.getSehirId() + "')");
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<MusteriEntity> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public String[] SehirGetir(){
		
		String[] sehirler ={"Adana","Ad�yaman", "Afyon", "A�r�", "Amasya", "Ankara", "Antalya", "Artvin",
	            "Ayd�n", "Bal�kesir","Bilecik", "Bing�l", "Bitlis", "Bolu", "Burdur", "Bursa", "�anakkale",
	            "�ank�r�", "�orum","Denizli","Diyarbak�r", "Edirne", "Elaz��", "Erzincan", "Erzurum ", "Eski�ehir",
	            "Gaziantep", "Giresun","G�m��hane", "Hakkari", "Hatay", "Isparta", "Mersin", "�stanbul", "�zmir",
	            "Kars", "Kastamonu", "Kayseri","K�rklareli", "K�r�ehir", "Kocaeli", "Konya", "K�tahya ", "Malatya",
	            "Manisa", "Kahramanmara�", "Mardin", "Mu�la", "Mu�", "Nev�ehir", "Ni�de", "Ordu", "Rize", "Sakarya",
	            "Samsun", "Siirt", "Sinop", "Sivas", "Tekirda�", "Tokat", "Trabzon  ", "Tunceli", "�anl�urfa", "U�ak",
	            "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt ", "Karaman", "K�r�kkale", "Batman", "��rnak",
	            "Bart�n", "Ardahan", "I�d�r", "Yalova", "Karab�k ", "Kilis", "Osmaniye ", "D�zce"};
		return sehirler;
	}

	@Override
	public MusteriEntity Delete(MusteriEntity Entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Update(MusteriEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MusteriEntity> GetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
