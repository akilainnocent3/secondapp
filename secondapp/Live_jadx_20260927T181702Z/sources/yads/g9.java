package yads;

import android.location.Location;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f149473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f149474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f149475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Location f149476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f149477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f149478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f149479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gp2 f149480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f149481k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f149482l;

    public g9(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, String str6, gp2 gp2Var, boolean z10, String str7) {
        this.f149471a = str;
        this.f149472b = str2;
        this.f149473c = str3;
        this.f149474d = str4;
        this.f149475e = list;
        this.f149476f = location;
        this.f149477g = map;
        this.f149478h = str5;
        this.f149479i = str6;
        this.f149480j = gp2Var;
        this.f149481k = z10;
        this.f149482l = str7;
    }

    public static g9 a(g9 g9Var, Map map, String str, int i10) {
        String str2 = g9Var.f149471a;
        String str3 = g9Var.f149472b;
        String str4 = g9Var.f149473c;
        String str5 = g9Var.f149474d;
        List list = g9Var.f149475e;
        Location location = g9Var.f149476f;
        if ((i10 & 64) != 0) {
            map = g9Var.f149477g;
        }
        return new g9(str2, str3, str4, str5, list, location, map, g9Var.f149478h, g9Var.f149479i, g9Var.f149480j, g9Var.f149481k, (i10 & 2048) != 0 ? g9Var.f149482l : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9)) {
            return false;
        }
        g9 g9Var = (g9) obj;
        return kotlin.jvm.internal.m0.g(this.f149471a, g9Var.f149471a) && kotlin.jvm.internal.m0.g(this.f149472b, g9Var.f149472b) && kotlin.jvm.internal.m0.g(this.f149473c, g9Var.f149473c) && kotlin.jvm.internal.m0.g(this.f149474d, g9Var.f149474d) && kotlin.jvm.internal.m0.g(this.f149475e, g9Var.f149475e) && kotlin.jvm.internal.m0.g(this.f149476f, g9Var.f149476f) && kotlin.jvm.internal.m0.g(this.f149477g, g9Var.f149477g) && kotlin.jvm.internal.m0.g(this.f149478h, g9Var.f149478h) && kotlin.jvm.internal.m0.g(this.f149479i, g9Var.f149479i) && this.f149480j == g9Var.f149480j && this.f149481k == g9Var.f149481k && kotlin.jvm.internal.m0.g(this.f149482l, g9Var.f149482l);
    }

    public final int hashCode() {
        int iHashCode = this.f149471a.hashCode() * 31;
        String str = this.f149472b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f149473c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f149474d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f149475e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Location location = this.f149476f;
        int iHashCode6 = (iHashCode5 + (location == null ? 0 : location.hashCode())) * 31;
        Map map = this.f149477g;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.f149478h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f149479i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        gp2 gp2Var = this.f149480j;
        int iA = (g8.a.a(this.f149481k) + ((iHashCode9 + (gp2Var == null ? 0 : gp2Var.hashCode())) * 31)) * 31;
        String str6 = this.f149482l;
        return iA + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "AdRequestData(adUnitId=" + this.f149471a + ", age=" + this.f149472b + ", gender=" + this.f149473c + ", contextQuery=" + this.f149474d + ", contextTags=" + this.f149475e + ", location=" + this.f149476f + ", parameters=" + this.f149477g + ", openBiddingData=" + this.f149478h + ", readyResponse=" + this.f149479i + ", preferredTheme=" + this.f149480j + ", shouldLoadImagesAutomatically=" + this.f149481k + ", preloadType=" + this.f149482l + gi.j.f86771d;
    }
}
