package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ch, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3593ch extends AbstractC3644eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56156b;

    public C3593ch(String message, int i10) {
        kotlin.jvm.internal.m0.p(message, "message");
        this.f56155a = i10;
        this.f56156b = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3593ch)) {
            return false;
        }
        C3593ch c3593ch = (C3593ch) obj;
        return this.f56155a == c3593ch.f56155a && kotlin.jvm.internal.m0.g(this.f56156b, c3593ch.f56156b);
    }

    public final int hashCode() {
        return this.f56156b.hashCode() + (this.f56155a * 31);
    }

    public final String toString() {
        return "Failure(statusCode=" + this.f56155a + ", message=" + this.f56156b + gi.j.f86771d;
    }
}
