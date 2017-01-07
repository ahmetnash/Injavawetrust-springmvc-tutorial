package _07.more.requestMapping.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import _07.more.requestMapping.dao.ProductRepositoryDAO;
import _07.more.requestMapping.domain.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepositoryDAO productRepository;

	@Override
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	@Override
	public Product getProductById(String productID) {
		return productRepository.getProductById(productID);
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		return productRepository.getProductsByCategory(category);
	}

	@Override
	public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
		return productRepository.getProductsByFilter(filterParams);
	}

	@Override
	public void addProduct(Product product) {
		productRepository.addProduct(product);
	}
}
