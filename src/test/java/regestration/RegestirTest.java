package regestration;

import org.testng.annotations.Test;
import page.Regestration;

public class RegestirTest {
    final Regestration regestration=new Regestration();
    @org.testng.annotations.Test(priority = 1)
    public void regestrationsuccesfully(){

        regestration.Register();

    }


    }
