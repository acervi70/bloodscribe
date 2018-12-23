package com.reigninbinary.bloodscribe.db.tables;

public class UserTable {

	public enum Columns {
		
		USER_ID				(1, "user_id"),
		EMAIL_ADDRESS		(2, "email_address"),
		IDENTITY_ID			(3, "identity_id"),
		IDENTITY_TYPE_ID	(4, "identity_type_id"),
		CREATED_DT			(5, "created_dt"),
		UPDATED_DT			(6, "updated_dt");	

		public int index() {
			return index;
		}

		public String label() {
			return label;
		}
		
		private int index;
		private String label;
		
		Columns(int index, String label) {
			this.index = index;
			this.label = label;
		}
	}
}
