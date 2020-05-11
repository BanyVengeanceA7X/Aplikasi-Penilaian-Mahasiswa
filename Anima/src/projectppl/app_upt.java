package projectppl;

import AppPackage.AnimationClass;
import InputMahasiswa.DaftarMahasiswa;
import InputMahasiswa.Mahasiswa;
import InputMahasiswa.TableMhs;
import InputMahasiswa.Tablemhssemua;
import InputNilai.DaftarNilai;
import InputNilai.Nilai;
import InputNilai.TableNilai;
import InputNilai.Tablepdf;
import Inputmatkul.TableMatkul;
import databasekonek.koneksi;
import jadwalmatkul.jadwalmatkul;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author BANY A7X
 */
public class app_upt extends javax.swing.JFrame {
    AnimationClass animasi_slide = new AnimationClass();
    int mouseX;
    int mouseY;
    DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>();
    String Kode_kelas,Nama_mk,nama,Hari,Kode_mk, Waktu,inputnim,namamhs,getkodematkul,Kode_ruang;
    int nim, Sks,Uts,Uas,quiz,tugas,tubes,prak,tambahan;
    int indexA,indexB,indexC,indexD,indexE,indexAB,indexBC;
    private DefaultTableModel model;
    
    public void clear(){
        input_kodemk.setText("");
        input_kodekelas.setText("R");
        input_namamk.setText("");
        input_sks.setValue(1);
        input_koderuang.setText("");
        input_hari.setSelectedItem("Pilih Hari :");
        input_waktu.setText("00:00:00");
        
        input_nuts.setText("0");
        input_nuas.setText("0");
        input_nquiz.setText("0");
        input_ntugas.setText("0");
        input_ntubes.setText("0");
        input_nprak.setText("0");
        input_ntambahan.setText("0");
        
        input_indexA.setText("0");
        input_indexAB.setText("0");
        input_indexB.setText("0");
        input_indexBC.setText("0");
        input_indexC.setText("0");
        input_indexD.setText("0");
        input_indexE.setText("0");
    }
    public void loaddata(){
        inputnim = input_nim1.getText();
        getkodematkul=pilihmatkul.getSelectedItem().toString();
        namamhs = input_namamhs.getText();
        Kode_mk = input_kodemk.getText();
        Kode_kelas = input_kodekelas.getText();
        Nama_mk =input_namamk.getText();
        Sks = (Integer)input_sks.getValue();
        Hari = (String)input_hari.getSelectedItem();
        Waktu = input_waktu.getText();
        Kode_ruang = input_koderuang.getText();
        Uts = Integer.parseInt(input_nuts.getText());
        Uas = Integer.parseInt(input_nuas.getText());
        quiz = Integer.parseInt(input_nquiz.getText());
        tugas = Integer.parseInt(input_ntugas.getText());
        tubes = Integer.parseInt(input_ntubes.getText());
        prak = Integer.parseInt(input_nprak.getText());
        tambahan = Integer.parseInt(input_ntambahan.getText());
        
        indexA = Integer.parseInt(input_indexA.getText());
        indexB = Integer.parseInt(input_indexAB.getText());
        indexC = Integer.parseInt(input_indexB.getText());
        indexD = Integer.parseInt(input_indexBC.getText());
        indexE = Integer.parseInt(input_indexC.getText());
        
        
    }
    
    public app_upt() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        r = new javax.swing.JLabel();
        nav = new javax.swing.JScrollPane();
        navigasi1 = new javax.swing.JPanel();
        menu_mk = new javax.swing.JLabel();
        menu_lihatnilai = new javax.swing.JLabel();
        menu_grafik = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        menu_mhs = new javax.swing.JLabel();
        menu_mhs1 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jadwal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        navbar = new javax.swing.JButton();
        kepalapanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Laman = new javax.swing.JPanel();
        HalamanAwal = new javax.swing.JPanel();
        judul_halamanAwal = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tampilan_awal = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        laman_matkul = new javax.swing.JPanel();
        konten_matkul = new javax.swing.JPanel();
        cardlayout_kiri = new javax.swing.JPanel();
        fresh_open = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        tabel = new javax.swing.JPanel();
        text3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablematkul = new javax.swing.JTable();
        cardlayout_kanan = new javax.swing.JPanel();
        card_komp = new javax.swing.JPanel();
        show_komponen = new javax.swing.JPanel();
        lblkode_mk = new javax.swing.JLabel();
        showkode_kelas = new javax.swing.JLabel();
        lblkode_mk1 = new javax.swing.JLabel();
        showkode_mk = new javax.swing.JLabel();
        show_tambah = new javax.swing.JLabel();
        lblkode_mk2 = new javax.swing.JLabel();
        lblkode_mk3 = new javax.swing.JLabel();
        lblkode_mk4 = new javax.swing.JLabel();
        lblkode_mk5 = new javax.swing.JLabel();
        show_ruang = new javax.swing.JLabel();
        show_namamk = new javax.swing.JLabel();
        show_sks = new javax.swing.JLabel();
        lblkode_mk6 = new javax.swing.JLabel();
        show_hari = new javax.swing.JLabel();
        lblkode_mk7 = new javax.swing.JLabel();
        show_waktu = new javax.swing.JLabel();
        lblkode_mk8 = new javax.swing.JLabel();
        lblkode_mk9 = new javax.swing.JLabel();
        lblkode_mk10 = new javax.swing.JLabel();
        lblkode_mk11 = new javax.swing.JLabel();
        lblkode_mk12 = new javax.swing.JLabel();
        lblkode_mk13 = new javax.swing.JLabel();
        lblkode_mk14 = new javax.swing.JLabel();
        show_e = new javax.swing.JLabel();
        show_uas = new javax.swing.JLabel();
        show_quiz = new javax.swing.JLabel();
        show_tugas = new javax.swing.JLabel();
        show_tubes = new javax.swing.JLabel();
        show_prak = new javax.swing.JLabel();
        persen8 = new javax.swing.JLabel();
        persen9 = new javax.swing.JLabel();
        persen10 = new javax.swing.JLabel();
        persen11 = new javax.swing.JLabel();
        persen12 = new javax.swing.JLabel();
        persen13 = new javax.swing.JLabel();
        persen14 = new javax.swing.JLabel();
        lblkode_mk15 = new javax.swing.JLabel();
        lblkode_mk16 = new javax.swing.JLabel();
        lblkode_mk17 = new javax.swing.JLabel();
        lblkode_mk18 = new javax.swing.JLabel();
        lblkode_mk19 = new javax.swing.JLabel();
        lblkode_mk20 = new javax.swing.JLabel();
        lblkode_mk21 = new javax.swing.JLabel();
        lblkode_mk22 = new javax.swing.JLabel();
        show_uts = new javax.swing.JLabel();
        show_a = new javax.swing.JLabel();
        show_ab = new javax.swing.JLabel();
        show_b = new javax.swing.JLabel();
        show_bc = new javax.swing.JLabel();
        show_c = new javax.swing.JLabel();
        show_d = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        blank = new javax.swing.JPanel();
        laman_input = new javax.swing.JPanel();
        input_kodemk = new javax.swing.JTextField();
        input_kodekelas = new javax.swing.JTextField();
        input_namamk = new javax.swing.JTextField();
        kode_mk = new javax.swing.JLabel();
        field_kdmk = new javax.swing.JLabel();
        kd_kelas = new javax.swing.JLabel();
        field_kdkelas = new javax.swing.JLabel();
        nama_mk = new javax.swing.JLabel();
        field_namamk = new javax.swing.JLabel();
        sks_mk = new javax.swing.JLabel();
        btsave_matkul = new javax.swing.JLabel();
        btcancel_matkul = new javax.swing.JLabel();
        hari_mk = new javax.swing.JLabel();
        index_nilai = new javax.swing.JLabel();
        komponen_mk = new javax.swing.JLabel();
        text_uts = new javax.swing.JLabel();
        text_uas = new javax.swing.JLabel();
        text_quiz = new javax.swing.JLabel();
        text_tugas = new javax.swing.JLabel();
        text_tubes = new javax.swing.JLabel();
        text_prak = new javax.swing.JLabel();
        text_tambahan = new javax.swing.JLabel();
        input_nuts = new javax.swing.JTextField();
        input_nuas = new javax.swing.JTextField();
        input_nquiz = new javax.swing.JTextField();
        input_ntugas = new javax.swing.JTextField();
        input_ntubes = new javax.swing.JTextField();
        input_nprak = new javax.swing.JTextField();
        input_ntambahan = new javax.swing.JTextField();
        field_uts = new javax.swing.JLabel();
        field_uas = new javax.swing.JLabel();
        field_quiz = new javax.swing.JLabel();
        field_tugas = new javax.swing.JLabel();
        field_tubes = new javax.swing.JLabel();
        field_praktikum = new javax.swing.JLabel();
        field_tambahan = new javax.swing.JLabel();
        persen1 = new javax.swing.JLabel();
        persen2 = new javax.swing.JLabel();
        persen3 = new javax.swing.JLabel();
        persen4 = new javax.swing.JLabel();
        persen5 = new javax.swing.JLabel();
        persen6 = new javax.swing.JLabel();
        persen7 = new javax.swing.JLabel();
        line = new javax.swing.JLabel();
        input_indexA = new javax.swing.JTextField();
        input_indexAB = new javax.swing.JTextField();
        input_indexB = new javax.swing.JTextField();
        input_indexBC = new javax.swing.JTextField();
        input_indexC = new javax.swing.JTextField();
        index_A = new javax.swing.JLabel();
        index_B = new javax.swing.JLabel();
        index_C = new javax.swing.JLabel();
        index_D = new javax.swing.JLabel();
        index_E = new javax.swing.JLabel();
        field_index1 = new javax.swing.JLabel();
        field_index2 = new javax.swing.JLabel();
        field_index3 = new javax.swing.JLabel();
        field_index4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        waktu_mk2 = new javax.swing.JLabel();
        input_waktu = new javax.swing.JTextField();
        field_waktu = new javax.swing.JLabel();
        index_B1 = new javax.swing.JLabel();
        index_B2 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        field_index6 = new javax.swing.JLabel();
        input_indexD = new javax.swing.JTextField();
        field_index8 = new javax.swing.JLabel();
        input_indexE = new javax.swing.JTextField();
        field_index9 = new javax.swing.JLabel();
        lbl_err1 = new javax.swing.JPanel();
        lbl_err3 = new javax.swing.JPanel();
        lbl_err4 = new javax.swing.JPanel();
        lbl_err5 = new javax.swing.JPanel();
        input_hari = new javax.swing.JComboBox<>();
        input_sks = new javax.swing.JSpinner();
        kode_ruang = new javax.swing.JLabel();
        input_koderuang = new javax.swing.JTextField();
        field_kdmk5 = new javax.swing.JLabel();
        lbl_err2 = new javax.swing.JPanel();
        laman_edit = new javax.swing.JPanel();
        update_kodemk1 = new javax.swing.JTextField();
        update_kodekelas1 = new javax.swing.JTextField();
        update_namamk1 = new javax.swing.JTextField();
        kode_mk5 = new javax.swing.JLabel();
        field_kdmk6 = new javax.swing.JLabel();
        kd_kelas6 = new javax.swing.JLabel();
        field_kdkelas6 = new javax.swing.JLabel();
        nama_mk1 = new javax.swing.JLabel();
        field_namamk1 = new javax.swing.JLabel();
        sks_mk1 = new javax.swing.JLabel();
        btupdate_matkul1 = new javax.swing.JLabel();
        btcupdate_matkul1 = new javax.swing.JLabel();
        hari_mk1 = new javax.swing.JLabel();
        index_nilai1 = new javax.swing.JLabel();
        komponen_mk1 = new javax.swing.JLabel();
        text_uts1 = new javax.swing.JLabel();
        text_uas1 = new javax.swing.JLabel();
        text_quiz1 = new javax.swing.JLabel();
        text_tugas1 = new javax.swing.JLabel();
        text_tubes1 = new javax.swing.JLabel();
        text_prak1 = new javax.swing.JLabel();
        text_tambahan1 = new javax.swing.JLabel();
        update_nuts1 = new javax.swing.JTextField();
        update_nuas1 = new javax.swing.JTextField();
        update_nquiz1 = new javax.swing.JTextField();
        update_ntugas1 = new javax.swing.JTextField();
        update_ntubes1 = new javax.swing.JTextField();
        update_nprak1 = new javax.swing.JTextField();
        update_ntambahan1 = new javax.swing.JTextField();
        field_uts1 = new javax.swing.JLabel();
        field_uas1 = new javax.swing.JLabel();
        field_quiz1 = new javax.swing.JLabel();
        field_tugas1 = new javax.swing.JLabel();
        field_tubes1 = new javax.swing.JLabel();
        field_praktikum1 = new javax.swing.JLabel();
        field_tambahan1 = new javax.swing.JLabel();
        persen15 = new javax.swing.JLabel();
        persen16 = new javax.swing.JLabel();
        persen17 = new javax.swing.JLabel();
        persen18 = new javax.swing.JLabel();
        persen19 = new javax.swing.JLabel();
        persen20 = new javax.swing.JLabel();
        persen21 = new javax.swing.JLabel();
        line1 = new javax.swing.JLabel();
        update_indexA1 = new javax.swing.JTextField();
        update_indexAB1 = new javax.swing.JTextField();
        update_indexB1 = new javax.swing.JTextField();
        update_indexBC1 = new javax.swing.JTextField();
        update_indexC1 = new javax.swing.JTextField();
        index_A1 = new javax.swing.JLabel();
        index_B3 = new javax.swing.JLabel();
        index_C1 = new javax.swing.JLabel();
        index_D1 = new javax.swing.JLabel();
        index_E1 = new javax.swing.JLabel();
        field_index5 = new javax.swing.JLabel();
        field_index7 = new javax.swing.JLabel();
        field_index10 = new javax.swing.JLabel();
        field_index11 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        waktu_mk8 = new javax.swing.JLabel();
        update_waktu1 = new javax.swing.JTextField();
        field_waktu4 = new javax.swing.JLabel();
        index_B4 = new javax.swing.JLabel();
        index_B5 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        field_index12 = new javax.swing.JLabel();
        update_indexD1 = new javax.swing.JTextField();
        field_index13 = new javax.swing.JLabel();
        update_indexE1 = new javax.swing.JTextField();
        field_index14 = new javax.swing.JLabel();
        update_hari1 = new javax.swing.JComboBox<>();
        update_sks1 = new javax.swing.JSpinner();
        kode_ruang1 = new javax.swing.JLabel();
        update_koderuang1 = new javax.swing.JTextField();
        field_kdmk7 = new javax.swing.JLabel();
        laman_delete = new javax.swing.JPanel();
        delete_kodemk = new javax.swing.JTextField();
        delete_namamk = new javax.swing.JTextField();
        kode_mk6 = new javax.swing.JLabel();
        field_kdmk8 = new javax.swing.JLabel();
        nama_mk2 = new javax.swing.JLabel();
        field_namamk2 = new javax.swing.JLabel();
        btn_deletemk = new javax.swing.JLabel();
        canceldelete = new javax.swing.JLabel();
        bariskedua1 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        text_matkul = new javax.swing.JLabel();
        button_input = new javax.swing.JLabel();
        pukul = new javax.swing.JLabel();
        button_update = new javax.swing.JLabel();
        delete_mk = new javax.swing.JLabel();
        laman_mahasiswa = new javax.swing.JPanel();
        bariskedua2 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        menu1 = new javax.swing.JPanel();
        text_matkul1 = new javax.swing.JLabel();
        button_input1 = new javax.swing.JLabel();
        pilihmatkul = new javax.swing.JComboBox<>();
        iconcari = new javax.swing.JLabel();
        searchkan1 = new javax.swing.JLabel();
        search2 = new javax.swing.JLabel();
        searchfix = new javax.swing.JTextField();
        button_input5 = new javax.swing.JLabel();
        COBA = new javax.swing.JTextField();
        konten_mahasiswa = new javax.swing.JPanel();
        cardlayout_kiri1 = new javax.swing.JPanel();
        fresh_open1 = new javax.swing.JPanel();
        text_matkul2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablemhs = new javax.swing.JTable();
        jLabel73 = new javax.swing.JLabel();
        sorting1 = new javax.swing.JComboBox<>();
        cardlayout_kanan1 = new javax.swing.JPanel();
        card_atas1 = new javax.swing.JPanel();
        blank1 = new javax.swing.JPanel();
        laman_input1 = new javax.swing.JPanel();
        input_namamhs = new javax.swing.JTextField();
        input_nim1 = new javax.swing.JTextField();
        input_mhs2 = new javax.swing.JTextField();
        kode_mk1 = new javax.swing.JLabel();
        field_kdmk1 = new javax.swing.JLabel();
        kd_kelas1 = new javax.swing.JLabel();
        field_kdkelas1 = new javax.swing.JLabel();
        waktu_mk1 = new javax.swing.JLabel();
        field_waktu1 = new javax.swing.JLabel();
        btsave_mhs = new javax.swing.JLabel();
        btsave_nilai = new javax.swing.JLabel();
        waktu_mk3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        komponenmhs = new javax.swing.JComboBox<>();
        waktu_mk4 = new javax.swing.JLabel();
        input_nilaimhs = new javax.swing.JTextField();
        field_waktu2 = new javax.swing.JLabel();
        laman_updatemhs = new javax.swing.JPanel();
        input_nim4 = new javax.swing.JTextField();
        kd_kelas5 = new javax.swing.JLabel();
        field_kdkelas5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        DELETE_mhs5 = new javax.swing.JLabel();
        laman_jadwal = new javax.swing.JPanel();
        bariskedua3 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        menu3 = new javax.swing.JPanel();
        text_matkul5 = new javax.swing.JLabel();
        konten_mahasiswa2 = new javax.swing.JPanel();
        fresh_open3 = new javax.swing.JPanel();
        text_matkul6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablejadwal = new javax.swing.JTable();
        laman_mahasiswa1 = new javax.swing.JPanel();
        bariskedua4 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        menu2 = new javax.swing.JPanel();
        text_matkul3 = new javax.swing.JLabel();
        button_input2 = new javax.swing.JLabel();
        button_input3 = new javax.swing.JLabel();
        searchkan = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        konten_mahasiswa1 = new javax.swing.JPanel();
        cardlayout_kiri2 = new javax.swing.JPanel();
        fresh_open2 = new javax.swing.JPanel();
        text_matkul4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablemhs1 = new javax.swing.JTable();
        cardlayout_kanan3 = new javax.swing.JPanel();
        card_atas3 = new javax.swing.JPanel();
        blank3 = new javax.swing.JPanel();
        laman_input3 = new javax.swing.JPanel();
        input_namamhs1 = new javax.swing.JTextField();
        input_nim2 = new javax.swing.JTextField();
        kode_mk3 = new javax.swing.JLabel();
        field_kdmk3 = new javax.swing.JLabel();
        kd_kelas3 = new javax.swing.JLabel();
        field_kdkelas3 = new javax.swing.JLabel();
        btsave_mhs2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        laman_updatemhs2 = new javax.swing.JPanel();
        input_namamhs2 = new javax.swing.JTextField();
        input_nim3 = new javax.swing.JTextField();
        field_kdmk4 = new javax.swing.JLabel();
        kode_mk4 = new javax.swing.JLabel();
        kd_kelas4 = new javax.swing.JLabel();
        field_kdkelas4 = new javax.swing.JLabel();
        UPDATE_mhs3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        DELETE_mhs4 = new javax.swing.JLabel();
        laman_nilai = new javax.swing.JPanel();
        bariskedua5 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        menu4 = new javax.swing.JPanel();
        text_matkul7 = new javax.swing.JLabel();
        pilihmatkul1 = new javax.swing.JComboBox<>();
        iconcari1 = new javax.swing.JLabel();
        searchkan2 = new javax.swing.JLabel();
        carimhs_nilai = new javax.swing.JLabel();
        searchmhsnilai = new javax.swing.JTextField();
        COBA1 = new javax.swing.JTextField();
        print = new javax.swing.JLabel();
        konten_nilai = new javax.swing.JPanel();
        cardlayout_kiri4 = new javax.swing.JPanel();
        fresh_open4 = new javax.swing.JPanel();
        text_matkul8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablenilai = new javax.swing.JTable();
        jLabel72 = new javax.swing.JLabel();
        sorting = new javax.swing.JComboBox<>();
        konten_pdf = new javax.swing.JPanel();
        cardlayout_kiri6 = new javax.swing.JPanel();
        fresh_open6 = new javax.swing.JPanel();
        text_matkul11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablepdf = new javax.swing.JTable();
        laman_grafik = new javax.swing.JPanel();
        bariskedua6 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        menu5 = new javax.swing.JPanel();
        text_matkul9 = new javax.swing.JLabel();
        pilihmatkul2 = new javax.swing.JComboBox<>();
        iconcari2 = new javax.swing.JLabel();
        searchfix2 = new javax.swing.JTextField();
        konten_mahasiswa4 = new javax.swing.JPanel();
        cardlayout_kiri5 = new javax.swing.JPanel();
        fresh_open5 = new javax.swing.JPanel();
        text_matkul10 = new javax.swing.JLabel();
        panelgrafik = new javax.swing.JPanel();

