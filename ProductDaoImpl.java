package com.pms.dao.impl;

import java.util.Scanner;

import com.pms.pojo.Product;

public class ProductDaoImpl {

	Scanner sc = new Scanner(System.in);
	Product ProductInfo[] = null;

	public void addProducts() {
		System.out.println("How many products do you want to add?");
		int size = sc.nextInt();
		ProductInfo = new Product[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter product id: ");
			int id = sc.nextInt();
			System.out.println("Enter product name: ");
			String name = sc.next();
			System.out.println("Enter product quantity: ");
			int qty = sc.nextInt();
			System.out.println("Enter Product price: ");
			int price = sc.nextInt();
			// Data Transfer Object;
			Product pro = new Product(id, name, qty, price);
			ProductInfo[i] = pro;
			System.out.println("Product Added Successfully.");

		}
	} // end of for loop

	public Product[] viewAllProducts() {
		return ProductInfo;

	}

	public Product viewProduct(int pid) {
		if (ProductInfo != null) {
			for (Product pro : ProductInfo) {
				if (pro != null) {
					if (pro.getPid() == pid) {
						return pro;
					}
				} // end of if
			}
		} // end of if
		return null;
	}// end of view Product



	public boolean deleteProduct(int pid) {
		boolean flag = false;
		int k = 0;
		if(ProductInfo!=null) {
		for (Product pro : ProductInfo) {
			if (pro.getPid() == pid) {
				ProductInfo[k] = null;
				flag = true;
				k++;
				break;
			} else
				k++;
		} //end of for loop
		} //end of if
		return flag;
	}// end of delete
	
	public void updateProduct(int pid) {
		int k =0;
		int m =1;
		if(ProductInfo!=null) {
		for(Product pro: ProductInfo) {
			if(pro!=null) {
			if(pro.getPid()==pid) {
				k++;
				while(m==1)
				{
				System.out.println("Do you want to update 1)Pname 2) Qty 3)Price");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the product name");
				String pname = sc.next();
				pro.setPname(pname);
				System.out.println("Product name Updated Successfully.");
				break;
			case 2:
				System.out.println("Enter the Product Qunatity");
				int qty = sc.nextInt();
				pro.setQty(qty);
				System.out.println("Product quantity updated successfuly");
				break;
			case 3:
				System.out.println("Enter the Product price");
				int price = sc.nextInt();
				pro.setPrice(price);
				System.out.println("Product price updated successfully");
				break;
			default:
				System.out.println("Choose between 1 to 3");
			}//switch
			System.out.println(" Do you want to continue updating? 1) Yes 2) No");
			m = sc.nextInt();
			} 
			}
		}
	} // end of if
		}
		else
			System.out.println("Stock is Empty");
		if(k==0)
			System.out.println("Fiven product id does not exist");
}
}
