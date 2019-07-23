package anagramme.src.test;

import anagramme.src.main.Anagramme;
import org.junit.*;

public class TestAnagramme {

    @Test
    public void CatIsAnagrammeOfAct(){
        Assert.assertEquals(true, Anagramme.isAnagramme("Cat", "Act"));
    }

    @Test
    public void CatIsNotAnagrammeOfDog(){
        Assert.assertEquals(false, Anagramme.isAnagramme("Cat", "Dog"));
    }

    @Test
    public void DogIsNotAnagrammeOfHome(){
        Assert.assertEquals(false, Anagramme.isAnagramme("Dog", "Home"));
    }


}
