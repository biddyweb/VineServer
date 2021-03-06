package vine.packet;

import java.nio.ByteBuffer;

public final class Packet {

	private final int id;
	private final byte[] data;

	public Packet(int id, byte[] data) {
		this.id = id;
		this.data = data;
	}

	public Packet(byte[] data) {
		this(-1, data);
	}

	public int getID() {
		return id;
	}

	public int getLength() {
		return data.length;
	}

	public byte[] getData() {
		return data;
	}

	public boolean isHeadless() {
		return id == -1;
	}

	@Override
	public String toString() {
		return "Packet (id=" + getID() + ", length=" + getLength() + ")";
	}

	public ByteBuffer toBuffer() {
		return ByteBuffer.wrap(data);
	}

}