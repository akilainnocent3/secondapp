package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95840c;

    public G(int i10, int i11, int i12) {
        this.f95838a = i10;
        this.f95839b = i11;
        this.f95840c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.m0.g(G.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.id.AdvIdGetterController.CanTrackIdentifiers");
        }
        G g10 = (G) obj;
        return this.f95838a == g10.f95838a && this.f95839b == g10.f95839b && this.f95840c == g10.f95840c;
    }

    public final int hashCode() {
        return L7.a(this.f95840c) + ((L7.a(this.f95839b) + (L7.a(this.f95838a) * 31)) * 31);
    }

    public final String toString() {
        return "CanTrackIdentifiers(canTrackGaid=" + H.a(this.f95838a) + ", canTrackHoaid=" + H.a(this.f95839b) + ", canTrackYandexAdvId=" + H.a(this.f95840c) + ')';
    }
}
