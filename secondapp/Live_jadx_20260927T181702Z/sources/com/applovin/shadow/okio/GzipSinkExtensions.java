package com.applovin.shadow.okio;

import kotlin.jvm.internal.m0;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-GzipSinkExtensions, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@cs.j(name = "-GzipSinkExtensions")
public final class GzipSinkExtensions {
    @oy.l
    public static final GzipSink gzip(@oy.l Sink sink) {
        m0.p(sink, "<this>");
        return new GzipSink(sink);
    }
}
