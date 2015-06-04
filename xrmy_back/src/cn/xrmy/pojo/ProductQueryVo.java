package cn.xrmy.pojo;

import java.util.List;


public class ProductQueryVo {
	
	//商品信息
	private Product product;
	
	//为了系统 可扩展性，对原始生成的po进行扩展
	private ProductCustom productCustom;
	
	//批量商品信息
	private List<ProductCustom> productList;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProductCustom getProductCustom() {
		return productCustom;
	}

	public void setProductCustom(ProductCustom productCustom) {
		this.productCustom = productCustom;
	}

	public List<ProductCustom> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductCustom> productList) {
		this.productList = productList;
	}

	
}
