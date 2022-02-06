package com.gameshop.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EUConstants {
	
	public final static String Europe = "EU";
	
	public final static Map<String, String> mapOfEuropeStates = new HashMap<String, String>() {
		{
			put("AX", "Aland Islands");
			put("AL", "Albania");
			put("AD", "Andorra");
            put("AM", "Armenia");
            put("AT", "Austria");
            put("BY", "Belarus");
            put("BE", "Belgium");
            put("BA", "Bosnia and Herzegovina");
            put("BG", "Bulgaria");
            put("HR", "Croatia");
            put("CZ", "Czech Republic");
            put("DK", "Denmark");
            put("EE", "Estonia");
            put("FO", "Faroe Islands");
            put("FI", "Finland");
            put("FR", "France");
            put("DE", "Germany");
            put("GI", "Gibraltar");
            put("GR", "Greece");
            put("GG", "Guernsey");
            put("VA", "Holy See");
            put("HU", "Hungary");
            put("IS", "Iceland");
            put("IE", "Ireland");
            put("IM", "Isle of Man");
            put("IT", "Italy");
            put("JE", "Jersey");
            put("LV", "Latvia");
            put("LI", "Liechtenstein");
            put("LT", "Lithuana");
            put("LU", "Luxembourg");
            put("MK", "Macedonia");
            put("MT", "Malta");
            put("MD", "Moldova");
            put("MC", "Monaco");
            put("ME", "Montenegro");
            put("NL", "Nederlands");
            put("NO", "Norway");
            put("PL", "Poland");
            put("PT", "Portugal");
            put("RO", "Romania");
            put("RU", "Russia");
            put("SM", "San Marino");
            put("RS", "Serbia");
            put("SK", "Slovakia");
            put("SI", "Slovenia");
            put("ES", "Spain");
            put("SJ", "Svalbard and Jan Mayen Islands");
            put("SE", "Sweden");
            put("CH", "Switzerland");
            put("UA", "Ukraine");
            put("GB", "United Kingdom");
		}
	};
	
	public final static List<String> listOfEuropeStatesCode = new ArrayList<>(mapOfEuropeStates.keySet());
	public final static List<String> listOfEuropeStatesName = new ArrayList<>(mapOfEuropeStates.values());

}
