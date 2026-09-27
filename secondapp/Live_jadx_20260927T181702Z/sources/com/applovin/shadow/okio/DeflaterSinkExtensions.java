package com.applovin.shadow.okio;

import java.util.zip.Deflater;
import kotlin.jvm.internal.m0;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-DeflaterSinkExtensions, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@cs.j(name = "-DeflaterSinkExtensions")
public final class DeflaterSinkExtensions {
    @oy.l
    public static final DeflaterSink deflate(@oy.l Sink sink, @oy.l Deflater deflater) {
        m0.p(sink, "<this>");
        m0.p(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }

    public static /* synthetic */ DeflaterSink deflate$default(Sink sink, Deflater deflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deflater = new Deflater();
        }
        m0.p(sink, "<this>");
        m0.p(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }
}
