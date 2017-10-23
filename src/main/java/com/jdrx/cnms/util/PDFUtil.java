package com.jdrx.cnms.util; /**
 * Created by dwz on 2017/7/3.
 */

import com.itextpdf.text.*;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.jdrx.cnms.util.AsianFontProvider;

import java.io.*;
import java.nio.charset.Charset;
import java.util.UUID;

public class PDFUtil {
    private static final Logger logger = LoggerFactory.getLogger(PDFUtil.class);
    // 导出Pdf文挡
    public static void exportPdfDocument(String html,String path,OutputStream fos) {
        Document document = new Document(PageSize.LETTER);
        try {
            PdfWriter pdfWriter = PdfWriter.getInstance(document,fos);
            document.open();
            document.addTitle("HTML to PDF");
            XMLWorkerHelper worker = XMLWorkerHelper.getInstance();
            worker.parseXHtml(pdfWriter, document,  new ByteArrayInputStream(html.getBytes()), Charset.forName("UTF-8"), new AsianFontProvider());
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }finally {
            document.close();
        }
    }
}
