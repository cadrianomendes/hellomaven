import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class bJSONDecode {

	// Lendo um JSON
	public static void main(String[] args) {

		JSONParser parser = new JSONParser();

		try {

			//Lendo JSON (atraves de arquivo)
			Object obj = parser.parse(new FileReader("c:\\BlueMix\\Workspace\\JSONTest\\src\\test.json"));

			JSONObject jsonObject = (JSONObject) obj;

			//Pegando conteudo do campo que se chama "name"
			String name = (String) jsonObject.get("name");
			System.out.println(name);

			//Pegando conteudo do campo que se chama "age"
			long age = (Long) jsonObject.get("age");
			System.out.println(age);

			//Pegando conteudo do array que se chama "messages"
			JSONArray msg = (JSONArray) jsonObject.get("messages");
			Iterator<String> iterator = msg.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
