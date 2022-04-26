interface Relatorio {
    void gerar();
}

class RelatorioPDF implements Relatorio {

    @Override
    public void gerar() {
        System.out.println("Gerando PDF...");
    }
}

class RelatorioDOCX implements Relatorio {

    @Override
    public void gerar() {
        System.out.println("Gerando DOCX...");
    }
}

class RelatorioODF implements Relatorio {

    @Override
    public void gerar() {
        System.out.println("Gerando ODF...");
    }
}

class GeradorRelatorio {
    private RelatorioPDF pdfRelatorio;
    private RelatorioDOCX docxRelatorio;
    private RelatorioODF odfRelatorio;

    void generatePDF() {
        if (pdfRelatorio == null) pdfRelatorio = new RelatorioPDF();
        pdfRelatorio.gerar();
    }

    void generateDOCX() {
        if (docxRelatorio == null) docxRelatorio = new RelatorioDOCX();
        docxRelatorio.gerar();
    }
    void generateODF() {
        if (odfRelatorio == null) odfRelatorio = new RelatorioODF();
        odfRelatorio.gerar();
    }

}

public class FacadeMain {
    public static void main(String[] args) {
        GeradorRelatorio geradorRelatorio = new GeradorRelatorio();
        geradorRelatorio.generateDOCX();
        geradorRelatorio.generateODF();
        geradorRelatorio.generatePDF();
        geradorRelatorio.generatePDF();
        geradorRelatorio.generatePDF();
        geradorRelatorio.generatePDF();
    }
}
