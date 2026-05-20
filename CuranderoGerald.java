public class CuranderoGerald extends Personatge {

    private  int CURA_MIN = 5;
    private int CURA_MAX = 15;

    private int MAL_MIN = 5;
    private int MAL_MAX = 15;

    public CuranderoGerald(String nom, Equip equip) {
        super(nom, equip);
    }

    @Override
    public void ferAccio (Personatge objectiu) {

        if (!esViu()) return;

        int atacarOcurar = Dau.tirar(10);

        if (atacarOcurar <= 8 ) {
            int cura = Dau.tirar(CURA_MAX - CURA_MIN + 1) + CURA_MIN;
            objectiu.curar(cura);

        } else {
            int mal = Dau.tirar(MAL_MAX - MAL_MIN + 1) + MAL_MIN;

            atacarAmbMal(objectiu, mal);
        }
    }
}

