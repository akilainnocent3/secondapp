package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class g80 {

    @oy.l
    public static final f80 Companion = new f80();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final zv.j[] f149455g = {null, null, null, null, new dw.f(dw.c3.f79541a), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f149458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f149459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f149460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f149461f;

    public /* synthetic */ g80(int i10, String str, String str2, String str3, String str4, List list, String str5) {
        if (18 != (i10 & 18)) {
            dw.g2.b(i10, 18, e80.f148565a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f149456a = null;
        } else {
            this.f149456a = str;
        }
        this.f149457b = str2;
        if ((i10 & 4) == 0) {
            this.f149458c = null;
        } else {
            this.f149458c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f149459d = null;
        } else {
            this.f149459d = str4;
        }
        this.f149460e = list;
        if ((i10 & 32) == 0) {
            this.f149461f = null;
        } else {
            this.f149461f = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g80)) {
            return false;
        }
        g80 g80Var = (g80) obj;
        return kotlin.jvm.internal.m0.g(this.f149456a, g80Var.f149456a) && kotlin.jvm.internal.m0.g(this.f149457b, g80Var.f149457b) && kotlin.jvm.internal.m0.g(this.f149458c, g80Var.f149458c) && kotlin.jvm.internal.m0.g(this.f149459d, g80Var.f149459d) && kotlin.jvm.internal.m0.g(this.f149460e, g80Var.f149460e) && kotlin.jvm.internal.m0.g(this.f149461f, g80Var.f149461f);
    }

    public final int hashCode() {
        String str = this.f149456a;
        int iA = k4.a(this.f149457b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f149458c;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f149459d;
        int iA2 = eb.a(this.f149460e, (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f149461f;
        return iA2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelMediationNetwork(id=" + this.f149456a + ", name=" + this.f149457b + ", logoUrl=" + this.f149458c + ", adapterStatus=" + this.f149459d + ", adapters=" + this.f149460e + ", latestAdapterVersion=" + this.f149461f + gi.j.f86771d;
    }
}
