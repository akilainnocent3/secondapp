package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class C2 implements ExternalAttribution {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B9 f95663a;

    public C2(@oy.l B9 b10) {
        this.f95663a = b10;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    @oy.l
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.f95663a);
    }

    @oy.l
    public final String toString() {
        return "ExternalAttribution(type=`" + L9.a(this.f95663a.f95604a) + "`value=`" + new String(this.f95663a.f95605b, cv.g.f77202b) + "`)";
    }
}
