package com.reigninbinary.bloodscribe.db.util;

import java.util.UUID;

import com.reigninbinary.bloodscribe.db.tables.UserIdentityTypes;


public class DatabaseUtils {

	public static UserIdentity generateDefaultUserIdentity() {
		
		UserIdentity identity = new UserIdentity();
		identity.setIdentityTypeId(UserIdentityTypes.IdentityTypes.EMAIL.typeId());
		identity.setIdentityId(UUID.randomUUID().toString());		
		return identity;
		
	}
}
