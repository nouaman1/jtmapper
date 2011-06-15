package org.jterramapper.io;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import com.compaq.BufferedRandomAccessFile;

public class LEBinaryReader {
	private RandomAccessFile raf = null;

	public LEBinaryReader(String file) throws IOException {
		this(new File(file));
	}

	public LEBinaryReader(File file) throws IOException {
		raf = new BufferedRandomAccessFile(file, "r");
	}

	public void close() throws IOException {
		raf.close();
	}

	public boolean equals(Object raf) {
		return raf.equals(raf);
	}

	public boolean readBoolean() throws IOException {
		return raf.readBoolean();
	}

	public int readByte() throws IOException {
		return readByteSigned() & 0xFF;
	}

	public byte readByteSigned() throws IOException {
		return raf.readByte();
	}

	public char readChar() throws IOException {
		int low = readByte() & 0xff;
		int high = readByte();
		return (char) (high << 8 | low);
	}

	public short readInt16() throws IOException {
		return readShort();
	}

	public short readShort() throws IOException {
		int low = readByte() & 0xff;
		int high = readByte() & 0xff;
		return (short) (high << 8 | low);
	}

	public int readInt32() throws IOException {
		return readInt();
	}

	public int readInt() throws IOException {
		int accum = 0;
		for (int shiftBy = 0; shiftBy < 32; shiftBy += 8) {
			accum |= (readByte() & 0xff) << shiftBy;
		}
		return accum;
	}

	public long readInt64() throws IOException {
		return readLong();
	}

	private int read7BitEncodedInt() throws IOException { // adapted from C#
															// System.IO.BinaryReader
		// Read out an int 7 bits at a time. The high bit
		// of the byte when on means to continue reading more bytes.
		int count = 0;
		int shift = 0;
		int b;
		do {
			b = readByte();
			count |= (b & 0x7F) << shift;
			shift += 7;
		} while ((b & 0x80) != 0);
		return count;
	}

	public long readLong() throws IOException {
		long accum = 0;
		for (int shiftBy = 0; shiftBy < 64; shiftBy += 8) {
			accum |= (long) (readByte() & 0xff) << shiftBy;
		}
		return accum;
	}

	public double readDouble() throws IOException {
		long accum = 0;
		for (int shiftBy = 0; shiftBy < 64; shiftBy += 8) {
			accum |= ((long) (readByte() & 0xff)) << shiftBy;
		}
		return Double.longBitsToDouble(accum);
	}

	public float readFloat() throws IOException {
		int accum = 0;
		for (int shiftBy = 0; shiftBy < 32; shiftBy += 8) {
			accum |= (readByte() & 0xff) << shiftBy;
		}
		return Float.intBitsToFloat(accum);
	}

	public String readString() throws IOException {
		// I uh...think this is right
		int size = read7BitEncodedInt();
		String str = "";
		for (int i = 0; i < size; i++) {
			str += (char) readByte();
		}
		return str;
	}

	public void seek(long pos) throws IOException {
		raf.seek(pos);
	}

	public long getPos() throws IOException {
		return raf.getFilePointer();
	}
}
