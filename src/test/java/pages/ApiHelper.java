package pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ApiHelper {

    Response response;
    int i=0;

//    @Test
//    @DisplayName("verify that the city Frankfurt is in Germany")
    public void getL(){
     response = RestAssured.get();
        List<Map> bodies = response.jsonPath().getList("networks.location");

        for (i = 0; i <bodies.size() ; i++) {
            if (bodies.get(i).containsValue("Frankfurt")){
                System.out.println(bodies.get(i));
                System.out.println("Index number of Frankfurt :"+i);
           break;
            }
        }
    }

    public void verifycountryTest(){

        Assert.assertEquals("DE",response.jsonPath().getString("networks.location["+i+"].country"));
        Assert.assertEquals("Frankfurt",response.jsonPath().getString("networks.location["+i+"].city"));

    }

    public void printLocationTest(){
        System.out.println("Laitude: "+response.jsonPath().getString("networks.location["+i+"].latitude"));

        System.out.println("Longitude: "+response.jsonPath().getString("networks.location["+i+"].longitude"));

    }




}
