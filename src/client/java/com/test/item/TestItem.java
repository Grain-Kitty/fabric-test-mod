package com.test.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TestItem {


    public static final Item TEST_ITEM =
            Registry.register(Registries.ITEM, new Identifier("test", "test_item"),
                    new Item(new Item.Settings().maxCount(20)));

    public static void registertestitem() {
    }

}
