package com.aptechnolo.detecto.detecto;

import java.io.Serializable;
import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

public class DatabaseInterceptor extends EmptyInterceptor {
	@Override
    public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        // do your checks here
        return false;
    }

}
