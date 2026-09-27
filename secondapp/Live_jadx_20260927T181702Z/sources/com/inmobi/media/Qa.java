package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Qa extends Sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55363a;

    public Qa(int i10) {
        this.f55363a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Qa) && this.f55363a == ((Qa) obj).f55363a;
    }

    public final int hashCode() {
        return this.f55363a;
    }

    public final String toString() {
        return "InValid(errorCode=" + this.f55363a + gi.j.f86771d;
    }
}
