package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wl30 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final sl30 h;

    public wl30(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, sl30 sl30Var) {
        sl30Var.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = sl30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl30)) {
            return false;
        }
        wl30 wl30Var = (wl30) obj;
        return this.a == wl30Var.a && Intrinsics.g(this.b, wl30Var.b) && Intrinsics.g(this.c, wl30Var.c) && Intrinsics.g(this.d, wl30Var.d) && Intrinsics.g(this.e, wl30Var.e) && this.f == wl30Var.f && this.g == wl30Var.g && Intrinsics.g(this.h, wl30Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + mtg0.a(mtg0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "RCBetHistoryItemState(id=" + this.a + ", time=" + this.b + ", date=" + this.c + ", stake=" + this.d + ", result=" + this.e + ", isWin=" + this.f + ", hasGift=" + this.g + ", detail=" + this.h + ')';
    }

    public wl30() {
        this(-1, "", "", "", "", true, false, sl30.a.a);
    }
}
