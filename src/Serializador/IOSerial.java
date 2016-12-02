package serializador;

import java.io.*;

/**
 *
 * @author PC-SALA1
 */
public class IOSerial implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	
	public IOSerial() {}

	public static byte[] serialize(IOSerial entry)
            throws IOException {
 
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(entry);
        oos.flush();
 
        return baos.toByteArray();
    }
 
    public static IOSerial deserialize(byte[] byteArray)
            throws IOException, ClassNotFoundException {
 
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(byteArray));
        IOSerial entry = (IOSerial) ois.readObject();
 
        return entry;
    }
}
