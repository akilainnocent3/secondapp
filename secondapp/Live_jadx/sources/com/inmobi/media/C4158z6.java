package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.z6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4158z6 extends C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f58246a;

    public C4158z6(short s10) {
        this.f58246a = s10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4158z6) && this.f58246a == ((C4158z6) obj).f58246a;
    }

    public final int hashCode() {
        return this.f58246a;
    }

    public final String toString() {
        return "Failure(errorCode=" + ((int) this.f58246a) + gi.j.f86771d;
    }
}
