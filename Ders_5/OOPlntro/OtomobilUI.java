package OOPlntro;
import javax.swing.*;
public class OtomobilUI {
    public static void main(String[] args) {
        Otomobil clio = new Otomobil();

        JFrame frame = new JFrame("Otomobil Kontrol Paneli");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton startStopBtn = new JButton("Start/Stop");
        startStopBtn.setBounds(50, 30, 120, 30);
        frame.add(startStopBtn);

        JButton hareketBtn = new JButton("Hareket Et");
        hareketBtn.setBounds(200, 30, 120, 30);
        frame.add(hareketBtn);

        JButton gazaBtn = new JButton("Gaza Bas");
        gazaBtn.setBounds(50, 80, 120, 30);
        frame.add(gazaBtn);

        JButton freneBtn = new JButton("Frene Bas");
        freneBtn.setBounds(200, 80, 120, 30);
        frame.add(freneBtn);

        JButton durdurBtn = new JButton("Durdur");
        durdurBtn.setBounds(125, 130, 120, 30);
        frame.add(durdurBtn);

        JLabel hizLabel = new JLabel("Hız: 0");
        hizLabel.setBounds(160, 180, 100, 30);
        frame.add(hizLabel);

        // Buton işlevleri
        startStopBtn.addActionListener(e -> clio.startStop());
        hareketBtn.addActionListener(e -> clio.hareketEt());
        gazaBtn.addActionListener(e -> {
            clio.gazaBas();
            hizLabel.setText("Hız: " + clio.guncelHiz());
        });
        freneBtn.addActionListener(e -> {
            clio.freneBas();
            hizLabel.setText("Hız: " + clio.guncelHiz());
        });
        durdurBtn.addActionListener(e -> {
            clio.durdur();
            hizLabel.setText("Hız: " + clio.guncelHiz());
        });

        frame.setVisible(true);
    }
}