package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class dh2 {

    @oy.l
    public static final ch2 Companion = new ch2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zv.j[] f148213b = {new dw.f(gh2.f149612a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f148214a;

    public /* synthetic */ dh2(int i10, List list) {
        if (1 != (i10 & 1)) {
            dw.g2.b(i10, 1, bh2.f147194a.getDescriptor());
        }
        this.f148214a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dh2) && kotlin.jvm.internal.m0.g(this.f148214a, ((dh2) obj).f148214a);
    }

    public final int hashCode() {
        return this.f148214a.hashCode();
    }

    public final String toString() {
        return "PrefetchedMediationData(mediationPrefetchAdapters=" + this.f148214a + gi.j.f86771d;
    }

    public dh2(List list) {
        this.f148214a = list;
    }
}
