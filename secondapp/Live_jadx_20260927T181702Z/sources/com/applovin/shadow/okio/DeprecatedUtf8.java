package com.applovin.shadow.okio;

import dr.g1;
import kotlin.jvm.internal.m0;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-DeprecatedUtf8, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@dr.o(message = "changed in Okio 2.x")
public final class DeprecatedUtf8 {

    @oy.l
    public static final DeprecatedUtf8 INSTANCE = new DeprecatedUtf8();

    private DeprecatedUtf8() {
    }

    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "string.utf8Size()", imports = {"com.applovin.shadow.okio.utf8Size"}))
    public final long size(@oy.l String string) {
        m0.p(string, "string");
        return Utf8.size$default(string, 0, 0, 3, null);
    }

    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "string.utf8Size(beginIndex, endIndex)", imports = {"com.applovin.shadow.okio.utf8Size"}))
    public final long size(@oy.l String string, int i10, int i11) {
        m0.p(string, "string");
        return Utf8.size(string, i10, i11);
    }
}
