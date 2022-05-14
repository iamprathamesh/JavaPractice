package datatypes;

import datatypes.Datatype.DataType;

// Refrence types are class, interface, annotations, arrays, enums, objects, strings
// This code mainly focuses on refrence types of primitive data types
public class Refrence extends Datatype {
	Byte byteNum = new Byte((byte) 2);
	Short shortNum = new Short((short) 2);
	Integer intNum = new Integer(2);
	Long longNum = new Long(2);
	Float floatNum = new Float(2.0f);
	Double doubleNum = new Double(2.0);
	Character character = new Character('a');
	Boolean bool = new Boolean(false);
	String str = new String("abc");

	// There are no default values for refrence types as the constructors with no
	// parameters are not defined
	@SuppressWarnings("unused")
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
}