public class EquipCuranderos extends Equip {
    public EquipCuranderos(String nom) {
        super(nom);
        afegirPersonatge(new CuranderoGerald("Venus", this));
        afegirPersonatge(new CuranderoGerald("Afrodita", this));

    }
}