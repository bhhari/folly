package com.facebook.presto.folly;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class FollyData {

	private native void getPage(ByteBuffer buffer);

	public byte[] getPage(byte[] b) {
		System.out.println("Send : " + Arrays.toString(b));
		ByteBuffer buffer = ByteBuffer.allocateDirect(10);
		buffer.put(b);
		buffer.rewind();
		getPage(buffer);
		buffer.get(b);
		System.out.println("Got  : " + Arrays.toString(b));
		return b;
	}
}
