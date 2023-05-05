package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextArea;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameBanHang extends JPanel {
	private DefaultTableModel model;
	private JTable table;
	private DefaultTableModel model_gioHang;
	private JTable table_gioHang;
	private JTextField textField_timKiemSanPham;
	private JTextField textField_maDonHang;
	private JTextField textField_ghiChu;


	public FrameBanHang() {
		setLayout(null);
		
		model = new DefaultTableModel();
		model.addColumn("Mã sản phẩm");
		model.addColumn("Tên sản phẩm");
		model.addColumn("Hãng sản xuất");
		model.addColumn("Dung tích");
		model.addColumn("Năm sản xuất");
		model.addColumn("Màu sắc");
		model.addColumn("Giá");
		model.addColumn("Loại xe");
		
		JButton btn_xoaSanPham = new JButton("Xóa sản phẩm");
		btn_xoaSanPham.setForeground(Color.WHITE);
		btn_xoaSanPham.setBackground(Color.RED);
		btn_xoaSanPham.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_xoaSanPham.setBounds(553, 183, 109, 23);
		add(btn_xoaSanPham);
		
		JButton btn_capNhatDonHang = new JButton("Cập Nhật");
		btn_capNhatDonHang.setBackground(Color.YELLOW);
		btn_capNhatDonHang.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_capNhatDonHang.setBounds(672, 183, 109, 23);
		add(btn_capNhatDonHang);
		
		JButton btn_luuSanPham = new JButton("Lưu");
		btn_luuSanPham.setBackground(Color.BLUE);
		btn_luuSanPham.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_luuSanPham.setBounds(676, 217, 105, 23);
		add(btn_luuSanPham);
		
		JPanel panel_thongTinDonHang = new JPanel();
		panel_thongTinDonHang.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Th\u00F4ng tin \u0111\u01A1n h\u00E0ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_thongTinDonHang.setBounds(10, 11, 791, 116);
		add(panel_thongTinDonHang);
		panel_thongTinDonHang.setLayout(null);
		
		JLabel lbl_maDonHang = new JLabel("Mã đơn hàng:");
		lbl_maDonHang.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_maDonHang.setBounds(28, 22, 95, 14);
		panel_thongTinDonHang.add(lbl_maDonHang);
		
		textField_maDonHang = new JTextField();
		textField_maDonHang.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_maDonHang.setColumns(10);
		textField_maDonHang.setBounds(127, 19, 210, 19);
		panel_thongTinDonHang.add(textField_maDonHang);
		
		JLabel lbl_maKhachHang = new JLabel("Mã khách hàng:");
		lbl_maKhachHang.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_maKhachHang.setBounds(28, 86, 95, 14);
		panel_thongTinDonHang.add(lbl_maKhachHang);
		
		JComboBox comboBox_maKhachHang = new JComboBox();
		comboBox_maKhachHang.setBounds(127, 82, 105, 22);
		panel_thongTinDonHang.add(comboBox_maKhachHang);
		
		JLabel lbl_ngayTaoDonHang = new JLabel("Ngày tạo:");
		lbl_ngayTaoDonHang.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_ngayTaoDonHang.setBounds(433, 22, 87, 14);
		panel_thongTinDonHang.add(lbl_ngayTaoDonHang);
		
		JLabel lbl_tongTien = new JLabel("Tổng tiền:");
		lbl_tongTien.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_tongTien.setBounds(433, 54, 54, 14);
		panel_thongTinDonHang.add(lbl_tongTien);
		
		JLabel lbl_ghiChu = new JLabel("Ghi chú:");
		lbl_ghiChu.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_ghiChu.setBounds(433, 86, 45, 14);
		panel_thongTinDonHang.add(lbl_ghiChu);
		
		JLabel lbl_maNhanVien = new JLabel("Mã nhân viên:");
		lbl_maNhanVien.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_maNhanVien.setBounds(28, 54, 95, 14);
		panel_thongTinDonHang.add(lbl_maNhanVien);
		
		JComboBox comboBox_maNhanVien = new JComboBox();
		comboBox_maNhanVien.setBounds(127, 50, 105, 22);
		panel_thongTinDonHang.add(comboBox_maNhanVien);
		
		JDateChooser dateChooser_ngayTaoDonHang = new JDateChooser();
		dateChooser_ngayTaoDonHang.getCalendarButton().setFont(new Font("Arial", Font.PLAIN, 11));
		dateChooser_ngayTaoDonHang.setBounds(530, 19, 211, 20);
		panel_thongTinDonHang.add(dateChooser_ngayTaoDonHang);
		
		JLabel lblTongTien = new JLabel("0");
		lblTongTien.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTongTien.setBounds(531, 51, 210, 20);
		panel_thongTinDonHang.add(lblTongTien);
		
		textField_ghiChu = new JTextField();
		textField_ghiChu.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_ghiChu.setColumns(10);
		textField_ghiChu.setBounds(531, 83, 210, 20);
		panel_thongTinDonHang.add(textField_ghiChu);
		
		JPanel panel_gioHang = new JPanel();
		panel_gioHang.setLayout(null);
		panel_gioHang.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Giỏ hàng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_gioHang.setBounds(10, 133, 533, 148);
		add(panel_gioHang);
		
		model_gioHang = new DefaultTableModel();
		table_gioHang = new JTable(model_gioHang);
		model_gioHang.addColumn("Mã sản phẩm");
		model_gioHang.addColumn("Tên sản phẩm");
		model_gioHang.addColumn("Đơn giá");
		model_gioHang.addColumn("Số lượng");
		
		JScrollPane scrollPane_gioHang = new JScrollPane(table_gioHang);
		scrollPane_gioHang.setBounds(10, 17, 513, 120);
		panel_gioHang.add(scrollPane_gioHang);
		
		JButton btn_xoaTatCa = new JButton("Xóa tất cả");
		btn_xoaTatCa.setBackground(Color.RED);
		btn_xoaTatCa.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_xoaTatCa.setBounds(553, 217, 109, 23);
		add(btn_xoaTatCa);
		
		JPanel panel_danhSachSanPham = new JPanel();
		panel_danhSachSanPham.setBorder(new TitledBorder(null, "Danh sách sản phẩm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_danhSachSanPham.setBounds(10, 282, 791, 231);
		add(panel_danhSachSanPham);
		panel_danhSachSanPham.setLayout(null);
		table = new JTable(model);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 52, 771, 168);
		panel_danhSachSanPham.add(scrollPane);
		
		JLabel lbl_timKiemSanPham = new JLabel("Tìm kiếm sản phẩm:");
		lbl_timKiemSanPham.setBounds(66, 25, 107, 14);
		panel_danhSachSanPham.add(lbl_timKiemSanPham);
		lbl_timKiemSanPham.setFont(new Font("Arial", Font.PLAIN, 11));
		
		textField_timKiemSanPham = new JTextField();
		textField_timKiemSanPham.setBounds(183, 22, 146, 20);
		panel_danhSachSanPham.add(textField_timKiemSanPham);
		textField_timKiemSanPham.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_timKiemSanPham.setColumns(10);
		
		JButton btn_timKiemSanPham = new JButton("Tìm");
		btn_timKiemSanPham.setForeground(Color.WHITE);
		btn_timKiemSanPham.setBackground(Color.BLUE);
		btn_timKiemSanPham.setBounds(339, 21, 53, 23);
		panel_danhSachSanPham.add(btn_timKiemSanPham);
		btn_timKiemSanPham.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JButton btn_themSanPham = new JButton("Thêm vào giỏ hàng");
		btn_themSanPham.setBackground(Color.GREEN);
		btn_themSanPham.setBounds(510, 21, 135, 23);
		panel_danhSachSanPham.add(btn_themSanPham);
		btn_themSanPham.setFont(new Font("Arial", Font.PLAIN, 11));

	}
	
	
}
