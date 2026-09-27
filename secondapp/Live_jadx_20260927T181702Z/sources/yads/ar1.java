package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class ar1 {

    @oy.l
    public static final zq1 Companion = new zq1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f146908c;

    public /* synthetic */ ar1(int i10, String str, String str2, boolean z10) {
        if (7 != (i10 & 7)) {
            dw.g2.b(i10, 7, yq1.f158455a.getDescriptor());
        }
        this.f146906a = str;
        this.f146907b = str2;
        this.f146908c = z10;
    }

    public final String a() {
        return this.f146906a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar1)) {
            return false;
        }
        ar1 ar1Var = (ar1) obj;
        return kotlin.jvm.internal.m0.g(this.f146906a, ar1Var.f146906a) && kotlin.jvm.internal.m0.g(this.f146907b, ar1Var.f146907b) && this.f146908c == ar1Var.f146908c;
    }

    public final int hashCode() {
        int iHashCode = this.f146906a.hashCode() * 31;
        String str = this.f146907b;
        return g8.a.a(this.f146908c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "MediationAdapterData(format=" + this.f146906a + ", version=" + this.f146907b + ", isIntegrated=" + this.f146908c + gi.j.f86771d;
    }

    public ar1(String str, String str2, boolean z10) {
        this.f146906a = str;
        this.f146907b = str2;
        this.f146908c = z10;
    }
}
