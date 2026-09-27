package com.yandex.div.evaluable.function;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class GetArray extends ArrayFromDict {

    @l
    public static final GetArray INSTANCE = new GetArray();

    @l
    private static final String name = "getArray";
    private static final boolean isMethod = true;

    private GetArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @l
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.ArrayFromDict
    public boolean isMethod() {
        return isMethod;
    }
}
