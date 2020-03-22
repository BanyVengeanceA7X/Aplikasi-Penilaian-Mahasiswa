package projectppl;

import Inputmatkul.TableMatkul;
import jadwalmatkul.jadwalmatkul;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;

public class app extends javax.swing.JFrame {
    int mouseX;
    int mouseY;
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
    
    public app() {
        initComponents();
        TableMatkul a = new TableMatkul(tablematkul);
        a.getData();
        
    }
    public void lebarKolom(){ 
        TableColumn column;
        tablejadwal.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
      
        column = tablejadwal.getColumnModel().getColumn(0);
        column.setPreferredWidth(150);
        column = tablejadwal.getColumnModel().getColumn(1); 
        column.setPreferredWidth(150); 
        column = tablejadwal.getColumnModel().getColumn(2); 
        column.setPreferredWidth(150); 
        column = tablejadwal.getColumnModel().getColumn(3); 
        column.setPreferredWidth(50); 
        column = tablejadwal.getColumnModel().getColumn(4); 
        column.setPreferredWidth(150); 
        column = tablejadwal.getColumnModel().getColumn(5); 
        column.setPreferredWidth(150); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kepalapanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bariskedua = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Laman = new javax.swing.JPanel();
        laman_matkul = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        text_matkul = new javax.swing.JLabel();
        button_input = new javax.swing.JLabel();
        field_pukul = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        mhs = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        konten_matkul = new javax.swing.JPanel();
        cardlayout_kiri = new javax.swing.JPanel();
        fresh_open = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablematkul = new javax.swing.JTable();
        text_matkul7 = new javax.swing.JLabel();
        cardlayout_kanan = new javax.swing.JPanel();
        card_atas = new javax.swing.JPanel();
        blank = new javax.swing.JPanel();
        laman_input = new javax.swing.JPanel();
        input_kodemk = new javax.swing.JTextField();
        input_kodekelas = new javax.swing.JTextField();
        input_namamk = new javax.swing.JTextField();
        input_sks = new javax.swing.JTextField();
        input_waktu = new javax.swing.JTextField();
        kode_mk = new javax.swing.JLabel();
        field_kdmk = new javax.swing.JLabel();
        kd_kelas = new javax.swing.JLabel();
        field_kdkelas = new javax.swing.JLabel();
        nama_mk = new javax.swing.JLabel();
        field_namamk = new javax.swing.JLabel();
        sks_mk = new javax.swing.JLabel();
        field_sks = new javax.swing.JLabel();
        waktu_mk = new javax.swing.JLabel();
        field_waktu = new javax.swing.JLabel();
        btsave_matkul = new javax.swing.JLabel();
        btcancel_matkul = new javax.swing.JLabel();
        laman_mahasiswa = new javax.swing.JPanel();
        menu1 = new javax.swing.JPanel();
        text_matkul1 = new javax.swing.JLabel();
        button_input1 = new javax.swing.JLabel();
        field_pukul1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        konten_mahasiswa = new javax.swing.JPanel();
        cardlayout_kiri1 = new javax.swing.JPanel();
        fresh_open1 = new javax.swing.JPanel();
        text_matkul2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cardlayout_kanan1 = new javax.swing.JPanel();
        card_atas1 = new javax.swing.JPanel();
        blank1 = new javax.swing.JPanel();
        laman_input1 = new javax.swing.JPanel();
        input_kodemk1 = new javax.swing.JTextField();
        input_kodekelas1 = new javax.swing.JTextField();
        input_waktu1 = new javax.swing.JTextField();
        kode_mk1 = new javax.swing.JLabel();
        field_kdmk1 = new javax.swing.JLabel();
        kd_kelas1 = new javax.swing.JLabel();
        field_kdkelas1 = new javax.swing.JLabel();
        waktu_mk1 = new javax.swing.JLabel();
        field_waktu1 = new javax.swing.JLabel();
        btsave_mhs = new javax.swing.JLabel();
        btsave_nilai = new javax.swing.JLabel();
        waktu_mk2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cbx_komponen1 = new javax.swing.JComboBox<>();
        waktu_mk3 = new javax.swing.JLabel();
        laman_nilai = new javax.swing.JPanel();
        menu2 = new javax.swing.JPanel();
        text_matkul3 = new javax.swing.JLabel();
        button_input2 = new javax.swing.JLabel();
        field_pukul2 = new javax.swing.JLabel();
        konten_mahasiswa1 = new javax.swing.JPanel();
        cardlayout_kiri2 = new javax.swing.JPanel();
        fresh_open2 = new javax.swing.JPanel();
        text_matkul4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        laman_jadwal = new javax.swing.JPanel();
        menu3 = new javax.swing.JPanel();
        text_matkul5 = new javax.swing.JLabel();
        konten_mahasiswa2 = new javax.swing.JPanel();
        cardlayout_kiri3 = new javax.swing.JPanel();
        fresh_open3 = new javax.swing.JPanel();
        text_matkul6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablejadwal = new javax.swing.JTable();
        cardlayout_kanan2 = new javax.swing.JPanel();
        card_atas2 = new javax.swing.JPanel();
        blank2 = new javax.swing.JPanel();
        field_pukul3 = new javax.swing.JLabel();
        laman_input2 = new javax.swing.JPanel();
        input_kodemk2 = new javax.swing.JTextField();
        input_kodekelas2 = new javax.swing.JTextField();
        input_waktu2 = new javax.swing.JTextField();
        kode_mk2 = new javax.swing.JLabel();
        field_kdmk2 = new javax.swing.JLabel();
        kd_kelas2 = new javax.swing.JLabel();
        field_kdkelas2 = new javax.swing.JLabel();
        waktu_mk4 = new javax.swing.JLabel();
        field_waktu2 = new javax.swing.JLabel();
        btsave_mhs1 = new javax.swing.JLabel();
        btsave_nilai1 = new javax.swing.JLabel();
        waktu_mk5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        cbx_komponen2 = new javax.swing.JComboBox<>();
        waktu_mk6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/green.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        kepalapanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 9, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        jLabel7.setText("Aplikasi Penilaian Mahasiswa (ANIMA)");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kepalapanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, 30));

        getContentPane().add(kepalapanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1365, 30));

        bariskedua.setBackground(new java.awt.Color(255, 255, 255));
        bariskedua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/menu_32px.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        jLabel1.setText("Tools Dosen Institut Teknologi Sumatera");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/logoitera.png"))); // NOI18N

        javax.swing.GroupLayout bariskeduaLayout = new javax.swing.GroupLayout(bariskedua);
        bariskedua.setLayout(bariskeduaLayout);
        bariskeduaLayout.setHorizontalGroup(
            bariskeduaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bariskeduaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGroup(bariskeduaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bariskeduaLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6))
                    .addGroup(bariskeduaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(853, Short.MAX_VALUE))
        );
        bariskeduaLayout.setVerticalGroup(
            bariskeduaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bariskeduaLayout.createSequentialGroup()
                .addGroup(bariskeduaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(bariskeduaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        getContentPane().add(bariskedua, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1365, -1));

        Laman.setBackground(new java.awt.Color(250, 250, 250));
        Laman.setLayout(new java.awt.CardLayout());

        laman_matkul.setBackground(new java.awt.Color(250, 250, 250));
        laman_matkul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(255, 255, 255));

        text_matkul.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        text_matkul.setText("Matakuliah");
        text_matkul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button_input.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button input.jpg"))); // NOI18N
        button_input.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_inputMouseClicked(evt);
            }
        });

        field_pukul.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        field_pukul.setText("  PUKUL : ");
        field_pukul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Nilai");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        mhs.setText("Mahasiswa");
        mhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mhsActionPerformed(evt);
            }
        });

        jButton4.setText("Jadwal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_matkul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 495, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(40, 40, 40)
                .addComponent(mhs)
                .addGap(144, 144, 144)
                .addComponent(button_input)
                .addGap(112, 112, 112)
                .addComponent(field_pukul, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(text_matkul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_input, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(field_pukul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(mhs)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        laman_matkul.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, 1365, 60));

        konten_matkul.setBackground(new java.awt.Color(250, 250, 250));
        konten_matkul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardlayout_kiri.setBackground(new java.awt.Color(255, 255, 255));
        cardlayout_kiri.setLayout(new java.awt.CardLayout());

        fresh_open.setBackground(new java.awt.Color(255, 255, 255));
        fresh_open.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Mata Kuliah", "Kode Kelas", "Nama Mata Kuliah", "SKS", "Hari", "Waktu"
            }
        ));
        jScrollPane3.setViewportView(tablematkul);

        text_matkul7.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        text_matkul7.setText("Mata Kuliah  ");
        text_matkul7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        text_matkul7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout fresh_openLayout = new javax.swing.GroupLayout(fresh_open);
        fresh_open.setLayout(fresh_openLayout);
        fresh_openLayout.setHorizontalGroup(
            fresh_openLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fresh_openLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(fresh_openLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_matkul7)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        fresh_openLayout.setVerticalGroup(
            fresh_openLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fresh_openLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(text_matkul7)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        cardlayout_kiri.add(fresh_open, "card2");

        konten_matkul.add(cardlayout_kiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 980, 590));

        cardlayout_kanan.setBackground(new java.awt.Color(255, 255, 255));
        cardlayout_kanan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardlayout_kanan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card_atas.setLayout(new java.awt.CardLayout());

        blank.setBackground(new java.awt.Color(255, 255, 255));
        blank.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        card_atas.add(blank, "card3");

        laman_input.setBackground(new java.awt.Color(255, 255, 255));
        laman_input.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input_kodemk.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_kodemk.setBorder(null);
        laman_input.add(input_kodemk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 18, 150, -1));

        input_kodekelas.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_kodekelas.setBorder(null);
        laman_input.add(input_kodekelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 150, -1));

        input_namamk.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_namamk.setBorder(null);
        laman_input.add(input_namamk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 97, 150, -1));

        input_sks.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_sks.setBorder(null);
        laman_input.add(input_sks, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 137, 150, 20));

        input_waktu.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_waktu.setBorder(null);
        laman_input.add(input_waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 173, 150, -1));

        kode_mk.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        kode_mk.setText("Kode Matakuliah :");
        laman_input.add(kode_mk, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 15, -1, -1));

        field_kdmk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input.add(field_kdmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 14, -1, -1));

        kd_kelas.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        kd_kelas.setText("Kode Kelas         :");
        laman_input.add(kd_kelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 57, -1, -1));

        field_kdkelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input.add(field_kdkelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 56, -1, -1));

        nama_mk.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        nama_mk.setText("Nama Matakuliah :");
        laman_input.add(nama_mk, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 94, -1, -1));

        field_namamk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input.add(field_namamk, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 94, -1, -1));

        sks_mk.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        sks_mk.setText("SKS                   :");
        laman_input.add(sks_mk, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 132, -1, -1));

        field_sks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input.add(field_sks, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 132, -1, -1));

        waktu_mk.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        waktu_mk.setText("Waktu                :");
        laman_input.add(waktu_mk, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 169, -1, -1));

        field_waktu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input.add(field_waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 169, -1, -1));

        btsave_matkul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button save.png"))); // NOI18N
        btsave_matkul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btsave_matkul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btsave_matkulMouseClicked(evt);
            }
        });
        laman_input.add(btsave_matkul, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        btcancel_matkul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button cancel1.png"))); // NOI18N
        btcancel_matkul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btcancel_matkul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcancel_matkulMouseClicked(evt);
            }
        });
        laman_input.add(btcancel_matkul, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        card_atas.add(laman_input, "card2");

        cardlayout_kanan.add(card_atas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 360, 330));

        konten_matkul.add(cardlayout_kanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 365, 590));

        laman_matkul.add(konten_matkul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1365, 670));

        Laman.add(laman_matkul, "card2");

        laman_mahasiswa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        field_pukul1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        field_pukul1.setText("  PUKUL : ");
        field_pukul1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        field_pukul1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field_pukul1MouseClicked(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_matkul1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 633, Short.MAX_VALUE)
                .addComponent(button_input1)
                .addGap(112, 112, 112)
                .addComponent(field_pukul1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1)
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(button_input1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(field_pukul1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(text_matkul1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addContainerGap())
        );

        laman_mahasiswa.add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1365, 70));

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "Hari", "Kode MK", "Kode Kelas", "Mata Kuliah", "SKS", "Tugas Besar"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout fresh_open1Layout = new javax.swing.GroupLayout(fresh_open1);
        fresh_open1.setLayout(fresh_open1Layout);
        fresh_open1Layout.setHorizontalGroup(
            fresh_open1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fresh_open1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(fresh_open1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_matkul2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        fresh_open1Layout.setVerticalGroup(
            fresh_open1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fresh_open1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(text_matkul2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
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

        input_kodemk1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_kodemk1.setBorder(null);
        laman_input1.add(input_kodemk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 18, 150, -1));

        input_kodekelas1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_kodekelas1.setBorder(null);
        laman_input1.add(input_kodekelas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 150, -1));

        input_waktu1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_waktu1.setBorder(null);
        input_waktu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_waktu1ActionPerformed(evt);
            }
        });
        laman_input1.add(input_waktu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 150, -1));

        kode_mk1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        kode_mk1.setText("Nama       :");
        laman_input1.add(kode_mk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        field_kdmk1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input1.add(field_kdmk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 14, -1, -1));

        kd_kelas1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        kd_kelas1.setText("NIM          :");
        laman_input1.add(kd_kelas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        field_kdkelas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input1.add(field_kdkelas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 56, -1, -1));

        waktu_mk1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        waktu_mk1.setText("Komponen :");
        laman_input1.add(waktu_mk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        field_waktu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input1.add(field_waktu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, 40));

        btsave_mhs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button save.png"))); // NOI18N
        btsave_mhs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btsave_mhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btsave_mhsMouseClicked(evt);
            }
        });
        laman_input1.add(btsave_mhs, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        btsave_nilai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button save.png"))); // NOI18N
        btsave_nilai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btsave_nilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btsave_nilaiMouseClicked(evt);
            }
        });
        laman_input1.add(btsave_nilai, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        waktu_mk2.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        waktu_mk2.setText("Nilai          :");
        laman_input1.add(waktu_mk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));
        laman_input1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 360, 10));

        cbx_komponen1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Komponen", "Item 2", "Item 3", "Item 4" }));
        cbx_komponen1.setOpaque(false);
        cbx_komponen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_komponen1ActionPerformed(evt);
            }
        });
        laman_input1.add(cbx_komponen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 120, 30));

        waktu_mk3.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        waktu_mk3.setText("NIM           :");
        laman_input1.add(waktu_mk3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        card_atas1.add(laman_input1, "card2");

        cardlayout_kanan1.add(card_atas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 360, 510));

        konten_mahasiswa.add(cardlayout_kanan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 365, 590));

        laman_mahasiswa.add(konten_mahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1365, 670));

        Laman.add(laman_mahasiswa, "card3");

        laman_nilai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu2.setBackground(new java.awt.Color(255, 255, 255));

        text_matkul3.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        text_matkul3.setText("Matakuliah");
        text_matkul3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button_input2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button input.jpg"))); // NOI18N
        button_input2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_input2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_input2MouseClicked(evt);
            }
        });

        field_pukul2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        field_pukul2.setText("  PUKUL : ");
        field_pukul2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        field_pukul2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field_pukul2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menu2Layout = new javax.swing.GroupLayout(menu2);
        menu2.setLayout(menu2Layout);
        menu2Layout.setHorizontalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_matkul3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 898, Short.MAX_VALUE)
                .addComponent(button_input2)
                .addGap(112, 112, 112)
                .addComponent(field_pukul2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu2Layout.setVerticalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(text_matkul3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_input2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(field_pukul2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        laman_nilai.add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, 1365, 60));

        konten_mahasiswa1.setBackground(new java.awt.Color(250, 250, 250));
        konten_mahasiswa1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardlayout_kiri2.setBackground(new java.awt.Color(255, 255, 255));
        cardlayout_kiri2.setLayout(new java.awt.CardLayout());

        fresh_open2.setBackground(new java.awt.Color(255, 255, 255));
        fresh_open2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        text_matkul4.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        text_matkul4.setText("Daftar Mahasiswa");
        text_matkul4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        text_matkul4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Tugas", "Kuis", "Praktikum", "Tugas Besar", "UTS", "UAS", "Nilai Akhir", "Grade"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton2.setText("PRINT");

        jButton3.setText("GRAFIK");

        javax.swing.GroupLayout fresh_open2Layout = new javax.swing.GroupLayout(fresh_open2);
        fresh_open2.setLayout(fresh_open2Layout);
        fresh_open2Layout.setHorizontalGroup(
            fresh_open2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fresh_open2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(fresh_open2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fresh_open2Layout.createSequentialGroup()
                        .addComponent(text_matkul4)
                        .addContainerGap(1089, Short.MAX_VALUE))
                    .addGroup(fresh_open2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(fresh_open2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(40, 40, 40))))
        );
        fresh_open2Layout.setVerticalGroup(
            fresh_open2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fresh_open2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(text_matkul4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fresh_open2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fresh_open2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fresh_open2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        cardlayout_kiri2.add(fresh_open2, "card2");

        konten_mahasiswa1.add(cardlayout_kiri2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1340, 590));

        laman_nilai.add(konten_mahasiswa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1365, 670));

        Laman.add(laman_nilai, "card3");

        laman_jadwal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        laman_jadwal.add(menu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, 1365, 60));

        konten_mahasiswa2.setBackground(new java.awt.Color(250, 250, 250));
        konten_mahasiswa2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardlayout_kiri3.setBackground(new java.awt.Color(255, 255, 255));
        cardlayout_kiri3.setLayout(new java.awt.CardLayout());

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
                .addGroup(fresh_open3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_matkul6)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        fresh_open3Layout.setVerticalGroup(
            fresh_open3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fresh_open3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(text_matkul6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        cardlayout_kiri3.add(fresh_open3, "card2");

        konten_mahasiswa2.add(cardlayout_kiri3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 980, 590));

        cardlayout_kanan2.setBackground(new java.awt.Color(255, 255, 255));
        cardlayout_kanan2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardlayout_kanan2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card_atas2.setLayout(new java.awt.CardLayout());

        blank2.setBackground(new java.awt.Color(255, 255, 255));
        blank2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        field_pukul3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        field_pukul3.setText("  PUKUL : ");
        field_pukul3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        field_pukul3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field_pukul3MouseClicked(evt);
            }
        });
        blank2.add(field_pukul3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 157, 30));

        card_atas2.add(blank2, "card3");

        laman_input2.setBackground(new java.awt.Color(255, 255, 255));
        laman_input2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input_kodemk2.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_kodemk2.setBorder(null);
        laman_input2.add(input_kodemk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 18, 150, -1));

        input_kodekelas2.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_kodekelas2.setBorder(null);
        laman_input2.add(input_kodekelas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 150, -1));

        input_waktu2.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_waktu2.setBorder(null);
        input_waktu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_waktu2ActionPerformed(evt);
            }
        });
        laman_input2.add(input_waktu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 150, -1));

        kode_mk2.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        kode_mk2.setText("Nama       :");
        laman_input2.add(kode_mk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        field_kdmk2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input2.add(field_kdmk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 14, -1, -1));

        kd_kelas2.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        kd_kelas2.setText("NIM          :");
        laman_input2.add(kd_kelas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        field_kdkelas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input2.add(field_kdkelas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 56, -1, -1));

        waktu_mk4.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        waktu_mk4.setText("Komponen :");
        laman_input2.add(waktu_mk4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        field_waktu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/textfield1.jpg"))); // NOI18N
        laman_input2.add(field_waktu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, 40));

        btsave_mhs1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button save.png"))); // NOI18N
        btsave_mhs1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btsave_mhs1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btsave_mhs1MouseClicked(evt);
            }
        });
        laman_input2.add(btsave_mhs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        btsave_nilai1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_laman_mk/button save.png"))); // NOI18N
        btsave_nilai1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btsave_nilai1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btsave_nilai1MouseClicked(evt);
            }
        });
        laman_input2.add(btsave_nilai1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        waktu_mk5.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        waktu_mk5.setText("Nilai          :");
        laman_input2.add(waktu_mk5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));
        laman_input2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 360, 10));

        cbx_komponen2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Komponen", "Item 2", "Item 3", "Item 4" }));
        cbx_komponen2.setOpaque(false);
        cbx_komponen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_komponen2ActionPerformed(evt);
            }
        });
        laman_input2.add(cbx_komponen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 120, 30));

        waktu_mk6.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        waktu_mk6.setText("NIM           :");
        laman_input2.add(waktu_mk6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        card_atas2.add(laman_input2, "card2");

        cardlayout_kanan2.add(card_atas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 360, 510));

        konten_mahasiswa2.add(cardlayout_kanan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1035, 0, 330, 590));

        laman_jadwal.add(konten_mahasiswa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1365, 670));

        Laman.add(laman_jadwal, "card3");

        getContentPane().add(Laman, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1365, 680));

        setSize(new java.awt.Dimension(1366, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        JOptionPane.showMessageDialog(rootPane, "Untuk saat ini, fitur tersebut belum dapat digunakan", "warning", 0);

    }//GEN-LAST:event_jLabel4MouseClicked

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
        laman_input.setVisible(true);
        btcancel_matkul.setVisible(true);
        btsave_matkul.setVisible(true);
    }//GEN-LAST:event_button_inputMouseClicked

    private void btsave_matkulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsave_matkulMouseClicked
        //blank_bawah.setVisible(false);
      //  bawah.setVisible(true);
        btcancel_matkul.setVisible(false);
        btsave_matkul.setVisible(false);
    }//GEN-LAST:event_btsave_matkulMouseClicked

    private void btcancel_matkulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcancel_matkulMouseClicked
        laman_input.setVisible(false);
    //    bawah.setVisible(false);
    }//GEN-LAST:event_btcancel_matkulMouseClicked

    private void button_input1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_input1MouseClicked
        blank1.setVisible(false);
        laman_input1.setVisible(true);
      //  btsave_mhs.setVisible(false);
    }//GEN-LAST:event_button_input1MouseClicked

    private void btsave_mhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsave_mhsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btsave_mhsMouseClicked

    private void mhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mhsActionPerformed
        laman_matkul.setVisible(false);
        laman_mahasiswa.setVisible(true);
        
        setModel();
        jComboBox1.setModel(model);
    }//GEN-LAST:event_mhsActionPerformed

    private void field_pukul1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field_pukul1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_field_pukul1MouseClicked

    private void input_waktu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_waktu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_waktu1ActionPerformed

    private void btsave_nilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsave_nilaiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btsave_nilaiMouseClicked

    private void cbx_komponen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_komponen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_komponen1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        laman_matkul.setVisible(false);
        laman_nilai.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button_input2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_input2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_button_input2MouseClicked

    private void field_pukul2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field_pukul2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_field_pukul2MouseClicked

    private void field_pukul3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field_pukul3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_field_pukul3MouseClicked

    private void input_waktu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_waktu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_waktu2ActionPerformed

    private void btsave_mhs1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsave_mhs1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btsave_mhs1MouseClicked

    private void btsave_nilai1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsave_nilai1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btsave_nilai1MouseClicked

    private void cbx_komponen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_komponen2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_komponen2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        laman_matkul.setVisible(false);
        laman_mahasiswa.setVisible(false);
        laman_jadwal.setVisible(true);
        jadwalmatkul a = new jadwalmatkul(tablejadwal);
        lebarKolom();
        a.getData();
    }//GEN-LAST:event_jButton4ActionPerformed
    public final void setModel(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/anima"; //disesuaikan
            String user="root";//disesuaikan
            String pass="";//disesuaikan
            Connection koneksi = DriverManager.getConnection(url,user,pass);

            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery("select nama_mk from matakuliah");
            while(rs.next()){
                model.addElement(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println("gagal");
        }
    }
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Laman;
    private javax.swing.JPanel bariskedua;
    private javax.swing.JPanel blank;
    private javax.swing.JPanel blank1;
    private javax.swing.JPanel blank2;
    private javax.swing.JLabel btcancel_matkul;
    private javax.swing.JLabel btsave_matkul;
    private javax.swing.JLabel btsave_mhs;
    private javax.swing.JLabel btsave_mhs1;
    private javax.swing.JLabel btsave_nilai;
    private javax.swing.JLabel btsave_nilai1;
    private javax.swing.JLabel button_input;
    private javax.swing.JLabel button_input1;
    private javax.swing.JLabel button_input2;
    private javax.swing.JPanel card_atas;
    private javax.swing.JPanel card_atas1;
    private javax.swing.JPanel card_atas2;
    private javax.swing.JPanel cardlayout_kanan;
    private javax.swing.JPanel cardlayout_kanan1;
    private javax.swing.JPanel cardlayout_kanan2;
    private javax.swing.JPanel cardlayout_kiri;
    private javax.swing.JPanel cardlayout_kiri1;
    private javax.swing.JPanel cardlayout_kiri2;
    private javax.swing.JPanel cardlayout_kiri3;
    private javax.swing.JComboBox<String> cbx_komponen1;
    private javax.swing.JComboBox<String> cbx_komponen2;
    private javax.swing.JLabel field_kdkelas;
    private javax.swing.JLabel field_kdkelas1;
    private javax.swing.JLabel field_kdkelas2;
    private javax.swing.JLabel field_kdmk;
    private javax.swing.JLabel field_kdmk1;
    private javax.swing.JLabel field_kdmk2;
    private javax.swing.JLabel field_namamk;
    private javax.swing.JLabel field_pukul;
    private javax.swing.JLabel field_pukul1;
    private javax.swing.JLabel field_pukul2;
    private javax.swing.JLabel field_pukul3;
    private javax.swing.JLabel field_sks;
    private javax.swing.JLabel field_waktu;
    private javax.swing.JLabel field_waktu1;
    private javax.swing.JLabel field_waktu2;
    private javax.swing.JPanel fresh_open;
    private javax.swing.JPanel fresh_open1;
    private javax.swing.JPanel fresh_open2;
    private javax.swing.JPanel fresh_open3;
    private javax.swing.JTextField input_kodekelas;
    private javax.swing.JTextField input_kodekelas1;
    private javax.swing.JTextField input_kodekelas2;
    private javax.swing.JTextField input_kodemk;
    private javax.swing.JTextField input_kodemk1;
    private javax.swing.JTextField input_kodemk2;
    private javax.swing.JTextField input_namamk;
    private javax.swing.JTextField input_sks;
    private javax.swing.JTextField input_waktu;
    private javax.swing.JTextField input_waktu1;
    private javax.swing.JTextField input_waktu2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel kd_kelas;
    private javax.swing.JLabel kd_kelas1;
    private javax.swing.JLabel kd_kelas2;
    private javax.swing.JPanel kepalapanel;
    private javax.swing.JLabel kode_mk;
    private javax.swing.JLabel kode_mk1;
    private javax.swing.JLabel kode_mk2;
    private javax.swing.JPanel konten_mahasiswa;
    private javax.swing.JPanel konten_mahasiswa1;
    private javax.swing.JPanel konten_mahasiswa2;
    private javax.swing.JPanel konten_matkul;
    private javax.swing.JPanel laman_input;
    private javax.swing.JPanel laman_input1;
    private javax.swing.JPanel laman_input2;
    private javax.swing.JPanel laman_jadwal;
    private javax.swing.JPanel laman_mahasiswa;
    private javax.swing.JPanel laman_matkul;
    private javax.swing.JPanel laman_nilai;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menu1;
    private javax.swing.JPanel menu2;
    private javax.swing.JPanel menu3;
    private javax.swing.JButton mhs;
    private javax.swing.JLabel nama_mk;
    private javax.swing.JLabel sks_mk;
    private javax.swing.JTable tablejadwal;
    private javax.swing.JTable tablematkul;
    private javax.swing.JLabel text_matkul;
    private javax.swing.JLabel text_matkul1;
    private javax.swing.JLabel text_matkul2;
    private javax.swing.JLabel text_matkul3;
    private javax.swing.JLabel text_matkul4;
    private javax.swing.JLabel text_matkul5;
    private javax.swing.JLabel text_matkul6;
    private javax.swing.JLabel text_matkul7;
    private javax.swing.JLabel waktu_mk;
    private javax.swing.JLabel waktu_mk1;
    private javax.swing.JLabel waktu_mk2;
    private javax.swing.JLabel waktu_mk3;
    private javax.swing.JLabel waktu_mk4;
    private javax.swing.JLabel waktu_mk5;
    private javax.swing.JLabel waktu_mk6;
    // End of variables declaration//GEN-END:variables
}
