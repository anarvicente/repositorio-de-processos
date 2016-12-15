package entidade;

import java.io.Serializable;

public class TipoRegra extends IOSerial implements Serializable{
	private char codigo;
	private String descricao;
        
        public TipoRegra(char c, String s){
            setCodigo(c);
            setDescricao(s);
        }
        
	public char getCodigo() {
		return codigo;
	}
	public void setCodigo(char codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
        
        public String toString(){
            return "\nCodigo: " + codigo + "\nDescrição: " + descricao;
        }
	
}
