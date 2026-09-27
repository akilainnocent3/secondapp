package com.applovin.shadow.okio;

import java.util.zip.Inflater;
import kotlin.jvm.internal.m0;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-InflaterSourceExtensions, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@cs.j(name = "-InflaterSourceExtensions")
public final class InflaterSourceExtensions {
    @oy.l
    public static final InflaterSource inflate(@oy.l Source source, @oy.l Inflater inflater) {
        m0.p(source, "<this>");
        m0.p(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }

    public static /* synthetic */ InflaterSource inflate$default(Source source, Inflater inflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inflater = new Inflater();
        }
        m0.p(source, "<this>");
        m0.p(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }
}
