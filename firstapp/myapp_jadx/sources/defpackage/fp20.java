package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class fp20 {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Boolean g;
    public final String h;
    public final String i;
    public final List<String> j;
    public final Integer k;
    public final Integer l;
    public final String m;
    public final Long n;
    public final Long o;
    public final String p;
    public final Long q;
    public final String r;
    public final String s;

    public fp20(Integer num, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, List<String> list, Integer num2, Integer num3, String str8, Long l, Long l2, String str9, Long l3, String str10, String str11) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = bool;
        this.h = str6;
        this.i = str7;
        this.j = list;
        this.k = num2;
        this.l = num3;
        this.m = str8;
        this.n = l;
        this.o = l2;
        this.p = str9;
        this.q = l3;
        this.r = str10;
        this.s = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp20)) {
            return false;
        }
        fp20 fp20Var = (fp20) obj;
        return Intrinsics.g(this.a, fp20Var.a) && Intrinsics.g(this.b, fp20Var.b) && Intrinsics.g(this.c, fp20Var.c) && Intrinsics.g(this.d, fp20Var.d) && Intrinsics.g(this.e, fp20Var.e) && Intrinsics.g(this.f, fp20Var.f) && Intrinsics.g(this.g, fp20Var.g) && Intrinsics.g(this.h, fp20Var.h) && Intrinsics.g(this.i, fp20Var.i) && Intrinsics.g(this.j, fp20Var.j) && Intrinsics.g(this.k, fp20Var.k) && Intrinsics.g(this.l, fp20Var.l) && Intrinsics.g(this.m, fp20Var.m) && Intrinsics.g(this.n, fp20Var.n) && Intrinsics.g(this.o, fp20Var.o) && Intrinsics.g(this.p, fp20Var.p) && Intrinsics.g(this.q, fp20Var.q) && Intrinsics.g(this.r, fp20Var.r) && Intrinsics.g(this.s, fp20Var.s);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<String> list = this.j;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.k;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.l;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str8 = this.m;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l = this.n;
        int iHashCode14 = (iHashCode13 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.o;
        int iHashCode15 = (iHashCode14 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str9 = this.p;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l3 = this.q;
        int iHashCode17 = (iHashCode16 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str10 = this.r;
        int iHashCode18 = (iHashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.s;
        return iHashCode18 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PresentationStackerGameDetails(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", countryCode=");
        sb.append(this.c);
        sb.append(", displayName=");
        sb.append(this.d);
        sb.append(", nativeSupportVersion=");
        sb.append(this.e);
        sb.append(", launchUrl=");
        sb.append(this.f);
        sb.append(", forceUseWebView=");
        sb.append(this.g);
        sb.append(", launchTrigger=");
        sb.append(this.h);
        sb.append(", imageUrl=");
        sb.append(this.i);
        sb.append(", tags=");
        sb.append(this.j);
        sb.append(", position=");
        sb.append(this.k);
        sb.append(", launchRate=");
        sb.append(this.l);
        sb.append(", releasedAt=");
        sb.append(this.m);
        sb.append(", minimumSdkVersion=");
        sb.append(this.n);
        sb.append(", minimumAppVersionSupported=");
        sb.append(this.o);
        sb.append(", webviewVersion=");
        sb.append(this.p);
        sb.append(", minimumCMSVersionSupported=");
        sb.append(this.q);
        sb.append(", gameUrl=");
        sb.append(this.r);
        sb.append(", deepLinkCode=");
        return j26.a(sb, this.s, ')');
    }

    public fp20() {
        this(0, "", "", "", "", "", Boolean.FALSE, "", "", new ArrayList(), 0, 0, "", 0L, 0L, "", 0L, "", "");
    }
}
