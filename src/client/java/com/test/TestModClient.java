package com.test;

import com.test.item.TestItem;
import net.fabricmc.api.ClientModInitializer;

public class TestModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.

		TestItem.registertestitem();
		//调用TestItem类的registertestitem()方法


	}
}