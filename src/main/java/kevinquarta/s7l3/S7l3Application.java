package kevinquarta.s7l3;

import kevinquarta.s7l3.esercizio1.DataSource;
import kevinquarta.s7l3.esercizio1.Info;
import kevinquarta.s7l3.esercizio1.UserData;
import kevinquarta.s7l3.esercizio1.infoAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class S7l3Application {

	public static void main(String[] args) {
		SpringApplication.run(S7l3Application.class, args);


		Info info = new Info();
		info.setNome("Kevin");
		info.setCognome("Quarta");

		Calendar cal = Calendar.getInstance();
		cal.set(2003,07,17);
		Date dataDiNascita = cal.getTime();
		info.setDataDiNascita(dataDiNascita);

		DataSource dataSource = new infoAdapter(info);

		UserData userData = new UserData();
		userData.getData(dataSource);


		System.out.println(dataSource.getEta());
		System.out.println(dataSource.getNomeCompleto());


	}

}
