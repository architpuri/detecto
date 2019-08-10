package com.aptechnolo.detecto.detecto;

import java.util.Optional;

public class CommonUtils {

	public static <E> E optionalToListConverter(Optional<E> list) {
		try {
			if(list.get().toString()!=null)
			{
				return list.get();
			}
		}catch(Exception E) {
		}
		return null;
	}
}