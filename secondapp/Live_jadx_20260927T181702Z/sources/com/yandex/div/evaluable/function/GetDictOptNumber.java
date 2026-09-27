package com.yandex.div.evaluable.function;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class GetDictOptNumber extends DictOptNumber {

    @l
    public static final GetDictOptNumber INSTANCE = new GetDictOptNumber();

    @l
    private static final String name = "getDictOptNumber";

    private GetDictOptNumber() {
    }

    @Override // com.yandex.div.evaluable.Function
    @l
    public String getName() {
        return name;
    }
}
