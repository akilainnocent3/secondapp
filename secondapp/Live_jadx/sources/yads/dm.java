package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class dm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f148271d;

    public dm(String str, String str2, String str3, String str4) {
        this.f148268a = str;
        this.f148269b = str2;
        this.f148270c = str3;
        this.f148271d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm)) {
            return false;
        }
        dm dmVar = (dm) obj;
        return kotlin.jvm.internal.m0.g(this.f148268a, dmVar.f148268a) && kotlin.jvm.internal.m0.g(this.f148269b, dmVar.f148269b) && kotlin.jvm.internal.m0.g(this.f148270c, dmVar.f148270c) && kotlin.jvm.internal.m0.g(this.f148271d, dmVar.f148271d);
    }

    public final int hashCode() {
        String str = this.f148268a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f148269b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f148270c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f148271d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundColors(top=" + this.f148268a + ", right=" + this.f148269b + ", left=" + this.f148270c + ", bottom=" + this.f148271d + gi.j.f86771d;
    }
}
