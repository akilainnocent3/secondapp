package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class b00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f146997c;

    public b00(String str, String str2, String str3) {
        this.f146995a = str;
        this.f146996b = str2;
        this.f146997c = str3;
    }

    public final String a() {
        return this.f146996b;
    }

    public final String b() {
        return this.f146995a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b00)) {
            return false;
        }
        b00 b00Var = (b00) obj;
        return kotlin.jvm.internal.m0.g(this.f146995a, b00Var.f146995a) && kotlin.jvm.internal.m0.g(this.f146996b, b00Var.f146996b) && kotlin.jvm.internal.m0.g(this.f146997c, b00Var.f146997c);
    }

    public final int hashCode() {
        String str = this.f146995a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f146996b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f146997c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "CoreAdBreakRequestData(pageId=" + this.f146995a + ", impId=" + this.f146996b + ", url=" + this.f146997c + gi.j.f86771d;
    }
}
