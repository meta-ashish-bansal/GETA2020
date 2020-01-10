
import java.util.Scanner;

class Cart {
	public static void main(String[] args) {
		int choice,x=0,y=0,total=0;
		Scanner input = new Scanner(System.in);
		System.out.println("\t\t\t\t ShopCart\n");
		System.out.println("Item List\n\t1.Pen@rs10\t2.Pencil@rs20\t3.Eraser@rs30\n");
		String[] item={"Pen","Pencil","Eraser"};
		int[] price = {10,20,30};
		int[] quantity = {0,0,0};
		try{
			do{
				System.out.println("Choose Appropriate option");
				System.out.println("1.Add item/Update Quantity");
				System.out.println("0.Generate Bill\n");
				choice = input.nextInt();
				switch(choice)
				{case 0 :
					{
						if((quantity[0]==0)&&(quantity[1]==0)&&(quantity[2]==0))
						{
							System.out.println("Bill Can't be generated, reason : Empty Cart");
						}
						else
						{
							System.out.println("Hurray! Bill Generated:");
							for(int i=0;i<3;i++)
							{
								if(quantity[i]>0)
								{
									total= total + quantity[i]*price[i];
									System.out.println("Item name: "+item[i]+"\tQuantity:"+quantity[i]+"\tPrice: "+price[i]*quantity[i]);
								}
							}
							System.out.println("Grand Total: "+total);
						}
					}
					break;
				case 1 :
					{
						System.out.println("Choose id number of the item");
						x = input.nextInt();
						System.out.println("Set Quantity");
						y = input.nextInt();
						quantity[x-1]=y;
						if((quantity[0]==0)&&(quantity[1]==0)&&(quantity[2]==0))
							{
								System.out.println("No items have been added to the cart");
							}
						else
							{
								for(int i=0;i<3;i++)
									{
										if(quantity[i]>0)
										{
											System.out.println("Item name: "+item[i]+"\tQuantity:"+quantity[i]+"\tPrice: "+price[i]*quantity[i]);
										}
									}
							}
					}
				}
			}
			while((choice>=1)&&(choice<2));
		}
		catch(Exception ex)
			{
				System.out.println("Please enter only valid integer in choices/id number ");
			}
}
}