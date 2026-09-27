package fk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    public final String f84859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public final String f84860b;

    public m0(@oy.m String str, @oy.m String str2) {
        this.f84859a = str;
        this.f84860b = str2;
    }

    public static /* synthetic */ m0 d(m0 m0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = m0Var.f84859a;
        }
        if ((i10 & 2) != 0) {
            str2 = m0Var.f84860b;
        }
        return m0Var.c(str, str2);
    }

    @oy.m
    public final String a() {
        return this.f84859a;
    }

    @oy.m
    public final String b() {
        return this.f84860b;
    }

    @oy.l
    public final m0 c(@oy.m String str, @oy.m String str2) {
        return new m0(str, str2);
    }

    @oy.m
    public final String e() {
        return this.f84860b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return kotlin.jvm.internal.m0.g(this.f84859a, m0Var.f84859a) && kotlin.jvm.internal.m0.g(this.f84860b, m0Var.f84860b);
    }

    @oy.m
    public final String f() {
        return this.f84859a;
    }

    public int hashCode() {
        String str = this.f84859a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f84860b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @oy.l
    public String toString() {
        return "FirebaseInstallationId(fid=" + this.f84859a + ", authToken=" + this.f84860b + ')';
    }
}
