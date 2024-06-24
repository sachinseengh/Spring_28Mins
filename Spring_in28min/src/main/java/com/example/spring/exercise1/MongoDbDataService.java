package com.example.spring.exercise1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MongoDbDataService implements DataService {

	@Override
	public int[] retrieveData() {
		return new int[] {11,22,33,44,55};
	}

}
