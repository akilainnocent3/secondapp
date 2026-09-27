package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ud3 implements vj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f156366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f156367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f156368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final de3 f156369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f156370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f156371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f156372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f156373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f156374i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ol3 f156375j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f156376k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f156377l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ip3 f156378m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f156379n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map f156380o;

    public ud3(boolean z10, ArrayList arrayList, LinkedHashMap linkedHashMap, de3 de3Var, String str, String str2, String str3, String str4, String str5, ol3 ol3Var, Integer num, String str6, ip3 ip3Var, ArrayList arrayList2, Map map) {
        this.f156366a = z10;
        this.f156367b = arrayList;
        this.f156368c = linkedHashMap;
        this.f156369d = de3Var;
        this.f156370e = str;
        this.f156371f = str2;
        this.f156372g = str3;
        this.f156373h = str4;
        this.f156374i = str5;
        this.f156375j = ol3Var;
        this.f156376k = num;
        this.f156377l = str6;
        this.f156378m = ip3Var;
        this.f156379n = arrayList2;
        this.f156380o = map;
    }

    @Override // yads.vj3
    public final Map a() {
        return this.f156380o;
    }

    public final de3 b() {
        return this.f156369d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud3)) {
            return false;
        }
        ud3 ud3Var = (ud3) obj;
        return this.f156366a == ud3Var.f156366a && kotlin.jvm.internal.m0.g(this.f156367b, ud3Var.f156367b) && kotlin.jvm.internal.m0.g(this.f156368c, ud3Var.f156368c) && kotlin.jvm.internal.m0.g(this.f156369d, ud3Var.f156369d) && kotlin.jvm.internal.m0.g(this.f156370e, ud3Var.f156370e) && kotlin.jvm.internal.m0.g(this.f156371f, ud3Var.f156371f) && kotlin.jvm.internal.m0.g(this.f156372g, ud3Var.f156372g) && kotlin.jvm.internal.m0.g(this.f156373h, ud3Var.f156373h) && kotlin.jvm.internal.m0.g(this.f156374i, ud3Var.f156374i) && kotlin.jvm.internal.m0.g(this.f156375j, ud3Var.f156375j) && kotlin.jvm.internal.m0.g(this.f156376k, ud3Var.f156376k) && kotlin.jvm.internal.m0.g(this.f156377l, ud3Var.f156377l) && kotlin.jvm.internal.m0.g(this.f156378m, ud3Var.f156378m) && kotlin.jvm.internal.m0.g(this.f156379n, ud3Var.f156379n) && kotlin.jvm.internal.m0.g(this.f156380o, ud3Var.f156380o);
    }

    public final int hashCode() {
        int iHashCode = (this.f156369d.hashCode() + ((this.f156368c.hashCode() + eb.a(this.f156367b, g8.a.a(this.f156366a) * 31, 31)) * 31)) * 31;
        String str = this.f156370e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f156371f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f156372g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f156373h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f156374i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ol3 ol3Var = this.f156375j;
        int iHashCode7 = (iHashCode6 + (ol3Var == null ? 0 : ol3Var.f153555a.hashCode())) * 31;
        Integer num = this.f156376k;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.f156377l;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ip3 ip3Var = this.f156378m;
        return this.f156380o.hashCode() + eb.a(this.f156379n, (iHashCode9 + (ip3Var != null ? ip3Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "VideoAd(isWrapper=" + this.f156366a + ", creatives=" + this.f156367b + ", rawTrackingEvents=" + this.f156368c + ", videoAdExtensions=" + this.f156369d + ", adSystem=" + this.f156370e + ", adTitle=" + this.f156371f + ", description=" + this.f156372g + ", survey=" + this.f156373h + ", vastAdTagUri=" + this.f156374i + ", viewableImpression=" + this.f156375j + ", sequence=" + this.f156376k + ", id=" + this.f156377l + ", wrapperConfiguration=" + this.f156378m + ", adVerifications=" + this.f156379n + ", trackingEvents=" + this.f156380o + gi.j.f86771d;
    }
}
