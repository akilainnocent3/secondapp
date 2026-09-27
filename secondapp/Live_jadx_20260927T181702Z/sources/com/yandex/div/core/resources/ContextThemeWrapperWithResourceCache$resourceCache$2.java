package com.yandex.div.core.resources;

import kotlin.jvm.internal.o0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ContextThemeWrapperWithResourceCache$resourceCache$2 extends o0 implements ds.a<PrimitiveResourceCache> {
    final /* synthetic */ ContextThemeWrapperWithResourceCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextThemeWrapperWithResourceCache$resourceCache$2(ContextThemeWrapperWithResourceCache contextThemeWrapperWithResourceCache) {
        super(0);
        this.this$0 = contextThemeWrapperWithResourceCache;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.a
    @l
    public final PrimitiveResourceCache invoke() {
        return new PrimitiveResourceCache(super/*r.d*/.getResources());
    }
}
