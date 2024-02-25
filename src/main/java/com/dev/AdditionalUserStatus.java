package com.dev;

public enum AdditionalUserStatus {
		SharingFriendLink ((short)125),
		CheckingFriend ((short)140);
		private final short code;
		AdditionalUserStatus(short statusCode) {
				this.code = statusCode;
		}
		
		public short code() {
				return this.code;
		}
}

