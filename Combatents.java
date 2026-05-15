import java.util.ArrayList;

public class Combatents {
    private ArrayList<Equip> equips;

    public Combatents() {
        equips = new ArrayList<>();
    }

    public void afegir(Equip e) {
        equips.add(e);
    }

    public void torn() {
        for (Equip e : equips) {
            e.torn(this);
        }
    }

    public ArrayList<Personatge> obtenirPersonatges() {
        ArrayList<Personatge> personatges = new ArrayList<>();
        for (Equip e : equips) {
            personatges.addAll(e.obtenirPersonatges());
        }
        return personatges;
    }
}
