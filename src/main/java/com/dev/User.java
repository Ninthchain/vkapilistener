package com.dev;

public class User {

		private long id;

		private long vkId;

		private boolean isVerified;

		private String token;
		
		public User() {
		
		}
		
		public User(long id, long vkId, boolean isVerified, String token) {
				this.setId(id);
				this.setVkId(vkId);
				this.setIsVerified(isVerified);
				this.setToken(token);
		}
		
		public long getId() {
				return id;
		}
		
		public void setId(long id) {
				this.id = id;
		}
		
		public long getVkId() {
				return vkId;
		}
		
		public void setVkId(long vkId) {
				this.vkId = vkId;
		}
		
		
		public void setIsVerified(boolean flag) {
				this.isVerified = flag;
		}
		
		public boolean getIsVerified() {
				return this.isVerified;
		}
		
		
		public String getToken() {
				return token;
		}
		
		public void setToken(String token) {
				this.token = token;
		}
}