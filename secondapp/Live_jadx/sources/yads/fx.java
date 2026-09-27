package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fx extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149285a;

    public fx(String str) {
        super(0);
        this.f149285a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fx) && kotlin.jvm.internal.m0.g(this.f149285a, ((fx) obj).f149285a);
    }

    public final int hashCode() {
        String str = this.f149285a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "Gdpr(value=" + this.f149285a + gi.j.f86771d;
    }
}
