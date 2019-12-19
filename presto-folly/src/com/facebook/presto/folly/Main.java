package com.facebook.presto.folly;

import java.nio.file.FileSystems;

public class Main {

	public static void main(String[] args) {
		System.load(FileSystems.getDefault().getPath("libfolly.dylib") // Dynamic link
				.normalize().toAbsolutePath().toString());
		FollyData data = new FollyData();
		byte[] b = new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		data.getPage(b);
	}
}
