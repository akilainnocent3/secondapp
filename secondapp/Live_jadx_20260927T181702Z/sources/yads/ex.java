package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ex extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148869a;

    public ex(String str) {
        super(0);
        this.f148869a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ex) && kotlin.jvm.internal.m0.g(this.f148869a, ((ex) obj).f148869a);
    }

    public final int hashCode() {
        String str = this.f148869a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "ConsentString(value=" + this.f148869a + gi.j.f86771d;
    }
}
