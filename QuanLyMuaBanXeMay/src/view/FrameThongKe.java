package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.MatteBorder;

public class FrameThongKe extends JPanel {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;

	public FrameThongKe() {
		setLayout(null);
		
		JPanel panel_doanhThu = new JPanel();
		panel_doanhThu.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_doanhThu.setBounds(6, 11, 195, 115);
		add(panel_doanhThu);
		panel_doanhThu.setLayout(null);
		
		JLabel lbl_doanhThu = new JLabel("Doanh Thu");
		lbl_doanhThu.setIcon(new ImageIcon(FrameThongKe.class.getResource("/img/doanhThu.png")));
		lbl_doanhThu.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_doanhThu.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_doanhThu.setBounds(23, 11, 149, 32);
		panel_doanhThu.add(lbl_doanhThu);
		
		JLabel lbl_valueDoanhThu = new JLabel("12.500.000");
		lbl_valueDoanhThu.setForeground(Color.GREEN);
		lbl_valueDoanhThu.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_valueDoanhThu.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_valueDoanhThu.setBounds(18, 54, 159, 25);
		panel_doanhThu.add(lbl_valueDoanhThu);
		
		JLabel lbl_donViDoanhThu = new JLabel("VNĐ");
		lbl_donViDoanhThu.setForeground(Color.GREEN);
		lbl_donViDoanhThu.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_donViDoanhThu.setBounds(146, 78, 49, 14);
		panel_doanhThu.add(lbl_donViDoanhThu);
		
		JPanel panel_soDonHang = new JPanel();
		panel_soDonHang.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_soDonHang.setLayout(null);
		panel_soDonHang.setBounds(207, 11, 195, 115);
		add(panel_soDonHang);
		
		JLabel lbl_soDonHang = new JLabel("Số đơn hàng");
		lbl_soDonHang.setIcon(new ImageIcon(FrameThongKe.class.getResource("/img/tongDonHang.png")));
		lbl_soDonHang.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_soDonHang.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_soDonHang.setBounds(14, 11, 166, 32);
		panel_soDonHang.add(lbl_soDonHang);
		
		JLabel lbl_valueSoDonHang = new JLabel("96");
		lbl_valueSoDonHang.setForeground(Color.GREEN);
		lbl_valueSoDonHang.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_valueSoDonHang.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_valueSoDonHang.setBounds(18, 54, 159, 25);
		panel_soDonHang.add(lbl_valueSoDonHang);
		
		JPanel panel_donHangDaHuy = new JPanel();
		panel_donHangDaHuy.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_donHangDaHuy.setLayout(null);
		panel_donHangDaHuy.setBounds(408, 11, 195, 115);
		add(panel_donHangDaHuy);
		
		JLabel lbl_donHangDaHuy = new JLabel("Đã hủy");
		lbl_donHangDaHuy.setIcon(new ImageIcon(FrameThongKe.class.getResource("/img/donHangDaHuy.png")));
		lbl_donHangDaHuy.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_donHangDaHuy.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_donHangDaHuy.setBounds(23, 11, 149, 32);
		panel_donHangDaHuy.add(lbl_donHangDaHuy);
		
		JLabel lbl_valueDonHangDaHuy = new JLabel("69");
		lbl_valueDonHangDaHuy.setForeground(Color.RED);
		lbl_valueDonHangDaHuy.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_valueDonHangDaHuy.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_valueDonHangDaHuy.setBounds(18, 54, 159, 25);
		panel_donHangDaHuy.add(lbl_valueDonHangDaHuy);
		
		JPanel panel_khachHang = new JPanel();
		panel_khachHang.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_khachHang.setLayout(null);
		panel_khachHang.setBounds(609, 11, 192, 115);
		add(panel_khachHang);
		
		JLabel lbl_khachHang = new JLabel("Khách hàng");
		lbl_khachHang.setIcon(new ImageIcon(FrameThongKe.class.getResource("/img/khachHangDaMua.png")));
		lbl_khachHang.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_khachHang.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_khachHang.setBounds(21, 11, 149, 32);
		panel_khachHang.add(lbl_khachHang);
		
		JLabel lbl_valueKhachHang = new JLabel("21");
		lbl_valueKhachHang.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_valueKhachHang.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_valueKhachHang.setBounds(16, 54, 159, 25);
		panel_khachHang.add(lbl_valueKhachHang);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(6, 291, 795, 212);
		add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_3.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setFont(new Font("Arial", Font.PLAIN, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 s\u1EA3n ph\u1EA9m", "T\u00EAn s\u1EA3n ph\u1EA9m", "Lo\u1EA1i", "Ng\u00E0y b\u00E1n", "S\u1ED1 l\u01B0\u1EE3ng t\u1ED3n", "\u0110\u01A1n gi\u00E1", "S\u1ED1 l\u01B0\u1EE3ng b\u00E1n"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_locTheoDieuKien = new JPanel();
		panel_locTheoDieuKien.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_locTheoDieuKien.setBounds(6, 137, 304, 140);
		add(panel_locTheoDieuKien);
		panel_locTheoDieuKien.setLayout(null);
		
		JRadioButton rdbtn_tatCa = new JRadioButton("Tất cả");
		rdbtn_tatCa.setBounds(22, 17, 111, 23);
		panel_locTheoDieuKien.add(rdbtn_tatCa);
		rdbtn_tatCa.setFont(new Font("Arial", Font.PLAIN, 11));
		buttonGroup.add(rdbtn_tatCa);
		
		JRadioButton rdbtn_theoQuy = new JRadioButton("Theo quý");
		rdbtn_theoQuy.setBounds(22, 55, 111, 23);
		panel_locTheoDieuKien.add(rdbtn_theoQuy);
		rdbtn_theoQuy.setFont(new Font("Arial", Font.PLAIN, 11));
		buttonGroup.add(rdbtn_theoQuy);
		
		JRadioButton rdbtn_theoNam = new JRadioButton("Theo năm");
		rdbtn_theoNam.setBounds(22, 91, 111, 23);
		panel_locTheoDieuKien.add(rdbtn_theoNam);
		rdbtn_theoNam.setFont(new Font("Arial", Font.PLAIN, 11));
		buttonGroup.add(rdbtn_theoNam);
		
		JComboBox comboBox_theoQuy = new JComboBox();
		comboBox_theoQuy.setBounds(151, 55, 63, 22);
		panel_locTheoDieuKien.add(comboBox_theoQuy);
		comboBox_theoQuy.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JComboBox comboBox_theoNam = new JComboBox();
		comboBox_theoNam.setBounds(151, 91, 63, 22);
		panel_locTheoDieuKien.add(comboBox_theoNam);
		comboBox_theoNam.setFont(new Font("Arial", Font.PLAIN, 11));
		
	}
}
