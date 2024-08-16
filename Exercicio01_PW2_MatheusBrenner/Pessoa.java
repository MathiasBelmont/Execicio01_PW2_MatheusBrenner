abstract class Pessoa {
    protected int atributoPessoa;
    
    public int getAtributoPessoa() {
        return atributoPessoa;
    }
    public void setAtributoPessoa(int a) {
        atributoPessoa = a;
    }
    public abstract String getTipoVoz();
}