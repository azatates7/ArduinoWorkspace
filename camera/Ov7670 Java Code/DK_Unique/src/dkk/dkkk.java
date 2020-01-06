package dkk;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import main.BMP;

public class dkkk {

public static  void main(String []args){
    DateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    Date date = new Date();
    BMP bmp = new BMP();
    bmp.saveBMP("C:/Users/DK/Downloads/dk/" + sdf.format(date) + ".bmp", rgb2);
    System.out.println("Saved image: " + counter);
}
}
