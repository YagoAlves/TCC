package br.ufc.tcc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

import com.google.gson.Gson;
import br.ufc.model.Ponto;

public class CarregaJson {
	
	public static void main(String[] args) {
		
		String sql = "";
		Gson g = new Gson();
		try {
			BufferedReader br = new BufferedReader(new FileReader("ponto_de_taxi.json"));			
			Ponto[] pontos = g.fromJson(br, Ponto[].class);
			for (int i = 0; i < pontos.length; i++) {
				sql = "('" + pontos[i].getName()+ "'," +
				pontos[i].getGeometry().getLocation().getLat() + "," +
				pontos[i].getGeometry().getLocation().getLng() + "," +
				"ST_SETSRID(ST_POINT(" + pontos[i].getGeometry().getLocation().getLng()+ "," + 	
				pontos[i].getGeometry().getLocation().getLat() + "),4326)," 
				+ pontos[i].getRating() +"),";
				System.out.println(sql);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
