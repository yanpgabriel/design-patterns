package dev.yanpgabriel.patterns.structural;

public class Facade {
    public static void main(String[] args) {
        ConversorDeVideo convertor = new ConversorDeVideo();
        Arquivo mp4 = convertor.converter("funny-cats-video.ogg", "mp4");
        mp4.salvar();
    }
}

class ConversorDeVideo {
    public Arquivo converter(String filename, String format) {
        // Simula a conversão de um arquivo de um formato para outro
        // Escondendo toda a complexidade do processo
        return new Arquivo(filename, format);
    }
}

class Arquivo {
    private String nomeArquivo;
    private String formato;
    Arquivo(String nomeArquivo, String formato) {
        this.nomeArquivo = nomeArquivo;
        this.formato = formato;
    }
    public void salvar() {
        System.out.println("Salvando arquivo " + nomeArquivo + " no formato " + formato);
    }
}