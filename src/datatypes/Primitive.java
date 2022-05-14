package datatypes;

public class Primitive extends Datatype {
	private byte byteNum; // 8 bit (default value 0)
	private short shortNum; // 16 bit (default value 0)
	private int intNum; // 32 bit (default value 0)
	private long longNum; // 64 bit (default value 0L)
	private float floatNum; // 32 bit (default 0.0f)
	private double doubleNum; // 64 bit (default 0.0d)
	private char character; // 16 bit unicode (min: 0000, max: ffff)
	private boolean bool; // 1 bit

	private String printDefaultValue(DataType dt) {
		String message = "The default value is:";

		if (dt == DataType.BYTE) {
			return createMessageForData(message, dt, String.valueOf(this.byteNum));
		} else if (dt == DataType.SHORT) {
			return createMessageForData(message, dt, String.valueOf(this.shortNum));
		} else if (dt == DataType.INT) {
			return createMessageForData(message, dt, String.valueOf(this.intNum));
		} else if (dt == DataType.LONG) {
			return createMessageForData(message, dt, String.valueOf(this.longNum));
		} else if (dt == DataType.FLOAT) {
			return createMessageForData(message, dt, String.valueOf(this.floatNum));
		} else if (dt == DataType.DOUBLE) {
			return createMessageForData(message, dt, String.valueOf(this.doubleNum));
		} else if (dt == DataType.CHARACTER) {
			return createMessageForData(message, dt, String.valueOf(this.character));
		} else if (dt == DataType.BOOLEAN) {
			return createMessageForData(message, dt, String.valueOf(this.bool));
		}

		return "Some error occured!";
	}

	public void getDefaultValues(DataType dt) {
		if (dt == null) {
			printString(printDefaultValue(DataType.BYTE));
			printString(printDefaultValue(DataType.SHORT));
			printString(printDefaultValue(DataType.INT));
			printString(printDefaultValue(DataType.LONG));
			printString(printDefaultValue(DataType.FLOAT));
			printString(printDefaultValue(DataType.DOUBLE));
			printString(printDefaultValue(DataType.CHARACTER));
			printString(printDefaultValue(DataType.BOOLEAN));
			return;
		}

		printString(printDefaultValue(dt));
	}

	// int cannot be casted to boolean
	public void typecastInt(int value) {
		String message = "Data converted from INT to:";
		byte b = (byte) value;
		short s = (short) value;
		long l = value;
		float f = value;
		double d = value;
		char c = (char) value; // here int needs to be an ASCII value

		printString(createMessageForData(message, DataType.BYTE, String.valueOf(b)));
		printString(createMessageForData(message, DataType.SHORT, String.valueOf(s)));
		printString(createMessageForData(message, DataType.LONG, String.valueOf(l)));
		printString(createMessageForData(message, DataType.FLOAT, String.valueOf(f)));
		printString(createMessageForData(message, DataType.DOUBLE, String.valueOf(d)));
		printString(createMessageForData(message, DataType.CHARACTER, String.valueOf(c)));
	}

	// Typecast eg: (int) is only required when typecasting from higher size
	// variable to lower size variable. Eg: int (32 bit) to byte (8 bit)
	public void typecastByte(byte value) {
		String message = "Data converted from BYTE to:";
		short s = value;
		int i = value;
		long l = value;
		float f = value;
		double d = value;
		char c = (char) value; // here int needs to be an ASCII value

		printString(createMessageForData(message, DataType.SHORT, String.valueOf(s)));
		printString(createMessageForData(message, DataType.INT, String.valueOf(i)));
		printString(createMessageForData(message, DataType.LONG, String.valueOf(l)));
		printString(createMessageForData(message, DataType.FLOAT, String.valueOf(f)));
		printString(createMessageForData(message, DataType.DOUBLE, String.valueOf(d)));
		printString(createMessageForData(message, DataType.CHARACTER, String.valueOf(c)));
	}

