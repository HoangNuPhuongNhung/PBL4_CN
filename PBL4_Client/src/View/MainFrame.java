
package View;

import Controller.DAOhd;
import Controller.DAOnv;
import Controller.DAOsp;
import Controller.socketConnect;
import Model.M_Hoadon;
import Model.M_Nhanvien;
import Model.M_Sanpham;
import java.util.List;
import java.net.Socket;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

    private List<M_Nhanvien> nhanvien;
    private List<M_Hoadon> hoadon;
    private List<M_Sanpham> sanpham;
    private DefaultTableModel Model;
    private DefaultTableModel ModelHD;
    private DefaultTableModel ModelSP;
    private DefaultTableModel ModelSP2;
    
    int selectedIndexsp;
    int selectedIndexsp2;
    int selectedIndex;
    
    public MainFrame() {
        initComponents();
        this.Show();
             
        this.setLocationRelativeTo(null);
        Model=(DefaultTableModel)tableInfor.getModel();  //nhanvien
        ModelHD=(DefaultTableModel)tableHoadon.getModel();
        ModelSP=(DefaultTableModel)TableSP.getModel();
        ModelSP2=(DefaultTableModel)TableSP2.getModel();
        
        showTableNV();
        showTableHD();
        showTableSP();
        showTableSP2();
        
    }
      public void Show(){
        panelContainer.setVisible(true);
        panelDonhang.setVisible(false);
        panelNhanvien.setVisible(false);
        pnSanpham.setVisible(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        sidepanel = new javax.swing.JPanel();
        btnNhanvien = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnSanpham = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btnDonhang = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        btStart = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panelContainer = new javax.swing.JPanel();
        pnSanpham = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtTensp2 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtSoluong2 = new javax.swing.JTextField();
        txtGia2 = new javax.swing.JTextField();
        txtMasp2 = new javax.swing.JTextField();
        comboboxLoai2 = new javax.swing.JComboBox<>();
        btUpdateSP = new javax.swing.JButton();
        btDelSP = new javax.swing.JButton();
        btResetSP = new javax.swing.JButton();
        btTimSP = new javax.swing.JButton();
        btAddSP = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableSP2 = new javax.swing.JTable();
        panelDonhang = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtTenkh = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        txtDateOrder = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtTensp = new javax.swing.JTextField();
        txtMasp = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtSoluong = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        comboboxLoai = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCTSP = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableSP = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableHoadon = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel36 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnaddSp = new javax.swing.JButton();
        btnaddHD = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        panelNhanvien = new javax.swing.JPanel();
        pnThongTin = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtluong = new javax.swing.JTextField();
        txtngaysinh = new com.toedter.calendar.JDateChooser();
        txtchucvu = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtManv = new javax.swing.JTextField();
        txtTennv = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtdiachi = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        btReset = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        txtgioitinh = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInfor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepanel.setBackground(new java.awt.Color(54, 33, 89));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNhanvien.setBackground(new java.awt.Color(85, 65, 118));
        btnNhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNhanvienMouseClicked(evt);
            }
        });
        btnNhanvien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NHÂN VIÊN");
        btnNhanvien.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 170, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/employee.png"))); // NOI18N
        btnNhanvien.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 60));

        sidepanel.add(btnNhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 290, 70));

        btnSanpham.setBackground(new java.awt.Color(85, 65, 118));
        btnSanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSanphamMouseClicked(evt);
            }
        });
        btnSanpham.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("SẢN PHẨM");
        btnSanpham.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 140, -1));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/gift.png"))); // NOI18N
        btnSanpham.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 70));

        sidepanel.add(btnSanpham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 290, 60));

        btnDonhang.setBackground(new java.awt.Color(85, 65, 118));
        btnDonhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDonhangMouseClicked(evt);
            }
        });
        btnDonhang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ĐƠN HÀNG");
        btnDonhang.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 140, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/clipboard.png"))); // NOI18N
        btnDonhang.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 60));

        sidepanel.add(btnDonhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 290, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PORT:");
        sidepanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 60, 30));

        txtPort.setBackground(new java.awt.Color(54, 33, 89));
        txtPort.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPort.setForeground(new java.awt.Color(255, 255, 255));
        txtPort.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        sidepanel.add(txtPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 80, 40));

        btStart.setBackground(new java.awt.Color(54, 33, 89));
        btStart.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btStart.setForeground(new java.awt.Color(255, 255, 255));
        btStart.setText("START");
        btStart.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStartActionPerformed(evt);
            }
        });
        sidepanel.add(btStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 90, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/client (1).png"))); // NOI18N
        sidepanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 140, 130));

        jPanel3.add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 800));

        panelContainer.setBackground(new java.awt.Color(204, 204, 255));
        panelContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnSanpham.setBackground(new java.awt.Color(204, 204, 255));
        pnSanpham.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 33, 89), 2, true), "Thông tin sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(54, 33, 89))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(54, 33, 89));
        jLabel28.setText("Tên sản phẩm");

        txtTensp2.setToolTipText("");
        txtTensp2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 33, 89), 1, true));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(54, 33, 89));
        jLabel29.setText("Mã sản phẩm");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(54, 33, 89));
        jLabel30.setText("Số lượng");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(54, 33, 89));
        jLabel31.setText("Giá");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(54, 33, 89));
        jLabel32.setText("Loại");

        txtSoluong2.setToolTipText("");
        txtSoluong2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 33, 89), 1, true));

        txtGia2.setToolTipText("");
        txtGia2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 33, 89), 1, true));

        txtMasp2.setToolTipText("");
        txtMasp2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 33, 89), 1, true));

        comboboxLoai2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T-Shirt", "Hoodie", "Sweater", "Short", "Jean", " " }));
        comboboxLoai2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)));

        btUpdateSP.setBackground(new java.awt.Color(54, 33, 89));
        btUpdateSP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btUpdateSP.setForeground(new java.awt.Color(255, 255, 255));
        btUpdateSP.setText("SỬA");
        btUpdateSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateSPActionPerformed(evt);
            }
        });

        btDelSP.setBackground(new java.awt.Color(54, 33, 89));
        btDelSP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btDelSP.setForeground(new java.awt.Color(255, 255, 255));
        btDelSP.setText("XÓA");
        btDelSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelSPActionPerformed(evt);
            }
        });

        btResetSP.setBackground(new java.awt.Color(54, 33, 89));
        btResetSP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResetSP.setForeground(new java.awt.Color(255, 255, 255));
        btResetSP.setText("RESET");
        btResetSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetSPActionPerformed(evt);
            }
        });

        btTimSP.setBackground(new java.awt.Color(54, 33, 89));
        btTimSP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btTimSP.setForeground(new java.awt.Color(255, 255, 255));
        btTimSP.setText("TÌM KIẾM");
        btTimSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimSPActionPerformed(evt);
            }
        });

        btAddSP.setBackground(new java.awt.Color(54, 33, 89));
        btAddSP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btAddSP.setForeground(new java.awt.Color(255, 255, 255));
        btAddSP.setText("THÊM");
        btAddSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btAddSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btResetSP, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btTimSP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 35, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSoluong2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtGia2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboboxLoai2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTensp2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMasp2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btAddSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btUpdateSP, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btDelSP, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMasp2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTensp2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboboxLoai2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoluong2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGia2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btUpdateSP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelSP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAddSP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btResetSP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTimSP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pnSanpham.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 400, 750));

        TableSP2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã sản phẩm", "Tên sản phẩm", "Loại", "Số lượng", "Giá"
            }
        ));
        TableSP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableSP2MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TableSP2);

        pnSanpham.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 780, 750));

        panelContainer.add(pnSanpham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 790));

        panelDonhang.setBackground(new java.awt.Color(204, 204, 255));
        panelDonhang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 33, 89), 2, true));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Số điện thoại");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Đơn hàng");

        txtSDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSDT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)));

        txtTenkh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenkh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Địa chỉ");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Ngày đặt");

        txtDiachi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDiachi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)));

        txtDateOrder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 33, 89), 1, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDateOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtTenkh, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        panelDonhang.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 560, 140));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 33, 89), 2, true));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Tên sản phẩm");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Mã sản phẩm");

        txtTensp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTensp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)));

        txtMasp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMasp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Loại");

        txtSoluong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSoluong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Số lượng");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Giá");

        txtGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtGia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)));

        comboboxLoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboboxLoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)));
        comboboxLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxLoaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtMasp, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboboxLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtTensp, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboboxLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        panelDonhang.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 610, -1));

        tableCTSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mã sản phẩm", "Số lượng", "Giá"
            }
        ));
        jScrollPane2.setViewportView(tableCTSP);

        panelDonhang.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 600, 240));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(54, 33, 89));
        jLabel24.setText("CHI TIẾT SẢN PHẨM ĐỂ BÁN");
        panelDonhang.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 250, 30));

        TableSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mã sản phẩm", "Tên sản phẩm", "Loại ", "Số lượng", "Giá"
            }
        ));
        TableSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableSPMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableSP);

        panelDonhang.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 600, 280));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(54, 33, 89));
        jLabel25.setText("BẢNG SẢN PHẨM");
        panelDonhang.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 180, 20));

        tableHoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Ngày đặt", "Thành tiền"
            }
        ));
        jScrollPane4.setViewportView(tableHoadon);

        panelDonhang.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 550, 280));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setText("Mã sản phẩm");
        panelDonhang.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 690, -1, -1));

        jTextField13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)));
        panelDonhang.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 690, 151, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setText("Ngày đặt");
        panelDonhang.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 710, 70, 20));

        jTextField14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)));
        panelDonhang.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 730, 151, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setText("Tên sản phẩm");
        panelDonhang.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 730, 99, 24));

        jDateChooser2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 33, 89), 1, true));
        panelDonhang.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 710, 151, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(54, 33, 89));
        jLabel36.setText("BẢNG HÓA ĐƠN");
        panelDonhang.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 170, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        btnaddSp.setBackground(new java.awt.Color(54, 33, 89));
        btnaddSp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnaddSp.setForeground(new java.awt.Color(255, 255, 255));
        btnaddSp.setText("THÊM SẢN PHẨM\n");

        btnaddHD.setBackground(new java.awt.Color(54, 33, 89));
        btnaddHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnaddHD.setForeground(new java.awt.Color(255, 255, 255));
        btnaddHD.setText("THÊM HÓA ĐƠN");
        btnaddHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddHDActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(54, 33, 89));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("LƯU");

        btnXoa.setBackground(new java.awt.Color(54, 33, 89));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("XÓA HÓA ĐƠN");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnaddHD, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnaddSp, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaddHD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnaddSp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelDonhang.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 480, 120));

        panelContainer.add(panelDonhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 800));

        panelNhanvien.setBackground(new java.awt.Color(204, 204, 255));
        panelNhanvien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnThongTin.setBackground(new java.awt.Color(204, 204, 255));
        pnThongTin.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 33, 89), 2, true), " Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(54, 33, 89))); // NOI18N
        pnThongTin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Mã nhân viên");
        pnThongTin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Lương");
        pnThongTin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 73, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Ngày sinh");
        pnThongTin.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        txtluong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)));
        txtluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtluongActionPerformed(evt);
            }
        });
        pnThongTin.add(txtluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 220, 30));

        txtngaysinh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 33, 89), 1, true));
        pnThongTin.add(txtngaysinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 180, 30));

        txtchucvu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtchucvu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bán hàng", "Bảo vệ", "Quản lí", " ", " ", " " }));
        txtchucvu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)));
        pnThongTin.add(txtchucvu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 170, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Chức vụ");
        pnThongTin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 90, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("Họ tên");
        pnThongTin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 62, -1));

        txtManv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)));
        txtManv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManvActionPerformed(evt);
            }
        });
        pnThongTin.add(txtManv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 220, 30));

        txtTennv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)));
        txtTennv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTennvActionPerformed(evt);
            }
        });
        pnThongTin.add(txtTennv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 220, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setText("Giới tính");
        pnThongTin.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 73, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setText("Địa chỉ");
        pnThongTin.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 73, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setText("Email");
        pnThongTin.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 73, -1));

        txtdiachi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)));
        txtdiachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiachiActionPerformed(evt);
            }
        });
        pnThongTin.add(txtdiachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 220, 30));

        txtemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        pnThongTin.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 220, 30));

        btReset.setBackground(new java.awt.Color(54, 33, 89));
        btReset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btReset.setForeground(new java.awt.Color(255, 255, 255));
        btReset.setText("RESET");
        btReset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });
        pnThongTin.add(btReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 680, 100, 40));

        btnAdd.setBackground(new java.awt.Color(54, 33, 89));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("THÊM");
        btnAdd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        pnThongTin.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 100, 40));

        btUpdate.setBackground(new java.awt.Color(54, 33, 89));
        btUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btUpdate.setText("SỬA");
        btUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });
        pnThongTin.add(btUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 620, 100, 40));

        btnFind.setBackground(new java.awt.Color(54, 33, 89));
        btnFind.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFind.setForeground(new java.awt.Color(255, 255, 255));
        btnFind.setText("TÌM KIẾM");
        btnFind.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        pnThongTin.add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, 110, 40));

        txtgioitinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtgioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", " " }));
        txtgioitinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)));
        pnThongTin.add(txtgioitinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 170, 30));

        btnDelete.setBackground(new java.awt.Color(54, 33, 89));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("XÓA");
        btnDelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnThongTin.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 620, 100, 40));

        panelNhanvien.add(pnThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 360, 770));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        tableInfor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã nhân viên", "Họ tên", "Chức vụ", "Ngày sinh", "Giới tính", "Địa chỉ", "Email", "Lương"
            }
        ));
        tableInfor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableInforMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableInfor);
        if (tableInfor.getColumnModel().getColumnCount() > 0) {
            tableInfor.getColumnModel().getColumn(8).setResizable(false);
        }

        panelNhanvien.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 830, 770));

        panelContainer.add(panelNhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 1450));

        jPanel3.add(panelContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1210, 800));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//Jpanel show:
    private void btnNhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanvienMouseClicked
        panelNhanvien.setVisible(true);
        panelDonhang.setVisible(false);
        pnSanpham.setVisible(false);
    }//GEN-LAST:event_btnNhanvienMouseClicked

    private void txtluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtluongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtluongActionPerformed

    private void btStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStartActionPerformed
        socketConnect obj = new socketConnect();
        obj.connectSocket(Integer.parseInt(txtPort.getText()));
    }//GEN-LAST:event_btStartActionPerformed

    private void txtManvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManvActionPerformed

    private void txtTennvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTennvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTennvActionPerformed

    private void txtdiachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiachiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiachiActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    //BUTTON TÌM KIÊM:
    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String Name=txtTennv.getText();
        if(Name.length()>0){
            nhanvien=new DAOnv().findbyName(Name);
            Model.setRowCount(0);
        for(M_Nhanvien nv:nhanvien){
            Model.addRow(new Object[]{
            tableInfor.getRowCount()+1,nv.getManv(),nv.getTennv(),nv.getChucvu(),nv.getDate(),nv.getGt(),nv.getDiachi(),nv.getEmail(),nv.getLuong()
        });
        }
        }
    }//GEN-LAST:event_btnFindActionPerformed
   
    //BUTTON THÊM NV:
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        M_Nhanvien nv=new M_Nhanvien();
        nv.setManv(txtManv.getText());
        nv.setTennv(txtTennv.getText());
        nv.setChucvu(txtchucvu.getSelectedItem().toString());
        nv.setDate(txtngaysinh.getDate());
        nv.setGt(txtgioitinh.getSelectedItem().toString());
        nv.setDiachi(txtdiachi.getText());
        nv.setEmail(txtemail.getText());
        boolean isOK=true;
        try{
            nv.setLuong(Integer.parseInt(txtluong.getText()));
     
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Là số không phải là kí tự");
            isOK=false;
        }
        if(isOK){
            new DAOnv().AddNV(nv);
            showTableNV();
            JOptionPane.showMessageDialog(this, "Them thanh cong");
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        txtManv.setText("");
        txtTennv.setText("");
        txtchucvu.setSelectedIndex(0);
        txtngaysinh.setDate(null);
        txtgioitinh.setSelectedIndex(0);
        txtdiachi.setText("");
        txtemail.setText("");
        txtluong.setText("");
        showTableNV();
    }//GEN-LAST:event_btResetActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       selectedIndex=tableInfor.getSelectedRow();
       M_Nhanvien nv= nhanvien.get(selectedIndex);
       JOptionPane.showConfirmDialog(this,"Bạn có chắc muốn xóa");
       new DAOnv().DeleteNV(nv.getId());
       showTableNV();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        selectedIndex=tableInfor.getSelectedRow();
        M_Nhanvien n= nhanvien.get(selectedIndex);
        new DAOnv().DeleteNV(n.getId());
        if(nhanvien.isEmpty()){
            JOptionPane.showMessageDialog(this, "Không có dữ liệu để sửa");
        }
        else if(selectedIndex==-1){
            JOptionPane.showMessageDialog(this, "Hãy chọn 1 dòng để sửa");
        }
        else{
        M_Nhanvien nv=new M_Nhanvien();
        nv.setManv(txtManv.getText());
        nv.setTennv(txtTennv.getText());
        nv.setChucvu(txtchucvu.getSelectedItem().toString());
        nv.setDate(txtngaysinh.getDate());
        nv.setGt(txtgioitinh.getSelectedItem().toString());
        nv.setDiachi(txtdiachi.getText());
        nv.setEmail(txtemail.getText());
        boolean isOK=true;
        try{
            nv.setLuong(Integer.parseInt(txtluong.getText()));
     
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Là số không phải là kí tự");
            isOK=false;
        }
        if(isOK){
            new DAOnv().AddNV(nv);
            showTableNV();
            JOptionPane.showMessageDialog(this, "Sửa thành công");
        }
        }
    }//GEN-LAST:event_btUpdateActionPerformed

    private void tableInforMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableInforMouseClicked
        selectedIndex=tableInfor.getSelectedRow();
        M_Nhanvien nv=nhanvien.get(selectedIndex);
        txtManv.setText(nv.getManv());
        txtTennv.setText(nv.getTennv());
        txtdiachi.setText(nv.getDiachi());
        txtchucvu.setSelectedItem(nv.getChucvu());
        txtgioitinh.setSelectedItem(nv.getGt());
        txtngaysinh.setDate(nv.getDate());
        txtemail.setText(nv.getEmail());
        txtluong.setText(nv.getLuong()+"");
    }//GEN-LAST:event_tableInforMouseClicked

    private void btnDonhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDonhangMouseClicked
        panelNhanvien.setVisible(false);
        panelDonhang.setVisible(true);
        pnSanpham.setVisible(false);
        
    }//GEN-LAST:event_btnDonhangMouseClicked

    private void btnSanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSanphamMouseClicked
        panelNhanvien.setVisible(false);
        panelDonhang.setVisible(false);
        pnSanpham.setVisible(true);
        
    }//GEN-LAST:event_btnSanphamMouseClicked

    private void btnaddHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddHDActionPerformed
