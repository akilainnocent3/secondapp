package yads;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ny0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f153260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f153261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f153262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gp2 f153263g;

    public ny0(String str, String str2, String str3, String str4, List list, Map map, gp2 gp2Var) {
        this.f153257a = str;
        this.f153258b = str2;
        this.f153259c = str3;
        this.f153260d = str4;
        this.f153261e = list;
        this.f153262f = map;
        this.f153263g = gp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny0)) {
            return false;
        }
        ny0 ny0Var = (ny0) obj;
        return kotlin.jvm.internal.m0.g(this.f153257a, ny0Var.f153257a) && kotlin.jvm.internal.m0.g(this.f153258b, ny0Var.f153258b) && kotlin.jvm.internal.m0.g(this.f153259c, ny0Var.f153259c) && kotlin.jvm.internal.m0.g(this.f153260d, ny0Var.f153260d) && kotlin.jvm.internal.m0.g(this.f153261e, ny0Var.f153261e) && kotlin.jvm.internal.m0.g(this.f153262f, ny0Var.f153262f) && this.f153263g == ny0Var.f153263g;
    }

    public final int hashCode() {
        int iHashCode = this.f153257a.hashCode() * 31;
        String str = this.f153258b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f153259c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f153260d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f153261e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.f153262f;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        gp2 gp2Var = this.f153263g;
        return iHashCode6 + (gp2Var != null ? gp2Var.hashCode() : 0);
    }

    public final String toString() {
        return "FullscreenCacheParams(adUnitId=" + this.f153257a + ", age=" + this.f153258b + ", gender=" + this.f153259c + ", contextQuery=" + this.f153260d + ", contextTags=" + this.f153261e + ", parameters=" + this.f153262f + ", preferredTheme=" + this.f153263g + gi.j.f86771d;
    }
}
