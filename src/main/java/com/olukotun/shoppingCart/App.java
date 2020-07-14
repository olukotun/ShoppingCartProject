package com.olukotun.shoppingCart;





import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.olukotun.shoppingCart.item.Items;
import com.olukotun.shoppingCart.service.CartService;

/**
 * Hello world!
 *
 */
public class App 
{

	public static void main( String[] args )
	
    {
		
    	CartService cartService = new CartService();
    	
    	List<Items> items = cartService.addToCart();
    	
  
    	cartService.checkOut(items);

    	
       
        
    
       
        
   
	
	
	}
}
