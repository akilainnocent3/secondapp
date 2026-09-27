package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155884c;

    public tg(String str, String str2, String str3) {
        this.f155882a = str;
        this.f155883b = str2;
        this.f155884c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg)) {
            return false;
        }
        tg tgVar = (tg) obj;
        return kotlin.jvm.internal.m0.g(this.f155882a, tgVar.f155882a) && kotlin.jvm.internal.m0.g(this.f155883b, tgVar.f155883b) && kotlin.jvm.internal.m0.g(this.f155884c, tgVar.f155884c);
    }

    public final int hashCode() {
        String str = this.f155882a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f155883b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f155884c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AppMetricaIdentifiers(adGetUrl=" + this.f155882a + ", deviceId=" + this.f155883b + ", uuid=" + this.f155884c + gi.j.f86771d;
    }
}
