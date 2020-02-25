package sprint1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Shelf {
    private int _prod_id;
    private String _in_Date;
    private String _out_date;


    public Shelf(int prod_id, String in_Date, String out_date) {
        this._prod_id = prod_id;
        this._in_Date = in_Date;
        this._out_date = out_date;
    }

    public static void getshelftime(String in_date, String out_date) {
        Date d1 = null;
        Date d2 = null;
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        try {
            d1 = format.parse(in_date);
            d2 = format.parse(out_date);
            long diff = d2.getTime() - d1.getTime();
            long diff2 = diff / (24 * 60 * 60 * 1000) ;
            System.out.print("Product Was in the Shelf for "+ diff2 + " days, ");

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        Shelf [] shelf = new Shelf[1000];
        Scanner sc = new Scanner(System.in);
        shelf[0] = new Shelf(1, "12/23/1999", "7/12/2003");
        shelf[1] = new Shelf(2, "9/13/2009", "7/12/2010");
        shelf[2] = new Shelf(3, "3/17/1996", "7/12/1996");
        shelf[3] = new Shelf(4, "1/23/1995", "7/28/1997");
        System.out.println("Enter The Product Id: ");
        int id = sc.nextInt();
        for(int i = 0; i < 4; i++){
            if(shelf[i]._prod_id == id){
                getshelftime(shelf[i]._in_Date, shelf[i]._out_date);
            }
        }
    }
}