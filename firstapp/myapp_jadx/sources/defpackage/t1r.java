package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t1r {
    public final String a;
    public final k0r b;
    public final m2q c;
    public final boolean d;
    public final v4r e;
    public final y5q f;
    public final e0q g;
    public final boolean h;

    public /* synthetic */ t1r(String str, k0r k0rVar, m2q m2qVar, boolean z, v4r v4rVar, y5q y5qVar, e0q e0qVar, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? k0r.b.a : k0rVar, (i & 4) != 0 ? new m2q(0) : m2qVar, (i & 8) != 0 ? false : z, (i & 16) != 0 ? v4r.a.a : v4rVar, (i & 32) != 0 ? y5q.a.a : y5qVar, (i & 64) != 0 ? e0q.b.a : e0qVar, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1r)) {
            return false;
        }
        t1r t1rVar = (t1r) obj;
        return Intrinsics.g(this.a, t1rVar.a) && Intrinsics.g(this.b, t1rVar.b) && Intrinsics.g(this.c, t1rVar.c) && this.d == t1rVar.d && Intrinsics.g(this.e, t1rVar.e) && Intrinsics.g(this.f, t1rVar.f) && Intrinsics.g(this.g, t1rVar.g) && this.h == t1rVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + mtg0.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LNPlaceBetState(lotteryName=" + this.a + ", contentState=" + this.b + ", betPanelState=" + this.c + ", showErrorDialog=" + this.d + ", recentDrawState=" + this.e + ", drawInfoState=" + this.f + ", mainDrawPanelDialog=" + this.g + ", showLNLiveToastView=" + this.h + ")";
    }

    public t1r(String str, k0r k0rVar, m2q m2qVar, boolean z, v4r v4rVar, y5q y5qVar, e0q e0qVar, boolean z2) {
        str.getClass();
        k0rVar.getClass();
        m2qVar.getClass();
        v4rVar.getClass();
        y5qVar.getClass();
        e0qVar.getClass();
        this.a = str;
        this.b = k0rVar;
        this.c = m2qVar;
        this.d = z;
        this.e = v4rVar;
        this.f = y5qVar;
        this.g = e0qVar;
        this.h = z2;
    }

    public t1r() {
        this((String) null, (k0r) null, (m2q) null, false, (v4r) null, (y5q) null, (e0q) null, 255);
    }
}
