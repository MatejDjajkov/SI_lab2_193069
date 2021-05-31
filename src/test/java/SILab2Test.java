import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    private List<Time> createList(Integer... elems)
    {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    public void everyBranch(){
        RuntimeException ex;


        assertEquals(0, SILab2.function(createList()));


        assertEquals(8200, SILab2.function(createList(1,35,50)));


        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(29,0,0)));
        assertTrue(ex.getMessage().contains("The hours are greater than the maximum"));


        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(-5,00,00)));
        assertTrue(ex.getMessage().contains("The hours are smaller than the minimum"));


        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(1,72,00)));
        assertTrue(ex.getMessage().contains("The minutes are greater than the maximum"));


        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(10,0,89)));
        assertTrue(ex.getMessage().contains("The seconds are not valid"));


        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(00,00,-1)));
        assertTrue(ex.getMessage().contains("The seconds are not valid"));


        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(24,1,1)));
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));


        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(24,0,2)));
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));


        assertEquals(86400, SILab2.function(createList(24,0,0)));
    }

    @Test
    public void multipleCondition(){
        RuntimeException ex;


        assertEquals(0, SILab2.function(createList()));


        assertEquals(8200, SILab2.function(createList(1,35,50)));


        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(29,0,0)));
        assertTrue(ex.getMessage().contains("The hours are greater than the maximum"));


        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(-5,00,00)));
        assertTrue(ex.getMessage().contains("The hours are smaller than the minimum"));


        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(1,72,00)));
        assertTrue(ex.getMessage().contains("The minutes are greater than the maximum"));


        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(10,0,89)));
        assertTrue(ex.getMessage().contains("The seconds are not valid"));


        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(00,00,-1)));
        assertTrue(ex.getMessage().contains("The seconds are not valid"));


        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(24,1,1)));
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));


        ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(24,0,2)));
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));


        assertEquals(86400, SILab2.function(createList(24,0,0)));
    }
}