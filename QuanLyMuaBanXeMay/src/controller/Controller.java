package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.FrameXeMay;
import view.FrameChiTietDonHang;
import view.FrameDangNhap;
import view.FrameDonHang;
import view.FrameMain;
import view.FrameNhanVien;

public class Controller implements ActionListener, MouseListener {
	private FrameMain frameMain;
	private FrameDangNhap frameDangNhap;
	private FrameDonHang frameDonHang;
	private FrameChiTietDonHang frameChiTietDonHang;
	private FrameNhanVien frameNhanVien;

	public Controller(FrameMain frameMain) {
		this.frameMain = frameMain;
	}

	public Controller(FrameDangNhap frameDangNhap) {
		this.frameDangNhap = frameDangNhap;
	}

	public Controller(FrameDonHang frameDonHang) {
		this.frameDonHang = frameDonHang;
	}

	public Controller(FrameChiTietDonHang frameChiTietDonHang) {
		this.frameChiTietDonHang = frameChiTietDonHang;
	}

	public Controller(FrameNhanVien frameNhanVien) {
		this.frameNhanVien = frameNhanVien;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cm = e.getActionCommand();
		if (cm.equals("Bán hàng")) {
			frameMain.chuyenTab(cm);
		} else if (cm.equals("Xe máy")) {
			frameMain.chuyenTab(cm);
		} else if (cm.equals("Đơn hàng")) {
			frameMain.chuyenTab(cm);
		} else if (cm.equals("Khách hàng")) {
			frameMain.chuyenTab(cm);
		} else if (cm.equals("Nhân viên")) {
			frameMain.chuyenTab(cm);
		} else if (cm.equals("Thống kê")) {
			frameMain.chuyenTab(cm);
		} else if (cm.equals("Thông tin")) {
			frameMain.chuyenTab(cm);
		} else if (cm.equals("Đăng Xuất")) {
			try {
				frameMain.thucHienDangXuat();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} else if (cm.equals("Đăng Nhập")) {
			frameDangNhap.kiemTraDangNhap();
		} else if (cm.equals("Thoát")) {
			if(e.getSource() == frameChiTietDonHang.getBtn_thoat()) {
				frameChiTietDonHang.thucHienThoat();
			}else {
				frameDangNhap.thucHienThoat();
			}
		} else if (cm.equals("Xem chi tiết")) {
			frameDonHang.thucHienXemChiTiet();
		}else if (cm.equals("Thêm")) {
			if(e.getSource() == frameNhanVien.getBtn_themNhanVien()) {
				frameNhanVien.thucHienThem();
			}
		}else if (cm.equals("Xóa")) {
			if(e.getSource() == frameNhanVien.getBtn_xoaNhanVien()) {
				frameNhanVien.thucHienXoa();
			}
		}else if (cm.equals("Cập Nhật")) {
			if(e.getSource() == frameNhanVien.getBtn_capNhatNhanVien()) {
				frameNhanVien.thucHienCapNhat();
			}
		}else if (cm.equals("Xóa trắng")) {
			frameDonHang.thucHienXemChiTiet();
		}else if (cm.equals("Tìm")) {
			frameDonHang.thucHienXemChiTiet();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == frameNhanVien.getTable_nhanVien()) {
			frameNhanVien.thucHienMouseClick();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
