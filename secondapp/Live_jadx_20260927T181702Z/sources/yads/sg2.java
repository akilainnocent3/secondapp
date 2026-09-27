package yads;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f155417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f155418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bb0 f155419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f155420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f155421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f155422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f155423i;

    public sg2(String str, String str2, Map map, Integer num, bb0 bb0Var, List list, List list2, String str3, String str4) {
        this.f155415a = str;
        this.f155416b = str2;
        this.f155417c = map;
        this.f155418d = num;
        this.f155419e = bb0Var;
        this.f155420f = list;
        this.f155421g = list2;
        this.f155422h = str3;
        this.f155423i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg2)) {
            return false;
        }
        sg2 sg2Var = (sg2) obj;
        return kotlin.jvm.internal.m0.g(this.f155415a, sg2Var.f155415a) && kotlin.jvm.internal.m0.g(this.f155416b, sg2Var.f155416b) && kotlin.jvm.internal.m0.g(this.f155417c, sg2Var.f155417c) && kotlin.jvm.internal.m0.g(this.f155418d, sg2Var.f155418d) && this.f155419e == sg2Var.f155419e && kotlin.jvm.internal.m0.g(this.f155420f, sg2Var.f155420f) && kotlin.jvm.internal.m0.g(this.f155421g, sg2Var.f155421g) && kotlin.jvm.internal.m0.g(this.f155422h, sg2Var.f155422h) && kotlin.jvm.internal.m0.g(this.f155423i, sg2Var.f155423i);
    }

    public final int hashCode() {
        int iA = k4.a(this.f155416b, this.f155415a.hashCode() * 31, 31);
        Map map = this.f155417c;
        int iHashCode = (iA + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.f155418d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        bb0 bb0Var = this.f155419e;
        int iHashCode3 = (iHashCode2 + (bb0Var == null ? 0 : bb0Var.hashCode())) * 31;
        List list = this.f155420f;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f155421g;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.f155422h;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f155423i;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "PreferredPackage(packageName=" + this.f155415a + ", url=" + this.f155416b + ", extras=" + this.f155417c + ", flags=" + this.f155418d + ", launchMode=" + this.f155419e + ", trackingUrls=" + this.f155420f + ", fallbackTrackingUrls=" + this.f155421g + ", deeplinkType=" + this.f155422h + ", className=" + this.f155423i + gi.j.f86771d;
    }
}
