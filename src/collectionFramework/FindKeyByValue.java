package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class FindKeyByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> countryCapitals = new HashMap<>();
		countryCapitals.put("India", "New Delhi");
		countryCapitals.put("Germany", "Berlin");
		countryCapitals.put("Japan", "Tokyo");
		countryCapitals.put("USA", "Washington DC");

		System.out.println("Country Capitals Map: " + countryCapitals);

		findCountry(countryCapitals, "Tokyo");
		
		findCountry(countryCapitals, "Mumbai");

	}

	private static void findCountry(HashMap<String, String> countryCapitals, String valueToFind) {
		// TODO Auto-generated method stub
		boolean found = false;

		for (Map.Entry<String, String> entry : countryCapitals.entrySet()) {
			if (entry.getValue().equals(valueToFind)) {
				System.out.println("The country with capital '" + valueToFind + "' is: " + entry.getKey());
				found = true;
			}
		}

		if (!found) {
			System.out.println("No country found with this capital: " + valueToFind);
		}
	}

}
