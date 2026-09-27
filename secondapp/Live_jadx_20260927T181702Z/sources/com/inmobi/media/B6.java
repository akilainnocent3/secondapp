package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class B6 extends C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3799kl f54389a;

    public B6() {
        this.f54389a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B6) && kotlin.jvm.internal.m0.g(this.f54389a, ((B6) obj).f54389a);
    }

    public final int hashCode() {
        C3799kl c3799kl = this.f54389a;
        if (c3799kl == null) {
            return 0;
        }
        return c3799kl.hashCode();
    }

    public final String toString() {
        return "UnAvailable(vastBeaconData=" + this.f54389a + gi.j.f86771d;
    }

    public B6(C3799kl c3799kl) {
        this.f54389a = c3799kl;
    }
}
