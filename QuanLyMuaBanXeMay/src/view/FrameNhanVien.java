package view;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;

public class FrameNhanVien extends JPanel {
	private JTextField textField_maNhanVien;
	private JTextField textField_tenNhanVien;
	private JTextField textField_diaChiNhanVien;
	private JTextField textField_soDienThoaiNhanVien;
	private JTextField textField_emailNhanVien;
	private JTextField textField_luong;
	private JTextField textField_ghiChu;
	private DefaultTableModel model_nhanVien;
	private JTable table_nhanVien;
	private JTextField textField_timKiemNhanVien;

	/**
	 * Create the panel.
	 */
	public FrameNhanVien() {
		setLayout(null);
		
		JPanel panel_ThongTinNhanVien = new JPanel();
		panel_ThongTinNhanVien.setBounds(10, 11, 791, 171);
		add(panel_ThongTinNhanVien);
		panel_ThongTinNhanVien.setLayout(null);
		panel_ThongTinNhanVien.setBorder(BorderFactory.createTitledBorder("Thông tin nhân viên"));
		
		JLabel lbl_maNhanVien = new JLabel("Mã nhân viên:");
		lbl_maNhanVien.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_maNhanVien.setBounds(10, 22, 81, 13);
		panel_ThongTinNhanVien.add(lbl_maNhanVien);
		
		textField_maNhanVien = new JTextField();
		textField_maNhanVien.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_maNhanVien.setColumns(10);
		textField_maNhanVien.setBounds(96, 18, 280, 20);
		panel_ThongTinNhanVien.add(textField_maNhanVien);
		
		JLabel lbl_tenNhanVien = new JLabel("Tên nhân viên:");
		lbl_tenNhanVien.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_tenNhanVien.setBounds(10, 52, 81, 13);
		panel_ThongTinNhanVien.add(lbl_tenNhanVien);
		
		textField_tenNhanVien = new JTextField();
		textField_tenNhanVien.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_tenNhanVien.setColumns(10);
		textField_tenNhanVien.setBounds(96, 48, 280, 20);
		panel_ThongTinNhanVien.add(textField_tenNhanVien);
		
		JLabel lbl_diaChiNhanVien = new JLabel("Địa chỉ:");
		lbl_diaChiNhanVien.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_diaChiNhanVien.setBounds(10, 82, 81, 14);
		panel_ThongTinNhanVien.add(lbl_diaChiNhanVien);
		
		textField_diaChiNhanVien = new JTextField();
		textField_diaChiNhanVien.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_diaChiNhanVien.setColumns(10);
		textField_diaChiNhanVien.setBounds(96, 79, 280, 20);
		panel_ThongTinNhanVien.add(textField_diaChiNhanVien);
		
		JLabel lbl_soDienThoaiNhanVien = new JLabel("Số điện thoại:");
		lbl_soDienThoaiNhanVien.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_soDienThoaiNhanVien.setBounds(10, 113, 81, 14);
		panel_ThongTinNhanVien.add(lbl_soDienThoaiNhanVien);
		
		textField_soDienThoaiNhanVien = new JTextField();
		textField_soDienThoaiNhanVien.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_soDienThoaiNhanVien.setColumns(10);
		textField_soDienThoaiNhanVien.setBounds(96, 110, 280, 20);
		panel_ThongTinNhanVien.add(textField_soDienThoaiNhanVien);
		
		JLabel lbl_gioiTinhNhanVien = new JLabel("Giới tính");
		lbl_gioiTinhNhanVien.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_gioiTinhNhanVien.setBounds(419, 21, 76, 14);
		panel_ThongTinNhanVien.add(lbl_gioiTinhNhanVien);
		
		JComboBox comboBox_gioiTinhNhanVien = new JComboBox();
		comboBox_gioiTinhNhanVien.setBounds(495, 17, 68, 22);
		panel_ThongTinNhanVien.add(comboBox_gioiTinhNhanVien);
		
		JLabel lbl_ngaySinhNhanVien = new JLabel("Ngày sinh:");
		lbl_ngaySinhNhanVien.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_ngaySinhNhanVien.setBounds(419, 51, 76, 14);
		panel_ThongTinNhanVien.add(lbl_ngaySinhNhanVien);
		
		JLabel lbl_emailNhanVien = new JLabel("Email:");
		lbl_emailNhanVien.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_emailNhanVien.setBounds(419, 82, 76, 14);
		panel_ThongTinNhanVien.add(lbl_emailNhanVien);
		
		textField_emailNhanVien = new JTextField();
		textField_emailNhanVien.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_emailNhanVien.setColumns(10);
		textField_emailNhanVien.setBounds(495, 79, 280, 20);
		panel_ThongTinNhanVien.add(textField_emailNhanVien);
		
		JLabel lbl_chucVu = new JLabel("Chức vụ:");
		lbl_chucVu.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_chucVu.setBounds(419, 113, 76, 14);
		panel_ThongTinNhanVien.add(lbl_chucVu);
		
		JLabel lbl_luong = new JLabel("Lương:");
		lbl_luong.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_luong.setBounds(10, 144, 81, 14);
		panel_ThongTinNhanVien.add(lbl_luong);
		
		textField_luong = new JTextField();
		textField_luong.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_luong.setColumns(10);
		textField_luong.setBounds(96, 141, 280, 20);
		panel_ThongTinNhanVien.add(textField_luong);
		
		JLabel lbl_ghiChu = new JLabel("Ghi chú:");
		lbl_ghiChu.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_ghiChu.setBounds(419, 144, 76, 14);
		panel_ThongTinNhanVien.add(lbl_ghiChu);
		
		textField_ghiChu = new JTextField();
		textField_ghiChu.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_ghiChu.setColumns(10);
		textField_ghiChu.setBounds(495, 141, 280, 20);
		panel_ThongTinNhanVien.add(textField_ghiChu);
		
		JDateChooser dateChooser_ngaySinh = new JDateChooser();
		dateChooser_ngaySinh.setBounds(495, 48, 280, 20);
		panel_ThongTinNhanVien.add(dateChooser_ngaySinh);
		
		JComboBox comboBox_chucVu = new JComboBox();
		comboBox_chucVu.setBounds(495, 109, 68, 22);
		panel_ThongTinNhanVien.add(comboBox_chucVu);
		
		JPanel panel_tableNhanVien = new JPanel();
		panel_tableNhanVien.setBounds(10, 201, 791, 251);
		add(panel_tableNhanVien);
		panel_tableNhanVien.setLayout(new BorderLayout());
		panel_tableNhanVien.setBorder(BorderFactory.createTitledBorder("Danh sách nhân viên"));
		
		model_nhanVien = new DefaultTableModel();
		table_nhanVien = new JTable(model_nhanVien);
		model_nhanVien.addColumn("Mã nhân viên");
		model_nhanVien.addColumn("Họ tên");
		model_nhanVien.addColumn("Giới tính");
		model_nhanVien.addColumn("Ngày sinh");
		model_nhanVien.addColumn("Địa chỉ ");
		model_nhanVien.addColumn("Email");
		model_nhanVien.addColumn("SĐT");
		model_nhanVien.addColumn("Chức vụ");
		model_nhanVien.addColumn("Lương");
		model_nhanVien.addColumn("Ghi chú");
		
		JScrollPane scrollPane = new JScrollPane(table_nhanVien);
		panel_tableNhanVien.add(scrollPane, BorderLayout.CENTER);
		
		JLabel lbl_timKiemNhanVien = new JLabel("Tìm kiếm nhân viên:");
		lbl_timKiemNhanVien.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_timKiemNhanVien.setBounds(39, 477, 101, 14);
		add(lbl_timKiemNhanVien);
		
		textField_timKiemNhanVien = new JTextField();
		textField_timKiemNhanVien.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_timKiemNhanVien.setColumns(10);
		textField_timKiemNhanVien.setBounds(147, 474, 146, 20);
		add(textField_timKiemNhanVien);
		
		JButton btn_timKiemNhanVien = new JButton("Tìm");
		btn_timKiemNhanVien.setForeground(Color.WHITE);
		btn_timKiemNhanVien.setBackground(Color.BLUE);
		btn_timKiemNhanVien.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_timKiemNhanVien.setBounds(313, 473, 66, 23);
		add(btn_timKiemNhanVien);
		
		JButton btn_themNhanVien = new JButton("Thêm");
		btn_themNhanVien.setBackground(Color.GREEN);
		btn_themNhanVien.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_themNhanVien.setBounds(425, 473, 81, 23);
		add(btn_themNhanVien);
		
		JButton btn_xoaNhanVien = new JButton("Xóa");
		btn_xoaNhanVien.setBackground(Color.RED);
		btn_xoaNhanVien.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_xoaNhanVien.setBounds(516, 473, 81, 23);
		add(btn_xoaNhanVien);
		
		JButton btn_capNhatNhanVien = new JButton("Cập Nhật");
		btn_capNhatNhanVien.setBackground(Color.YELLOW);
		btn_capNhatNhanVien.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_capNhatNhanVien.setBounds(607, 473, 81, 23);
		add(btn_capNhatNhanVien);
		
		JButton btn_luu = new JButton("Lưu");
		btn_luu.setBackground(Color.BLUE);
		btn_luu.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_luu.setBounds(697, 473, 81, 23);
		add(btn_luu);
		
		
		

	}
}
