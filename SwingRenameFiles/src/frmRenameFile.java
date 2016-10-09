import javax.swing.*;

/**
 * Created by user on 09.10.2016.
 */
public class frmRenameFile extends JFrame {
    private JButton buttonOK;

    frmRenameFile()
    {
      //  buttonOK = new JButton();
      //  buttonOK.
        buttonOK.setBounds(10,10,40,20);
        buttonOK.setVisible(true);
    }

    public static void main(String[] args) {

        frmRenameFile frm1 = new frmRenameFile();
        frm1.setBounds(10,10,500,410);
        frm1.setLocationRelativeTo(null);
        frm1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frm1.setVisible(true);
    }
}
