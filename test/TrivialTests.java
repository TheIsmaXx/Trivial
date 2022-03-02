import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {
    @Test
    public void true_is_true(){
        Assertions.assertTrue(false);
    }

    @Test
    public void crear_Game(){
        Game trivial = new Game();
    }

    @Test
    public void si_al_principio_saco_un_1_voy_a_casilla_1(){
        Game sut = new Game();
        sut.agregar("María");
        sut.agregar("Juan");

        sut.tirarDado(1);

        String expected = "La nueva posición de María es 1";

        String actual = sut.nuevaPosicionJugador();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void menos_de_2_jugadores(){
        Game sut = new Game();

        sut.agregar("María");

        boolean esjugable = sut.esJugable();

        Assertions.assertFalse(esjugable);
    }

    @Test
    public void mas_de_2_jugadores_o_2(){
        Game sut = new Game();

        sut.agregar("María");
        sut.agregar("Juan");
        sut.agregar("Pedro");

        boolean esjugable = sut.esJugable();

        Assertions.assertTrue(esjugable);
    }

    @Test
    public void mas_de_6_jugadores(){
        Game sut = new Game();

        sut.agregar("María");
        sut.agregar("Juan");
        sut.agregar("Pedro");
        sut.agregar("Paco");
        sut.agregar("Pablo");
        sut.agregar("Ismael");
        sut.agregar("Javier");

        boolean esjugable = sut.esJugable();

        Assertions.assertFalse(esjugable);
    }
}
