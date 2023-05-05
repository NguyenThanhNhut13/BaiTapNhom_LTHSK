package view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class FrameKhachHang extends JPanel {
	private JTextField textField_maKhachHang;
	private JTextField textField_tenKhachHang;
	private JTextField textField_diaChi;
	private JTextField textField_soDienThoai;
	private JTextField textField_ngaySinh;
	private JTextField textField_timKiemKhachHang;
	
	private DefaultTableModel modelKhachHang;
	private JTable tableKhachHang;

	public FrameKhachHang() {
		setLayout(null);
		
		JPanel panel_khachHang = new JPanel();
		panel_khachHang.setBounds(10, 11, 795, 177);
		add(panel_khachHang);
		panel_khachHang.setLayout(null);
		panel_khachHang.setBorder(BorderFactory.createTitledBorder("Thông tin khách hàng"));
		
		JLabel lbl_maKhachHang = new JLabel("Mã khách hàng:");
		lbl_maKhachHang.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_maKhachHang.setBounds(10, 32, 81, 13);
		panel_khachHang.add(lbl_maKhachHang);
		
		textField_maKhachHang = new JTextField();
		textField_maKhachHang.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_maKhachHang.setColumns(10);
		textField_maKhachHang.setBounds(96, 28, 280, 20);
		panel_khachHang.add(textField_maKhachHang);
		
		JLabel lbl_tenKhachHang = new JLabel("Tên khách hàng:");
		lbl_tenKhachHang.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_tenKhachHang.setBounds(10, 62, 81, 13);
		panel_khachHang.add(lbl_tenKhachHang);
		
		textField_tenKhachHang = new JTextField();
		textField_tenKhachHang.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_tenKhachHang.setColumns(10);
		textField_tenKhachHang.setBounds(96, 58, 280, 20);
		panel_khachHang.add(textField_tenKhachHang);
		
		JLabel lbl_diaChi = new JLabel("Địa chỉ:");
		lbl_diaChi.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_diaChi.setBounds(10, 89, 81, 14);
		panel_khachHang.add(lbl_diaChi);
		
		textField_diaChi = new JTextField();
		textField_diaChi.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_diaChi.setColumns(10);
		textField_diaChi.setBounds(96, 86, 280, 20);
		panel_khachHang.add(textField_diaChi);
		
		JLabel lbl_soDienThoai = new JLabel("Số điện thoại:");
		lbl_soDienThoai.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_soDienThoai.setBounds(10, 119, 81, 14);
		panel_khachHang.add(lbl_soDienThoai);
		
		textField_soDienThoai = new JTextField();
		textField_soDienThoai.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_soDienThoai.setColumns(10);
		textField_soDienThoai.setBounds(96, 116, 280, 20);
		panel_khachHang.add(textField_soDienThoai);
		
		JLabel lbl_gioiTinh = new JLabel("Giới tính");
		lbl_gioiTinh.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_gioiTinh.setBounds(419, 31, 76, 14);
		panel_khachHang.add(lbl_gioiTinh);
		
		JLabel lbl_ngaySinh = new JLabel("Ng\u00E0y sinh:");
		lbl_ngaySinh.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_ngaySinh.setBounds(419, 61, 76, 14);
		panel_khachHang.add(lbl_ngaySinh);
		
		textField_ngaySinh = new JTextField();
		textField_ngaySinh.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_ngaySinh.setColumns(10);
		textField_ngaySinh.setBounds(505, 58, 280, 20);
		panel_khachHang.add(textField_ngaySinh);
		
		JComboBox comboBox_gioiTinh = new JComboBox();
		comboBox_gioiTinh.setBounds(505, 27, 70, 22);
		panel_khachHang.add(comboBox_gioiTinh);
		
		JPanel panel_table = new JPanel();
		panel_table.setBounds(10, 219, 795, 234);
		add(panel_table);
		panel_table.setLayout(new BorderLayout(0, 0));
		panel_table.setBorder(BorderFactory.createTitledBorder("Danh sách khách hàng"));
		
		modelKhachHang = new DefaultTableModel();
		tableKhachHang = new JTable(modelKhachHang);
		modelKhachHang.addColumn("Mã khách hàng");
		modelKhachHang.addColumn("Tên khách hàng");
		modelKhachHang.addColumn("Giới tính");
		modelKhachHang.addColumn("Địa chỉ");
		modelKhachHang.addColumn("Ngày sinh");
		modelKhachHang.addColumn("Số điện thoại");
		JScrollPane scrollPane = new JScrollPane(tableKhachHang);
		panel_table.add(scrollPane, BorderLayout.CENTER);
		
		JLabel lbl_timKiemKhachHang = new JLabel("Tìm kiếm khách hàng:");
		lbl_timKiemKhachHang.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_timKiemKhachHang.setBounds(31, 477, 120, 14);
		add(lbl_timKiemKhachHang);
		
		textField_timKiemKhachHang = new JTextField();
		textField_timKiemKhachHang.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_timKiemKhachHang.setColumns(10);
		textField_timKiemKhachHang.setBounds(157, 474, 146, 20);
		add(textField_timKiemKhachHang);
		
		
		
		JButton btn_timKhachHang = new JButton("Tìm");
		btn_timKhachHang.setForeground(Color.WHITE);
		btn_timKhachHang.setBackground(Color.BLUE);
		btn_timKhachHang.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_timKhachHang.setBounds(313, 473, 66, 23);
		add(btn_timKhachHang);
		
		JButton btn_themKhachHang = new JButton("Thêm");
		btn_themKhachHang.setBackground(Color.GREEN);
		btn_themKhachHang.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_themKhachHang.setBounds(420, 473, 81, 23);
		add(btn_themKhachHang);
		
		JButton btn_xoaKhachHang = new JButton("Xóa");
		btn_xoaKhachHang.setBackground(Color.RED);
		btn_xoaKhachHang.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_xoaKhachHang.setBounds(511, 473, 81, 23);
		add(btn_xoaKhachHang);
		
		JButton btn_capNhat = new JButton("Cập Nhật");
		btn_capNhat.setBackground(Color.YELLOW);
		btn_capNhat.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_capNhat.setBounds(602, 473, 81, 23);
		add(btn_capNhat);
		
		JButton btn_luu = new JButton("Lưu");
		btn_luu.setBackground(Color.BLUE);
		btn_luu.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_luu.setBounds(692, 473, 81, 23);
		add(btn_luu);

	}
}
