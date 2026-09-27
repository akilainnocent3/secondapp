package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class a10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ds.a f146608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f146610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f146611d;

    public a10(f02 f02Var, String str, int i10, int i11) {
        this.f146608a = f02Var;
        this.f146609b = str;
        this.f146610c = i10;
        this.f146611d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a10)) {
            return false;
        }
        a10 a10Var = (a10) obj;
        return kotlin.jvm.internal.m0.g(this.f146608a, a10Var.f146608a) && kotlin.jvm.internal.m0.g(this.f146609b, a10Var.f146609b) && this.f146610c == a10Var.f146610c && this.f146611d == a10Var.f146611d;
    }

    public final int hashCode() {
        int iHashCode = this.f146608a.hashCode() * 31;
        String str = this.f146609b;
        return this.f146611d + nd3.a(this.f146610c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "CoreNativeAdImage(getBitmap=" + this.f146608a + ", sizeType=" + this.f146609b + ", width=" + this.f146610c + ", height=" + this.f146611d + gi.j.f86771d;
    }
}
