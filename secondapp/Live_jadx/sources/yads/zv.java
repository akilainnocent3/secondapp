package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zv implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159054a;

    public zv(String str) {
        this.f159054a = str;
    }

    @Override // yads.m0
    public final String a() {
        return this.f159054a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zv) && kotlin.jvm.internal.m0.g(this.f159054a, ((zv) obj).f159054a);
    }

    public final int hashCode() {
        return this.f159054a.hashCode();
    }

    public final String toString() {
        return "CloseAction(actionType=" + this.f159054a + gi.j.f86771d;
    }
}
