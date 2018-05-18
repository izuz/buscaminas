package codigo;

import javax.swing.JButton;

/**
 * @author Gonzalo Izuzquiza
 */
public class Boton extends JButton{
    
    int mina = 0;
    private int i = 0;
    private int j = 0;
    int numeroMinasAlrededor = 0;
    
    public Boton (int _i, int _j){
        i = _i;
        j = _j;
    }

    public int getMina() {
        return mina;
    }

    public void setMina(int mina) {
        this.mina = mina;
    }

    public int getNumeroMinasAlrededor() {
        return numeroMinasAlrededor;
    }

    public void setNumeroMinasAlrededor(int numeroMinasAlrededor) {
        this.numeroMinasAlrededor = numeroMinasAlrededor;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    
}
