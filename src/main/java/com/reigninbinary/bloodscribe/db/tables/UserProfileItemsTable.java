package com.reigninbinary.bloodscribe.db.tables;

public class UserProfileItemsTable {

	public enum Columns {
		
		ITEM_ID			(1, "item_id"),
		USER_ID			(2, "user_id"),
		ITEM_TYPE_ID	(3, "item_type_id"),
		ITEM_VALUE		(4, "item_value"),
		CREATED_DT		(5, "created_dt"),
		UPDATED_DT		(6, "updated_dt");	

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
