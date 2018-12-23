package com.reigninbinary.bloodscribe.db.tables;

public class UserIdentityTypes {
	
	public enum IdentityTypes {
		
		EMAIL(1),
		GOOGLE(2),
		FACEBOOK(3);
		
		private int typeId;
		
		public int typeId() { return typeId; }
		
		IdentityTypes(int type_id) {
			
		}
	}
	
	public enum Columns {
		
		IDENTITY_TYPE_ID	(1, "identity_type_id"),
		IDENTITY_TYPE		(2, "idenity_type"),
		DESCRIPTION			(3, "description");

		public int index() {
			return index;
		}

		public String label() {
			return label;
		}
		
		private int index;
		private String label;
		
		Columns(int index, String label) {
			
			this.label = label;
		}
	}



}
