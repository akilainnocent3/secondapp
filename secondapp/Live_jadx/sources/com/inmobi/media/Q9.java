package com.inmobi.media;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class Q9 extends AbstractC3731i2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f55362f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q9(String eventId, String componentType, String eventType, String str) {
        super(eventType, str);
        kotlin.jvm.internal.m0.p(eventId, "eventId");
        kotlin.jvm.internal.m0.p(componentType, "componentType");
        kotlin.jvm.internal.m0.p(eventType, "eventType");
        this.f55361e = eventId;
        this.f55362f = componentType;
    }

    public final String toString() {
        return this.f56632a + to.c.phraseDel + this.f55362f + " ";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Q9(String str, String str2, String str3) {
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        this(string, str, str2, str3);
    }
}
