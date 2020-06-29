package exercicio03_exercicio06;

public class Media {
	int idAluno;
	int idDisc;
	double media;
	
	public Media(int idAluno, int idDisc, double media) {
		this.idAluno = idAluno;
		this.idDisc = idDisc;
		this.media = media;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public int getIdDisc() {
		return idDisc;
	}

	public void setIdDisc(int idDisc) {
		this.idDisc = idDisc;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	
}
