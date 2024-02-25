package com.dev;

public enum UserStatus {
		Unknown ((short) 0),
		UnverifiedAge ((short) 1),
		Verified ((short) 2),
		Invalid ((short) -4);
		
		private final short code;
		UserStatus(short statusCode) {
				this.code = statusCode;
		}
		
		public short code() {
				return this.code;
		}
}