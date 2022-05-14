package datatypes;

public abstract class Datatype {
	public static enum DataType {
		BYTE, SHORT, INT, LONG, FLOAT, DOUBLE, CHARACTER, BOOLEAN
	};

	protected void printString(String string) {
		System.out.println(string);
	}

	protected String createMessageForData(String message, DataType dataType, String data) {
		return message + " " + String.valueOf(dataType) + " " + data;
	}
}