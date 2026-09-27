package com.applovin.shadow.okio;

import kotlin.jvm.internal.m0;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-GzipSourceExtensions, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@cs.j(name = "-GzipSourceExtensions")
public final class GzipSourceExtensions {
    private static final int FCOMMENT = 4;
    private static final int FEXTRA = 2;
    private static final int FHCRC = 1;
    private static final int FNAME = 3;
    private static final byte SECTION_BODY = 1;
    private static final byte SECTION_DONE = 3;
    private static final byte SECTION_HEADER = 0;
    private static final byte SECTION_TRAILER = 2;

    private static final boolean getBit(int i10, int i11) {
        return ((i10 >> i11) & 1) == 1;
    }

    @oy.l
    public static final GzipSource gzip(@oy.l Source source) {
        m0.p(source, "<this>");
        return new GzipSource(source);
    }
}
