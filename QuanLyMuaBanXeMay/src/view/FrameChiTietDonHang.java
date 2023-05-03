package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.Controller;

import javax.swing.JButton;
import java.awt.Color;

public class FrameChiTietDonHang extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btn_thoat;

	public FrameChiTietDonHang() {
		this.setTitle("Chi tiết đơn hàng");
		this.setSize(700, 500);
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		Controller action = new Controller(this);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_thongTin = new JPanel();
		panel_thongTin.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_thongTin.setBounds(10, 11, 666, 179);
		contentPane.add(panel_thongTin);
		panel_thongTin.setLayout(null);

		JLabel lbl_maDonHang = new JLabel("Mã đơn hàng:");
		lbl_maDonHang.setBounds(10, 15, 108, 17);
		panel_thongTin.add(lbl_maDonHang);
		lbl_maDonHang.setFont(new Font("Arial", Font.PLAIN, 14));

		JLabel lbl_maKhachHang = new JLabel("Mã khách hàng:");
		lbl_maKhachHang.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl_maKhachHang.setBounds(10, 47, 108, 18);
		panel_thongTin.add(lbl_maKhachHang);

		JLabel lbl_maNhanVien = new JLabel("Mã nhân viên:");
		lbl_maNhanVien.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl_maNhanVien.setBounds(10, 80, 108, 18);
		panel_thongTin.add(lbl_maNhanVien);

		JLabel lbl_tongTien = new JLabel("Tổng tiền:");
		lbl_tongTien.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl_tongTien.setBounds(10, 113, 108, 18);
		panel_thongTin.add(lbl_tongTien);

		JLabel lbl_trangThai = new JLabel("Trạng thái:");
		lbl_trangThai.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl_trangThai.setBounds(10, 146, 108, 18);
		panel_thongTin.add(lbl_trangThai);

		JLabel lbl_ngayTaoDonHang = new JLabel("Ngày tạo đơn hàng:");
		lbl_ngayTaoDonHang.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl_ngayTaoDonHang.setBounds(360, 14, 129, 18);
		panel_thongTin.add(lbl_ngayTaoDonHang);

		JLabel lbl_tenKhachHang = new JLabel("Tên khách hàng:");
		lbl_tenKhachHang.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl_tenKhachHang.setBounds(360, 47, 129, 18);
		panel_thongTin.add(lbl_tenKhachHang);

		JLabel lbl_tenNhanVien = new JLabel("Tên nhân viên:");
		lbl_tenNhanVien.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl_tenNhanVien.setBounds(360, 80, 129, 18);
		panel_thongTin.add(lbl_tenNhanVien);

		JLabel lbl_ghiChu = new JLabel("Ghi chú:");
		lbl_ghiChu.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl_ghiChu.setBounds(360, 113, 129, 18);
		panel_thongTin.add(lbl_ghiChu);

		JTextArea textArea_ghiChu = new JTextArea();
		textArea_ghiChu.setFont(new Font("Arial", Font.BOLD, 14));
		textArea_ghiChu.setEditable(false);
		textArea_ghiChu.setBounds(493, 111, 163, 55);
		panel_thongTin.add(textArea_ghiChu);

		JLabel lbl_valueMaDonHang = new JLabel("001");
		lbl_valueMaDonHang.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_valueMaDonHang.setBounds(147, 15, 108, 17);
		panel_thongTin.add(lbl_valueMaDonHang);

		JLabel lbl_valueMaKhachHang = new JLabel("KH01");
		lbl_valueMaKhachHang.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_valueMaKhachHang.setBounds(147, 47, 108, 18);
		panel_thongTin.add(lbl_valueMaKhachHang);

		JLabel lbl_valueMaNhanVien = new JLabel("NV01");
		lbl_valueMaNhanVien.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_valueMaNhanVien.setBounds(147, 80, 108, 18);
		panel_thongTin.add(lbl_valueMaNhanVien);

		JLabel lbl_valueTongTien = new JLabel("1.000.000");
		lbl_valueTongTien.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_valueTongTien.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_valueTongTien.setBounds(147, 113, 98, 18);
		panel_thongTin.add(lbl_valueTongTien);

		JLabel lbl_valueTrangThai = new JLabel("Đã xác nhận");
		lbl_valueTrangThai.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_valueTrangThai.setBounds(147, 146, 108, 18);
		panel_thongTin.add(lbl_valueTrangThai);

		JLabel lbl_tongTienDonVi = new JLabel("VNĐ");
		lbl_tongTienDonVi.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_tongTienDonVi.setBounds(255, 115, 49, 14);
		panel_thongTin.add(lbl_tongTienDonVi);

		JLabel lbl_valueNgayTaoDonHang = new JLabel("May, 1, 2022");
		lbl_valueNgayTaoDonHang.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_valueNgayTaoDonHang.setBounds(498, 14, 158, 18);
		panel_thongTin.add(lbl_valueNgayTaoDonHang);

		JLabel lbl_valueTenKhachHang = new JLabel("Nguyễn Văn A");
		lbl_valueTenKhachHang.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_valueTenKhachHang.setBounds(498, 47, 158, 18);
		panel_thongTin.add(lbl_valueTenKhachHang);

		JLabel lbl_valueTenNhanVien = new JLabel("Bùi Thị C");
		lbl_valueTenNhanVien.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_valueTenNhanVien.setBounds(498, 80, 158, 18);
		panel_thongTin.add(lbl_valueTenNhanVien);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 211, 666, 179);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		table.setFont(new Font("Arial", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "STT", "M\u00E3 s\u1EA3n ph\u1EA9m",
				"T\u00EAn s\u1EA3n ph\u1EA9m", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n gi\u00E1" }));
		table.getColumnModel().getColumn(0).setResizable(false);
		scrollPane.setViewportView(table);

		btn_thoat = new JButton("Thoát");
		btn_thoat.addActionListener(action);
		btn_thoat.setBackground(new Color(255, 0, 0));
		btn_thoat.setFont(new Font("Arial", Font.BOLD, 14));
		btn_thoat.setBounds(550, 417, 89, 23);
		contentPane.add(btn_thoat);
	}

	public JButton getBtn_thoat() {
		return btn_thoat;
	}

	public void setBtn_thoat(JButton btn_thoat) {
		this.btn_thoat = btn_thoat;
	}

	public void thucHienThoat() {
		this.setVisible(false);
	}
}
