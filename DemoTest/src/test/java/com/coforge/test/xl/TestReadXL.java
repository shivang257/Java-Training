package com.coforge.test.xl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestReadXL {
    
    static FileInputStream fin;
    static File f;
    static WebDriver driver;
    
    
    public static void readXL() throws IOException {

        f = new File("D:\\Datapool\\LoginCredentials.xlsx"); // Corrected file path
        
        fin = new FileInputStream(f);
        XSSFWorkbook wb = new XSSFWorkbook(fin);
        XSSFSheet sb = wb.getSheet("Sheet1");
        
        int firstRow = sb.getFirstRowNum();
        int lastRow = sb.getLastRowNum();
        
        for(int i=2; i<=lastRow; i++) {
            System.out.println(sb.getRow(i).getCell(0).getStringCellValue());
            System.out.println(sb.getRow(i).getCell(1).getStringCellValue());

        }
        
        //1`
        fin.close();
        
        setup();
    }
    
    public static void setup() {
        driver = new ChromeDriver();
    }
    
    public static void main(String[] args) throws IOException {
        readXL();
    }}