        jPanel2.setBackground(new java.awt.Color(70, 130, 180));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("Input Komponen Nilai");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 170, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_halaman_awal/plus.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 30, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_halaman_awal/output-onlinepngtools.png"))); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("Input Mahasiswa");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 170, 20));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_halaman_awal/nilai.png"))); // NOI18N
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel25.setText("Input Nilai Mahasiswa");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 170, 30));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_halaman_awal/bar.png"))); // NOI18N
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 40, 40));

        jLabel27.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel27.setText("Grafik dan Nilai Akhir");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 170, 30));

        r.setBackground(new java.awt.Color(70, 130, 180));
        r.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav.setBackground(new java.awt.Color(70, 130, 180));
        nav.setBorder(null);
        nav.setOpaque(false);

        navigasi1.setBackground(new java.awt.Color(70, 130, 180));
        navigasi1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu_mk.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        menu_mk.setText("Matakuliah");
        menu_mk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_mkMouseClicked(evt);
            }
        });
        navigasi1.add(menu_mk, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 120, 20));

        menu_lihatnilai.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        menu_lihatnilai.setText("Lihat Nilai Mahasiswa");
        menu_lihatnilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_lihatnilaiMouseClicked(evt);
            }
        });
        navigasi1.add(menu_lihatnilai, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 170, 30));

        menu_grafik.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        menu_grafik.setText("Grafik dan Nilai Akhir");
        menu_grafik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_grafikMouseClicked(evt);
            }
        });
        navigasi1.add(menu_grafik, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 160, 30));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_halaman_awal/plus.png"))); // NOI18N
        navigasi1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 30, 30));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_halaman_awal/add_user_group_woman_man_40px.png"))); // NOI18N
        navigasi1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_halaman_awal/nilai.png"))); // NOI18N
        navigasi1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_halaman_awal/bar.png"))); // NOI18N
        navigasi1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 40, 40));

        menu_mhs.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        menu_mhs.setText("Mahasiswa");
        menu_mhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_mhsMouseClicked(evt);
            }
        });
        navigasi1.add(menu_mhs, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 120, 40));

        menu_mhs1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        menu_mhs1.setText("Data Kuliah");
        menu_mhs1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_mhs1MouseClicked(evt);
            }
        });
        navigasi1.add(menu_mhs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 120, 30));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_halaman_awal/add_user_group_woman_man_40px.png"))); // NOI18N
        navigasi1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jadwal.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jadwal.setText("Jadwal Mengajar");
        jadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jadwalMouseClicked(evt);
            }
        });
        navigasi1.add(jadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 150, 20));

        nav.setViewportView(navigasi1);

        getContentPane().add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, 90, 230, 680));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navbar.setBackground(new java.awt.Color(255, 255, 255));
        navbar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/menu_32px.png"))); // NOI18N
        navbar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        navbar.setBorderPainted(false);
        navbar.setOpaque(false);
        navbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navbarMouseClicked(evt);
            }
        });
        jPanel1.add(navbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 30, 70, 56));

        kepalapanel.setBackground(new java.awt.Color(255, 255, 255));
        kepalapanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kepalapanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kepalapanelMouseDragged(evt);
            }
        });
        kepalapanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kepalapanelMousePressed(evt);
            }
        });
        kepalapanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/red.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        kepalapanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 9, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/orange.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        kepalapanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 9, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel7.setText("Aplikasi Penilaian Mahasiswa (ANIMA)");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kepalapanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, 30));

        getContentPane().add(kepalapanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1365, 30));

        Laman.setBackground(new java.awt.Color(250, 250, 250));
        Laman.setLayout(new java.awt.CardLayout());

        HalamanAwal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul_halamanAwal.setBackground(new java.awt.Color(255, 255, 255));
        judul_halamanAwal.setPreferredSize(new java.awt.Dimension(775, 95));
        judul_halamanAwal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/logoitera.png"))); // NOI18N
        judul_halamanAwal.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 9, -1, 42));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel22.setText("DASHBOARD APLIKASI PENILAIAN MAHASISWA");
        judul_halamanAwal.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        HalamanAwal.add(judul_halamanAwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 1310, 55));

        tampilan_awal.setBackground(new java.awt.Color(255, 255, 255));
        tampilan_awal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jLabel31.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel31.setText("Hello, Selamat Datang!");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel31)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        tampilan_awal.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 460, 80));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_halaman_awal/20200312_203118.jpg"))); // NOI18N
        tampilan_awal.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 720));

        HalamanAwal.add(tampilan_awal, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 50, 1370, 780));

        Laman.add(HalamanAwal, "card4");

        laman_matkul.setBackground(new java.awt.Color(250, 250, 250));
        laman_matkul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        konten_matkul.setBackground(new java.awt.Color(250, 250, 250));
        konten_matkul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardlayout_kiri.setBackground(new java.awt.Color(255, 255, 255));
        cardlayout_kiri.setLayout(new java.awt.CardLayout());

        fresh_open.setBackground(new java.awt.Color(255, 255, 255));
        fresh_open.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fresh_open.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/label_text.png"))); // NOI18N
        fresh_open.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 30, -1, -1));

        text2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/text_empty.png"))); // NOI18N
        fresh_open.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 300, -1, -1));

        cardlayout_kiri.add(fresh_open, "card2");

        tabel.setBackground(new java.awt.Color(255, 255, 255));
        tabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/label_text.png"))); // NOI18N
        tabel.add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        tablematkul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Matkul", "Kode Kelas", "Nama matkul", "SKS", "Hari", "Waktu"
            }
        ));
        tablematkul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablematkulMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablematkul);

        tabel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 870, 490));

        cardlayout_kiri.add(tabel, "card3");

        konten_matkul.add(cardlayout_kiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 980, 610));

        cardlayout_kanan.setBackground(new java.awt.Color(255, 255, 255));
        cardlayout_kanan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardlayout_kanan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card_komp.setLayout(new java.awt.CardLayout());

        show_komponen.setBackground(new java.awt.Color(255, 255, 255));
        show_komponen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblkode_mk.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk.setText("Kode Kelas         :");
        show_komponen.add(lblkode_mk, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 60, -1, -1));

        showkode_kelas.setBackground(new java.awt.Color(255, 255, 255));
        showkode_kelas.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        showkode_kelas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        showkode_kelas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(showkode_kelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 190, 23));

        lblkode_mk1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk1.setText("Kode Matakuliah  :");
        show_komponen.add(lblkode_mk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 15, -1, -1));

        showkode_mk.setBackground(new java.awt.Color(255, 255, 255));
        showkode_mk.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        showkode_mk.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        showkode_mk.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(showkode_mk, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 15, 190, 23));

        show_tambah.setBackground(new java.awt.Color(255, 255, 255));
        show_tambah.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        show_tambah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_tambah.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(show_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, 30, 23));

        lblkode_mk2.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk2.setText("Tambahan     :");
        show_komponen.add(lblkode_mk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 560, -1, -1));

        lblkode_mk3.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk3.setText("Ruangan             :");
        show_komponen.add(lblkode_mk3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 100, -1, -1));

        lblkode_mk4.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk4.setText("Nama Matakuliah :");
        show_komponen.add(lblkode_mk4, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 140, -1, -1));

        lblkode_mk5.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk5.setText("SKS                   :");
        show_komponen.add(lblkode_mk5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 180, -1, -1));

        show_ruang.setBackground(new java.awt.Color(255, 255, 255));
        show_ruang.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        show_ruang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        show_ruang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(show_ruang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 190, 23));

        show_namamk.setBackground(new java.awt.Color(255, 255, 255));
        show_namamk.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        show_namamk.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        show_namamk.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(show_namamk, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 190, 23));

        show_sks.setBackground(new java.awt.Color(255, 255, 255));
        show_sks.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        show_sks.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        show_sks.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(show_sks, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 190, 23));

        lblkode_mk6.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk6.setText("Hari                    :");
        show_komponen.add(lblkode_mk6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 220, -1, -1));

        show_hari.setBackground(new java.awt.Color(255, 255, 255));
        show_hari.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        show_hari.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        show_hari.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(show_hari, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 190, 23));

        lblkode_mk7.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk7.setText("Waktu                :");
        show_komponen.add(lblkode_mk7, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 270, -1, -1));

        show_waktu.setBackground(new java.awt.Color(255, 255, 255));
        show_waktu.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        show_waktu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        show_waktu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(show_waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 190, 23));

        lblkode_mk8.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk8.setText("TUGAS          :");
        show_komponen.add(lblkode_mk8, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 470, -1, -1));

        lblkode_mk9.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk9.setText("Index Nilai");
        show_komponen.add(lblkode_mk9, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 340, -1, -1));

        lblkode_mk10.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk10.setText("E    :");
        show_komponen.add(lblkode_mk10, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 560, -1, -1));

        lblkode_mk11.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk11.setText("UAS              :");
        show_komponen.add(lblkode_mk11, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 410, -1, -1));

        lblkode_mk12.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk12.setText("QUIZ             :");
        show_komponen.add(lblkode_mk12, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 440, -1, -1));

        lblkode_mk13.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk13.setText("Tugas Besar  :");
        show_komponen.add(lblkode_mk13, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 500, -1, -1));

        lblkode_mk14.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk14.setText("Praktikum      :");
        show_komponen.add(lblkode_mk14, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 530, -1, -1));

        show_e.setBackground(new java.awt.Color(255, 255, 255));
        show_e.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        show_e.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_e.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(show_e, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, 30, 23));

        show_uas.setBackground(new java.awt.Color(255, 255, 255));
        show_uas.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        show_uas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_uas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(show_uas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 30, 23));

        show_quiz.setBackground(new java.awt.Color(255, 255, 255));
        show_quiz.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        show_quiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_quiz.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(show_quiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 30, 23));

        show_tugas.setBackground(new java.awt.Color(255, 255, 255));
        show_tugas.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        show_tugas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_tugas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(show_tugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 30, 23));

        show_tubes.setBackground(new java.awt.Color(255, 255, 255));
        show_tubes.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        show_tubes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_tubes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(show_tubes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 30, 23));

        show_prak.setBackground(new java.awt.Color(255, 255, 255));
        show_prak.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        show_prak.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_prak.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(show_prak, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 30, 23));

        persen8.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen8.setText("%");
        show_komponen.add(persen8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        persen9.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen9.setText("%");
        show_komponen.add(persen9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, -1));

        persen10.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen10.setText("%");
        show_komponen.add(persen10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, -1, -1));

        persen11.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen11.setText("%");
        show_komponen.add(persen11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        persen12.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen12.setText("%");
        show_komponen.add(persen12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, -1, -1));

        persen13.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen13.setText("%");
        show_komponen.add(persen13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

        persen14.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen14.setText("%");
        show_komponen.add(persen14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, -1, -1));

        lblkode_mk15.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk15.setText("Komponen Nilai");
        show_komponen.add(lblkode_mk15, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 340, -1, -1));

        lblkode_mk16.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk16.setText("UTS              :");
        show_komponen.add(lblkode_mk16, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 380, -1, -1));

        lblkode_mk17.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk17.setText("AB  :");
        show_komponen.add(lblkode_mk17, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 410, -1, -1));

        lblkode_mk18.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk18.setText("A    :");
        show_komponen.add(lblkode_mk18, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 380, -1, -1));

        lblkode_mk19.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk19.setText("B    :");
        show_komponen.add(lblkode_mk19, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 440, -1, -1));

        lblkode_mk20.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk20.setText("BC  :");
        show_komponen.add(lblkode_mk20, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 470, -1, -1));

        lblkode_mk21.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk21.setText("C    :");
        show_komponen.add(lblkode_mk21, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 500, -1, -1));

        lblkode_mk22.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        lblkode_mk22.setText("D    :");
        show_komponen.add(lblkode_mk22, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 530, -1, -1));

        show_uts.setBackground(new java.awt.Color(255, 255, 255));
        show_uts.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        show_uts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_uts.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(show_uts, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 30, 23));

        show_a.setBackground(new java.awt.Color(255, 255, 255));
        show_a.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        show_a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_a.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(show_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 30, 23));

        show_ab.setBackground(new java.awt.Color(255, 255, 255));
        show_ab.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        show_ab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_ab.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(show_ab, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 30, 23));

        show_b.setBackground(new java.awt.Color(255, 255, 255));
        show_b.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        show_b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_b.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(show_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 30, 23));

        show_bc.setBackground(new java.awt.Color(255, 255, 255));
        show_bc.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        show_bc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_bc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(show_bc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 30, 23));

        show_c.setBackground(new java.awt.Color(255, 255, 255));
        show_c.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        show_c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_c.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(show_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 30, 23));

        show_d.setBackground(new java.awt.Color(255, 255, 255));
        show_d.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        show_d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_d.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_komponen.add(show_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 30, 23));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );

        show_komponen.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 370, 185, 230));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );

        show_komponen.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 370, 140, -1));

        card_komp.add(show_komponen, "card4");

        blank.setBackground(new java.awt.Color(255, 255, 255));
        blank.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        card_komp.add(blank, "card3");

        laman_input.setBackground(new java.awt.Color(255, 255, 255));
        laman_input.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input_kodemk.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_kodemk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_kodemk.setBorder(null);
        laman_input.add(input_kodemk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 18, 150, -1));

        input_kodekelas.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_kodekelas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_kodekelas.setText("R");
        input_kodekelas.setBorder(null);
        input_kodekelas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_kodekelasKeyPressed(evt);
            }
        });
        laman_input.add(input_kodekelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 150, -1));

        input_namamk.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_namamk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_namamk.setBorder(null);
        laman_input.add(input_namamk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 150, -1));

        kode_mk.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        kode_mk.setText("Kode Matakuliah  :");
        laman_input.add(kode_mk, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 15, -1, -1));

        field_kdmk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input.add(field_kdmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 14, -1, -1));

        kd_kelas.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        kd_kelas.setText("Kode Kelas         :");
        laman_input.add(kd_kelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 57, -1, -1));

        field_kdkelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input.add(field_kdkelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 56, -1, -1));

        nama_mk.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        nama_mk.setText("Nama Matakuliah :");
        laman_input.add(nama_mk, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 140, -1, -1));

        field_namamk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input.add(field_namamk, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 137, -1, -1));

        sks_mk.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        sks_mk.setText("SKS                   :");
        laman_input.add(sks_mk, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 175, -1, -1));

        btsave_matkul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button save.png"))); // NOI18N
        btsave_matkul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btsave_matkul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btsave_matkulMouseClicked(evt);
            }
        });
        laman_input.add(btsave_matkul, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, -1, 40));

        btcancel_matkul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button cancel1.png"))); // NOI18N
        btcancel_matkul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btcancel_matkul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcancel_matkulMouseClicked(evt);
            }
        });
        laman_input.add(btcancel_matkul, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, -1, 40));

        hari_mk.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        hari_mk.setText("Hari                    :");
        laman_input.add(hari_mk, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        index_nilai.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        index_nilai.setText("Index Nilai   :");
        laman_input.add(index_nilai, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 295, -1, -1));

        komponen_mk.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        komponen_mk.setText("Komponen Nilai   :");
        laman_input.add(komponen_mk, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 295, -1, -1));

        text_uts.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        text_uts.setText("UTS");
        laman_input.add(text_uts, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        text_uas.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        text_uas.setText("UAS");
        laman_input.add(text_uas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        text_quiz.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        text_quiz.setText("Quiz");
        laman_input.add(text_quiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        text_tugas.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        text_tugas.setText("Tugas");
        laman_input.add(text_tugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        text_tubes.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        text_tubes.setText("Tugas Besar");
        laman_input.add(text_tubes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        text_prak.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        text_prak.setText("Praktikum");
        laman_input.add(text_prak, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        text_tambahan.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        text_tambahan.setText("Tambahan");
        laman_input.add(text_tambahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        input_nuts.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        input_nuts.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_nuts.setText("0");
        input_nuts.setBorder(null);
        laman_input.add(input_nuts, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 333, 20, -1));

        input_nuas.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        input_nuas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_nuas.setText("0");
        input_nuas.setBorder(null);
        laman_input.add(input_nuas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 363, 20, -1));

        input_nquiz.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        input_nquiz.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_nquiz.setText("0");
        input_nquiz.setBorder(null);
        laman_input.add(input_nquiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 393, 20, -1));

        input_ntugas.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        input_ntugas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_ntugas.setText("0");
        input_ntugas.setBorder(null);
        laman_input.add(input_ntugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 423, 20, -1));

        input_ntubes.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        input_ntubes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_ntubes.setText("0");
        input_ntubes.setBorder(null);
        laman_input.add(input_ntubes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 453, 20, -1));

        input_nprak.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        input_nprak.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_nprak.setText("0");
        input_nprak.setBorder(null);
        laman_input.add(input_nprak, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 483, 20, -1));

        input_ntambahan.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        input_ntambahan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_ntambahan.setText("0");
        input_ntambahan.setBorder(null);
        laman_input.add(input_ntambahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 513, 20, -1));

        field_uts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_input.add(field_uts, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 50, -1));

        field_uas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_input.add(field_uas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 50, -1));

        field_quiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_input.add(field_quiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 50, -1));

        field_tugas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_input.add(field_tugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 50, -1));

        field_tubes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_input.add(field_tubes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 50, -1));

        field_praktikum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_input.add(field_praktikum, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 50, -1));

        field_tambahan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_input.add(field_tambahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 50, -1));

        persen1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen1.setText("%");
        laman_input.add(persen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        persen2.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen2.setText("%");
        laman_input.add(persen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));

        persen3.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen3.setText("%");
        laman_input.add(persen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        persen4.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen4.setText("%");
        laman_input.add(persen4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        persen5.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen5.setText("%");
        laman_input.add(persen5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, -1, -1));

        persen6.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen6.setText("%");
        laman_input.add(persen6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, -1, -1));

        persen7.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen7.setText("%");
        laman_input.add(persen7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, -1, -1));

        line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/line.png"))); // NOI18N
        laman_input.add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 333, 10, 200));

        input_indexA.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        input_indexA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_indexA.setText("0");
        input_indexA.setBorder(null);
        laman_input.add(input_indexA, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 333, 20, -1));

        input_indexAB.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        input_indexAB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_indexAB.setText("0");
        input_indexAB.setBorder(null);
        laman_input.add(input_indexAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 363, 20, -1));

        input_indexB.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        input_indexB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_indexB.setText("0");
        input_indexB.setBorder(null);
        laman_input.add(input_indexB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 393, 20, -1));

        input_indexBC.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        input_indexBC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_indexBC.setText("0");
        input_indexBC.setBorder(null);
        laman_input.add(input_indexBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 423, 20, -1));

        input_indexC.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        input_indexC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_indexC.setText("0");
        input_indexC.setBorder(null);
        laman_input.add(input_indexC, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 453, 20, -1));

        index_A.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        index_A.setText("A");
        laman_input.add(index_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        index_B.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        index_B.setText("E");
        laman_input.add(index_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, -1, -1));

        index_C.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        index_C.setText("B");
        laman_input.add(index_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        index_D.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        index_D.setText("BC");
        laman_input.add(index_D, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));

        index_E.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        index_E.setText("C");
        laman_input.add(index_E, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        field_index1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_input.add(field_index1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 50, -1));

        field_index2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_input.add(field_index2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 50, -1));

        field_index3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_input.add(field_index3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 50, -1));

        field_index4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_input.add(field_index4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 50, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText(":");
        laman_input.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 10, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setText(":");
        laman_input.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 10, 20));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setText(":");
        laman_input.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 10, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setText(":");
        laman_input.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 10, -1));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setText(":");
        laman_input.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 10, -1));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setText(":");
        laman_input.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 10, -1));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setText(":");
        laman_input.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 10, 20));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setText(":");
        laman_input.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 10, 20));

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setText(":");
        laman_input.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 10, 20));

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel18.setText(":");
        laman_input.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 10, 20));

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel19.setText(":");
        laman_input.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 10, 20));

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel20.setText(":");
        laman_input.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 10, 20));

        waktu_mk2.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        waktu_mk2.setText("Waktu                 :");
        laman_input.add(waktu_mk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        input_waktu.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_waktu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_waktu.setText("00:00:00");
        input_waktu.setBorder(null);
        input_waktu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_waktuKeyPressed(evt);
            }
        });
        laman_input.add(input_waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 254, 150, -1));

        field_waktu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input.add(field_waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        index_B1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        index_B1.setText("AB");
        laman_input.add(index_B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        index_B2.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        index_B2.setText("D");
        laman_input.add(index_B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, -1, -1));

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel28.setText(":");
        laman_input.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 10, -1));

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel29.setText(":");
        laman_input.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 10, -1));

        field_index6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_input.add(field_index6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 50, -1));

        input_indexD.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        input_indexD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_indexD.setText("0");
        input_indexD.setBorder(null);
        laman_input.add(input_indexD, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 483, 20, -1));

        field_index8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_input.add(field_index8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 50, -1));

        input_indexE.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        input_indexE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_indexE.setText("0");
        input_indexE.setBorder(null);
        laman_input.add(input_indexE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 513, 20, -1));

        field_index9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_input.add(field_index9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 50, -1));

        lbl_err1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_err1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51), 2));

        javax.swing.GroupLayout lbl_err1Layout = new javax.swing.GroupLayout(lbl_err1);
        lbl_err1.setLayout(lbl_err1Layout);
        lbl_err1Layout.setHorizontalGroup(
            lbl_err1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );
        lbl_err1Layout.setVerticalGroup(
            lbl_err1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        laman_input.add(lbl_err1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 17, 150, 23));

        lbl_err3.setBackground(new java.awt.Color(255, 255, 255));
        lbl_err3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51), 2));

        javax.swing.GroupLayout lbl_err3Layout = new javax.swing.GroupLayout(lbl_err3);
        lbl_err3.setLayout(lbl_err3Layout);
        lbl_err3Layout.setHorizontalGroup(
            lbl_err3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );
        lbl_err3Layout.setVerticalGroup(
            lbl_err3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        laman_input.add(lbl_err3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 150, 23));

        lbl_err4.setBackground(new java.awt.Color(255, 255, 255));
        lbl_err4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51), 2));

        javax.swing.GroupLayout lbl_err4Layout = new javax.swing.GroupLayout(lbl_err4);
        lbl_err4.setLayout(lbl_err4Layout);
        lbl_err4Layout.setHorizontalGroup(
            lbl_err4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );
        lbl_err4Layout.setVerticalGroup(
            lbl_err4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        laman_input.add(lbl_err4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 175, 150, 23));

        lbl_err5.setBackground(new java.awt.Color(255, 255, 255));
        lbl_err5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51), 2));

        javax.swing.GroupLayout lbl_err5Layout = new javax.swing.GroupLayout(lbl_err5);
        lbl_err5.setLayout(lbl_err5Layout);
        lbl_err5Layout.setHorizontalGroup(
            lbl_err5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );
        lbl_err5Layout.setVerticalGroup(
            lbl_err5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        laman_input.add(lbl_err5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 23));

        input_hari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Hari :", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu" }));
        input_hari.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        input_hari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        input_hari.setOpaque(false);
        laman_input.add(input_hari, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 170, -1));

        input_sks.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        input_sks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        input_sks.setName(""); // NOI18N
        input_sks.setOpaque(false);
        laman_input.add(input_sks, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 176, -1, -1));

        kode_ruang.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        kode_ruang.setText("Ruangan             :");
        laman_input.add(kode_ruang, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 100, -1, -1));

        input_koderuang.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_koderuang.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_koderuang.setBorder(null);
        laman_input.add(input_koderuang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 150, -1));

        field_kdmk5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input.add(field_kdmk5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 97, -1, -1));

        lbl_err2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_err2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51), 2));

        javax.swing.GroupLayout lbl_err2Layout = new javax.swing.GroupLayout(lbl_err2);
        lbl_err2.setLayout(lbl_err2Layout);
        lbl_err2Layout.setHorizontalGroup(
            lbl_err2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );
        lbl_err2Layout.setVerticalGroup(
            lbl_err2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        laman_input.add(lbl_err2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, -1));

        card_komp.add(laman_input, "card2");

        laman_edit.setBackground(new java.awt.Color(255, 255, 255));
        laman_edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update_kodemk1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        update_kodemk1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_kodemk1.setBorder(null);
        laman_edit.add(update_kodemk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 18, 150, -1));

        update_kodekelas1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        update_kodekelas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_kodekelas1.setBorder(null);
        update_kodekelas1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                update_kodekelas1KeyPressed(evt);
            }
        });
        laman_edit.add(update_kodekelas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 150, -1));

        update_namamk1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        update_namamk1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_namamk1.setBorder(null);
        laman_edit.add(update_namamk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 150, -1));

        kode_mk5.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        kode_mk5.setText("Kode Matakuliah  :");
        laman_edit.add(kode_mk5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 15, -1, -1));

        field_kdmk6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_edit.add(field_kdmk6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 14, -1, -1));

        kd_kelas6.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        kd_kelas6.setText("Kode Kelas         :");
        laman_edit.add(kd_kelas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 57, -1, -1));

        field_kdkelas6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_edit.add(field_kdkelas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 56, -1, -1));

        nama_mk1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        nama_mk1.setText("Nama Matakuliah :");
        laman_edit.add(nama_mk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 140, -1, -1));

        field_namamk1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_edit.add(field_namamk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 137, -1, -1));

        sks_mk1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        sks_mk1.setText("SKS                   :");
        laman_edit.add(sks_mk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 175, -1, -1));

        btupdate_matkul1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button save.png"))); // NOI18N
        btupdate_matkul1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btupdate_matkul1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btupdate_matkul1MouseClicked(evt);
            }
        });
        laman_edit.add(btupdate_matkul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, -1, 40));

        btcupdate_matkul1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button cancel1.png"))); // NOI18N
        btcupdate_matkul1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btcupdate_matkul1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcupdate_matkul1MouseClicked(evt);
            }
        });
        laman_edit.add(btcupdate_matkul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, -1, 40));

        hari_mk1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        hari_mk1.setText("Hari                    :");
        laman_edit.add(hari_mk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        index_nilai1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        index_nilai1.setText("Index Nilai   :");
        laman_edit.add(index_nilai1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 295, -1, -1));

        komponen_mk1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        komponen_mk1.setText("Komponen Nilai   :");
        laman_edit.add(komponen_mk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 295, -1, -1));

        text_uts1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        text_uts1.setText("UTS");
        laman_edit.add(text_uts1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        text_uas1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        text_uas1.setText("UAS");
        laman_edit.add(text_uas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        text_quiz1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        text_quiz1.setText("Quiz");
        laman_edit.add(text_quiz1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        text_tugas1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        text_tugas1.setText("Tugas");
        laman_edit.add(text_tugas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        text_tubes1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        text_tubes1.setText("Tugas Besar");
        laman_edit.add(text_tubes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        text_prak1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        text_prak1.setText("Praktikum");
        laman_edit.add(text_prak1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        text_tambahan1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        text_tambahan1.setText("Tambahan");
        laman_edit.add(text_tambahan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        update_nuts1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        update_nuts1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_nuts1.setBorder(null);
        laman_edit.add(update_nuts1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 333, 20, -1));

        update_nuas1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        update_nuas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_nuas1.setBorder(null);
        laman_edit.add(update_nuas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 363, 20, -1));

        update_nquiz1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        update_nquiz1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_nquiz1.setBorder(null);
        laman_edit.add(update_nquiz1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 393, 20, -1));

        update_ntugas1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        update_ntugas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_ntugas1.setBorder(null);
        laman_edit.add(update_ntugas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 423, 20, -1));

        update_ntubes1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        update_ntubes1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_ntubes1.setBorder(null);
        laman_edit.add(update_ntubes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 453, 20, -1));

        update_nprak1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        update_nprak1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_nprak1.setBorder(null);
        laman_edit.add(update_nprak1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 483, 20, -1));

        update_ntambahan1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        update_ntambahan1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_ntambahan1.setBorder(null);
        laman_edit.add(update_ntambahan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 513, 20, -1));

        field_uts1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_edit.add(field_uts1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 50, -1));

        field_uas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_edit.add(field_uas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 50, -1));

        field_quiz1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_edit.add(field_quiz1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 50, -1));

        field_tugas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_edit.add(field_tugas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 50, -1));

        field_tubes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_edit.add(field_tubes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 50, -1));

        field_praktikum1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_edit.add(field_praktikum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 50, -1));

        field_tambahan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_edit.add(field_tambahan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 50, -1));

        persen15.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen15.setText("%");
        laman_edit.add(persen15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        persen16.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen16.setText("%");
        laman_edit.add(persen16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));

        persen17.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen17.setText("%");
        laman_edit.add(persen17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        persen18.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen18.setText("%");
        laman_edit.add(persen18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        persen19.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen19.setText("%");
        laman_edit.add(persen19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, -1, -1));

        persen20.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen20.setText("%");
        laman_edit.add(persen20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, -1, -1));

        persen21.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        persen21.setText("%");
        laman_edit.add(persen21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, -1, -1));

        line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/line.png"))); // NOI18N
        laman_edit.add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 333, 10, 200));

        update_indexA1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        update_indexA1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_indexA1.setBorder(null);
        laman_edit.add(update_indexA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 333, 20, -1));

        update_indexAB1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        update_indexAB1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_indexAB1.setBorder(null);
        laman_edit.add(update_indexAB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 363, 20, -1));

        update_indexB1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        update_indexB1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_indexB1.setBorder(null);
        laman_edit.add(update_indexB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 393, 20, -1));

        update_indexBC1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        update_indexBC1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_indexBC1.setBorder(null);
        laman_edit.add(update_indexBC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 423, 20, -1));

        update_indexC1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        update_indexC1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_indexC1.setBorder(null);
        laman_edit.add(update_indexC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 453, 20, -1));

        index_A1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        index_A1.setText("A");
        laman_edit.add(index_A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        index_B3.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        index_B3.setText("E");
        laman_edit.add(index_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, -1, -1));

        index_C1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        index_C1.setText("B");
        laman_edit.add(index_C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        index_D1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        index_D1.setText("BC");
        laman_edit.add(index_D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));

        index_E1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        index_E1.setText("C");
        laman_edit.add(index_E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        field_index5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_edit.add(field_index5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 50, -1));

        field_index7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_edit.add(field_index7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 50, -1));

        field_index10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_edit.add(field_index10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 50, -1));

        field_index11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_edit.add(field_index11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 50, -1));

        jLabel37.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel37.setText(":");
        laman_edit.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 10, -1));

        jLabel52.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel52.setText(":");
        laman_edit.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 10, 20));

        jLabel53.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel53.setText(":");
        laman_edit.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 10, -1));

        jLabel54.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel54.setText(":");
        laman_edit.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 10, -1));

        jLabel55.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel55.setText(":");
        laman_edit.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 10, -1));

        jLabel56.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel56.setText(":");
        laman_edit.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 10, -1));

        jLabel57.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel57.setText(":");
        laman_edit.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 10, 20));

        jLabel58.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel58.setText(":");
        laman_edit.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 10, 20));

        jLabel59.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel59.setText(":");
        laman_edit.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 10, 20));

        jLabel60.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel60.setText(":");
        laman_edit.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 10, 20));

        jLabel61.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel61.setText(":");
        laman_edit.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 10, 20));

        jLabel62.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel62.setText(":");
        laman_edit.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 10, 20));

        waktu_mk8.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        waktu_mk8.setText("Waktu                 :");
        laman_edit.add(waktu_mk8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        update_waktu1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        update_waktu1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_waktu1.setBorder(null);
        update_waktu1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                update_waktu1KeyPressed(evt);
            }
        });
        laman_edit.add(update_waktu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 254, 150, -1));

        field_waktu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_edit.add(field_waktu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        index_B4.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        index_B4.setText("AB");
        laman_edit.add(index_B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        index_B5.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        index_B5.setText("D");
        laman_edit.add(index_B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, -1, -1));

        jLabel63.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel63.setText(":");
        laman_edit.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 10, -1));

        jLabel65.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel65.setText(":");
        laman_edit.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 10, -1));

        field_index12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_edit.add(field_index12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 50, -1));

        update_indexD1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        update_indexD1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_indexD1.setBorder(null);
        laman_edit.add(update_indexD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 483, 20, -1));

        field_index13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_edit.add(field_index13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 50, -1));

        update_indexE1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        update_indexE1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_indexE1.setBorder(null);
        laman_edit.add(update_indexE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 513, 20, -1));

        field_index14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_edit.add(field_index14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 50, -1));

        update_hari1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Hari :", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu" }));
        update_hari1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update_hari1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_hari1.setOpaque(false);
        laman_edit.add(update_hari1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 170, -1));

        update_sks1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        update_sks1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_sks1.setName(""); // NOI18N
        update_sks1.setOpaque(false);
        laman_edit.add(update_sks1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 176, -1, -1));

        kode_ruang1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        kode_ruang1.setText("Ruangan             :");
        laman_edit.add(kode_ruang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 100, -1, -1));

        update_koderuang1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        update_koderuang1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_koderuang1.setBorder(null);
        laman_edit.add(update_koderuang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 150, -1));

        field_kdmk7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_edit.add(field_kdmk7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 97, -1, -1));

        card_komp.add(laman_edit, "card2");

        laman_delete.setBackground(new java.awt.Color(255, 255, 255));
        laman_delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delete_kodemk.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        delete_kodemk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        delete_kodemk.setBorder(null);
        laman_delete.add(delete_kodemk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 150, 20));

        delete_namamk.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        delete_namamk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        delete_namamk.setBorder(null);
        laman_delete.add(delete_namamk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 150, 20));

        kode_mk6.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        kode_mk6.setText("Kode Matakuliah  :");
        laman_delete.add(kode_mk6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        field_kdmk8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_delete.add(field_kdmk8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 79, -1, 40));

        nama_mk2.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        nama_mk2.setText("Nama Matakuliah :");
        laman_delete.add(nama_mk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        field_namamk2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_delete.add(field_namamk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 29, -1, 40));

        btn_deletemk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/DELETE.PNG"))); // NOI18N
        btn_deletemk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_deletemk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_deletemkMouseClicked(evt);
            }
        });
        laman_delete.add(btn_deletemk, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, 40));

        canceldelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button cancel1.png"))); // NOI18N
        canceldelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        canceldelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canceldeleteMouseClicked(evt);
            }
        });
        laman_delete.add(canceldelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, 40));

        card_komp.add(laman_delete, "card2");

        cardlayout_kanan.add(card_komp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 355, 600));

        konten_matkul.add(cardlayout_kanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 5, 360, 610));

        laman_matkul.add(konten_matkul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1365, 620));

        bariskedua1.setBackground(new java.awt.Color(255, 255, 255));
        bariskedua1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel35.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        jLabel35.setText("Tools Dosen Institut Teknologi Sumatera");
        jLabel35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/logoitera.png"))); // NOI18N

        javax.swing.GroupLayout bariskedua1Layout = new javax.swing.GroupLayout(bariskedua1);
        bariskedua1.setLayout(bariskedua1Layout);
        bariskedua1Layout.setHorizontalGroup(
            bariskedua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bariskedua1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addContainerGap(817, Short.MAX_VALUE))
        );
        bariskedua1Layout.setVerticalGroup(
            bariskedua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bariskedua1Layout.createSequentialGroup()
                .addGroup(bariskedua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addGroup(bariskedua1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel36))
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        laman_matkul.add(bariskedua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 1, 1290, 55));

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text_matkul.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        text_matkul.setText("Matakuliah");
        text_matkul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu.add(text_matkul, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 130, 40));

        button_input.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button input.jpg"))); // NOI18N
        button_input.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_inputMouseClicked(evt);
            }
        });
        menu.add(button_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, 30));

        pukul.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        menu.add(pukul, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 18, 90, 20));

        button_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/Rectangle 2.PNG"))); // NOI18N
        button_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_updateMouseClicked(evt);
            }
        });
        menu.add(button_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 80, 30));

        delete_mk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button delete.PNG"))); // NOI18N
        delete_mk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_mk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_mkMouseClicked(evt);
            }
        });
        menu.add(delete_mk, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, -1, 30));

        laman_matkul.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1365, 70));

        Laman.add(laman_matkul, "card2");

        laman_mahasiswa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bariskedua2.setBackground(new java.awt.Color(255, 255, 255));
        bariskedua2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel39.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        jLabel39.setText("Tools Dosen Institut Teknologi Sumatera");
        jLabel39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/logoitera.png"))); // NOI18N

        javax.swing.GroupLayout bariskedua2Layout = new javax.swing.GroupLayout(bariskedua2);
        bariskedua2.setLayout(bariskedua2Layout);
        bariskedua2Layout.setHorizontalGroup(
            bariskedua2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bariskedua2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addContainerGap(817, Short.MAX_VALUE))
        );
        bariskedua2Layout.setVerticalGroup(
            bariskedua2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bariskedua2Layout.createSequentialGroup()
                .addGroup(bariskedua2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addGroup(bariskedua2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel40))
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        laman_mahasiswa.add(bariskedua2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 1, 1290, 55));

        menu1.setBackground(new java.awt.Color(255, 255, 255));

        text_matkul1.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        text_matkul1.setText("Mata Kuliah : ");
        text_matkul1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button_input1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button input.jpg"))); // NOI18N
        button_input1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_input1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_input1MouseClicked(evt);
            }
        });

        pilihmatkul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pilihmatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihmatkulActionPerformed(evt);
            }
        });

        iconcari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/search_find_lupa_21889.png"))); // NOI18N
        iconcari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconcariMouseClicked(evt);
            }
        });

        searchkan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N

        search2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/cari.PNG"))); // NOI18N
        search2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search2MouseClicked(evt);
            }
        });

        searchfix.setBorder(null);

        button_input5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button delete.PNG"))); // NOI18N
        button_input5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_input5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_input5MouseClicked(evt);
            }
        });

        COBA.setText("Nama Mata Kuliah");

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_matkul1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pilihmatkul, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iconcari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(COBA, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchfix, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(search2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(button_input1)
                .addGap(38, 38, 38)
                .addComponent(button_input5)
                .addGap(217, 217, 217))
            .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu1Layout.createSequentialGroup()
                    .addContainerGap(628, Short.MAX_VALUE)
                    .addComponent(searchkan1)
                    .addContainerGap(567, Short.MAX_VALUE)))
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pilihmatkul)
                            .addComponent(text_matkul1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(iconcari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button_input5)
                            .addComponent(button_input1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(menu1Layout.createSequentialGroup()
                                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(COBA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchfix, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu1Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(searchkan1)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        laman_mahasiswa.add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1365, 70));

        konten_mahasiswa.setBackground(new java.awt.Color(250, 250, 250));
        konten_mahasiswa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardlayout_kiri1.setBackground(new java.awt.Color(255, 255, 255));
        cardlayout_kiri1.setLayout(new java.awt.CardLayout());

        fresh_open1.setBackground(new java.awt.Color(255, 255, 255));
        fresh_open1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        text_matkul2.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        text_matkul2.setText("Daftar Mahasiswa ");
        text_matkul2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        text_matkul2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tablemhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Kode Kelas", "Mata Kuliah", "SKS", "Tugas Besar"
            }
        ));
        tablemhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablemhsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablemhs);
        if (tablemhs.getColumnModel().getColumnCount() > 0) {
            tablemhs.getColumnModel().getColumn(0).setResizable(false);
            tablemhs.getColumnModel().getColumn(1).setResizable(false);
            tablemhs.getColumnModel().getColumn(2).setResizable(false);
            tablemhs.getColumnModel().getColumn(3).setResizable(false);
            tablemhs.getColumnModel().getColumn(4).setResizable(false);
            tablemhs.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel73.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel73.setText("Sort By :");

        sorting1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIM", "NAMA" }));
        sorting1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sorting1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout fresh_open1Layout = new javax.swing.GroupLayout(fresh_open1);
        fresh_open1.setLayout(fresh_open1Layout);
        fresh_open1Layout.setHorizontalGroup(
            fresh_open1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fresh_open1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(fresh_open1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fresh_open1Layout.createSequentialGroup()
                        .addComponent(text_matkul2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel73)
                        .addGap(18, 18, 18)
                        .addComponent(sorting1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        fresh_open1Layout.setVerticalGroup(
            fresh_open1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fresh_open1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(fresh_open1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_matkul2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fresh_open1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel73)
                        .addComponent(sorting1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
        );

        cardlayout_kiri1.add(fresh_open1, "card2");

        konten_mahasiswa.add(cardlayout_kiri1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 980, 590));

        cardlayout_kanan1.setBackground(new java.awt.Color(255, 255, 255));
        cardlayout_kanan1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardlayout_kanan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card_atas1.setLayout(new java.awt.CardLayout());

        blank1.setBackground(new java.awt.Color(255, 255, 255));
        blank1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        card_atas1.add(blank1, "card3");

        laman_input1.setBackground(new java.awt.Color(255, 255, 255));
        laman_input1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input_namamhs.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_namamhs.setBorder(null);
        laman_input1.add(input_namamhs, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 33, 150, -1));

        input_nim1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_nim1.setBorder(null);
        laman_input1.add(input_nim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 83, 150, -1));

        input_mhs2.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_mhs2.setBorder(null);
        input_mhs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_mhs2ActionPerformed(evt);
            }
        });
        laman_input1.add(input_mhs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 150, -1));

        kode_mk1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        kode_mk1.setText("Nama       :");
        laman_input1.add(kode_mk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        field_kdmk1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input1.add(field_kdmk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        kd_kelas1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        kd_kelas1.setText("NIM          :");
        laman_input1.add(kd_kelas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        field_kdkelas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input1.add(field_kdkelas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        waktu_mk1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        waktu_mk1.setText("Komponen :");
        laman_input1.add(waktu_mk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        field_waktu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input1.add(field_waktu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, 40));

        btsave_mhs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button save.png"))); // NOI18N
        btsave_mhs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btsave_mhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btsave_mhsMouseClicked(evt);
            }
        });
        laman_input1.add(btsave_mhs, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        btsave_nilai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button save.png"))); // NOI18N
        btsave_nilai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btsave_nilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btsave_nilaiMouseClicked(evt);
            }
        });
        laman_input1.add(btsave_nilai, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        waktu_mk3.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        waktu_mk3.setText("Nilai          :");
        laman_input1.add(waktu_mk3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));
        laman_input1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 360, 10));

        komponenmhs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tugas", "Kuis", "Praktikum", "Tubes", "UTS", "UAS", "Tambahan" }));
        komponenmhs.setOpaque(false);
        komponenmhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                komponenmhsActionPerformed(evt);
            }
        });
        laman_input1.add(komponenmhs, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 120, 30));

        waktu_mk4.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        waktu_mk4.setText("NIM           :");
        laman_input1.add(waktu_mk4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        input_nilaimhs.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_nilaimhs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_nilaimhs.setBorder(null);
        input_nilaimhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nilaimhsActionPerformed(evt);
            }
        });
        laman_input1.add(input_nilaimhs, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 40, -1));

        field_waktu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield_kecil.png"))); // NOI18N
        laman_input1.add(field_waktu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 60, 40));

        card_atas1.add(laman_input1, "card2");

        laman_updatemhs.setBackground(new java.awt.Color(255, 255, 255));
        laman_updatemhs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input_nim4.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_nim4.setBorder(null);
        laman_updatemhs.add(input_nim4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 93, 150, -1));

        kd_kelas5.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        kd_kelas5.setText("NIM          :");
        laman_updatemhs.add(kd_kelas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        field_kdkelas5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_updatemhs.add(field_kdkelas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 89, -1, 30));
        laman_updatemhs.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 360, 10));

        jLabel33.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel33.setText("DELETE DATA");
        laman_updatemhs.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        DELETE_mhs5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/DELETE.PNG"))); // NOI18N
        DELETE_mhs5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DELETE_mhs5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DELETE_mhs5MouseClicked(evt);
            }
        });
        laman_updatemhs.add(DELETE_mhs5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, 40));

        card_atas1.add(laman_updatemhs, "card2");

        cardlayout_kanan1.add(card_atas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 360, 510));

        konten_mahasiswa.add(cardlayout_kanan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 365, 590));

        laman_mahasiswa.add(konten_mahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1365, 610));

        Laman.add(laman_mahasiswa, "card3");

        laman_jadwal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bariskedua3.setBackground(new java.awt.Color(255, 255, 255));
        bariskedua3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel46.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        jLabel46.setText("Tools Dosen Institut Teknologi Sumatera");
        jLabel46.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/logoitera.png"))); // NOI18N

        javax.swing.GroupLayout bariskedua3Layout = new javax.swing.GroupLayout(bariskedua3);
        bariskedua3.setLayout(bariskedua3Layout);
        bariskedua3Layout.setHorizontalGroup(
            bariskedua3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bariskedua3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addContainerGap(821, Short.MAX_VALUE))
        );
        bariskedua3Layout.setVerticalGroup(
            bariskedua3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bariskedua3Layout.createSequentialGroup()
                .addGroup(bariskedua3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addGroup(bariskedua3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel47))
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        laman_jadwal.add(bariskedua3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 1, 1290, 55));

        menu3.setBackground(new java.awt.Color(255, 255, 255));

        text_matkul5.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        text_matkul5.setText("Matakuliah");
        text_matkul5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout menu3Layout = new javax.swing.GroupLayout(menu3);
        menu3.setLayout(menu3Layout);
        menu3Layout.setHorizontalGroup(
            menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_matkul5)
                .addContainerGap(1247, Short.MAX_VALUE))
        );
        menu3Layout.setVerticalGroup(
            menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_matkul5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        laman_jadwal.add(menu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1365, 60));

        konten_mahasiswa2.setBackground(new java.awt.Color(250, 250, 250));
        konten_mahasiswa2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fresh_open3.setBackground(new java.awt.Color(255, 255, 255));
        fresh_open3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        text_matkul6.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        text_matkul6.setText("Jadwal Mata Kuliah");
        text_matkul6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        text_matkul6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tablejadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Hari", "Kode Matkul", "Kelas", "Mata Kuliah", "SKS", "Waktu"
            }
        ));
        tablejadwal.setRowHeight(50);
        jScrollPane4.setViewportView(tablejadwal);

        javax.swing.GroupLayout fresh_open3Layout = new javax.swing.GroupLayout(fresh_open3);
        fresh_open3.setLayout(fresh_open3Layout);
        fresh_open3Layout.setHorizontalGroup(
            fresh_open3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fresh_open3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(text_matkul6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fresh_open3Layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
        );
        fresh_open3Layout.setVerticalGroup(
            fresh_open3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fresh_open3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(text_matkul6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        konten_mahasiswa2.add(fresh_open3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1340, 590));

        laman_jadwal.add(konten_mahasiswa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1365, 610));

        Laman.add(laman_jadwal, "card3");

        laman_mahasiswa1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bariskedua4.setBackground(new java.awt.Color(255, 255, 255));
        bariskedua4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel49.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        jLabel49.setText("Tools Dosen Institut Teknologi Sumatera");
        jLabel49.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/logoitera.png"))); // NOI18N

        javax.swing.GroupLayout bariskedua4Layout = new javax.swing.GroupLayout(bariskedua4);
        bariskedua4.setLayout(bariskedua4Layout);
        bariskedua4Layout.setHorizontalGroup(
            bariskedua4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bariskedua4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48)
                .addContainerGap(821, Short.MAX_VALUE))
        );
        bariskedua4Layout.setVerticalGroup(
            bariskedua4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bariskedua4Layout.createSequentialGroup()
                .addGroup(bariskedua4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48)
                    .addGroup(bariskedua4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel50))
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        laman_mahasiswa1.add(bariskedua4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 1, 1290, 55));

        menu2.setBackground(new java.awt.Color(255, 255, 255));

        text_matkul3.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        text_matkul3.setText("Mahasiswa ITERA");
        text_matkul3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button_input2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button input.jpg"))); // NOI18N
        button_input2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_input2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_input2MouseClicked(evt);
            }
        });

        button_input3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/Rectangle 2.PNG"))); // NOI18N
        button_input3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_input3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_input3MouseClicked(evt);
            }
        });

        searchkan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N

        search.setBorder(null);

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/cari.PNG"))); // NOI18N
        jLabel64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel64MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menu2Layout = new javax.swing.GroupLayout(menu2);
        menu2.setLayout(menu2Layout);
        menu2Layout.setHorizontalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_matkul3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 388, Short.MAX_VALUE)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel64)
                .addGap(64, 64, 64)
                .addComponent(button_input2)
                .addGap(31, 31, 31)
                .addComponent(button_input3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
            .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu2Layout.createSequentialGroup()
                    .addContainerGap(597, Short.MAX_VALUE)
                    .addComponent(searchkan)
                    .addContainerGap(598, Short.MAX_VALUE)))
        );
        menu2Layout.setVerticalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_matkul3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menu2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(button_input3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_input2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu2Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(searchkan)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        laman_mahasiswa1.add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1365, 70));

        konten_mahasiswa1.setBackground(new java.awt.Color(250, 250, 250));
        konten_mahasiswa1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardlayout_kiri2.setBackground(new java.awt.Color(255, 255, 255));
        cardlayout_kiri2.setLayout(new java.awt.CardLayout());

        fresh_open2.setBackground(new java.awt.Color(255, 255, 255));
        fresh_open2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        text_matkul4.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        text_matkul4.setText("Daftar Mahasiswa ");
        text_matkul4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        text_matkul4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tablemhs1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Kode Kelas", "Mata Kuliah", "SKS", "Tugas Besar"
            }
        ));
        tablemhs1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablemhs1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablemhs1);

        javax.swing.GroupLayout fresh_open2Layout = new javax.swing.GroupLayout(fresh_open2);
        fresh_open2.setLayout(fresh_open2Layout);
        fresh_open2Layout.setHorizontalGroup(
            fresh_open2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fresh_open2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(fresh_open2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_matkul4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        fresh_open2Layout.setVerticalGroup(
            fresh_open2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fresh_open2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(text_matkul4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
        );

        cardlayout_kiri2.add(fresh_open2, "card2");

        konten_mahasiswa1.add(cardlayout_kiri2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 980, 590));

        cardlayout_kanan3.setBackground(new java.awt.Color(255, 255, 255));
        cardlayout_kanan3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardlayout_kanan3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card_atas3.setLayout(new java.awt.CardLayout());

        blank3.setBackground(new java.awt.Color(255, 255, 255));
        blank3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        card_atas3.add(blank3, "card3");

        laman_input3.setBackground(new java.awt.Color(255, 255, 255));
        laman_input3.setPreferredSize(new java.awt.Dimension(360, 300));
        laman_input3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input_namamhs1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_namamhs1.setBorder(null);
        input_namamhs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_namamhs1ActionPerformed(evt);
            }
        });
        laman_input3.add(input_namamhs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 93, 150, -1));

        input_nim2.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_nim2.setBorder(null);
        laman_input3.add(input_nim2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 143, 150, -1));

        kode_mk3.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        kode_mk3.setText("Nama       :");
        laman_input3.add(kode_mk3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        field_kdmk3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input3.add(field_kdmk3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        kd_kelas3.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        kd_kelas3.setText("NIM          :");
        laman_input3.add(kd_kelas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        field_kdkelas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input3.add(field_kdkelas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        btsave_mhs2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button save.png"))); // NOI18N
        btsave_mhs2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btsave_mhs2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btsave_mhs2MouseClicked(evt);
            }
        });
        laman_input3.add(btsave_mhs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));
        laman_input3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 360, 10));

        jLabel30.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel30.setText("INPUT DATA BARU");
        laman_input3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        card_atas3.add(laman_input3, "card2");

        laman_updatemhs2.setBackground(new java.awt.Color(255, 255, 255));
        laman_updatemhs2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input_namamhs2.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_namamhs2.setBorder(null);
        laman_updatemhs2.add(input_namamhs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 93, 150, -1));

        input_nim3.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_nim3.setBorder(null);
        laman_updatemhs2.add(input_nim3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 143, 150, -1));

        field_kdmk4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_updatemhs2.add(field_kdmk4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        kode_mk4.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        kode_mk4.setText("Nama       :");
        laman_updatemhs2.add(kode_mk4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        kd_kelas4.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        kd_kelas4.setText("NIM          :");
        laman_updatemhs2.add(kd_kelas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        field_kdkelas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_updatemhs2.add(field_kdkelas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        UPDATE_mhs3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/Rectangle 1.png"))); // NOI18N
        UPDATE_mhs3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UPDATE_mhs3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UPDATE_mhs3MouseClicked(evt);
            }
        });
        laman_updatemhs2.add(UPDATE_mhs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));
        laman_updatemhs2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 360, 10));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("UPDATE DATA");
        laman_updatemhs2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        DELETE_mhs4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/DELETE.PNG"))); // NOI18N
        DELETE_mhs4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DELETE_mhs4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DELETE_mhs4MouseClicked(evt);
            }
        });
        laman_updatemhs2.add(DELETE_mhs4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, 40));

        card_atas3.add(laman_updatemhs2, "card2");

        cardlayout_kanan3.add(card_atas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 360, 510));

        konten_mahasiswa1.add(cardlayout_kanan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 365, 590));

        laman_mahasiswa1.add(konten_mahasiswa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1365, 610));

        Laman.add(laman_mahasiswa1, "card3");

        laman_nilai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bariskedua5.setBackground(new java.awt.Color(255, 255, 255));
        bariskedua5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel67.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        jLabel67.setText("Tools Dosen Institut Teknologi Sumatera");
        jLabel67.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/logoitera.png"))); // NOI18N

        javax.swing.GroupLayout bariskedua5Layout = new javax.swing.GroupLayout(bariskedua5);
        bariskedua5.setLayout(bariskedua5Layout);
        bariskedua5Layout.setHorizontalGroup(
            bariskedua5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bariskedua5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel66)
                .addContainerGap(821, Short.MAX_VALUE))
        );
        bariskedua5Layout.setVerticalGroup(
            bariskedua5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bariskedua5Layout.createSequentialGroup()
                .addGroup(bariskedua5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66)
                    .addGroup(bariskedua5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel68))
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        laman_nilai.add(bariskedua5, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 1, 1290, 55));

        menu4.setBackground(new java.awt.Color(255, 255, 255));

        text_matkul7.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        text_matkul7.setText("Mata Kuliah : ");
        text_matkul7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pilihmatkul1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pilihmatkul1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihmatkul1ActionPerformed(evt);
            }
        });

        iconcari1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/search_find_lupa_21889.png"))); // NOI18N
        iconcari1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconcari1MouseClicked(evt);
            }
        });

        searchkan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N

        carimhs_nilai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/cari.PNG"))); // NOI18N
        carimhs_nilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carimhs_nilaiMouseClicked(evt);
            }
        });

        searchmhsnilai.setBorder(null);

        COBA1.setText("Nama Mata Kuliah");

        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_print/print.png"))); // NOI18N
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menu4Layout = new javax.swing.GroupLayout(menu4);
        menu4.setLayout(menu4Layout);
        menu4Layout.setHorizontalGroup(
            menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_matkul7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pilihmatkul1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iconcari1)
                .addGap(18, 18, 18)
                .addComponent(COBA1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchmhsnilai, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(carimhs_nilai)
                .addGap(56, 56, 56)
                .addComponent(print)
                .addContainerGap(366, Short.MAX_VALUE))
            .addGroup(menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu4Layout.createSequentialGroup()
                    .addContainerGap(655, Short.MAX_VALUE)
                    .addComponent(searchkan2)
                    .addContainerGap(540, Short.MAX_VALUE)))
        );
        menu4Layout.setVerticalGroup(
            menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu4Layout.createSequentialGroup()
                .addGroup(menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pilihmatkul1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_matkul7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(iconcari1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carimhs_nilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menu4Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(print))))
                    .addGroup(menu4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchmhsnilai, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(COBA1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu4Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(searchkan2)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        laman_nilai.add(menu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1365, 70));

        konten_nilai.setBackground(new java.awt.Color(250, 250, 250));
        konten_nilai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardlayout_kiri4.setBackground(new java.awt.Color(255, 255, 255));
        cardlayout_kiri4.setLayout(new java.awt.CardLayout());

        fresh_open4.setBackground(new java.awt.Color(255, 255, 255));
        fresh_open4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        text_matkul8.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        text_matkul8.setText("Daftar Mahasiswa ");
        text_matkul8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        text_matkul8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tablenilai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Kode Kelas", "Mata Kuliah", "SKS", "Tugas Besar"
            }
        ));
        tablenilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablenilaiMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablenilai);
        if (tablenilai.getColumnModel().getColumnCount() > 0) {
            tablenilai.getColumnModel().getColumn(0).setResizable(false);
            tablenilai.getColumnModel().getColumn(1).setResizable(false);
            tablenilai.getColumnModel().getColumn(2).setResizable(false);
            tablenilai.getColumnModel().getColumn(3).setResizable(false);
            tablenilai.getColumnModel().getColumn(4).setResizable(false);
            tablenilai.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel72.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel72.setText("Sort By :");

        sorting.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIM", "NAMA", "GRADE", "Nilai Akhir" }));
        sorting.setBorder(null);
        sorting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sorting.setOpaque(false);
        sorting.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sortingItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout fresh_open4Layout = new javax.swing.GroupLayout(fresh_open4);
        fresh_open4.setLayout(fresh_open4Layout);
        fresh_open4Layout.setHorizontalGroup(
            fresh_open4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fresh_open4Layout.createSequentialGroup()
                .addGroup(fresh_open4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fresh_open4Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(text_matkul8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel72)
                        .addGap(18, 18, 18)
                        .addComponent(sorting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fresh_open4Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        fresh_open4Layout.setVerticalGroup(
            fresh_open4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fresh_open4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(fresh_open4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_matkul8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fresh_open4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel72)
                        .addComponent(sorting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
        );

        cardlayout_kiri4.add(fresh_open4, "card2");

        konten_nilai.add(cardlayout_kiri4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1340, 590));

        laman_nilai.add(konten_nilai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1365, 610));

        konten_pdf.setBackground(new java.awt.Color(250, 250, 250));
        konten_pdf.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardlayout_kiri6.setBackground(new java.awt.Color(255, 255, 255));
        cardlayout_kiri6.setLayout(new java.awt.CardLayout());

        fresh_open6.setBackground(new java.awt.Color(255, 255, 255));
        fresh_open6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        text_matkul11.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        text_matkul11.setText("Daftar Mahasiswa ");
        text_matkul11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        text_matkul11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tablepdf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Kode Kelas", "Mata Kuliah", "SKS", "Tugas Besar"
            }
        ));
        tablepdf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablepdfMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tablepdf);
        if (tablepdf.getColumnModel().getColumnCount() > 0) {
            tablepdf.getColumnModel().getColumn(0).setResizable(false);
            tablepdf.getColumnModel().getColumn(1).setResizable(false);
            tablepdf.getColumnModel().getColumn(2).setResizable(false);
            tablepdf.getColumnModel().getColumn(3).setResizable(false);
            tablepdf.getColumnModel().getColumn(4).setResizable(false);
            tablepdf.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout fresh_open6Layout = new javax.swing.GroupLayout(fresh_open6);
        fresh_open6.setLayout(fresh_open6Layout);
        fresh_open6Layout.setHorizontalGroup(
            fresh_open6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fresh_open6Layout.createSequentialGroup()
                .addGroup(fresh_open6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fresh_open6Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(text_matkul11))
                    .addGroup(fresh_open6Layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(488, Short.MAX_VALUE))
        );
        fresh_open6Layout.setVerticalGroup(
            fresh_open6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fresh_open6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(text_matkul11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
        );

        cardlayout_kiri6.add(fresh_open6, "card2");

        konten_pdf.add(cardlayout_kiri6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1340, 590));

        laman_nilai.add(konten_pdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1365, 610));

        Laman.add(laman_nilai, "card3");

        laman_grafik.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bariskedua6.setBackground(new java.awt.Color(255, 255, 255));
        bariskedua6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel70.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        jLabel70.setText("Tools Dosen Institut Teknologi Sumatera");
        jLabel70.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/logoitera.png"))); // NOI18N

        javax.swing.GroupLayout bariskedua6Layout = new javax.swing.GroupLayout(bariskedua6);
        bariskedua6.setLayout(bariskedua6Layout);
        bariskedua6Layout.setHorizontalGroup(
            bariskedua6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bariskedua6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69)
                .addContainerGap(821, Short.MAX_VALUE))
        );
        bariskedua6Layout.setVerticalGroup(
            bariskedua6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bariskedua6Layout.createSequentialGroup()
                .addGroup(bariskedua6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel69)
                    .addGroup(bariskedua6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel71))
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        laman_grafik.add(bariskedua6, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 1, 1290, 55));

        menu5.setBackground(new java.awt.Color(255, 255, 255));

        text_matkul9.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        text_matkul9.setText("Mata Kuliah : ");
        text_matkul9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pilihmatkul2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pilihmatkul2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihmatkul2ActionPerformed(evt);
            }
        });

        iconcari2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/search_find_lupa_21889.png"))); // NOI18N
        iconcari2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconcari2MouseClicked(evt);
            }
        });

        searchfix2.setBorder(null);

        javax.swing.GroupLayout menu5Layout = new javax.swing.GroupLayout(menu5);
        menu5.setLayout(menu5Layout);
        menu5Layout.setHorizontalGroup(
            menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_matkul9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pilihmatkul2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iconcari2)
                .addGap(216, 216, 216)
                .addComponent(searchfix2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(603, Short.MAX_VALUE))
        );
        menu5Layout.setVerticalGroup(
            menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu5Layout.createSequentialGroup()
                .addGroup(menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pilihmatkul2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_matkul9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(iconcari2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(menu5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(searchfix2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        laman_grafik.add(menu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1365, 70));

        konten_mahasiswa4.setBackground(new java.awt.Color(250, 250, 250));
        konten_mahasiswa4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardlayout_kiri5.setBackground(new java.awt.Color(255, 255, 255));
        cardlayout_kiri5.setLayout(new java.awt.CardLayout());

        fresh_open5.setBackground(new java.awt.Color(255, 255, 255));
        fresh_open5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        text_matkul10.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        text_matkul10.setText("Grafik Nilai");
        text_matkul10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        text_matkul10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelgrafikLayout = new javax.swing.GroupLayout(panelgrafik);
        panelgrafik.setLayout(panelgrafikLayout);
        panelgrafikLayout.setHorizontalGroup(
            panelgrafikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 805, Short.MAX_VALUE)
        );
        panelgrafikLayout.setVerticalGroup(
            panelgrafikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fresh_open5Layout = new javax.swing.GroupLayout(fresh_open5);
        fresh_open5.setLayout(fresh_open5Layout);
        fresh_open5Layout.setHorizontalGroup(
            fresh_open5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fresh_open5Layout.createSequentialGroup()
                .addGroup(fresh_open5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fresh_open5Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(text_matkul10))
                    .addGroup(fresh_open5Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(panelgrafik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        fresh_open5Layout.setVerticalGroup(
            fresh_open5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fresh_open5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(text_matkul10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(panelgrafik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        cardlayout_kiri5.add(fresh_open5, "card2");

        konten_mahasiswa4.add(cardlayout_kiri5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1340, 590));

        laman_grafik.add(konten_mahasiswa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1365, 610));

        Laman.add(laman_grafik, "card3");

        getContentPane().add(Laman, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 31, 1365, 740));

        setSize(new java.awt.Dimension(1366, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void kepalapanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kepalapanelMouseDragged
        int kordinatX = evt.getXOnScreen();
        int kordinatY = evt.getYOnScreen();
        this.setLocation(kordinatX-mouseX, kordinatY-mouseY);
    }//GEN-LAST:event_kepalapanelMouseDragged

    private void kepalapanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kepalapanelMousePressed
        mouseX= evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_kepalapanelMousePressed

    private void button_inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_inputMouseClicked
        blank.setVisible(false);
        
        tablematkul.getMousePosition(false);
        tablematkul.getSelectionModel().isSelectionEmpty();
        tablematkul.disable();
        show_komponen.setVisible(false);
        laman_input.setVisible(true);
        laman_edit.setVisible(false);
        laman_delete.setVisible(false);
        btcancel_matkul.setVisible(true);
        btsave_matkul.setVisible(true);
        
    }//GEN-LAST:event_button_inputMouseClicked
    
    public void saveData(){
        loaddata();
        try{
            
            Statement stat = (Statement) koneksi.getKoneksi().createStatement();
            if(input_kodemk.getText().trim().isEmpty() || input_koderuang.getText().trim().isEmpty() || 
                    input_namamk.getText().trim().isEmpty() || input_hari.getSelectedItem().equals("Pilih Hari :")  ){
                JOptionPane.showMessageDialog(null,"Lengkapi data dengan benar!", "Data Belum Tersimpan",2);
            }else{
                String Matkul = "Insert into matakuliah (kode_mk,kode_kls,ruang,nama_mk,sks,hari,waktu)"
                            +"values ('"+Kode_mk+"','"+Kode_kelas+"','"+Kode_ruang+"','"+Nama_mk+"','"+Sks+"',"
                            +"'"+Hari+"','"+Waktu+"')";
                String Mk_komp = "Insert into komponen (kode_mk,uts,uas,kuis,tugas,tubes,praktikum,tambahan)"
                            +"values ('"+Kode_mk+"','"+Uts+"','"+Uas+"','"+quiz+"',"
                            +"'"+tugas+"','"+tubes+"','"+prak+"','"+tambahan+"')";
                String index = "Insert into index_nilai "
                            +"values ('"+Kode_mk+"','"+indexA+"','"+indexAB+"','"+indexB+"','"+indexBC+"','"+indexC+"',"
                            +"'"+indexD+"','"+indexE+"')";
                PreparedStatement p = (PreparedStatement) koneksi.getKoneksi().prepareStatement(Matkul);
                p.executeUpdate();
                PreparedStatement p1 = (PreparedStatement) koneksi.getKoneksi().prepareStatement(Mk_komp);
                p1.executeUpdate();
                PreparedStatement INDEX = (PreparedStatement) koneksi.getKoneksi().prepareStatement(index);
                INDEX.executeUpdate();

                JOptionPane.showMessageDialog(null,"Berhasil!");
                lbl_err1.setVisible(false);
                lbl_err2.setVisible(false);
                lbl_err3.setVisible(false);
                lbl_err4.setVisible(false);
                lbl_err5.setVisible(false);
                clear();
            }
        }catch(SQLException x){
            JOptionPane.showMessageDialog(null,"Lengkapi data dengan benar", "Data Belum Tersimpan",2);
        }catch(IllegalArgumentException a){
            JOptionPane.showMessageDialog(null,"Format data tidak sesuai!", "Kesalahan Input",2);
        }
    }
    private void navbarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navbarMouseClicked
        
        animasi_slide.jTextAreaXRight(-230, 0, 30, 10, nav);
        animasi_slide.jTextAreaXLeft(0, -230, 20, 10, nav);
       
    }//GEN-LAST:event_navbarMouseClicked

    private void menu_mkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_mkMouseClicked
        nav.setVisible(true);
        animasi_slide.jTextAreaXLeft(0, -230, 20, 10, nav);
        laman_matkul.setVisible(true);
        laman_jadwal.setVisible(false);
        laman_nilai.setVisible(false);
        HalamanAwal.setVisible(false);
        laman_mahasiswa.setVisible(false);
        laman_mahasiswa1.setVisible(false);
        fresh_open.setVisible(false);
        tabel.setVisible(true);
        show_komponen.setVisible(false);
        laman_grafik.setVisible(false);
        TableMatkul a = new TableMatkul(tablematkul);
        lebarKolomMatkul();
        a.getData();
    }//GEN-LAST:event_menu_mkMouseClicked
    private void menu_mhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_mhsMouseClicked
        nav.setVisible(true);
        animasi_slide.jTextAreaXLeft(0, -230, 20, 10, nav);
        laman_mahasiswa.setVisible(true);
        HalamanAwal.setVisible(false);
        laman_jadwal.setVisible(false);
        laman_nilai.setVisible(false);
        laman_matkul.setVisible(false);
        laman_grafik.setVisible(false);
        laman_mahasiswa1.setVisible(false);
        Connection conn;
        Statement stat;
        String cari;
        int eror = 0;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            conn = DriverManager.getConnection("jdbc:mysql://localhost/anima", "root", "");
            stat = conn.createStatement();
            String sql="select kode_mk from matakuliah ";
            ResultSet R = stat.executeQuery(sql); 
            R.next();
            cari = R.getString(1);
            if(!cari.isEmpty()){
                eror=1;
            }
            
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException ex){
            //JOptionPane.showMessageDialog(null, "Terdapat Kesalahan");
        }
        
        if(eror==1){
            pilihmatkul1.removeAllItems();
            pilihmatkul2.removeAllItems();
            pilihmatkul.removeAllItems();
            setModel();
            if(model1.getSize()==0){            
            }else if(model1.getSize()>0){            
                pilihmatkul.setModel(model1);
                
            }
        }
        setText();
        TableMhs a = new TableMhs(tablemhs);
        lebarKolomMhs();
        a.getDataMhs(pilihmatkul.getSelectedItem().toString(), sorting1.getSelectedItem().toString());
    }//GEN-LAST:event_menu_mhsMouseClicked

    private void button_input1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_input1MouseClicked
        blank1.setVisible(false);
        laman_input1.setVisible(true);
        laman_updatemhs.setVisible(false);
    }//GEN-LAST:event_button_input1MouseClicked
    public final void setModel(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/anima"; 
            String user="root";
            String pass="";
            Connection koneksi = DriverManager.getConnection(url,user,pass);

            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery("select kode_mk from matakuliah");
            while(rs.next()){
                model1.addElement(rs.getString(1));
            }
            
        } catch (Exception e) {
            System.out.println("gagal");
        }
    }
    public final void setText(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/anima"; //disesuaikan
            String user="root";//disesuaikan
            String pass="";//disesuaikan
            Connection koneksi = DriverManager.getConnection(url,user,pass);
            Statement st0 = koneksi.createStatement();
            ResultSet rs0 = st0.executeQuery("select kode_mk,nama_mk from matakuliah WHERE kode_mk='"+pilihmatkul.getSelectedItem().toString()+"';");
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery("select kode_mk,nama_mk from matakuliah WHERE kode_mk='"+pilihmatkul1.getSelectedItem().toString()+"';");
            while(rs.next()){
                String A = rs.getString("nama_mk");                
                COBA1.setText(A);
            }
            while(rs0.next()){
                String A = rs0.getString("nama_mk");                
                COBA.setText(A);
            }
        } catch (Exception e) {
            System.out.println("gagal");
        }
    }
    
    private void input_mhs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_mhs2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_mhs2ActionPerformed
    
    private void btsave_mhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsave_mhsMouseClicked
        Connection conn;
        Statement stat;
        String cari;
        TableNilai aa = new TableNilai(tablenilai);
        aa.getKlik();
        aa.getKlik2();
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            conn = DriverManager.getConnection("jdbc:mysql://localhost/anima", "root", "");
            stat = conn.createStatement();
            String sql="select * from nilai where "+ "nim='" +input_nim1.getText() +"' && kode_mk= '"+ pilihmatkul.getSelectedItem().toString()+"'";            
            ResultSet R = stat.executeQuery(sql);             

            if(input_nim1.getText().trim().isEmpty() && input_namamhs.getText().trim().isEmpty()){             
                JOptionPane.showMessageDialog(null, "Inputan NIM dan Nama kosong!", "Data Tidak Tersimpan",2);
            }else if(input_nim1.getText().trim().isEmpty()){             
                JOptionPane.showMessageDialog(null, "Inputan NIM kosong!", "Data Tidak Tersimpan",2);
            }else if(input_namamhs.getText().trim().isEmpty()){              
                JOptionPane.showMessageDialog(null, "Inputan Nama kosong!", "Data Tidak Tersimpan",2);
            }
            if(!input_nim1.getText().trim().isEmpty() && R.next()){
                cari = R.getString(1);                
                JOptionPane.showMessageDialog(null, "NIM : "+cari+"\nSudah terdapat didalam data. Harap input Data baru.","Duplikat",JOptionPane.WARNING_MESSAGE);
            }
            
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException ex){            
        }
       
        DaftarNilai ps = new DaftarNilai(input_nim1.getText(),
            new Nilai(   
                pilihmatkul.getSelectedItem().toString()
            )
        );
        String nama = input_namamhs.getText();
        String NIM = input_nim1.getText();
        if(ps.validasiData() && !nama.matches(".*[1-9].*") && !NIM.matches(".*[A-Za-z].*")){
            if(NIM.length()>=8&&NIM.length()<=10){
                if(ps.getDaftar1()!=-1 && ps.getDaftar2()!=-1){
                    JOptionPane.showMessageDialog(null, "Berhasil ditambahkan");
                }
            }else{
                JOptionPane.showMessageDialog(null, "NIM yang dapat diterima sepanjang 8-10 Karakter");
            }
        }else if(nama.matches(".*[1-9].*")){
            JOptionPane.showMessageDialog(null, "Nama tidak boleh mengandung angka");
        }else if(NIM.matches(".*[A-Za-z].*")){
            JOptionPane.showMessageDialog(null, "NIM tidak boleh mengandung huruf");
        }
        TableMhs a = new TableMhs(tablemhs);
        lebarKolomMhs();
        a.getDataMhs(pilihmatkul.getSelectedItem().toString(), sorting1.getSelectedItem().toString());
        input_namamhs.setText("");
        input_nim1.setText("");
    }//GEN-LAST:event_btsave_mhsMouseClicked

    private void btsave_nilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsave_nilaiMouseClicked
        
        Connection conn;
        Statement stat;
        String cari;
        int eror = 0;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            conn = DriverManager.getConnection("jdbc:mysql://localhost/anima", "root", "");
            stat = conn.createStatement();
            String sql="select * from nilai where "+ "nim='" +input_mhs2.getText() +"' && kode_mk= '"+ pilihmatkul.getSelectedItem().toString()+"'";
            ResultSet R = stat.executeQuery(sql); 
            R.next();
            cari = R.getString(1);
            if(!cari.isEmpty()){
                eror=1;
            }
            
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException ex){
            //JOptionPane.showMessageDialog(null, "Terdapat Kesalahan");
        }
        String ambil = input_nilaimhs.getText();
        
        if(komponenmhs.isEnabled()&& !input_mhs2.getText().isEmpty() && !input_nilaimhs.getText().isEmpty()&&eror==1 ){
            Float nilai = Float.parseFloat(ambil);
            if( nilai>=0 && nilai<=100){
                TableMhs a = new TableMhs(tablemhs);
                a.getUpdateNilai(input_mhs2.getText(),komponenmhs.getSelectedItem().toString(),input_nilaimhs.getText(),pilihmatkul.getSelectedItem().toString() );
                lebarKolomMhs();

                a.getDataMhs(pilihmatkul.getSelectedItem().toString(), sorting1.getSelectedItem().toString());
                input_mhs2.setText("");
                input_nilaimhs.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "Nilai yang anda masukkan tidak sesuai!" );
            }       
        }else  {
            JOptionPane.showMessageDialog(null, "Update Data salah, periksa NIM dan Nilai yang dimasukkan" );
        }
        
        
    }//GEN-LAST:event_btsave_nilaiMouseClicked

    private void komponenmhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_komponenmhsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_komponenmhsActionPerformed

    private void input_nilaimhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nilaimhsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_nilaimhsActionPerformed
    public void lebarKolom(){ 
        TableColumn column;
        tablejadwal.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
      
        column = tablejadwal.getColumnModel().getColumn(0);
        column.setPreferredWidth(110);
        column = tablejadwal.getColumnModel().getColumn(1); 
        column.setPreferredWidth(110); 
        column = tablejadwal.getColumnModel().getColumn(2); 
        column.setPreferredWidth(235); 
        column = tablejadwal.getColumnModel().getColumn(3); 
        column.setPreferredWidth(100); 
        column = tablejadwal.getColumnModel().getColumn(4); 
        column.setPreferredWidth(80); 
        column = tablejadwal.getColumnModel().getColumn(5); 
        column.setPreferredWidth(81); 
        column = tablejadwal.getColumnModel().getColumn(6); 
        column.setPreferredWidth(151); 
    }
    public void lebarKolomMhs(){ 
        TableColumn column;
        tablemhs.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
      
        column = tablemhs.getColumnModel().getColumn(0);
        column.setPreferredWidth(115);
        column = tablemhs.getColumnModel().getColumn(1); 
        column.setPreferredWidth(257); 
        column = tablemhs.getColumnModel().getColumn(2); 
        column.setPreferredWidth(70); 
        column = tablemhs.getColumnModel().getColumn(3); 
        column.setPreferredWidth(70); 
        column = tablemhs.getColumnModel().getColumn(4); 
        column.setPreferredWidth(70); 
        column = tablemhs.getColumnModel().getColumn(5); 
        column.setPreferredWidth(70); 
        column = tablemhs.getColumnModel().getColumn(6); 
        column.setPreferredWidth(70); 
        column = tablemhs.getColumnModel().getColumn(7); 
        column.setPreferredWidth(70); 
        column = tablemhs.getColumnModel().getColumn(8); 
        column.setPreferredWidth(70); 
    }
    public void lebarKolomNilai(){ 
        TableColumn column;
        tablenilai.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
      
        column = tablenilai.getColumnModel().getColumn(0);
        column.setPreferredWidth(110);
        column = tablenilai.getColumnModel().getColumn(1); 
        column.setPreferredWidth(200);        
        column = tablenilai.getColumnModel().getColumn(2); 
        column.setPreferredWidth(55); 
        column = tablenilai.getColumnModel().getColumn(3); 
        column.setPreferredWidth(55); 
        column = tablenilai.getColumnModel().getColumn(4); 
        column.setPreferredWidth(70);
        column = tablenilai.getColumnModel().getColumn(5); 
        column.setPreferredWidth(60); 
        column = tablenilai.getColumnModel().getColumn(6); 
        column.setPreferredWidth(55); 
        column = tablenilai.getColumnModel().getColumn(7); 
        column.setPreferredWidth(55); 
        column = tablenilai.getColumnModel().getColumn(8);
        column.setPreferredWidth(70);
        column = tablenilai.getColumnModel().getColumn(9);
        column.setPreferredWidth(70);
        column = tablenilai.getColumnModel().getColumn(10);
        column.setPreferredWidth(61);
    }
    public void lebarKolomPDF(){ 
        TableColumn column;
        tablepdf.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
      
        column = tablepdf.getColumnModel().getColumn(0);
        column.setPreferredWidth(80);       
        column = tablepdf.getColumnModel().getColumn(1); 
        column.setPreferredWidth(45); 
        column = tablepdf.getColumnModel().getColumn(2); 
        column.setPreferredWidth(39); 
        column = tablepdf.getColumnModel().getColumn(3); 
        column.setPreferredWidth(38);
        column = tablepdf.getColumnModel().getColumn(4); 
        column.setPreferredWidth(46); 
        column = tablepdf.getColumnModel().getColumn(5); 
        column.setPreferredWidth(39); 
        column = tablepdf.getColumnModel().getColumn(6); 
        column.setPreferredWidth(39); 
        column = tablepdf.getColumnModel().getColumn(7);
        column.setPreferredWidth(37);
        column = tablepdf.getColumnModel().getColumn(8);
        column.setPreferredWidth(43);
        column = tablepdf.getColumnModel().getColumn(9);
        column.setPreferredWidth(44);
    }
    public void lebarKolomMatkul(){ 
        TableColumn column;
        tablematkul.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
      
        column = tablematkul.getColumnModel().getColumn(0);
        column.setPreferredWidth(150);
        column = tablematkul.getColumnModel().getColumn(1); 
        column.setPreferredWidth(100); 
        column = tablematkul.getColumnModel().getColumn(2); 
        column.setPreferredWidth(250); 
        column = tablematkul.getColumnModel().getColumn(3); 
        column.setPreferredWidth(100); 
        column = tablematkul.getColumnModel().getColumn(4); 
        column.setPreferredWidth(121); 
        column = tablematkul.getColumnModel().getColumn(5); 
        column.setPreferredWidth(151); 
    }
    private void menu_lihatnilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_lihatnilaiMouseClicked
        nav.setVisible(true);
        animasi_slide.jTextAreaXLeft(0, -230, 20, 10, nav);
        laman_matkul.setVisible(false);
        laman_jadwal.setVisible(false);
        laman_nilai.setVisible(true);
        HalamanAwal.setVisible(false);
        laman_mahasiswa.setVisible(false);
        laman_mahasiswa1.setVisible(false);
        laman_grafik.setVisible(false);
        konten_nilai.setVisible(true);
        konten_pdf.setVisible(false);
        Connection conn;
        Statement stat;
        String cari;
        int eror = 0;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            conn = DriverManager.getConnection("jdbc:mysql://localhost/anima", "root", "");
            stat = conn.createStatement();
            String sql="select kode_mk from matakuliah ";
            ResultSet R = stat.executeQuery(sql); 
            R.next();
            cari = R.getString(1);
            if(!cari.isEmpty()){
                eror=1;
            }
            
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException ex){
            //JOptionPane.showMessageDialog(null, "Terdapat Kesalahan");
        }
        
        if(eror==1){
            pilihmatkul1.removeAllItems();
            pilihmatkul2.removeAllItems();
            pilihmatkul.removeAllItems();
            setModel();
            if(model1.getSize()==0){            
            }else if(model1.getSize()>0){            
                pilihmatkul1.setModel(model1);
                
            }
        }
        TableNilai a = new TableNilai(tablenilai);
        lebarKolomNilai();
        setText();
        a.getKlik();
        a.getKlik2();
        a.getData(pilihmatkul1.getSelectedItem().toString(), sorting1.getSelectedItem().toString());
    }//GEN-LAST:event_menu_lihatnilaiMouseClicked

    private void iconcariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconcariMouseClicked

        setText();
        TableMhs a = new TableMhs(tablemhs);
        lebarKolomMhs();
        a.getDataMhs(pilihmatkul.getSelectedItem().toString(), sorting1.getSelectedItem().toString());
        
    }//GEN-LAST:event_iconcariMouseClicked

    private void button_input2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_input2MouseClicked
        blank3.setVisible(false);
        laman_input3.setVisible(true);
        laman_updatemhs2.setVisible(false);
    }//GEN-LAST:event_button_input2MouseClicked

    private void btsave_mhs2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsave_mhs2MouseClicked
        DaftarMahasiswa ps = new DaftarMahasiswa(input_nim2.getText(),
            new Mahasiswa(   
                input_namamhs1.getText()
            )
        );
        String cari;
        int eror = 0;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/anima", "root", "");
            Statement stat = conn.createStatement();
            String sql="select * from mahasiswa where "+ "nim='" +input_nim2.getText()+"'" ;
            ResultSet R = stat.executeQuery(sql); 
            
            if(!input_nim2.getText().trim().isEmpty() && R.next()){
                cari = R.getString(1);       
                eror = 1;
                
            }
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException ex){            
        }
        String nama = input_namamhs1.getText();
        String NIM = input_nim2.getText();
        if(ps.validasiData()&& !nama.matches(".*[1-9].*") && !NIM.matches(".*[A-Za-z].*")){
            if(eror!=1){
                if(NIM.length()>=8 && NIM.length()<=10){
                    if(ps.getDaftar()!=-1){
                        JOptionPane.showMessageDialog(null, "Berhasil ditambahkan");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "NIM yang dapat diterima sepanjang 8 - 10 karakter");
                }
            }else{
                JOptionPane.showMessageDialog(null, "NIM sudah terdapat didalam data. Harap input Data baru.","Duplikat",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            ps.Pesan("Data Tidak Valid!");
        }
        Tablemhssemua a = new Tablemhssemua(tablemhs1);
        a.getData();
        input_namamhs1.setText("");
        input_nim2.setText("");
    }//GEN-LAST:event_btsave_mhs2MouseClicked

    private void menu_mhs1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_mhs1MouseClicked
        nav.setVisible(true);
        animasi_slide.jTextAreaXLeft(0, -230, 20, 10, nav);
        laman_mahasiswa.setVisible(false);
        HalamanAwal.setVisible(false);
        laman_jadwal.setVisible(false);
        laman_matkul.setVisible(false);
        laman_nilai.setVisible(false);
        laman_mahasiswa1.setVisible(true);
        laman_grafik.setVisible(false);
        Tablemhssemua a = new Tablemhssemua(tablemhs1);
        //lebarKolomMhs();
        a.getData();
        
    }//GEN-LAST:event_menu_mhs1MouseClicked

    private void jadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jadwalMouseClicked
        nav.setVisible(true);
        animasi_slide.jTextAreaXLeft(0, -230, 20, 10, nav);
        laman_matkul.setVisible(false);
        laman_jadwal.setVisible(true);
        HalamanAwal.setVisible(false);
        laman_mahasiswa.setVisible(false);
        laman_mahasiswa1.setVisible(false);
        laman_grafik.setVisible(false);
        laman_nilai.setVisible(false);
        jadwalmatkul a = new jadwalmatkul(tablejadwal);
        lebarKolom();
        a.getData();
    }//GEN-LAST:event_jadwalMouseClicked

    private void button_input3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_input3MouseClicked
        blank3.setVisible(false);
        laman_updatemhs2.setVisible(true);
        laman_input3.setVisible(false);
    }//GEN-LAST:event_button_input3MouseClicked

    private void input_namamhs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_namamhs1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_namamhs1ActionPerformed

    private void DELETE_mhs4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETE_mhs4MouseClicked
        Connection conn;
        Statement stat;
        String cari;
        int eror=0;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            conn = DriverManager.getConnection("jdbc:mysql://localhost/anima", "root", "");
            stat = conn.createStatement();
            String sql="select * from mahasiswa where "+ "nim='" +input_nim3.getText();
            ResultSet R = stat.executeQuery(sql); 
            
            R.next();
            cari = R.getString(1);
            if(!cari.isEmpty()){
                eror=1;
            }

        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException ex){        
        }
        
        if(!input_nim3.getText().isEmpty() && eror==1){
            Tablemhssemua a = new Tablemhssemua(tablemhs1);
            a.getHapus(input_nim3.getText());
            a.getData();                       
        }else{
            JOptionPane.showMessageDialog(null, "Data yang ingin dihapus tidak ditemukan" );
        }
        input_namamhs2.setText("");
        input_nim3.setText("");
    }//GEN-LAST:event_DELETE_mhs4MouseClicked

    private void button_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_updateMouseClicked
        blank.setVisible(false);
        laman_input.setVisible(false);
        show_komponen.setVisible(false);        
        
        tablematkul.getMousePosition(false);
        tablematkul.getSelectionModel().isSelectionEmpty();
        tablematkul.disable();
        laman_delete.setVisible(false);
        show_komponen.setVisible(false);
        laman_input.setVisible(false);
        laman_edit.setVisible(true);
    }//GEN-LAST:event_button_updateMouseClicked

    private void jLabel64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel64MouseClicked
        Tablemhssemua a = new Tablemhssemua(tablemhs1);
        a.getCari(search.getText());
    }//GEN-LAST:event_jLabel64MouseClicked

    private void search2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search2MouseClicked
        TableMhs a = new TableMhs(tablemhs);
        lebarKolomMhs();
        a.getCari(searchfix.getText(),pilihmatkul.getSelectedItem().toString());
    }//GEN-LAST:event_search2MouseClicked

    private void tablemhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablemhsMouseClicked
        int baris2 = tablemhs.rowAtPoint(evt.getPoint());
        String nim = tablemhs.getValueAt(baris2, 0).toString();
        input_mhs2.setText(nim);
        input_nim4.setText(nim);
        
        int baris3 = tablemhs.rowAtPoint(evt.getPoint());
       
    }//GEN-LAST:event_tablemhsMouseClicked

    private void tablemhs1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablemhs1MouseClicked
        int baris2 = tablemhs1.rowAtPoint(evt.getPoint());
        String nama = tablemhs1.getValueAt(baris2, 1).toString();
        input_namamhs2.setText(nama);
        String nim = tablemhs1.getValueAt(baris2, 0).toString();
        input_nim3.setText(nim);
    }//GEN-LAST:event_tablemhs1MouseClicked

    private void input_kodekelasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_kodekelasKeyPressed
        char c = evt.getKeyChar();
        //Untuk memasukkan jenis Text
        if(Character.isLetter(c)){
            input_kodekelas.setEditable(true);

        }else{
            input_kodekelas.setEditable(false);
        }
    }//GEN-LAST:event_input_kodekelasKeyPressed

    private void btsave_matkulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsave_matkulMouseClicked
        Connection conn;
        Statement stat;
        String cari;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/anima", "root", "");
            stat = conn.createStatement();
            String sql="select * from matakuliah where "+ "kode_mk='" +input_kodemk.getText() +"'";
            ResultSet R = stat.executeQuery(sql);
            if(input_kodemk.getText().trim().isEmpty()){
                lbl_err1.setVisible(true);
                JOptionPane.showMessageDialog(null, "Inputan [Kode Matakuliah] kosong!", "Data Tidak Tersimpan",2);
            }
            else if(!input_kodemk.getText().trim().isEmpty()){
                lbl_err1.setVisible(false);
            }
            if(!input_kodemk.getText().trim().isEmpty() && R.next()){
                cari = R.getString(1);
                lbl_err1.setVisible(true);
                JOptionPane.showMessageDialog(null, "Kode Matakuliah : "+cari+"\nSudah terdapat didalam data. Harap input Data baru.","Duplikat",JOptionPane.WARNING_MESSAGE);
            }
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, "Terdapat Kesalahan");
        }
        if(input_koderuang.getText().trim().isEmpty()){
            lbl_err2.setVisible(true);
            JOptionPane.showMessageDialog(null, "Inputan [Ruangan] kosong!", "Data Tidak Tersimpan",2);
        }else if(input_koderuang.getText()!= null){
            lbl_err2.setVisible(false);
        }

        if(input_namamk.getText().trim().isEmpty()){
            lbl_err3.setVisible(true);
            JOptionPane.showMessageDialog(null, "Inputan [Nama Matakuliah] kosong!", "Data Tidak Tersimpan",2);
        }else if(input_namamk.getText()!= null){
            lbl_err3.setVisible(false);
        }
        if(input_hari.getSelectedItem().equals("Pilih Hari :")){
            lbl_err5.setVisible(true);
            JOptionPane.showMessageDialog(null, "Inputan [Nama Hari] kosong!", "Data Tidak Tersimpan",2);
        }else if(input_hari.getSelectedItem()!= null){
            lbl_err5.setVisible(false);
        }
        try{
            saveData();
            TableMatkul a = new TableMatkul(tablematkul);
            lebarKolomMatkul();
            a.getData();
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, "Telah terjadi Kesalahan", "Data Tidak Tersimpan",2);
        }
    }//GEN-LAST:event_btsave_matkulMouseClicked

    private void btcancel_matkulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcancel_matkulMouseClicked
        laman_input.setVisible(false);
        lbl_err1.setVisible(false);
        lbl_err2.setVisible(false);
        lbl_err3.setVisible(false);
        lbl_err4.setVisible(false);
        lbl_err5.setVisible(false);
        clear();
        tablematkul.enable();        
        laman_edit.setVisible(false);
        laman_delete.setVisible(false);
        show_komponen.setVisible(true);        
    }//GEN-LAST:event_btcancel_matkulMouseClicked

    private void input_waktuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_waktuKeyPressed
        char c = evt.getKeyChar();
        //Untuk memasukkan jenis input Angka
        if(Character.isLetter(c)){
            input_waktu.setEditable(false);

        }else{
            input_waktu.setEditable(true);
        }
    }//GEN-LAST:event_input_waktuKeyPressed

    private void tablematkulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablematkulMouseClicked
        String Kodemk, Kodekls, Ruang, Namamk, Sks, Hari, Waktu1;
        int baris, sks;
        String Ruang1;
        app_upt app = new app_upt();
        
        baris = tablematkul.rowAtPoint(evt.getPoint());
        
        Kodemk  = tablematkul.getValueAt(baris, 0).toString();
        showkode_mk.setText(Kodemk);
        update_kodemk1.setText(Kodemk);
        try{
        String myDriver = "org.gjt.mm.mysql.Driver";
        String myUrl = "jdbc:mysql://localhost/Anima";
        Class.forName(myDriver);
        Connection conn = DriverManager.getConnection(myUrl, "root", "");
        
        String query = "SELECT * FROM matakuliah Where kode_mk = '"+showkode_mk.getText()+"'";
        String query_komponen = "SELECT * FROM komponen Where kode_mk = '"+showkode_mk.getText()+"'";
        String query_index = "SELECT * FROM index_nilai Where kode_mk = '"+showkode_mk.getText()+"'";
        Statement s1 = conn.createStatement();
        Statement s2 = conn.createStatement();
        Statement s3 = conn.createStatement();
        ResultSet r1 = s1.executeQuery(query);
        ResultSet r2 = s2.executeQuery(query_komponen);
        ResultSet r3 = s3.executeQuery(query_index);
        while (r1.next()){
            showkode_kelas.setText(r1.getString("kode_kls"));
            delete_kodemk.setText(r1.getString("kode_mk"));
            delete_namamk.setText(r1.getString("nama_mk"));
            update_kodekelas1.setText(r1.getString("kode_kls"));
            show_namamk.setText(r1.getString("nama_mk"));
            update_namamk1.setText(r1.getString("nama_mk"));
            show_sks.setText(r1.getString("sks"));
            update_sks1.setValue(r1.getInt("sks"));
            show_hari.setText(r1.getString("hari"));
            update_hari1.setSelectedItem(r1.getString("hari"));
            show_waktu.setText(r1.getString("waktu"));
            update_waktu1.setText(r1.getString("waktu"));
            show_ruang.setText(r1.getString("ruang"));
            update_koderuang1.setText(r1.getString("ruang"));
            
        }
        while(r2.next()){
            show_uts.setText(r2.getString("uts"));
            update_nuts1.setText(r2.getString("uts"));
            show_uas.setText(r2.getString("uas"));
            update_nuas1.setText(r2.getString("uas"));
            show_quiz.setText(r2.getString("kuis"));
            update_nquiz1.setText(r2.getString("kuis"));
            show_tugas.setText(r2.getString("tugas"));
            update_ntugas1.setText(r2.getString("tugas"));
            show_tubes.setText(r2.getString("tubes"));
            update_ntubes1.setText(r2.getString("tubes"));
            show_prak.setText(r2.getString("praktikum"));
            update_nprak1.setText(r2.getString("praktikum"));
            show_tambah.setText(r2.getString("tambahan"));
            update_ntambahan1.setText(r2.getString("tambahan"));
        }
        while(r3.next()){
            show_a.setText(r3.getString("A"));
            update_indexA1.setText(r3.getString("A"));
            show_ab.setText(r3.getString("AB"));
            update_indexAB1.setText(r3.getString("AB"));
            show_b.setText(r3.getString("B"));
            update_indexB1.setText(r3.getString("B"));
            show_bc.setText(r3.getString("BC"));
            update_indexBC1.setText(r3.getString("BC"));
            show_c.setText(r3.getString("C"));
            update_indexC1.setText(r3.getString("C"));
            show_d.setText(r3.getString("D"));
            update_indexD1.setText(r3.getString("D"));
            show_e.setText(r3.getString("E"));
            update_indexE1.setText(r3.getString("E"));
        }
        
    }
    catch (Exception e){
        System.err.println("Got an exception! ");
        System.err.println(e.getMessage());
    }
        tablematkul.enable();
 
        if(laman_input.isVisible()){
            show_komponen.setVisible(false);
            laman_edit.setVisible(false);
            tablematkul.disable();
            laman_input.setVisible(true);
            JOptionPane.showMessageDialog(null,"Anda tidak diperbolehkan meng-klik table saat sedang menginputkan matakuliah", "PERINGATAN",2);
        }
        
                      
    }//GEN-LAST:event_tablematkulMouseClicked

    private void button_input5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_input5MouseClicked
        blank1.setVisible(false);
        laman_updatemhs.setVisible(true);
        laman_input1.setVisible(false);
    }//GEN-LAST:event_button_input5MouseClicked

    private void DELETE_mhs5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETE_mhs5MouseClicked
        
        Connection conn;
        Statement stat;
        String cari;
        int eror=0;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            conn = DriverManager.getConnection("jdbc:mysql://localhost/anima", "root", "");
            stat = conn.createStatement();
            String sql="select * from nilai where "+ "nim='" +input_nim4.getText() +"' && kode_mk= '"+ pilihmatkul.getSelectedItem().toString()+"'";
            ResultSet R = stat.executeQuery(sql); 
            
            R.next();
            cari = R.getString(1);
            if(!cari.isEmpty()){
                eror=1;
            }

        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException ex){        
        }
        
        if(!input_nim4.getText().trim().isEmpty() && eror==1 ){
            TableMhs a = new TableMhs(tablemhs);
            a.getHapus(input_nim4.getText(),pilihmatkul.getSelectedItem().toString());
            lebarKolomMhs();
            
            a.getDataMhs(pilihmatkul.getSelectedItem().toString(), sorting1.getSelectedItem().toString());
            input_nim4.setText("");
          
        }else {
            JOptionPane.showMessageDialog(null, "NIM yang ingin dihapus tidak ditemukan" );
        }
    }//GEN-LAST:event_DELETE_mhs5MouseClicked

    private void UPDATE_mhs3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPDATE_mhs3MouseClicked

        String nama = input_namamhs2.getText();
        String NIM = input_nim3.getText();
        if(!nama.matches(".*[1-9].*") && !NIM.matches(".*[A-Za-z].*")){            
            if(!input_namamhs2.getText().isEmpty()&& !input_nim3.getText().isEmpty() ){
                Tablemhssemua a = new Tablemhssemua(tablemhs1);
                a.getUpdate(input_namamhs2.getText(), input_nim3.getText());
                a.getData();
            }else{
                JOptionPane.showMessageDialog(null, "Data tidak berubah");
            }
        }else if(nama.matches(".*[1-9].*") || NIM.matches(".*[A-Za-z].*")){
            JOptionPane.showMessageDialog(null, "Data yang dimasukkan tidak valid");
        }
        
        input_namamhs2.setText("");
        input_nim3.setText("");
    }//GEN-LAST:event_UPDATE_mhs3MouseClicked

    private void update_kodekelas1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_update_kodekelas1KeyPressed
        char c = evt.getKeyChar();
        //Untuk memasukkan jenis Text
        if(Character.isLetter(c)){
            input_kodekelas.setEditable(true);

        }else{
            input_kodekelas.setEditable(false);
        }
    }//GEN-LAST:event_update_kodekelas1KeyPressed

    private void btupdate_matkul1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btupdate_matkul1MouseClicked
        try {

            String matkul ="UPDATE matakuliah SET kode_mk = '"+update_kodemk1.getText()+"', kode_kls = '"+update_kodekelas1.getText()+
            "', ruang = '"+update_koderuang1.getText()+"', nama_mk = '"+update_namamk1.getText()+
            "', sks = '"+update_sks1.getValue()+"', hari = '"+update_hari1.getSelectedItem()+"', waktu = '"+
            update_waktu1.getText()+"' WHERE kode_mk = '"+update_kodemk1.getText()+"'";

            String komp ="UPDATE komponen SET kode_mk = '"+update_kodemk1.getText()+"', uts = '"+update_nuts1.getText()+
            "', uas = '"+update_nuas1.getText()+"', kuis = '"+update_nquiz1.getText()+
            "', tugas = '"+update_ntugas1.getText()+"', tubes = '"+update_ntubes1.getText()+"', praktikum = '"+
            update_nprak1.getText()+"', tambahan = '"+update_ntambahan1.getText()+"' WHERE kode_mk = '"+update_kodemk1.getText()+"'";

            String index ="UPDATE index_nilai SET kode_mk = '"+update_kodemk1.getText()+"', A = '"+update_indexA1.getText()+
            "', AB = '"+update_indexAB1.getText()+"', B = '"+update_indexB1.getText()+
            "', BC = '"+update_indexBC1.getText()+"', C = '"+update_indexC1.getText()+"', D = '"+
            update_indexD1.getText()+"', E = '"+update_indexE1.getText()+"' WHERE kode_mk = '"+update_kodemk1.getText()+"'";

            Connection conn=(Connection)koneksi.getKoneksi();
            PreparedStatement Matkul=conn.prepareStatement(matkul);
            PreparedStatement Komp=conn.prepareStatement(komp);
            PreparedStatement Index=conn.prepareStatement(index);
            Matkul.executeUpdate();
            Komp.executeUpdate();
            Index.executeUpdate();

            JOptionPane.showMessageDialog(null, "data berhasil di edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal. "+e.getMessage());
        }
        TableMatkul a = new TableMatkul(tablematkul);
            lebarKolomMatkul();
            a.getData();
    }//GEN-LAST:event_btupdate_matkul1MouseClicked

    private void btcupdate_matkul1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcupdate_matkul1MouseClicked
        laman_input.setVisible(false);
        laman_edit.setVisible(false);
        laman_delete.setVisible(false);
        show_komponen.setVisible(true);
        clear();
        tablematkul.enable();
    }//GEN-LAST:event_btcupdate_matkul1MouseClicked

    private void update_waktu1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_update_waktu1KeyPressed
        char c = evt.getKeyChar();
        //Untuk memasukkan jenis input Angka
        if(Character.isLetter(c)){
            input_waktu.setEditable(false);

        }else{
            input_waktu.setEditable(true);
        }
    }//GEN-LAST:event_update_waktu1KeyPressed

    private void pilihmatkul1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihmatkul1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilihmatkul1ActionPerformed

    private void iconcari1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconcari1MouseClicked
        TableNilai a = new TableNilai(tablenilai);
        lebarKolomNilai();
        setText();
        a.getData(pilihmatkul1.getSelectedItem().toString(), sorting1.getSelectedItem().toString());
    }//GEN-LAST:event_iconcari1MouseClicked

    private void carimhs_nilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carimhs_nilaiMouseClicked
        TableNilai a = new TableNilai(tablenilai);
        lebarKolomNilai();
        a.getCari(searchmhsnilai.getText(), pilihmatkul1.getSelectedItem().toString());
    }//GEN-LAST:event_carimhs_nilaiMouseClicked

    private void tablenilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablenilaiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablenilaiMouseClicked

    private void pilihmatkul2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihmatkul2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilihmatkul2ActionPerformed

    private void iconcari2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconcari2MouseClicked
            
        try {
            Connection conn=(Connection)koneksi.getKoneksi();
            Statement st1 = (Statement)conn.createStatement();
            Statement st2 = (Statement)conn.createStatement();
            Statement st3 = (Statement)conn.createStatement();
            Statement st4 = (Statement)conn.createStatement();
            Statement st5 = (Statement)conn.createStatement();
            Statement st6 = (Statement)conn.createStatement();
            Statement st7 = (Statement)conn.createStatement();
            Statement st8 = (Statement)conn.createStatement();
                        
            String cari1 = "SELECT COUNT(GRADE) as count FROM konversi_NA WHERE GRADE='A' && KODE_MK='"+pilihmatkul2.getSelectedItem().toString()+"';";
            String cari2 = "SELECT COUNT(GRADE) as count FROM konversi_NA WHERE GRADE='AB' && KODE_MK='"+pilihmatkul2.getSelectedItem().toString()+"';";
            String cari3 = "SELECT COUNT(GRADE) as count FROM konversi_NA WHERE GRADE='B' && KODE_MK='"+pilihmatkul2.getSelectedItem().toString()+"';";
            String cari4 = "SELECT COUNT(GRADE) as count FROM konversi_NA WHERE GRADE='BC' && KODE_MK='"+pilihmatkul2.getSelectedItem().toString()+"';";
            String cari5 = "SELECT COUNT(GRADE) as count FROM konversi_NA WHERE GRADE='C' && KODE_MK='"+pilihmatkul2.getSelectedItem().toString()+"';";
            String cari6 = "SELECT COUNT(GRADE) as count FROM konversi_NA WHERE GRADE='D' && KODE_MK='"+pilihmatkul2.getSelectedItem().toString()+"';";
            String cari7 = "SELECT COUNT(GRADE) as count FROM konversi_NA WHERE GRADE='E' && KODE_MK='"+pilihmatkul2.getSelectedItem().toString()+"';";
            String carijudul = "select nama_mk from matakuliah WHERE KODE_MK='"+pilihmatkul2.getSelectedItem().toString()+"';";
            
            ResultSet rs1 = st1.executeQuery(cari1);
            ResultSet rs2 = st2.executeQuery(cari2);
            ResultSet rs3 = st3.executeQuery(cari3);
            ResultSet rs4 = st4.executeQuery(cari4);
            ResultSet rs5 = st5.executeQuery(cari5);
            ResultSet rs6 = st6.executeQuery(cari6);
            ResultSet rs7 = st7.executeQuery(cari7);
            ResultSet rs8 = st8.executeQuery(carijudul);
            
            while(rs1.next()&& rs2.next() && rs3.next() && rs4.next()&& rs5.next()&& rs6.next()&& rs7.next()&& rs8.next()){
                int count1=rs1.getInt("count");  
                int count2=rs2.getInt("count");   
                int count3=rs3.getInt("count");  
                int count4=rs4.getInt("count");   
                int count5=rs5.getInt("count");  
                int count6=rs6.getInt("count");   
                int count7=rs7.getInt("count");  
                String judul=rs8.getString("nama_mk");                
                
                DefaultCategoryDataset piedata = new DefaultCategoryDataset();
                piedata.setValue(count7,"Grafik","E");
                piedata.setValue(count6,"Grafik","D");
                piedata.setValue(count5,"Grafik","C");
                piedata.setValue(count4,"Grafik","BC");
                piedata.setValue(count3,"Grafik","B");
                piedata.setValue(count2,"Grafik","AB");
                piedata.setValue(count1,"Grafik","A");
                
                JFreeChart chart = ChartFactory.createLineChart3D(judul,"Grade","Frekuensi",piedata);
                panelgrafik.setLayout(new java.awt.BorderLayout());
                ChartPanel CF = new ChartPanel(chart);
                panelgrafik.add(CF,BorderLayout.CENTER);
                panelgrafik.validate();
                
            }
        } catch (SQLException ex) {
        //    java.util.logging.Logger.getLogger(chart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconcari2MouseClicked

    private void menu_grafikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_grafikMouseClicked
        nav.setVisible(true);
        animasi_slide.jTextAreaXLeft(0, -230, 20, 10, nav);
        laman_matkul.setVisible(false);
        laman_jadwal.setVisible(false);
        laman_nilai.setVisible(false);
        HalamanAwal.setVisible(false);
        laman_mahasiswa.setVisible(false);
        laman_mahasiswa1.setVisible(false);
        fresh_open.setVisible(false);
        tabel.setVisible(false);
        show_komponen.setVisible(false);
        laman_grafik.setVisible(true);
        Connection conn1;
        Statement stat;
        String cari;
        int eror = 0;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            conn1 = DriverManager.getConnection("jdbc:mysql://localhost/anima", "root", "");
            stat = conn1.createStatement();
            String sql="select kode_mk from matakuliah ";
            ResultSet R = stat.executeQuery(sql); 
            R.next();
            cari = R.getString(1);
            if(!cari.isEmpty()){
                eror=1;
            }
            
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException ex){
            //JOptionPane.showMessageDialog(null, "Terdapat Kesalahan");
        }
        
        if(eror==1){
            pilihmatkul1.removeAllItems();
            pilihmatkul2.removeAllItems();
            pilihmatkul.removeAllItems();
            setModel();
            if(model1.getSize()==0){            
            }else if(model1.getSize()>0){            
                pilihmatkul2.setModel(model1);               
            }
        }

        try {
            Connection conn=(Connection)koneksi.getKoneksi();
            Statement st1 = (Statement)conn.createStatement();
            Statement st2 = (Statement)conn.createStatement();
            Statement st3 = (Statement)conn.createStatement();
            Statement st4 = (Statement)conn.createStatement();
            Statement st5 = (Statement)conn.createStatement();
            Statement st6 = (Statement)conn.createStatement();
            Statement st7 = (Statement)conn.createStatement();
            Statement st8 = (Statement)conn.createStatement();
                        
            String cari1 = "SELECT COUNT(GRADE) as count FROM konversi_NA WHERE GRADE='A' && KODE_MK='"+pilihmatkul2.getSelectedItem().toString()+"';";
            String cari2 = "SELECT COUNT(GRADE) as count FROM konversi_NA WHERE GRADE='AB' && KODE_MK='"+pilihmatkul2.getSelectedItem().toString()+"';";
            String cari3 = "SELECT COUNT(GRADE) as count FROM konversi_NA WHERE GRADE='B' && KODE_MK='"+pilihmatkul2.getSelectedItem().toString()+"';";
            String cari4 = "SELECT COUNT(GRADE) as count FROM konversi_NA WHERE GRADE='BC' && KODE_MK='"+pilihmatkul2.getSelectedItem().toString()+"';";
            String cari5 = "SELECT COUNT(GRADE) as count FROM konversi_NA WHERE GRADE='C' && KODE_MK='"+pilihmatkul2.getSelectedItem().toString()+"';";
            String cari6 = "SELECT COUNT(GRADE) as count FROM konversi_NA WHERE GRADE='D' && KODE_MK='"+pilihmatkul2.getSelectedItem().toString()+"';";
            String cari7 = "SELECT COUNT(GRADE) as count FROM konversi_NA WHERE GRADE='E' && KODE_MK='"+pilihmatkul2.getSelectedItem().toString()+"';";
            String carijudul = "select nama_mk from matakuliah WHERE KODE_MK='"+pilihmatkul2.getSelectedItem().toString()+"';";
            
            ResultSet rs1 = st1.executeQuery(cari1);
            ResultSet rs2 = st2.executeQuery(cari2);
            ResultSet rs3 = st3.executeQuery(cari3);
            ResultSet rs4 = st4.executeQuery(cari4);
            ResultSet rs5 = st5.executeQuery(cari5);
            ResultSet rs6 = st6.executeQuery(cari6);
            ResultSet rs7 = st7.executeQuery(cari7);
            ResultSet rs8 = st8.executeQuery(carijudul);
            
            while(rs1.next()&& rs2.next() && rs3.next() && rs4.next()&& rs5.next()&& rs6.next()&& rs7.next()&& rs8.next()){
                int count1=rs1.getInt("count");  
                int count2=rs2.getInt("count");   
                int count3=rs3.getInt("count");  
                int count4=rs4.getInt("count");   
                int count5=rs5.getInt("count");  
                int count6=rs6.getInt("count");   
                int count7=rs7.getInt("count");  
                String judul=rs8.getString("nama_mk");                
                
                DefaultCategoryDataset piedata = new DefaultCategoryDataset();
                piedata.setValue(count7,"Grafik","E");
                piedata.setValue(count6,"Grafik","D");
                piedata.setValue(count5,"Grafik","C");
                piedata.setValue(count4,"Grafik","BC");
                piedata.setValue(count3,"Grafik","B");
                piedata.setValue(count2,"Grafik","AB");
                piedata.setValue(count1,"Grafik","A");
                
                JFreeChart chart = ChartFactory.createLineChart3D(judul,"Grade","Frekuensi",piedata);
                panelgrafik.setLayout(new java.awt.BorderLayout());
                ChartPanel CF = new ChartPanel(chart);
                panelgrafik.add(CF,BorderLayout.CENTER);
                panelgrafik.validate();
                
            }
        } catch (SQLException ex) {
        
        }
    }//GEN-LAST:event_menu_grafikMouseClicked

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        konten_nilai.setVisible(false);
        konten_pdf.setVisible(true);
        
        Tablepdf a = new Tablepdf(tablepdf);
        lebarKolomPDF();        
        a.getData(pilihmatkul1.getSelectedItem().toString());
               
        MessageFormat header = new MessageFormat ("Nilai Akhir Matakuliah "+ COBA1.getText());
        MessageFormat footer = new MessageFormat ("Page{0,number,integer}");
        try{
            tablepdf.print(JTable.PrintMode.NORMAL, header, footer);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Print Data Gagal. "+e.getMessage());
        }
        
        konten_nilai.setVisible(true);
        konten_pdf.setVisible(false);
        TableNilai b = new TableNilai(tablenilai);
        lebarKolomNilai();        
        b.getData(pilihmatkul1.getSelectedItem().toString(), sorting1.getSelectedItem().toString());
    }//GEN-LAST:event_printMouseClicked

    private void tablepdfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablepdfMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablepdfMouseClicked

    private void sortingItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sortingItemStateChanged
        sorting.getSelectedItem().toString();
        TableNilai a = new TableNilai(tablenilai);
        lebarKolomNilai();
        a.getData(pilihmatkul1.getSelectedItem().toString(), sorting.getSelectedItem().toString());
    }//GEN-LAST:event_sortingItemStateChanged

    private void sorting1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sorting1ItemStateChanged
        TableMhs a = new TableMhs(tablemhs);
        lebarKolomMhs();
        sorting1.getSelectedItem().toString();
        a.getDataMhs(pilihmatkul.getSelectedItem().toString(), sorting1.getSelectedItem().toString());
    }//GEN-LAST:event_sorting1ItemStateChanged

    private void pilihmatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihmatkulActionPerformed

    }//GEN-LAST:event_pilihmatkulActionPerformed

    private void delete_mkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_mkMouseClicked
        blank.setVisible(false);
        laman_input.setVisible(false);
        show_komponen.setVisible(false);        
        
        tablematkul.getMousePosition(false);
        tablematkul.getSelectionModel().isSelectionEmpty();
        tablematkul.disable();
        laman_delete.setVisible(true);
        show_komponen.setVisible(false);
        laman_input.setVisible(false);
        laman_edit.setVisible(false);
    }//GEN-LAST:event_delete_mkMouseClicked

    private void btn_deletemkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deletemkMouseClicked
        
        Connection conn;
        Statement stat;
        String cari;
        int eror=0;
        String id = delete_kodemk.getText();
        String nama = delete_namamk.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            conn = DriverManager.getConnection("jdbc:mysql://localhost/anima", "root", "");
            stat = conn.createStatement();
            String sql="select * from matakuliah where kode_mk='" +id +"' && nama_mk= '"+ nama+"';";
            ResultSet R = stat.executeQuery(sql); 
            
            R.next();
            cari = R.getString(1);
            if(!cari.isEmpty()){
                eror=1;
            }
            
        } catch (Exception e) {            
        }
        if(!id.isEmpty()&&!nama.isEmpty()){
            if(eror==1 ){
                TableMatkul a = new TableMatkul(tablematkul);
                a.getHapus(id, nama);
                lebarKolomMatkul();
                a.getData();
                JOptionPane.showMessageDialog(null, "Mata Kuliah berhasil di Hapus");
            }else{
                JOptionPane.showMessageDialog(null, "Mata Kuliah yang ingin dihapus tidak ditemukan" );
            }
        }else{
            JOptionPane.showMessageDialog(null, "Hapus matkul gagal, isikan ID dan nama matkul dengan lengkap!");
        }        
    }//GEN-LAST:event_btn_deletemkMouseClicked

    private void canceldeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canceldeleteMouseClicked
        laman_input.setVisible(false);
        laman_edit.setVisible(false);
        laman_delete.setVisible(false);
        show_komponen.setVisible(true);
        clear();
        tablematkul.enable();
    }//GEN-LAST:event_canceldeleteMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(app_upt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(app_upt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(app_upt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(app_upt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                app_upt App = new app_upt();
                App.setVisible(true);
                App.tabel.setVisible(true);
                App.fresh_open.setVisible(false);
                
                App.lbl_err1.setVisible(false); //Label Kode matakuliah
                App.lbl_err2.setVisible(false); //Label Ruangan
                App.lbl_err3.setVisible(false); //Label Nama matakuliah
                App.lbl_err4.setVisible(false); //Label SKS
                App.lbl_err5.setVisible(false); //Label Hari
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField COBA;
    private javax.swing.JTextField COBA1;
    private javax.swing.JLabel DELETE_mhs4;
    private javax.swing.JLabel DELETE_mhs5;
    private javax.swing.JPanel HalamanAwal;
    private javax.swing.JPanel Laman;
    private javax.swing.JLabel UPDATE_mhs3;
    private javax.swing.JPanel bariskedua1;
    private javax.swing.JPanel bariskedua2;
    private javax.swing.JPanel bariskedua3;
    private javax.swing.JPanel bariskedua4;
    private javax.swing.JPanel bariskedua5;
    private javax.swing.JPanel bariskedua6;
    private javax.swing.JPanel blank;
    private javax.swing.JPanel blank1;
    private javax.swing.JPanel blank3;
    private javax.swing.JLabel btcancel_matkul;
    private javax.swing.JLabel btcupdate_matkul1;
    private javax.swing.JLabel btn_deletemk;
    private javax.swing.JLabel btsave_matkul;
    private javax.swing.JLabel btsave_mhs;
    private javax.swing.JLabel btsave_mhs2;
    private javax.swing.JLabel btsave_nilai;
    private javax.swing.JLabel btupdate_matkul1;
    private javax.swing.JLabel button_input;
    private javax.swing.JLabel button_input1;
    private javax.swing.JLabel button_input2;
    private javax.swing.JLabel button_input3;
    private javax.swing.JLabel button_input5;
    private javax.swing.JLabel button_update;
    private javax.swing.JLabel canceldelete;
    private javax.swing.JPanel card_atas1;
    private javax.swing.JPanel card_atas3;
    private javax.swing.JPanel card_komp;
    private javax.swing.JPanel cardlayout_kanan;
    private javax.swing.JPanel cardlayout_kanan1;
    private javax.swing.JPanel cardlayout_kanan3;
    private javax.swing.JPanel cardlayout_kiri;
    private javax.swing.JPanel cardlayout_kiri1;
    private javax.swing.JPanel cardlayout_kiri2;
    private javax.swing.JPanel cardlayout_kiri4;
    private javax.swing.JPanel cardlayout_kiri5;
    private javax.swing.JPanel cardlayout_kiri6;
    private javax.swing.JLabel carimhs_nilai;
    private javax.swing.JTextField delete_kodemk;
    private javax.swing.JLabel delete_mk;
    private javax.swing.JTextField delete_namamk;
    private javax.swing.JLabel field_index1;
    private javax.swing.JLabel field_index10;
    private javax.swing.JLabel field_index11;
    private javax.swing.JLabel field_index12;
    private javax.swing.JLabel field_index13;
    private javax.swing.JLabel field_index14;
    private javax.swing.JLabel field_index2;
    private javax.swing.JLabel field_index3;
    private javax.swing.JLabel field_index4;
    private javax.swing.JLabel field_index5;
    private javax.swing.JLabel field_index6;
    private javax.swing.JLabel field_index7;
    private javax.swing.JLabel field_index8;
    private javax.swing.JLabel field_index9;
    private javax.swing.JLabel field_kdkelas;
    private javax.swing.JLabel field_kdkelas1;
    private javax.swing.JLabel field_kdkelas3;
    private javax.swing.JLabel field_kdkelas4;
    private javax.swing.JLabel field_kdkelas5;
    private javax.swing.JLabel field_kdkelas6;
    private javax.swing.JLabel field_kdmk;
    private javax.swing.JLabel field_kdmk1;
    private javax.swing.JLabel field_kdmk3;
    private javax.swing.JLabel field_kdmk4;
    private javax.swing.JLabel field_kdmk5;
    private javax.swing.JLabel field_kdmk6;
    private javax.swing.JLabel field_kdmk7;
    private javax.swing.JLabel field_kdmk8;
    private javax.swing.JLabel field_namamk;
    private javax.swing.JLabel field_namamk1;
    private javax.swing.JLabel field_namamk2;
    private javax.swing.JLabel field_praktikum;
    private javax.swing.JLabel field_praktikum1;
    private javax.swing.JLabel field_quiz;
    private javax.swing.JLabel field_quiz1;
    private javax.swing.JLabel field_tambahan;
    private javax.swing.JLabel field_tambahan1;
    private javax.swing.JLabel field_tubes;
    private javax.swing.JLabel field_tubes1;
    private javax.swing.JLabel field_tugas;
    private javax.swing.JLabel field_tugas1;
    private javax.swing.JLabel field_uas;
    private javax.swing.JLabel field_uas1;
    private javax.swing.JLabel field_uts;
    private javax.swing.JLabel field_uts1;
    private javax.swing.JLabel field_waktu;
    private javax.swing.JLabel field_waktu1;
    private javax.swing.JLabel field_waktu2;
    private javax.swing.JLabel field_waktu4;
    private javax.swing.JPanel fresh_open;
    private javax.swing.JPanel fresh_open1;
    private javax.swing.JPanel fresh_open2;
    private javax.swing.JPanel fresh_open3;
    private javax.swing.JPanel fresh_open4;
    private javax.swing.JPanel fresh_open5;
    private javax.swing.JPanel fresh_open6;
    private javax.swing.JLabel hari_mk;
    private javax.swing.JLabel hari_mk1;
    private javax.swing.JLabel iconcari;
    private javax.swing.JLabel iconcari1;
    private javax.swing.JLabel iconcari2;
    private javax.swing.JLabel index_A;
    private javax.swing.JLabel index_A1;
    private javax.swing.JLabel index_B;
    private javax.swing.JLabel index_B1;
    private javax.swing.JLabel index_B2;
    private javax.swing.JLabel index_B3;
    private javax.swing.JLabel index_B4;
    private javax.swing.JLabel index_B5;
    private javax.swing.JLabel index_C;
    private javax.swing.JLabel index_C1;
    private javax.swing.JLabel index_D;
    private javax.swing.JLabel index_D1;
    private javax.swing.JLabel index_E;
    private javax.swing.JLabel index_E1;
    private javax.swing.JLabel index_nilai;
    private javax.swing.JLabel index_nilai1;
    private javax.swing.JComboBox<String> input_hari;
    private javax.swing.JTextField input_indexA;
    private javax.swing.JTextField input_indexAB;
    private javax.swing.JTextField input_indexB;
    private javax.swing.JTextField input_indexBC;
    private javax.swing.JTextField input_indexC;
    private javax.swing.JTextField input_indexD;
    private javax.swing.JTextField input_indexE;
    private javax.swing.JTextField input_kodekelas;
    private javax.swing.JTextField input_kodemk;
    private javax.swing.JTextField input_koderuang;
    private javax.swing.JTextField input_mhs2;
    private javax.swing.JTextField input_namamhs;
    private javax.swing.JTextField input_namamhs1;
    private javax.swing.JTextField input_namamhs2;
    private javax.swing.JTextField input_namamk;
    private javax.swing.JTextField input_nilaimhs;
    private javax.swing.JTextField input_nim1;
    private javax.swing.JTextField input_nim2;
    private javax.swing.JTextField input_nim3;
    private javax.swing.JTextField input_nim4;
    private javax.swing.JTextField input_nprak;
    private javax.swing.JTextField input_nquiz;
    private javax.swing.JTextField input_ntambahan;
    private javax.swing.JTextField input_ntubes;
    private javax.swing.JTextField input_ntugas;
    private javax.swing.JTextField input_nuas;
    private javax.swing.JTextField input_nuts;
    private javax.swing.JSpinner input_sks;
    private javax.swing.JTextField input_waktu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel jadwal;
    private javax.swing.JPanel judul_halamanAwal;
    private javax.swing.JLabel kd_kelas;
    private javax.swing.JLabel kd_kelas1;
    private javax.swing.JLabel kd_kelas3;
    private javax.swing.JLabel kd_kelas4;
    private javax.swing.JLabel kd_kelas5;
    private javax.swing.JLabel kd_kelas6;
    private javax.swing.JPanel kepalapanel;
    private javax.swing.JLabel kode_mk;
    private javax.swing.JLabel kode_mk1;
    private javax.swing.JLabel kode_mk3;
    private javax.swing.JLabel kode_mk4;
    private javax.swing.JLabel kode_mk5;
    private javax.swing.JLabel kode_mk6;
    private javax.swing.JLabel kode_ruang;
    private javax.swing.JLabel kode_ruang1;
    private javax.swing.JLabel komponen_mk;
    private javax.swing.JLabel komponen_mk1;
    private javax.swing.JComboBox<String> komponenmhs;
    private javax.swing.JPanel konten_mahasiswa;
    private javax.swing.JPanel konten_mahasiswa1;
    private javax.swing.JPanel konten_mahasiswa2;
    private javax.swing.JPanel konten_mahasiswa4;
    private javax.swing.JPanel konten_matkul;
    private javax.swing.JPanel konten_nilai;
    private javax.swing.JPanel konten_pdf;
    private javax.swing.JPanel laman_delete;
    private javax.swing.JPanel laman_edit;
    private javax.swing.JPanel laman_grafik;
    private javax.swing.JPanel laman_input;
    private javax.swing.JPanel laman_input1;
    private javax.swing.JPanel laman_input3;
    private javax.swing.JPanel laman_jadwal;
    private javax.swing.JPanel laman_mahasiswa;
    private javax.swing.JPanel laman_mahasiswa1;
    private javax.swing.JPanel laman_matkul;
    private javax.swing.JPanel laman_nilai;
    private javax.swing.JPanel laman_updatemhs;
    private javax.swing.JPanel laman_updatemhs2;
    private javax.swing.JPanel lbl_err1;
    private javax.swing.JPanel lbl_err2;
    private javax.swing.JPanel lbl_err3;
    private javax.swing.JPanel lbl_err4;
    private javax.swing.JPanel lbl_err5;
    private javax.swing.JLabel lblkode_mk;
    private javax.swing.JLabel lblkode_mk1;
    private javax.swing.JLabel lblkode_mk10;
    private javax.swing.JLabel lblkode_mk11;
    private javax.swing.JLabel lblkode_mk12;
    private javax.swing.JLabel lblkode_mk13;
    private javax.swing.JLabel lblkode_mk14;
    private javax.swing.JLabel lblkode_mk15;
    private javax.swing.JLabel lblkode_mk16;
    private javax.swing.JLabel lblkode_mk17;
    private javax.swing.JLabel lblkode_mk18;
    private javax.swing.JLabel lblkode_mk19;
    private javax.swing.JLabel lblkode_mk2;
    private javax.swing.JLabel lblkode_mk20;
    private javax.swing.JLabel lblkode_mk21;
    private javax.swing.JLabel lblkode_mk22;
    private javax.swing.JLabel lblkode_mk3;
    private javax.swing.JLabel lblkode_mk4;
    private javax.swing.JLabel lblkode_mk5;
    private javax.swing.JLabel lblkode_mk6;
    private javax.swing.JLabel lblkode_mk7;
    private javax.swing.JLabel lblkode_mk8;
    private javax.swing.JLabel lblkode_mk9;
    private javax.swing.JLabel line;
    private javax.swing.JLabel line1;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menu1;
    private javax.swing.JPanel menu2;
    private javax.swing.JPanel menu3;
    private javax.swing.JPanel menu4;
    private javax.swing.JPanel menu5;
    private javax.swing.JLabel menu_grafik;
    private javax.swing.JLabel menu_lihatnilai;
    private javax.swing.JLabel menu_mhs;
    private javax.swing.JLabel menu_mhs1;
    private javax.swing.JLabel menu_mk;
    private javax.swing.JLabel nama_mk;
    private javax.swing.JLabel nama_mk1;
    private javax.swing.JLabel nama_mk2;
    private javax.swing.JScrollPane nav;
    private javax.swing.JButton navbar;
    private javax.swing.JPanel navigasi1;
    private javax.swing.JPanel panelgrafik;
    private javax.swing.JLabel persen1;
    private javax.swing.JLabel persen10;
    private javax.swing.JLabel persen11;
    private javax.swing.JLabel persen12;
    private javax.swing.JLabel persen13;
    private javax.swing.JLabel persen14;
    private javax.swing.JLabel persen15;
    private javax.swing.JLabel persen16;
    private javax.swing.JLabel persen17;
    private javax.swing.JLabel persen18;
    private javax.swing.JLabel persen19;
    private javax.swing.JLabel persen2;
    private javax.swing.JLabel persen20;
    private javax.swing.JLabel persen21;
    private javax.swing.JLabel persen3;
    private javax.swing.JLabel persen4;
    private javax.swing.JLabel persen5;
    private javax.swing.JLabel persen6;
    private javax.swing.JLabel persen7;
    private javax.swing.JLabel persen8;
    private javax.swing.JLabel persen9;
    private javax.swing.JComboBox<String> pilihmatkul;
    private javax.swing.JComboBox<String> pilihmatkul1;
    private javax.swing.JComboBox<String> pilihmatkul2;
    private javax.swing.JLabel print;
    private javax.swing.JLabel pukul;
    private javax.swing.JLabel r;
    private javax.swing.JTextField search;
    private javax.swing.JLabel search2;
    private javax.swing.JTextField searchfix;
    private javax.swing.JTextField searchfix2;
    private javax.swing.JLabel searchkan;
    private javax.swing.JLabel searchkan1;
    private javax.swing.JLabel searchkan2;
    private javax.swing.JTextField searchmhsnilai;
    private javax.swing.JLabel show_a;
    private javax.swing.JLabel show_ab;
    private javax.swing.JLabel show_b;
    private javax.swing.JLabel show_bc;
    private javax.swing.JLabel show_c;
    private javax.swing.JLabel show_d;
    private javax.swing.JLabel show_e;
    private javax.swing.JLabel show_hari;
    private javax.swing.JPanel show_komponen;
    private javax.swing.JLabel show_namamk;
    private javax.swing.JLabel show_prak;
    private javax.swing.JLabel show_quiz;
    private javax.swing.JLabel show_ruang;
    private javax.swing.JLabel show_sks;
    private javax.swing.JLabel show_tambah;
    private javax.swing.JLabel show_tubes;
    private javax.swing.JLabel show_tugas;
    private javax.swing.JLabel show_uas;
    private javax.swing.JLabel show_uts;
    private javax.swing.JLabel show_waktu;
    private javax.swing.JLabel showkode_kelas;
    private javax.swing.JLabel showkode_mk;
    private javax.swing.JLabel sks_mk;
    private javax.swing.JLabel sks_mk1;
    private javax.swing.JComboBox<String> sorting;
    private javax.swing.JComboBox<String> sorting1;
    private javax.swing.JPanel tabel;
    private javax.swing.JTable tablejadwal;
    private javax.swing.JTable tablematkul;
    private javax.swing.JTable tablemhs;
    private javax.swing.JTable tablemhs1;
    private javax.swing.JTable tablenilai;
    private javax.swing.JTable tablepdf;
    private javax.swing.JPanel tampilan_awal;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text_matkul;
    private javax.swing.JLabel text_matkul1;
    private javax.swing.JLabel text_matkul10;
    private javax.swing.JLabel text_matkul11;
    private javax.swing.JLabel text_matkul2;
    private javax.swing.JLabel text_matkul3;
    private javax.swing.JLabel text_matkul4;
    private javax.swing.JLabel text_matkul5;
    private javax.swing.JLabel text_matkul6;
    private javax.swing.JLabel text_matkul7;
    private javax.swing.JLabel text_matkul8;
    private javax.swing.JLabel text_matkul9;
    private javax.swing.JLabel text_prak;
    private javax.swing.JLabel text_prak1;
    private javax.swing.JLabel text_quiz;
    private javax.swing.JLabel text_quiz1;
    private javax.swing.JLabel text_tambahan;
    private javax.swing.JLabel text_tambahan1;
    private javax.swing.JLabel text_tubes;
    private javax.swing.JLabel text_tubes1;
    private javax.swing.JLabel text_tugas;
    private javax.swing.JLabel text_tugas1;
    private javax.swing.JLabel text_uas;
    private javax.swing.JLabel text_uas1;
    private javax.swing.JLabel text_uts;
    private javax.swing.JLabel text_uts1;
    private javax.swing.JComboBox<String> update_hari1;
    private javax.swing.JTextField update_indexA1;
    private javax.swing.JTextField update_indexAB1;
    private javax.swing.JTextField update_indexB1;
    private javax.swing.JTextField update_indexBC1;
    private javax.swing.JTextField update_indexC1;
    private javax.swing.JTextField update_indexD1;
    private javax.swing.JTextField update_indexE1;
    private javax.swing.JTextField update_kodekelas1;
    private javax.swing.JTextField update_kodemk1;
    private javax.swing.JTextField update_koderuang1;
    private javax.swing.JTextField update_namamk1;
    private javax.swing.JTextField update_nprak1;
    private javax.swing.JTextField update_nquiz1;
    private javax.swing.JTextField update_ntambahan1;
    private javax.swing.JTextField update_ntubes1;
    private javax.swing.JTextField update_ntugas1;
    private javax.swing.JTextField update_nuas1;
    private javax.swing.JTextField update_nuts1;
    private javax.swing.JSpinner update_sks1;
    private javax.swing.JTextField update_waktu1;
    private javax.swing.JLabel waktu_mk1;
    private javax.swing.JLabel waktu_mk2;
    private javax.swing.JLabel waktu_mk3;
    private javax.swing.JLabel waktu_mk4;
    private javax.swing.JLabel waktu_mk8;
    // End of variables declaration//GEN-END:variables
}
