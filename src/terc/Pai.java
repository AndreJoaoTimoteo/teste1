package terc;

public class Pai implements Comparable<Pai> {
	private Integer id;

	public Pai(Integer id) {
		super();
		this.id = id;
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Pai [id=" + id + "]"; 
	}

	@Override
	public int compareTo(Pai otherPai) {
		// TODO Auto-generated method stub
		return this.id.compareTo(otherPai.id);
	}

}
