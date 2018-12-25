package com.reigninbinary.bloodscribe.db.util;

import java.util.UUID;

import com.reigninbinary.bloodscribe.db.tables.UserIdentityTypesTable;


public class DatabaseUtils {

	public static UserIdentity generateDefaultUserIdentity() {
		
		UserIdentity identity = new UserIdentity();
		identity.setIdentityTypeId(UserIdentityTypesTable.IdentityTypes.EMAIL.typeId());
		identity.setIdentityId(UUID.randomUUID().toString());		
		return identity;
		
	}
}
