package sw1.connector;

import sw1.model.AccesoEntity;

import java.util.List;

/**
 * Created by Ricardo on 13/07/2015.
 */
public class TestClass {
    public static void main(String[] args) {

        List<AccesoEntity> hola = DataBaseController.getInstance().getAllAccesos();
        for (AccesoEntity c:hola){
            System.out.println(c);
        }
    }
}
