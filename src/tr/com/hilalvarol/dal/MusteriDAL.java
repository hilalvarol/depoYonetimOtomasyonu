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
		
		String[] sehirler ={"Adana","Adýyaman", "Afyon", "Aðrý", "Amasya", "Ankara", "Antalya", "Artvin",
	            "Aydýn", "Balýkesir","Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale",
	            "Çankýrý", "Çorum","Denizli","Diyarbakýr", "Edirne", "Elazýð", "Erzincan", "Erzurum ", "Eskiþehir",
	            "Gaziantep", "Giresun","Gümüþhane", "Hakkari", "Hatay", "Isparta", "Mersin", "Ýstanbul", "Ýzmir",
	            "Kars", "Kastamonu", "Kayseri","Kýrklareli", "Kýrþehir", "Kocaeli", "Konya", "Kütahya ", "Malatya",
	            "Manisa", "Kahramanmaraþ", "Mardin", "Muðla", "Muþ", "Nevþehir", "Niðde", "Ordu", "Rize", "Sakarya",
	            "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdað", "Tokat", "Trabzon  ", "Tunceli", "Þanlýurfa", "Uþak",
	            "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt ", "Karaman", "Kýrýkkale", "Batman", "Þýrnak",
	            "Bartýn", "Ardahan", "Iðdýr", "Yalova", "Karabük ", "Kilis", "Osmaniye ", "Düzce"};
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
