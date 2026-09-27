package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mz0 implements nz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152780a;

    public mz0(String str) {
        this.f152780a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mz0) && kotlin.jvm.internal.m0.g(this.f152780a, ((mz0) obj).f152780a);
    }

    public final int hashCode() {
        return this.f152780a.hashCode();
    }

    public final String toString() {
        return "Url(raw=" + this.f152780a + gi.j.f86771d;
    }
}
