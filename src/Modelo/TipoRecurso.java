package entidade;

import java.io.Serializable;

public abstract class TipoRecurso extends IOSerial implements Serializable{
	private int id;
	
	public void setId(int i)
	{
		id = i;
	}
	
	public int getId()
	{
		return id;
	}
}

