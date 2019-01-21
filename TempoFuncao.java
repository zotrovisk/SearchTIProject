package rest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.primefaces.component.log.Log;

public class TempoFuncao { 


	
	
	public static void main(String[] args){
		entrada();
		
	}


	
	public static void entrada() {
		int dias = 0; 
		String dataInicial = "";
		String dataFinal = "";
		
		ArrayList<Registro> listaRegistros = registros();
		
		
		for(int i = 0 ; i < listaRegistros.size();i++) {
			Registro rg = listaRegistros.get(i);
			dataInicial = rg.getDataInicial();
			dataFinal = rg.getDataFinal();
			calculaTimeFunc(rg.getCodigo(),"21/01/2018","21/01/2019");
		}
		
		
	}
	
	public static void calculaTimeFunc(String codigo,String dataInicial ,String dataFinal) {
		//int dia = 0;
		//int mes = 0;
		//int ano = 0;
		
		/*
		String [] dataInicialSeparada = dataInicial.split("/");
		System.out.println(dataInicialSeparada[0]);
		dia = Integer.valueOf(dataInicialSeparada[0]);
		System.out.println(dataInicialSeparada[1]);
		mes = Integer.valueOf(dataInicialSeparada[1]);
		System.out.println(dataInicialSeparada[2]);
		ano = Integer.valueOf(dataInicialSeparada[2]);
		*/
		
		
		// Dando um exemplo: quantos dias se passam desde 07/09/1822 até 05/06/2006?
        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        df.setLenient(false);
        Date d1;
        long dias = 0;
        
		try {
			d1 = df.parse (dataInicial);
			System.out.println (d1);
	        Date d2 = df.parse (dataFinal);
	        System.out.println (d2);
	        long dt = (d2.getTime() - d1.getTime()) + 3600000; // 1 hora para compensar horário de verão
	        System.out.println (dt / 86400000L); 
			 dias = dt / 86400000L ;
		} catch (ParseException e) {
			e.printStackTrace();
		}
        
		
		System.out.println("Código: "+codigo);
		System.out.println("Dias: "+dias);
	}

	
	public static ArrayList<Registro> registros() {
		 ArrayList<Registro> listaRegistros = new ArrayList<>();

		String [] registros = {"registro1;registro2;registro3","registro4;registro5;registro6"
				,"registro7;registro8;registro9"		
		};
		

		 for(int i  = 0 ; i < registros.length;i++) {
			 
			 Registro registroUnico = new Registro();
			 String registro = registros[i]; 
			 String [] registroSeparado = registro.split(";");
			 
			 
			 for(int i2 = 0; i2 < 3;i2++) {

			 System.out.println(registroSeparado[i2]);
			 
			 if(i2 == 0) {
				 System.out.println(0);
				 String codigo = registroSeparado[i2];
					registroUnico.setCodigo(codigo); 
			 }
			
			 if(i2 == 1) {
				 System.out.println(1);

				 String dataInicial = registroSeparado[i2];
					registroUnico.setDataInicial(dataInicial);
			 }
		
			 if(i2 == 2) {
				 System.out.println(2);

				 String dataFinal = registroSeparado[i2];
				 registroUnico.setDataFinal(dataFinal);

			 }	
			 
			 System.out.println("rgUni: "+registroUnico.toString());

			 }
			 
			 listaRegistros.add(registroUnico);	 

			 
		}
		

			return listaRegistros;
		
	}
	
}


	







