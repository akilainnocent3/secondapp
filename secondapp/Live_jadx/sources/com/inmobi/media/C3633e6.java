package com.inmobi.media;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.e6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3633e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f56337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56338b;

    public C3633e6(String payload, ArrayList eventIDs) {
        kotlin.jvm.internal.m0.p(eventIDs, "eventIDs");
        kotlin.jvm.internal.m0.p(payload, "payload");
        this.f56337a = eventIDs;
        this.f56338b = payload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3633e6)) {
            return false;
        }
        C3633e6 c3633e6 = (C3633e6) obj;
        return kotlin.jvm.internal.m0.g(this.f56337a, c3633e6.f56337a) && kotlin.jvm.internal.m0.g(this.f56338b, c3633e6.f56338b);
    }

    public final int hashCode() {
        return g8.a.a(false) + ((this.f56338b.hashCode() + (this.f56337a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "EventPayload(eventIDs=" + this.f56337a + ", payload=" + this.f56338b + ", shouldFlushOnFailure=false" + gi.j.f86771d;
    }
}