	public void typecastShort(short value) {
		String message = "Data converted from SHORT to:";
		byte b = (byte) value;
		int i = value;
		long l = value;
		float f = value;
		double d = value;
		char c = (char) value; // here int needs to be an ASCII value

		printString(createMessageForData(message, DataType.BYTE, String.valueOf(b)));
		printString(createMessageForData(message, DataType.INT, String.valueOf(i)));
		printString(createMessageForData(message, DataType.LONG, String.valueOf(l)));
		printString(createMessageForData(message, DataType.FLOAT, String.valueOf(f)));
		printString(createMessageForData(message, DataType.DOUBLE, String.valueOf(d)));
		printString(createMessageForData(message, DataType.CHARACTER, String.valueOf(c)));
	}

	public void typecastLong(long value) {
		String message = "Data converted from LONG to:";
		byte b = (byte) value;
		short s = (short) value;
		int i = (int) value;
		float f = value;
		double d = value;
		char c = (char) value; // here int needs to be an ASCII value

		printString(createMessageForData(message, DataType.SHORT, String.valueOf(s)));
		printString(createMessageForData(message, DataType.BYTE, String.valueOf(b)));
		printString(createMessageForData(message, DataType.INT, String.valueOf(i)));
		printString(createMessageForData(message, DataType.FLOAT, String.valueOf(f)));
		printString(createMessageForData(message, DataType.DOUBLE, String.valueOf(d)));
		printString(createMessageForData(message, DataType.CHARACTER, String.valueOf(c)));
	}

	public void typecastFloat(float value) {
		String message = "Data converted from FLOAT to:";
		byte b = (byte) value;
		short s = (short) value;
		int i = (int) value;
		long l = (long) value;
		double d = value;
		char c = (char) value; // here int needs to be an ASCII value

		printString(createMessageForData(message, DataType.SHORT, String.valueOf(s)));
		printString(createMessageForData(message, DataType.BYTE, String.valueOf(b)));
		printString(createMessageForData(message, DataType.INT, String.valueOf(i)));
		printString(createMessageForData(message, DataType.LONG, String.valueOf(l)));
		printString(createMessageForData(message, DataType.DOUBLE, String.valueOf(d)));
		printString(createMessageForData(message, DataType.CHARACTER, String.valueOf(c)));
	}

	public void typecastDouble(double value) {
		String message = "Data converted from DOUBLE to:";
		byte b = (byte) value;
		short s = (short) value;
		int i = (int) value;
		long l = (long) value;
		float f = (float) value;
		char c = (char) value; // here int needs to be an ASCII value

		printString(createMessageForData(message, DataType.SHORT, String.valueOf(s)));
		printString(createMessageForData(message, DataType.BYTE, String.valueOf(b)));
		printString(createMessageForData(message, DataType.INT, String.valueOf(i)));
		printString(createMessageForData(message, DataType.FLOAT, String.valueOf(f)));
		printString(createMessageForData(message, DataType.LONG, String.valueOf(l)));
		printString(createMessageForData(message, DataType.CHARACTER, String.valueOf(c)));
	}

	public void typecastChar(char value) {
		String message = "Data converted from CHAR to:";
		byte b = (byte) value;
		short s = (short) value;
		int i = (int) value;
		long l = (long) value;
		float f = (float) value;
		double d = (double) value;

		printString(createMessageForData(message, DataType.SHORT, String.valueOf(s)));
		printString(createMessageForData(message, DataType.BYTE, String.valueOf(b)));
		printString(createMessageForData(message, DataType.INT, String.valueOf(i)));
		printString(createMessageForData(message, DataType.FLOAT, String.valueOf(f)));
		printString(createMessageForData(message, DataType.LONG, String.valueOf(l)));
		printString(createMessageForData(message, DataType.DOUBLE, String.valueOf(d)));
	}

	public void createArrays() {
		int[] intArr = { 1, 2 };
		// int[] intArr1 = new int[2];
		char[] charArr = { 'a', 'b', 'c', 'd' };
		// char[] charArr1 = new char[5];

		for (int i : intArr) {
			System.out.println(String.valueOf(i));
		}

		for (char c : charArr) {
			System.out.println(String.valueOf(c));
		}
	}
}