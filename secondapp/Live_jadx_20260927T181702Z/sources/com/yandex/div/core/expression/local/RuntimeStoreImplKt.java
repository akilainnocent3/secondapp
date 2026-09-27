package com.yandex.div.core.expression.local;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class RuntimeStoreImplKt {

    @l
    public static final String ERROR_PARENT_RUNTIME_NOT_STORED = "Parent runtime for path '%s' is not stored.";

    @l
    private static final String WARNING_LOCAL_USING_LOCAL_VARIABLES = "You are using local variables. Please ensure that all elements that use local variables and all of their parents recursively have an 'id' attribute.";
}
