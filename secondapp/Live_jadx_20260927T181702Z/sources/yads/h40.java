package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class h40 {

    @oy.l
    public static final g40 Companion = new g40();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zv.j[] f149921f = {null, null, new dw.f(n50.f152883a), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f149924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f149925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f149926e;

    public /* synthetic */ h40(int i10, String str, String str2, List list, String str3, String str4) {
        if (6 != (i10 & 6)) {
            dw.g2.b(i10, 6, f40.f148965a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f149922a = null;
        } else {
            this.f149922a = str;
        }
        this.f149923b = str2;
        this.f149924c = list;
        if ((i10 & 8) == 0) {
            this.f149925d = null;
        } else {
            this.f149925d = str3;
        }
        if ((i10 & 16) == 0) {
            this.f149926e = null;
        } else {
            this.f149926e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h40)) {
            return false;
        }
        h40 h40Var = (h40) obj;
        return kotlin.jvm.internal.m0.g(this.f149922a, h40Var.f149922a) && kotlin.jvm.internal.m0.g(this.f149923b, h40Var.f149923b) && kotlin.jvm.internal.m0.g(this.f149924c, h40Var.f149924c) && kotlin.jvm.internal.m0.g(this.f149925d, h40Var.f149925d) && kotlin.jvm.internal.m0.g(this.f149926e, h40Var.f149926e);
    }

    public final int hashCode() {
        String str = this.f149922a;
        int iA = eb.a(this.f149924c, k4.a(this.f149923b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f149925d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f149926e;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelAdUnitBiddingMediation(adapter=" + this.f149922a + ", networkName=" + this.f149923b + ", biddingParameters=" + this.f149924c + ", adUnitId=" + this.f149925d + ", networkAdUnitIdName=" + this.f149926e + gi.j.f86771d;
    }
}
