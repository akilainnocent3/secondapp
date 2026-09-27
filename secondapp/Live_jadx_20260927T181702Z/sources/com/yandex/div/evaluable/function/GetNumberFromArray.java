package com.yandex.div.evaluable.function;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class GetNumberFromArray extends ArrayNumber {

    @l
    public static final GetNumberFromArray INSTANCE = new GetNumberFromArray();

    @l
    private static final String name = "getNumberFromArray";

    private GetNumberFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @l
    public String getName() {
        return name;
    }
}
