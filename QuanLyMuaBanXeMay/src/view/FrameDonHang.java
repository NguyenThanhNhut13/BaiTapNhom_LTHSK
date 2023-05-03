package view;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import controller.Controller;

import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class FrameDonHang extends JPanel {
	private DefaultTableModel model;
	private JTable table;
	
	public FrameDonHang() {
		setLayout(null);
		
		Controller action = new Controller(this);
		
		JPanel panel_timKiem = new JPanel();
		panel_timKiem.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0110\u01A1n h\u00E0ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_timKiem.setBounds(10, 11, 791, 463);
		add(panel_timKiem);
		panel_timKiem.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 204, 771, 248);
		panel_timKiem.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Arial", Font.PLAIN, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 \u0111\u01A1n h\u00E0ng", "Ng\u00E0y l\u1EADp \u0111\u01A1n h\u00E0ng", "T\u1ED5ng ti\u1EC1n", "Tr\u1EA1ng th\u00E1i", "Ng\u01B0\u1EDDi l\u1EADp", "T\u00EAn kh\u00E1ch h\u00E0ng", "Ghi ch\u00FA"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_locTheoTen = new JPanel();
		panel_locTheoTen.setBorder(new TitledBorder(null, "L\u1ECDc theo t\u00EAn kh\u00E1ch h\u00E0ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_locTheoTen.setBounds(36, 37, 184, 67);
		panel_timKiem.add(panel_locTheoTen);
		panel_locTheoTen.setLayout(null);
		
		JComboBox comboBox_locTheoTen = new JComboBox();
		comboBox_locTheoTen.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBox_locTheoTen.setBounds(28, 21, 127, 22);
		panel_locTheoTen.add(comboBox_locTheoTen);
		
		JPanel panel_locTheoTrangThai = new JPanel();
		panel_locTheoTrangThai.setLayout(null);
		panel_locTheoTrangThai.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "L\u1ECDc theo tr\u1EA1ng th\u00E1i", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_locTheoTrangThai.setBounds(256, 37, 152, 67);
		panel_timKiem.add(panel_locTheoTrangThai);
		
		JComboBox comboBox_locTheoTrangThai = new JComboBox();
		comboBox_locTheoTrangThai.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBox_locTheoTrangThai.setBounds(10, 21, 127, 22);
		panel_locTheoTrangThai.add(comboBox_locTheoTrangThai);
		
		JPanel panel_locTheoTongTien = new JPanel();
		panel_locTheoTongTien.setLayout(null);
		panel_locTheoTongTien.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "L\u1ECDc theo t\u1ED5ng ti\u1EC1n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_locTheoTongTien.setBounds(444, 37, 310, 67);
		panel_timKiem.add(panel_locTheoTongTien);
		
		JLabel lblNewLabel_1_1 = new JLabel("đến");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(148, 26, 28, 14);
		panel_locTheoTongTien.add(lblNewLabel_1_1);
		
		JComboBox comboBox_locTheoTongTien_Start = new JComboBox();
		comboBox_locTheoTongTien_Start.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBox_locTheoTongTien_Start.setBounds(40, 22, 98, 22);
		panel_locTheoTongTien.add(comboBox_locTheoTongTien_Start);
		
		JLabel lblNewLabel_tu = new JLabel("Từ");
		lblNewLabel_tu.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_tu.setBounds(10, 26, 22, 14);
		panel_locTheoTongTien.add(lblNewLabel_tu);
		
		JComboBox comboBox_locTheoTongTien_End = new JComboBox();
		comboBox_locTheoTongTien_End.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBox_locTheoTongTien_End.setBounds(178, 22, 98, 22);
		panel_locTheoTongTien.add(comboBox_locTheoTongTien_End);
		
		JButton btn_loc = new JButton("Lọc");
		btn_loc.setForeground(Color.WHITE);
		btn_loc.setBackground(Color.BLUE);
		btn_loc.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_loc.setBounds(351, 146, 89, 23);
		panel_timKiem.add(btn_loc);
		
		JButton btn_xemChiTiet = new JButton("Xem chi tiết");
		btn_xemChiTiet.addActionListener(action);
		btn_xemChiTiet.setBackground(Color.ORANGE);
		btn_xemChiTiet.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_xemChiTiet.setBounds(211, 485, 93, 23);
		add(btn_xemChiTiet);
		
		JButton btn_inHoaDon = new JButton("In hóa đơn");
		btn_inHoaDon.setBackground(Color.GREEN);
		btn_inHoaDon.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_inHoaDon.setBounds(511, 485, 89, 23);
		add(btn_inHoaDon);
		
		model = new DefaultTableModel();
		
	}
	
	public void thucHienXemChiTiet() {
		FrameChiTietDonHang frameChiTietDonHang = new FrameChiTietDonHang();
		frameChiTietDonHang.setVisible(true);
	}
}
