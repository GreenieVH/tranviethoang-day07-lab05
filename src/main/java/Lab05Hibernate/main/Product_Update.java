package Lab05Hibernate.main;

import Lab05Hibernate.dao.ProductDAOImpl;
import Lab05Hibernate.entity.Product;

public class Product_Update {
	public static void main(String[] args) {
		Product p = new ProductDAOImpl().getProductById("P0004");
		p.setMaSP("P0004");
		p.setTenSanPham("Kệ để giày tung ");
		p.setAnhSanPham("P0004.jpg");
		p.setSoLuong(150);
		p.setDonGia(2990000d);
		
		boolean flag = new ProductDAOImpl().updateProduct(p);
		if(flag == true) {
			System.out.printf("Sửa đổi dữ liệu thành công !!!");
		}else {
			System.out.printf("Xảy ra lỗi khi sửa sản phẩm :))");
		}
		
	}
}
