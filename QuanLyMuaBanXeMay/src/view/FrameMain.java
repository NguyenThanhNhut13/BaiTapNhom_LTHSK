package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.Controller;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Label;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;

public class FrameMain extends JFrame {
	public FrameDangNhap frameDangNhap;
	public JPanel panel_chucNang;
	public JTabbedPane tabbedPane_chucNang;
	private FrameNhanVien frameNhanVien;
	
	public FrameMain() throws Exception {
		getContentPane().setBackground(SystemColor.window);
		this.init();
	}

	private void init() throws Exception {
		this.setTitle("Quản lý mua bán xe máy - Nhóm 1");
		this.setSize(1000, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setFont(new Font("Arial", Font.BOLD, 12));
		getContentPane().setLayout(null);
		
		Controller action = new Controller(this);
		
		JLabel lbl_user = new JLabel("User:");
		lbl_user.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(FrameMain.class.getResource("/img/user.png"))));
		lbl_user.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_user.setFont(new Font("Arial", Font.BOLD, 12));
		lbl_user.setBounds(10, 13, 77, 32);
		getContentPane().add(lbl_user);
		
		JButton btn_dangXuat = new JButton("Đăng Xuất");
		btn_dangXuat.addActionListener(action);
		btn_dangXuat.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(FrameMain.class.getResource("/img/log-out.png"))));
		btn_dangXuat.setFont(new Font("Arial", Font.BOLD, 12));
		btn_dangXuat.setBounds(10, 488, 155, 49);
		getContentPane().add(btn_dangXuat);
		
		JButton btn_xeMay = new JButton("Xe máy");
		btn_xeMay.addActionListener(action);
		btn_xeMay.setFont(new Font("Arial", Font.BOLD, 12));
		btn_xeMay.setIcon(new ImageIcon(FrameMain.class.getResource("/img/motorbike.png")));
		btn_xeMay.setBounds(10, 120, 155, 49);
		getContentPane().add(btn_xeMay);
		
		JButton btn_banHang = new JButton("Bán hàng");
		btn_banHang.addActionListener(action);
		btn_banHang.setFont(new Font("Arial", Font.BOLD, 12));
		btn_banHang.setIcon(new ImageIcon(FrameMain.class.getResource("/img/banHang.png")));
		btn_banHang.setBounds(10, 58, 155, 49);
		getContentPane().add(btn_banHang);
		
		JButton btn_thongKe = new JButton("Thống kê");
		btn_thongKe.addActionListener(action);
		btn_thongKe.setFont(new Font("Arial", Font.BOLD, 12));
		btn_thongKe.setIcon(new ImageIcon(FrameMain.class.getResource("/img/thongKe.png")));
		btn_thongKe.setBounds(10, 368, 155, 49);
		getContentPane().add(btn_thongKe);
		
		JButton btn_nhanVien = new JButton("Nhân viên");
		btn_nhanVien.addActionListener(action);
		btn_nhanVien.setFont(new Font("Arial", Font.BOLD, 12));
		btn_nhanVien.setIcon(new ImageIcon(FrameMain.class.getResource("/img/nhanVien.png")));
		btn_nhanVien.setBounds(10, 306, 155, 49);
		getContentPane().add(btn_nhanVien);
		
		JButton btn_khachHang = new JButton("Khách hàng");
		btn_khachHang.addActionListener(action);
		btn_khachHang.setFont(new Font("Arial", Font.BOLD, 12));
		btn_khachHang.setIcon(new ImageIcon(FrameMain.class.getResource("/img/khachHang.png")));
		btn_khachHang.setBounds(10, 244, 155, 49);
		getContentPane().add(btn_khachHang);
		
		JButton btn_thongTin = new JButton("Thông tin");
		btn_thongTin.addActionListener(action);
		btn_thongTin.setFont(new Font("Arial", Font.BOLD, 12));
		btn_thongTin.setIcon(new ImageIcon(FrameMain.class.getResource("/img/thongTin.png")));
		btn_thongTin.setBounds(10, 428, 155, 49);
		getContentPane().add(btn_thongTin);
		
		panel_chucNang = new JPanel();
		panel_chucNang.setBounds(165, 11, 811, 541);
		getContentPane().add(panel_chucNang);
		panel_chucNang.setLayout(new CardLayout(0, 0));
		
		tabbedPane_chucNang = new JTabbedPane();
		tabbedPane_chucNang.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
		panel_chucNang.add(tabbedPane_chucNang);
		
		FrameBanHang frameBanHang = new FrameBanHang();
		frameBanHang.setBackground(SystemColor.window);
		tabbedPane_chucNang.add("Bán hàng", frameBanHang);
		FrameXeMay frameXeMay = new FrameXeMay();
		frameXeMay.setBackground(SystemColor.window);
		tabbedPane_chucNang.add("Xe máy", frameXeMay);
		FrameDonHang frameDonHang = new FrameDonHang();
		frameDonHang.setBackground(SystemColor.window);
		tabbedPane_chucNang.add("Đơn hàng", frameDonHang);
		FrameThongKe frameThongKe = new FrameThongKe();
		frameThongKe.setBackground(SystemColor.window);
		tabbedPane_chucNang.add("Thống kê", frameThongKe);
		frameNhanVien = new FrameNhanVien();
		frameNhanVien.setBackground(SystemColor.window);
		tabbedPane_chucNang.add("Nhân viên", frameNhanVien);
		FrameKhachHang frameKhachHang = new FrameKhachHang();
		frameKhachHang.setBackground(SystemColor.window);
		tabbedPane_chucNang.add("Khách hàng", frameKhachHang);
		tabbedPane_chucNang.add("Thông tin", new FrameAbout());
		
		JLabel lbl_username = new JLabel("sa");
		lbl_username.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_username.setBounds(97, 11, 68, 32);
		getContentPane().add(lbl_username);
		
		JButton btn_donHang = new JButton("Đơn hàng");
		btn_donHang.addActionListener(action);
		btn_donHang.setIcon(new ImageIcon(FrameMain.class.getResource("/img/hoaDon.png")));
		btn_donHang.setFont(new Font("Arial", Font.BOLD, 12));
		btn_donHang.setBounds(10, 182, 155, 49);
		getContentPane().add(btn_donHang);
		
		//LoadData
		loadData();
		this.setVisible(true);
		
	}

	public void loadData() {
		frameNhanVien.loadData();
	}

	public void chuyenTab(String cm) {
		tabbedPane_chucNang.setSelectedIndex(tabbedPane_chucNang.indexOfTab(cm));
	}

	public void thucHienDangXuat() throws Exception {
		JOptionPane.showMessageDialog(this, "Đã đăng xuất");
		frameDangNhap = new FrameDangNhap();
		this.setVisible(false);
		frameDangNhap.setVisible(true);
	}
}
