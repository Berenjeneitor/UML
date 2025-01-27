import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {
    public OK getoK() {
        return oK;
    }
    public Cancel getCancel() {
        return cancel;
    }
    public Hilo getHilo() {
        return hilo;
    }
    private OK oK;
    private Cancel cancel;
    private Hilo hilo;

    public ControlPanel(){
        oK = new OK();
        cancel = new Cancel();
        hilo = new Hilo();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.weightx = 0;
        constraints.insets = new Insets(5,20,5,0);
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.WEST;

        this.setLayout(new GridBagLayout());
        this.add(cancel, constraints);
        constraints.gridx = 1;
        this.add(oK, constraints);
        constraints.gridx = 2;
        this.add(hilo, constraints);
        constraints.gridx = 3;
        constraints.weightx = 1;
        this.add(Box.createHorizontalGlue(), constraints);
        this.setVisible(true);
        System.out.println("Controls creado");
    }
}
