package Entidades;

public class Equipamento {
    private String nomeEquipamento;
    private String tipoEquipamento;
    private int id;

    public void setNomeEquipamento(String novonomeEquipamento) {
        this.nomeEquipamento = novonomeEquipamento;
    }

    public String getNomeEquipamento() {
        return this.nomeEquipamento;
    }

    public void setTipoEquipamento(String novotipoEquipamento) {
        this.tipoEquipamento = novotipoEquipamento;
    }

    public String getTipoEquipamento() {
        return this.tipoEquipamento;
    }

    public void setId(int novoid) {
        this.id = novoid;
    }

    public int getId() {
        return this.id;
    }

}
