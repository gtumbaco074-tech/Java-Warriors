public class Joc {
    Combatents combatents;

    public void executar() {
        combatents = new Combatents();
        crearEquips();
        while (combatents.equipsAmbVius() > 1) {
            combatents.torn();
        }
        combatents.fi();
    }

    public void crearEquips() {
        //combatents.afegir(new EquipArquers("Arquers"));
        //combatents.afegir(new EquipArquerIGuerrer("Mixt"));
        //combatents.afegir(new EquipGuerrers("Guerrers"));
        combatents.afegir(new EquipDavant("Davant"));
        combatents.afegir(new EquipDarrera("Darrera"));
        combatents.afegir(new EquipCuranderos("Angels"));
    }
}
