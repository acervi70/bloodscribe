package com.reigninbinary.bloodscribe.db.tables;

public class UserProfileItemTypesTable {

	public enum Columns {
		
		ITEM_TYPE_ID	(1, "item_type_id"),
		ITEM_TYPE		(2, "item_type"),
		DESCRIPTION		(3, "description"),
		CREATED_DT		(4, "created_dt"),
		UPDATED_DT		(5, "updated_dt");	

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
