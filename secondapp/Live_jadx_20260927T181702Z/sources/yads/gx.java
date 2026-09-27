package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gx extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149811a;

    public gx(String str) {
        super(0);
        this.f149811a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gx) && kotlin.jvm.internal.m0.g(this.f149811a, ((gx) obj).f149811a);
    }

    public final int hashCode() {
        String str = this.f149811a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "PurposeConsents(value=" + this.f149811a + gi.j.f86771d;
    }
}
