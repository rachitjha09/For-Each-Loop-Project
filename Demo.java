
/**
 * Demo For Each Loop
 *
 * @author (Rachit Jha)
 * @version (1/11/24)
 */
public class Demo
{
    public static double biggest(double []a){
        double test=a[0];
        for(double d : a){
            test=Math.max(d, test);
        }
        return test;
    }
    public static void main(String[]args){
        double data[]={8.9, 0.4, -4.5, 3.4, 8.9};
      /*  for(int i=0; i<data.length; i++){
            System.out.println(data[i]);
        }
       */ 
        System.out.println("Using a for-each loop:");
        for(double item: data){
            System.out.println(item);
        }
        System.out.println("Biggest element is " + biggest(data));
        
        for(double item: data){
            item=0.0;
        }
        for(int i=0; i<data.length; i++){
            double item=data[i];
            System.out.println(data[i]);
        }
    }
    
}