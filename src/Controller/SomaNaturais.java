package Controller;

public class SomaNaturais {

	public SomaNaturais() {

		super();
	}

	public int SomaN(int N) {
		//condição de parada
		if (N <= 0) {
			return 0;

		}
		//função do termo anterior 
		return N + SomaN(N - 1);
	}

}