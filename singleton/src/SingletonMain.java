class ObjetoTriste {
    private ObjetoTriste(){}
    private static final ObjetoTriste instance = new ObjetoTriste();
    static ObjetoTriste getInstance() {
        return instance;
    }
    void showMessage() {
    	System.out.println("Eu sou muito triste... Muito mesmo");
        System.out.println("O professor Giuliano não gosta de mim :(");
    }
}

public class SingletonMain {
    public static void main(String[] args) {
    	ObjetoTriste object = ObjetoTriste.getInstance();
        object.showMessage();
        
//		Não dá pra ir além, pois o constructor está private
//      object = new ObjetoTriste();
    }
}
