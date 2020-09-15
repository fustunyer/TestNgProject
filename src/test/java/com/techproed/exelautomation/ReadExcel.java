package com.techproed.exelautomation;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

public class ReadExcel {
    @Test
    public void test() throws IOException {
        //javada bir dosyayi acmak icin FileInpuStram kllanilir
        //parametre bolumunne acmak istedigimiz dosyanin adresi yazilir.
        String dosyaYolu="src\\test\\resources\\ULKELER.xlsx";
        FileInputStream fileInputStream=new FileInputStream(dosyaYolu);
        Workbook workbook=WorkbookFactory.create(fileInputStream);
        Sheet sheet=workbook.getSheetAt(0);//0 index numarali sayfaya gider index 0 dan baslar
        //1. satira gidelim
        Row row=sheet.getRow(0);//satir index i de 0 dan baslar
        //1. hucreyi alalim
        Cell ulkeler=row.getCell(0);//hucre indexi de 0 dan baslar
        Cell baskentler=row.getCell(1);
        Cell meshurlar=row.getCell(2);
        System.out.println(ulkeler);
        System.out.println(baskentler);
        System.out.println(meshurlar);

        System.out.println(workbook.getSheetAt(0).getRow(3).getCell(1));
        System.out.println(workbook.getSheetAt(0).getRow(7).getCell(2));
        System.out.println(workbook.getSheetAt(0).getRow(10).getCell(0));

        //son satir numarasini almak icin
        int satirSayisi=workbook.getSheetAt(0).getLastRowNum()+1;//index 0 dan basladigi icin 1 ekledik
        System.out.println("Satir sayisi: "+satirSayisi);
        //icerisinde veri olan satir sayisi icin
        int doluSAtirSayisi=workbook.getSheetAt(0).getPhysicalNumberOfRows();
        System.out.println("Dolu satir sayisi: "+doluSAtirSayisi);
        int sonSatirinIndexi=workbook.getSheetAt(0).getLastRowNum();
        for (int i=0;i<=sonSatirinIndexi;i++){
            System.out.println(workbook.getSheetAt(0).getRow(i).getCell(0));
        }
        for (int i=0;i<=sonSatirinIndexi;i++){
            System.out.println(workbook.getSheetAt(0).getRow(i).getCell(1));
        }
        //bir satirin son sutunuun indexini alma

        int sonSutunIndexi=workbook.getSheetAt(0).getRow(0).getLastCellNum();
        System.out.println(sonSutunIndexi);
        for (int i=0;i<sonSutunIndexi;i++){
            System.out.print(workbook.getSheetAt(0).getRow(3).getCell(i)+" ");
        }


        /*for (int i=0;i<=sonSatirinIndexi;i++){
            System.out.println(workbook.getSheetAt(0).getRow(i).getCell(2));
        }*/
       // Random rastgeleSayi=new Random(sonSatirinIndexi);
        //System.out.println(workbook.getSheetAt(0).getRow(rastgeleSayi).getCell(1));





  }
}