//        txtTenkh.setText("");
//        txtDiachi.setText("");
//        txtSDT.setText("");
//        txtDateOrder.setDate(date);
        
    }//GEN-LAST:event_btnaddHDActionPerformed

    private void TableSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableSPMouseClicked
        selectedIndexsp=TableSP.getSelectedRow();
        M_Sanpham sp=sanpham.get(selectedIndexsp);
        txtMasp.setText(sp.getMasp());
        txtTensp.setText(sp.getTensp());
        comboboxLoai.setText(sp.getLoai());
        txtGia.setText(sp.getGia()+"");
        txtSoluong.setText(sp.getSoluong()+"");
    }//GEN-LAST:event_TableSPMouseClicked

    private void btUpdateSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateSPActionPerformed
        selectedIndexsp2=TableSP2.getSelectedRow();
        M_Sanpham s=sanpham.get(selectedIndexsp2);
        new DAOsp().DeleteSP(s.getId());
        if(sanpham.isEmpty()){
            JOptionPane.showMessageDialog(this, "Không có dữ liệu để sửa");
        }
        else if(selectedIndex==-1){
            JOptionPane.showMessageDialog(this, "Hãy chọn 1 dòng để sửa");
        }
        else{
            M_Sanpham sp=new M_Sanpham();
            sp.setMasp(txtMasp2.getText());
            sp.setTensp(txtTensp2.getText());
            sp.setLoai(comboboxLoai2.getSelectedItem().toString());
            boolean isOK2=true;
            try {
                sp.setSoluong(Integer.parseInt(txtSoluong2.getText()));
                sp.setGia(Integer.parseInt(txtGia2.getText()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Là số không phải là kí tự");
                isOK2=false;
            }if(isOK2){
                new DAOsp().AddSP(sp);
                showTableSP2();
                showTableSP();
                JOptionPane.showMessageDialog(this, "Sửa thành công");
            }
        }
    }//GEN-LAST:event_btUpdateSPActionPerformed

    private void btAddSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddSPActionPerformed
        M_Sanpham sp=new M_Sanpham();
        sp.setMasp(txtMasp2.getText());
        sp.setTensp(txtTensp2.getText());
        sp.setLoai(comboboxLoai2.getSelectedItem().toString());
        sp.setSoluong(Integer.parseInt(txtSoluong2.getText()));
        boolean isOK2=true;
        try {
            String soluongText = txtSoluong2.getText();
            String giaText = txtGia2.getText();
            if (soluongText.isEmpty() || giaText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập giá trị số");
                return; // Thoát khỏi phương thức để không thực hiện các lệnh tiếp theo
            }
            int soluong = Integer.parseInt(soluongText);
            int gia = Integer.parseInt(giaText);

            sp.setSoluong(soluong);
            sp.setGia(gia);
        } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(this, "Vui lòng nhập giá trị số hợp lệ");
        }
        if(isOK2){
            new DAOsp().AddSP(sp);
            showTableSP2();
            showTableSP();
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        }
    }//GEN-LAST:event_btAddSPActionPerformed

    private void TableSP2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableSP2MouseClicked
        selectedIndexsp2=TableSP2.getSelectedRow();
        M_Sanpham sp=sanpham.get(selectedIndexsp2);
        txtMasp2.setText(sp.getMasp());
        txtTensp2.setText(sp.getTensp());
        comboboxLoai2.setSelectedItem(sp.getLoai());
        txtGia2.setText(sp.getGia()+"");
        txtSoluong2.setText(sp.getSoluong()+"");
    }//GEN-LAST:event_TableSP2MouseClicked

    private void btDelSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelSPActionPerformed

       selectedIndexsp2=TableSP2.getSelectedRow();
       M_Sanpham sp=sanpham.get(selectedIndex);
       JOptionPane.showConfirmDialog(this,"Bạn có chắc muốn xóa");
       new DAOsp().DeleteSP(sp.getId());
       showTableSP2();
       showTableSP();
       
    }//GEN-LAST:event_btDelSPActionPerformed

    private void btTimSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimSPActionPerformed
        String Masp=txtMasp2.getText();
        if(Masp.length()>0){
            sanpham=new DAOsp().findbyMasp(Masp);
            ModelSP2.setRowCount(0);
        for(M_Sanpham sp:sanpham){
           ModelSP2.addRow(new Object[]{
                TableSP2.getRowCount()+1,sp.getMasp(),sp.getTensp(),sp.getLoai(),sp.getSoluong(),sp.getGia()
            });
        }
        }
    }//GEN-LAST:event_btTimSPActionPerformed

    private void btResetSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetSPActionPerformed
        txtMasp2.setText("");
        txtTensp2.setText("");
        comboboxLoai2.setSelectedIndex(0);
        txtSoluong2.setText("");
        txtGia2.setText("");
        showTableSP2();
    }//GEN-LAST:event_btResetSPActionPerformed

    private void comboboxLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxLoaiActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableSP;
    private javax.swing.JTable TableSP2;
    private javax.swing.JButton btAddSP;
    private javax.swing.JButton btDelSP;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btResetSP;
    private javax.swing.JButton btStart;
    private javax.swing.JButton btTimSP;
    private javax.swing.JButton btUpdate;
    private javax.swing.JButton btUpdateSP;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JPanel btnDonhang;
    private javax.swing.JButton btnFind;
    private javax.swing.JPanel btnNhanvien;
    private javax.swing.JPanel btnSanpham;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnaddHD;
    private javax.swing.JButton btnaddSp;
    private javax.swing.JTextField comboboxLoai;
    private javax.swing.JComboBox<String> comboboxLoai2;
    private com.toedter.calendar.JDateChooser jDateChooser2;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JPanel panelContainer;
    private javax.swing.JPanel panelDonhang;
    private javax.swing.JPanel panelNhanvien;
    private javax.swing.JPanel pnSanpham;
    private javax.swing.JPanel pnThongTin;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JTable tableCTSP;
    private javax.swing.JTable tableHoadon;
    private javax.swing.JTable tableInfor;
    private com.toedter.calendar.JDateChooser txtDateOrder;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtGia2;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtMasp;
    private javax.swing.JTextField txtMasp2;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtSoluong2;
    private javax.swing.JTextField txtTenkh;
    private javax.swing.JTextField txtTennv;
    private javax.swing.JTextField txtTensp;
    private javax.swing.JTextField txtTensp2;
    private javax.swing.JComboBox<String> txtchucvu;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtemail;
    private javax.swing.JComboBox<String> txtgioitinh;
    private javax.swing.JTextField txtluong;
    private com.toedter.calendar.JDateChooser txtngaysinh;
    // End of variables declaration//GEN-END:variables

    private void showTableNV() {
        nhanvien=new DAOnv().getListNV();
        Model.setRowCount(0);
        for(M_Nhanvien nv:nhanvien){
            Model.addRow(new Object[]{
            tableInfor.getRowCount()+1,nv.getManv(),nv.getTennv(),nv.getChucvu(),nv.getDate(),nv.getGt(),nv.getDiachi(),nv.getEmail(),nv.getLuong()
        });
        }
    }
    private void showTableHD() {
        hoadon=new DAOhd().getListHD();
        ModelHD.setRowCount(0);
        for(M_Hoadon hd:hoadon){
            ModelHD.addRow(new Object[]{
                tableHoadon.getRowCount()+1,hd.getDateOrder(),hd.getThanhtien()
            });
        }
    }
//bên bảng đơn hàng:
    private void showTableSP() {
        sanpham=new DAOsp().getListSP();
        ModelSP.setRowCount(0);
        for(M_Sanpham sp:sanpham){
            ModelSP.addRow(new Object[]{
                TableSP.getRowCount()+1,sp.getMasp(),sp.getTensp(),sp.getLoai(),sp.getSoluong(),sp.getGia()
            });
        }
    }   
//bên bảng sản phẩm:
    private void showTableSP2() {
        sanpham=new DAOsp().getListSP();
        ModelSP2.setRowCount(0);
        for(M_Sanpham sp:sanpham){
            ModelSP2.addRow(new Object[]{
                TableSP2.getRowCount()+1,sp.getMasp(),sp.getTensp(),sp.getLoai(),sp.getSoluong(),sp.getGia()
            });
        }
    }

}
