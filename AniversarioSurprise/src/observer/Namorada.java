package observer;

public class Namorada implements ChegadaAniversarianteObserver {

	@Override
	public void chegou(ChegadaAniversarianteEvent event) {
		System.out.println("Apaga tudooo rapaziada!");
		System.out.println("Quieto, quem falar é mulher do padre!");
		System.out.println("SURPRISE MY FRIEND!!!");
	}
}