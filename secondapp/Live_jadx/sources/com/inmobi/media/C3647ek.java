package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ek, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3647ek extends AbstractC3731i2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f56364e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3647ek(String eventType, String str, String eventSource) {
        super(eventType, str);
        kotlin.jvm.internal.m0.p(eventType, "eventType");
        kotlin.jvm.internal.m0.p(eventSource, "eventSource");
        this.f56364e = eventSource;
    }

    public final String toString() {
        return this.f56632a + " ";
    }
}
