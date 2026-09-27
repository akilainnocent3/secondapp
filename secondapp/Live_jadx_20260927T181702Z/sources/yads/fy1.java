package yads;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cq2 f149297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f149298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f149299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f149300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final if1 f149301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j5 f149302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f149303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f149304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gc f149305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f149306j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f149307k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f149308l;

    public fy1(cq2 cq2Var, List list, String str, String str2, if1 if1Var, j5 j5Var, List list2, List list3, gc gcVar, String str3, String str4, Map map) {
        this.f149297a = cq2Var;
        this.f149298b = list;
        this.f149299c = str;
        this.f149300d = str2;
        this.f149301e = if1Var;
        this.f149302f = j5Var;
        this.f149303g = list2;
        this.f149304h = list3;
        this.f149305i = gcVar;
        this.f149306j = str3;
        this.f149307k = str4;
        this.f149308l = map;
    }

    public final if1 a() {
        return this.f149301e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy1)) {
            return false;
        }
        fy1 fy1Var = (fy1) obj;
        return this.f149297a == fy1Var.f149297a && kotlin.jvm.internal.m0.g(this.f149298b, fy1Var.f149298b) && kotlin.jvm.internal.m0.g(this.f149299c, fy1Var.f149299c) && kotlin.jvm.internal.m0.g(this.f149300d, fy1Var.f149300d) && kotlin.jvm.internal.m0.g(this.f149301e, fy1Var.f149301e) && kotlin.jvm.internal.m0.g(this.f149302f, fy1Var.f149302f) && kotlin.jvm.internal.m0.g(this.f149303g, fy1Var.f149303g) && kotlin.jvm.internal.m0.g(this.f149304h, fy1Var.f149304h) && kotlin.jvm.internal.m0.g(this.f149305i, fy1Var.f149305i) && kotlin.jvm.internal.m0.g(this.f149306j, fy1Var.f149306j) && kotlin.jvm.internal.m0.g(this.f149307k, fy1Var.f149307k) && kotlin.jvm.internal.m0.g(this.f149308l, fy1Var.f149308l);
    }

    public final int hashCode() {
        int iA = eb.a(this.f149298b, this.f149297a.hashCode() * 31, 31);
        String str = this.f149299c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f149300d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        if1 if1Var = this.f149301e;
        int iHashCode3 = (iHashCode2 + (if1Var == null ? 0 : if1Var.hashCode())) * 31;
        j5 j5Var = this.f149302f;
        int iA2 = eb.a(this.f149304h, eb.a(this.f149303g, (iHashCode3 + (j5Var == null ? 0 : j5Var.f150935b.hashCode())) * 31, 31), 31);
        gc gcVar = this.f149305i;
        int iHashCode4 = (iA2 + (gcVar == null ? 0 : gcVar.hashCode())) * 31;
        String str3 = this.f149306j;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f149307k;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map map = this.f149308l;
        return iHashCode6 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "Native(responseNativeType=" + this.f149297a + ", assets=" + this.f149298b + ", adId=" + this.f149299c + ", info=" + this.f149300d + ", link=" + this.f149301e + ", impressionData=" + this.f149302f + ", renderTrackingUrls=" + this.f149303g + ", showNotices=" + this.f149304h + ", additionalInfo=" + this.f149305i + ", creativeId=" + this.f149306j + ", campaignId=" + this.f149307k + ", analyticsParameters=" + this.f149308l + gi.j.f86771d;
    }
}
