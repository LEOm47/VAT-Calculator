public class TaxCalculator {
    public static void main(String[] args){

double net;
double vat;
double vat1;
double GrossValue;
double SoldProduct;
double netSP;
double vat2;
double SPwVAT;

System.out.println("WELCOME");
    net = 9.99;
    vat = 0.23;
        System.out.println("Net Price for 1 Product ---------> " + net +"$");
        vat1 = net * vat;
        System.out.println("23% VAT for 1 Product ---------> "+ vat1+"$");
        System.out.print("--- ");
      GrossValue = net * (1 +vat);
        System.out.println("Price for 1 Product with 23% VAT ---------> " + GrossValue+"$");
    ////////////////////////
        System.out.println("++---------------------------------------------------+ +");
    SoldProduct = 10_000;
        netSP = (net * SoldProduct);
        System.out.println("Total Net Price for 10,000 Products ---------> " + netSP+"$");
    vat2 = netSP * vat;
        System.out.println("23% VAT for 10,000 Sold Products ---------> " + vat2+"$");
        System.out.print("--- ");
    SPwVAT = netSP * (1+vat);
    System.out.println("Price for 10,000 Products with 23% VAT ---------> " + SPwVAT+"$");
    }
}
