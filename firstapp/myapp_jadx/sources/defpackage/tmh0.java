package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public final class tmh0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final List<String> l;
    public final List<String> m;

    public tmh0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = list;
        this.m = CollectionsKt.A0(ay0.V(new String[]{str2, str}));
    }

    public static tmh0 a(tmh0 tmh0Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i) {
        tmh0Var.getClass();
        String str10 = tmh0Var.a;
        if ((i & 4) != 0) {
            str = tmh0Var.b;
        }
        String str11 = str;
        if ((i & 8) != 0) {
            str2 = tmh0Var.c;
        }
        String str12 = str2;
        String str13 = (i & 16) != 0 ? tmh0Var.d : str3;
        String str14 = (i & 32) != 0 ? tmh0Var.e : str4;
        String str15 = (i & 64) != 0 ? tmh0Var.f : str5;
        String str16 = (i & 128) != 0 ? tmh0Var.g : str6;
        String str17 = (i & 256) != 0 ? tmh0Var.h : str7;
        String str18 = (i & 512) != 0 ? tmh0Var.i : str8;
        String str19 = tmh0Var.k;
        List<String> list = tmh0Var.l;
        tmh0Var.getClass();
        str11.getClass();
        str14.getClass();
        str15.getClass();
        str16.getClass();
        str18.getClass();
        str9.getClass();
        list.getClass();
        return new tmh0(str10, str11, str12, str13, str14, str15, str16, str17, str18, str9, str19, list);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    /* JADX WARN: Code duplicated, block: B:33:0x004c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0062  */
    /* JADX WARN: Code duplicated, block: B:53:0x0078  */
    /* JADX WARN: Code duplicated, block: B:62:0x008d  */
    public final tmh0 b(f750 f750Var) {
        String str;
        String strC = f750Var.getBaseHost();
        if (strC == null) {
            strC = this.b;
        } else {
            if (StringsKt.U(strC)) {
                strC = null;
            }
            if (strC == null) {
                strC = this.b;
            } else if (!c.k(strC, "/", false)) {
                strC = strC.concat("/");
            }
        }
        String str2 = strC;
        String strA = f750Var.getAliveApiBaseUrl();
        if (strA == null) {
            strA = this.j;
        } else {
            if (StringsKt.U(strA)) {
                strA = null;
            }
            if (strA == null) {
                strA = this.j;
            }
        }
        String str3 = strA;
        String strE = f750Var.getResourcesBaseUrl();
        if (strE == null) {
            strE = this.e;
        } else {
            if (StringsKt.U(strE)) {
                strE = null;
            }
            if (strE == null) {
                strE = this.e;
            }
        }
        String str4 = strE;
        String strF = f750Var.getSportyComUrl();
        if (strF == null) {
            strF = this.f;
        } else {
            if (StringsKt.U(strF)) {
                strF = null;
            }
            if (strF == null) {
                strF = this.f;
            }
        }
        String str5 = strF;
        String strB = f750Var.getAnalyticsAuthorization();
        if (strB == null) {
            strB = this.g;
        } else {
            if (StringsKt.U(strB)) {
                strB = null;
            }
            if (strB == null) {
                strB = this.g;
            }
        }
        String str6 = strB;
        String strD = f750Var.getLiveScoreUrl();
        if (strD == null) {
            str = this.i;
        } else {
            str = StringsKt.U(strD) ? null : strD;
            if (str == null) {
                str = this.i;
            }
        }
        return a(this, str2, null, null, str4, str5, str6, null, str, str3, 6427);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmh0)) {
            return false;
        }
        tmh0 tmh0Var = (tmh0) obj;
        return this.a.equals(tmh0Var.a) && this.b.equals(tmh0Var.b) && this.c.equals(tmh0Var.c) && this.d.equals(tmh0Var.d) && this.e.equals(tmh0Var.e) && this.f.equals(tmh0Var.f) && this.g.equals(tmh0Var.g) && Intrinsics.g(this.h, tmh0Var.h) && this.i.equals(tmh0Var.i) && this.j.equals(tmh0Var.j) && this.k.equals(tmh0Var.k) && Intrinsics.g(this.l, tmh0Var.l);
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(Boolean.hashCode(true) * 31, 31, this.a), 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        return this.l.hashCode() + gmf0.a(gmf0.a(gmf0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("UrlConfig(isProductionApiHost=true, defaultHost=", this.a, ", baseHost=", this.b, ", rootHost=");
        hxa.c(sbA, this.c, ", apiHost=", this.d, ", resourcesBaseUrl=");
        hxa.c(sbA, this.e, ", sportyComUrl=", this.f, ", analyticsAuthorization=");
        hxa.c(sbA, this.g, ", serverReplica=", this.h, ", liveScoreUrl=");
        hxa.c(sbA, this.i, ", aliveApiBaseUrl=", this.j, ", rumCollectorUrl=");
        return nve.a(this.k, ", cdnFallbackDomains=", ")", sbA, this.l);
    }
}
