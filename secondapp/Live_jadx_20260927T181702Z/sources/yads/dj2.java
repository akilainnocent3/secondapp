package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class dj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f148235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f148236e;

    public dj2(String str, String str2, String str3, String str4, String str5) {
        this.f148232a = str;
        this.f148233b = str2;
        this.f148234c = str3;
        this.f148235d = str4;
        this.f148236e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj2)) {
            return false;
        }
        dj2 dj2Var = (dj2) obj;
        return ib3.a(this.f148232a, dj2Var.f148232a) && ib3.a(this.f148233b, dj2Var.f148233b) && ib3.a(this.f148234c, dj2Var.f148234c) && ib3.a(this.f148235d, dj2Var.f148235d) && ib3.a(this.f148236e, dj2Var.f148236e);
    }

    public final int hashCode() {
        String str = this.f148232a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f148233b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f148234c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f148235d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f148236e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
