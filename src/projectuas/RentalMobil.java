package projectuas;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class RentalMobil extends JFrame implements ActionListener {
    public JLabel judul,nama, noTelp, waktu, tglSewa, mobil, harga;
    protected JTextField teksNama, teksNoTelp, teksharga;
    JRadioButton jk_laki, jk_wanita;
    JComboBox jc_waktu, jc_mobil;
    JButton submit = new JButton();
    JButton view = new JButton();
    JButton close = new JButton();
    
    public RentalMobil(){
        Font title = new Font("Times New Roman", Font.BOLD, 22);
        Font body = new Font("Times New Roman", Font.PLAIN, 16);
        judul = new JLabel();
        nama = new JLabel();
        
        judul.setFont(title);
        nama.setFont(body);noTelp.setFont(body);waktu.setFont(body);
        tglSewa.setFont(body);mobil.setFont(body);harga.setFont(body);
        submit.setFont(body);view.setFont(body);close.setFont(body);
        
        judul.setText("Rental Mobil ASIIIUUU");
        judul.setBounds(180, 10, 250, 30);
        add(judul);
        
        nama.setText("Nama");
        nama.setBounds(50, 70, 100, 25);
        add(nama);
        teksNama = new JTextField();
        teksNama.setBounds(190, 70, 180, 25);
        add(teksNama);
        
        
        setLayout(null);
        setTitle("RENTAL MOBIL");
        setSize(520, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
    
    public static void main(String[] args) {
        RentalMobil rb = new RentalMobil();
    }
}
