package exercicio03_exercicio06;

public class CaixinhaDuplaMedia{
	private Media media;
	private CaixinhaDuplaMedia anterior;
	private CaixinhaDuplaMedia proximo;
	
	public Media getMedia() {
		return media;
	}
	public void setMedia(Media media) {
		this.media = media;
	}
	public CaixinhaDuplaMedia getAnterior() {
		return anterior;
	}
	public void setAnterior(CaixinhaDuplaMedia anterior) {
		this.anterior = anterior;
	}
	public CaixinhaDuplaMedia getProximo() {
		return proximo;
	}
	public void setProximo(CaixinhaDuplaMedia proximo) {
		this.proximo = proximo;
	}
}
