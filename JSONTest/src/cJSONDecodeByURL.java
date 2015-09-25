import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class cJSONDecodeByURL {

	public static void main(String[] args) {
		
		String url = "https://br.api.pvp.net/api/lol/br/v1.4/summoner/by-name/DMG Ozob?api_key=a15b7f84-6013-4941-9516-127986944281";

		JSONParser parser = new JSONParser();

		try {

			// Lendo JSON (atraves de URL)
			BufferedReader input = new BufferedReader(new InputStreamReader(new URL(url).openStream(), "UTF-8"));
			Object obj = parser.parse(input);

			JSONObject jsonObject = (JSONObject) obj;

			// Pegando conteudo do campo que se chama "id"
			int id = (int) jsonObject.get("id");
			System.out.println(id);


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
