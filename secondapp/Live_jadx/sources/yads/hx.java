package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hx extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150330a;

    public hx(String str) {
        super(0);
        this.f150330a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hx) && kotlin.jvm.internal.m0.g(this.f150330a, ((hx) obj).f150330a);
    }

    public final int hashCode() {
        String str = this.f150330a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "VendorConsents(value=" + this.f150330a + gi.j.f86771d;
    }
}
