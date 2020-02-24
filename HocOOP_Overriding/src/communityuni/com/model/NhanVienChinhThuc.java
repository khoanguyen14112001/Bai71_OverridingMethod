package communityuni.com.model;

public class NhanVienChinhThuc extends NhanVien {

	@Override
	public void tinhLuong(int ngayCong) {
		// TODO Auto-generated method stub
		if(ngayCong<20)
			System.out.println("Lương 5 triệu");
		else
			System.out.println("Lương 20 triệu");
		
	}
	

}
