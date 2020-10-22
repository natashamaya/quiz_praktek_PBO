import java.util.Scanner;

public class Quis1_PBO_Praktek{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int total,bayar,harga = 0; 
		int M,K,L = 0;
		int kembalian,banyak;
		char merek,tipe;
		String nama;
		boolean loop = true;
		
		bayar=0;	
		System.out.print("Masukkan Nama Anda : ");
		nama = input.nextLine();
		
	    System.out.println("Merk :      Tipe  :      Harga ");
		System.out.println("G           Meja(M)      Rp.  95.000 ");
		System.out.println("            Kursi(K)     Rp. 125.000 ");
		System.out.println("            Lemari(L)    Rp. 450.000 ");
		System.out.println();
		System.out.println("O           Meja(M)      Rp. 115.000 ");
		System.out.println("            Kursi(K)     Rp. 135.000 ");
		System.out.println("            Lemari(L)    Rp. 550.000 ");
		
		System.out.println("");
		
		System.out.print("Masukkan Merek ( G / O ) : ");
		merek = input.next().charAt(0);
		System.out.println("");
		while(loop){
			
		System.out.print("Masukkan tipe (M / K / L) : ");
		tipe = input.next().charAt(0);
		System.out.println("");
		

		 switch(tipe)
		 {
            case 'M'  :
               if (merek =='G')
               {harga = 95000;
               }
               else {harga = 115000;
               }
                loop = false;
                break;
                    
           case 'K' :
               if (merek =='G')
               {harga = 125000;
               }
               else {harga = 135000;
               }
                loop = false;
                break;
                
           case 'L'  :
               if (merek =='G')
               {harga = 450000;
               }
               else {harga = 550000;
               }
                loop = false;
                break;
                        
           
               default :
                System.out.println("Pilihan tidak tersedia, mohon masukkan kembali.");
               
                
        }
        
	  
	}
	
       System.out.print("Masukkan Banyak Pesanan : ");
       banyak = input.nextInt();
       System.out.println("");
       
       total = banyak*harga;
       System.out.println("Total Harga : Rp. "+total);
       System.out.println("");
      
       
		while(bayar<total){
		System.out.print("Masukkan Jumlah Bayaran = Rp."); 
		bayar = input.nextInt();
			if (bayar > total){
				kembalian=bayar-total;
			}
			else if (bayar<total){
				System.out.println("Uang anda kurang, mohon ditambah");
			}
		}
	   
	   kembalian = bayar - total;
		
		
	   System.out.println("------------------------------------------");
	   System.out.println("Nama        : "+nama );
	   System.out.println("Total Harga : Rp."+total);
	   System.out.println("Bayar       : Rp."+bayar);
	   System.out.println("Kembalian   : Rp."+kembalian);
	    
	   
	    	
		
				
	}
}