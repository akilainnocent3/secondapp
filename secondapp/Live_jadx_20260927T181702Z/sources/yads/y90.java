package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class y90 extends ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x80 f158192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q50 f158193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f158194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f158195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f158196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f158197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f158198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c50 f158199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f158200k;

    public y90(String str, String str2, x80 x80Var, q50 q50Var, String str3, String str4, String str5, List list, List list2, c50 c50Var, String str6) {
        super(0);
        this.f158190a = str;
        this.f158191b = str2;
        this.f158192c = x80Var;
        this.f158193d = q50Var;
        this.f158194e = str3;
        this.f158195f = str4;
        this.f158196g = str5;
        this.f158197h = list;
        this.f158198i = list2;
        this.f158199j = c50Var;
        this.f158200k = str6;
    }

    public final String a() {
        return this.f158195f;
    }

    public final List b() {
        return this.f158198i;
    }

    public final String c() {
        return this.f158190a;
    }

    public final String d() {
        return this.f158196g;
    }

    public final List e() {
        return this.f158197h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y90)) {
            return false;
        }
        y90 y90Var = (y90) obj;
        return kotlin.jvm.internal.m0.g(this.f158190a, y90Var.f158190a) && kotlin.jvm.internal.m0.g(this.f158191b, y90Var.f158191b) && kotlin.jvm.internal.m0.g(this.f158192c, y90Var.f158192c) && kotlin.jvm.internal.m0.g(this.f158193d, y90Var.f158193d) && kotlin.jvm.internal.m0.g(this.f158194e, y90Var.f158194e) && kotlin.jvm.internal.m0.g(this.f158195f, y90Var.f158195f) && kotlin.jvm.internal.m0.g(this.f158196g, y90Var.f158196g) && kotlin.jvm.internal.m0.g(this.f158197h, y90Var.f158197h) && kotlin.jvm.internal.m0.g(this.f158198i, y90Var.f158198i) && this.f158199j == y90Var.f158199j && kotlin.jvm.internal.m0.g(this.f158200k, y90Var.f158200k);
    }

    public final c50 f() {
        return this.f158199j;
    }

    public final int hashCode() {
        int iHashCode = this.f158190a.hashCode() * 31;
        String str = this.f158191b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        x80 x80Var = this.f158192c;
        int iHashCode3 = (this.f158193d.hashCode() + ((iHashCode2 + (x80Var == null ? 0 : x80Var.hashCode())) * 31)) * 31;
        String str2 = this.f158194e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f158195f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f158196g;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f158197h;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f158198i;
        int iHashCode8 = (this.f158199j.hashCode() + ((iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
        String str5 = this.f158200k;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "MediationAdapter(name=" + this.f158190a + ", logoUrl=" + this.f158191b + ", infoFirst=" + this.f158192c + ", infoSecond=" + this.f158193d + ", waringMessage=" + this.f158194e + ", adUnitId=" + this.f158195f + ", networkAdUnitIdName=" + this.f158196g + ", parameters=" + this.f158197h + ", cpmFloors=" + this.f158198i + ", type=" + this.f158199j + ", sdk=" + this.f158200k + gi.j.f86771d;
    }

    public /* synthetic */ y90(String str, String str2, x80 x80Var, q50 q50Var, String str3, String str4, String str5, List list, List list2, c50 c50Var, String str6, int i10) {
        this(str, str2, x80Var, q50Var, str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? null : list, (i10 & 256) != 0 ? null : list2, (i10 & 512) != 0 ? c50.f147573e : c50Var, (i10 & 1024) != 0 ? null : str6);
    }
}
