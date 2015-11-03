public class BMIKalkulator {
	double izracunajBMI(double visina, double tezina) {
		if ((visina < 1.2) || (visina > 2.4)) {
			// provera visine da li je odgovarajuca
			System.out
					.println("Greska, molimo Vas unesite odgovarajucu visinu, (izmedju 1,2 i 2,4 m) ");
			return 0.0;
		}
		if ((tezina < 30) || (tezina > 200)) {
			//provera tezine da li je odgovarajuca
			System.out.println("Greska");
			return 0.0;
		}

		double rezultat = tezina / (visina * visina);
		//formula za dobijanje BMI
		return rezultat;
	}
	
      String odredi(double bmi){
    	  //dobijanje kategorije kako bi uporedili gde pripadamo
          //dal ovo sranje radi
	  String kategorija ="";
	  if (bmi<= 15){
		  kategorija = "anoreksicnih";
		  }
	  if ((bmi> 15) && (bmi <= 18.5)){
	  kategorija = "Mrsavi";
	  }
	  if ((bmi> 18.5) && (bmi <= 25)){
		  kategorija = "normalnih";
		  }
	  if ((bmi> 25) && (bmi <= 30)){
		  kategorija = "popunjenih";
		  }
	  if ((bmi> 30) && (bmi <= 40)){
		  kategorija = "debelih";
		  }
	  if (bmi> 40){
		  kategorija = "gojaznih";
		  }
	  return kategorija;
  }}
