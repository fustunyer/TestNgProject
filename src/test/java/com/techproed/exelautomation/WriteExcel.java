package com.techproed.exelautomation;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    @Test
    public void test() throws IOException {
        String dosyaYolu="src\\test\\resources\\ULKELER.xlsx";
        FileInputStream fileInputStream=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        //burada dosya uzerine yazi yazacagim icin
        FileOutputStream fileOutputStream=new FileOutputStream(dosyaYolu);
        workbook.getSheetAt(0).getRow(0).createCell(3).setCellValue("NUFUS");
        workbook.getSheetAt(0).getRow(1).createCell(3).setCellValue("80000000");
        workbook.getSheetAt(0).getRow(2).createCell(3).setCellValue("10000000");
        //0. indexteki satirin 1. indexteki hucreyi silelim
        Cell silmekIstedigimizHucre=workbook.getSheetAt(0).getRow(0).getCell(1);
        workbook.getSheetAt(0).getRow(0).removeCell(silmekIstedigimizHucre);
        Row silmekIstedigimSatir=workbook.getSheetAt(0).getRow(2);
        workbook.getSheetAt(0).removeRow(silmekIstedigimSatir);
        //degisiklikleri excel e yazar ve kaydeder
        workbook.write(fileOutputStream);
        fileInputStream.close();
        fileOutputStream.close();
        workbook.close();

    }


}
