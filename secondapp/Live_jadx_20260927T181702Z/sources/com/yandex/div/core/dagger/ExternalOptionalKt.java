package com.yandex.div.core.dagger;

import oy.l;
import qq.a0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ExternalOptionalKt {
    @l
    public static final <T> ExternalOptional<T> asExternal(@l a0<? extends T> a0Var) {
        return new ExternalOptional<>(a0Var);
    }
}
