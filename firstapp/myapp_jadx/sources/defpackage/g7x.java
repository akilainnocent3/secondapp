package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g7x {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final c7x g;

    public g7x(int i, String str, String str2, String str3, boolean z, boolean z2, c7x c7xVar) {
        c7xVar.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = c7xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7x)) {
            return false;
        }
        g7x g7xVar = (g7x) obj;
        return this.a == g7xVar.a && Intrinsics.g(this.b, g7xVar.b) && Intrinsics.g(this.c, g7xVar.c) && Intrinsics.g(this.d, g7xVar.d) && this.e == g7xVar.e && this.f == g7xVar.f && Intrinsics.g(this.g, g7xVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + mtg0.a(mtg0.a(gmf0.a(gmf0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "NNDBetHistoryItemState(id=" + this.a + ", time=" + this.b + ", stake=" + this.c + ", result=" + this.d + ", isWin=" + this.e + ", hasGift=" + this.f + ", detail=" + this.g + ')';
    }

    public g7x() {
        this(-1, "", "", "", true, false, c7x.a.a);
    }
}
