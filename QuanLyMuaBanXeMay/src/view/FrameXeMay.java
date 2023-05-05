package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class FrameXeMay extends JPanel {
	private JTextField textField_maXe;
	private JTextField textField;
	private JTextField textField_namSx;
	private JTextField textField_dungTich;
	private JTextField textField_gia;
	private DefaultTableModel model;
	private JTable table;
	private JTextField textField_timKiemXe;
	private JTextField textField_hangXe;
	private JTextField textField_mauXe;
	private JTextField textField_loaiXe;

	public FrameXeMay() {
		setBounds(100, 100, 811, 520);
		this.setLayout(null);
		
		JPanel panel_thongTin = new JPanel();
		panel_thongTin.setBorder(BorderFactory.createTitledBorder("Thông tin xe"));
		panel_thongTin.setBounds(10, 11, 795, 211);
		add(panel_thongTin);
		panel_thongTin.setLayout(null);
		
		textField_maXe = new JTextField();
		textField_maXe.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_maXe.setBounds(96, 18, 280, 20);
		panel_thongTin.add(textField_maXe);
		textField_maXe.setColumns(10);
		
		JLabel lbl_maXe = new JLabel("Mã xe:");
		lbl_maXe.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_maXe.setBounds(20, 21, 59, 14);
		panel_thongTin.add(lbl_maXe);
		
		JLabel lbl_tenXe = new JLabel("Tên xe:");
		lbl_tenXe.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_tenXe.setBounds(20, 53, 37, 14);
		panel_thongTin.add(lbl_tenXe);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 11));
		textField.setColumns(10);
		textField.setBounds(96, 50, 280, 20);
		panel_thongTin.add(textField);
		
		JLabel lbl_hangXe = new JLabel("Hãng xe:");
		lbl_hangXe.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_hangXe.setBounds(20, 85, 44, 14);
		panel_thongTin.add(lbl_hangXe);
		
		JLabel lbl_mauXe = new JLabel("Màu xe:");
		lbl_mauXe.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_mauXe.setBounds(20, 180, 44, 14);
		panel_thongTin.add(lbl_mauXe);
		
		JLabel lbl_namSx = new JLabel("Năm sản xuất:");
		lbl_namSx.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_namSx.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_namSx.setBounds(20, 148, 76, 14);
		panel_thongTin.add(lbl_namSx);
		
		textField_namSx = new JTextField();
		textField_namSx.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_namSx.setColumns(10);
		textField_namSx.setBounds(96, 145, 280, 20);
		panel_thongTin.add(textField_namSx);
		
		JLabel lbl_gia = new JLabel("Giá:");
		lbl_gia.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_gia.setBounds(431, 21, 33, 14);
		panel_thongTin.add(lbl_gia);
		
		JLabel lbl_loaiXe = new JLabel("Loại xe:");
		lbl_loaiXe.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_loaiXe.setBounds(431, 53, 44, 14);
		panel_thongTin.add(lbl_loaiXe);
		
		JLabel lbl_anhXe = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().createImage(FrameXeMay.class.getResource("/img/Exciter_150_2019.png"))));
		lbl_anhXe.setBounds(503, 76, 280, 114);
		panel_thongTin.add(lbl_anhXe);
		
		JLabel lbl_dungTich = new JLabel("Dung tích:");
		lbl_dungTich.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_dungTich.setBounds(20, 117, 51, 13);
		panel_thongTin.add(lbl_dungTich);
		
		textField_dungTich = new JTextField();
		textField_dungTich.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_dungTich.setColumns(10);
		textField_dungTich.setBounds(96, 113, 280, 20);
		panel_thongTin.add(textField_dungTich);
		
		textField_gia = new JTextField();
		textField_gia.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_gia.setColumns(10);
		textField_gia.setBounds(503, 18, 280, 20);
		panel_thongTin.add(textField_gia);
		
		JLabel lbl_loaiXe_1 = new JLabel("Ảnh xe:");
		lbl_loaiXe_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_loaiXe_1.setBounds(431, 116, 44, 14);
		panel_thongTin.add(lbl_loaiXe_1);
		
		textField_hangXe = new JTextField();
		textField_hangXe.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_hangXe.setColumns(10);
		textField_hangXe.setBounds(96, 82, 280, 20);
		panel_thongTin.add(textField_hangXe);
		
		textField_mauXe = new JTextField();
		textField_mauXe.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_mauXe.setColumns(10);
		textField_mauXe.setBounds(96, 177, 280, 20);
		panel_thongTin.add(textField_mauXe);
		
		textField_loaiXe = new JTextField();
		textField_loaiXe.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_loaiXe.setColumns(10);
		textField_loaiXe.setBounds(503, 50, 280, 20);
		panel_thongTin.add(textField_loaiXe);
		
		JPanel panel_table = new JPanel();
		panel_table.setBorder(BorderFactory.createTitledBorder("Danh sách xe"));
		panel_table.setBounds(10, 225, 795, 246);
		add(panel_table);
		panel_table.setLayout(new BorderLayout());
		
		model = new DefaultTableModel();
		table = new JTable(model);
		model.addColumn("Mã xe");
		model.addColumn("Tên xe");
		model.addColumn("Hãng xe");
		model.addColumn("Dung tích");
		model.addColumn("Năm sản xuất");
		model.addColumn("Màu xe");
		model.addColumn("Giá");
		model.addColumn("Loại xe");

		JScrollPane scrollPane = new JScrollPane(table);
		panel_table.add(scrollPane, BorderLayout.CENTER);
		
		JButton btn_themXe = new JButton("Thêm");
		btn_themXe.setBackground(Color.GREEN);
		btn_themXe.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_themXe.setBounds(428, 482, 63, 23);
		add(btn_themXe);
		
		JButton btn_capNhatXe = new JButton("Cập Nhật");
		btn_capNhatXe.setBackground(Color.YELLOW);
		btn_capNhatXe.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_capNhatXe.setBounds(608, 482, 83, 23);
		add(btn_capNhatXe);
		
		JButton btn_xoaXe = new JButton("Xóa");
		btn_xoaXe.setBackground(Color.RED);
		btn_xoaXe.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_xoaXe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_xoaXe.setBounds(523, 482, 53, 23);
		add(btn_xoaXe);
		
		JButton btn_luuXe = new JButton("Lưu");
		btn_luuXe.setBackground(Color.BLUE);
		btn_luuXe.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_luuXe.setBounds(723, 482, 53, 23);
		add(btn_luuXe);
		
		JLabel lbl_timKiemXe = new JLabel("Tìm kiếm xe:");
		lbl_timKiemXe.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_timKiemXe.setBounds(32, 486, 72, 14);
		add(lbl_timKiemXe);
		
		textField_timKiemXe = new JTextField();
		textField_timKiemXe.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_timKiemXe.setColumns(10);
		textField_timKiemXe.setBounds(114, 483, 146, 20);
		add(textField_timKiemXe);
		
		JButton btn_timKiemXe = new JButton("Tìm");
		btn_timKiemXe.setForeground(Color.WHITE);
		btn_timKiemXe.setBackground(Color.BLUE);
		btn_timKiemXe.setFont(new Font("Arial", Font.PLAIN, 11));
		btn_timKiemXe.setBounds(282, 482, 53, 23);
		add(btn_timKiemXe);
		this.setVisible(true);
	}
}
