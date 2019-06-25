import com.company.Cont;
        import org.junit.Assert;
        import org.junit.Test;

public class ContTest {
    @Test
    public void testWidrawal(){
        //given
        Cont cont1=new Cont("Mihai","1231_1234_1234_1444",300, 12 );
        //when
        double result=cont1.widrawal(100);
        //then
        Assert.assertEquals(200, result,0.01);
    }

    @Test
    public void testDeposit(){
        Cont cont1=new Cont("Mihai","1231_1234_1234_1444",300, 12 );
        double result=cont1.deposit(200);
        Assert.assertEquals(500, result, 0.01);
    }

    @Test
    public void testAdaugaDobanda(){
        Cont cont2=new Cont("Paul","1231_1234_1234_1241", 500, 10);
        double result=cont2.adaugaDobanda();
        Assert.assertEquals(550,result,0.01);
    }
}
