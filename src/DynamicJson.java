import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.ReUsableMethods;
import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
public class DynamicJson {
	
	@Test(dataProvider="BooksData")
	public void Addbook(String isbn,String aisle)
	{
		RestAssured.baseURI="http://216.10.245.166";
		String response=given().header("Content-Type","application/json")
				.body(payload.Addbook("isbn","aisle"))
				.when().post("/Library/Addbook.php").
				then().assertThat().statusCode(200).
				extract().response().asString();
				JsonPath js= ReUsableMethods.rawToJson(response);
				   String id=js.get("ID");
				   System.out.println(id);
				   

	} //deleteBOok
	@DataProvider(name="BooksData")
	public Object[][] getData()
	{
	//array=collection of elements
	//multidimensional array= collection of arrays
	return new Object[][] {{"ojfwty","9363"},{"cwetee","4253"}, {"okmfet","533"}};

	}			
	}