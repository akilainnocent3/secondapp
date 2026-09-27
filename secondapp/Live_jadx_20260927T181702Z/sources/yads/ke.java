package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd f151513a;

    public ke(vd vdVar) {
        this.f151513a = vdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ke) && kotlin.jvm.internal.m0.g(this.f151513a, ((ke) obj).f151513a);
    }

    public final int hashCode() {
        return this.f151513a.hashCode();
    }

    public final String toString() {
        return "Success(advertisingInfoHolder=" + this.f151513a + gi.j.f86771d;
    }
}
