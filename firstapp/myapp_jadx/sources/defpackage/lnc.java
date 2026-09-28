package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lnc implements wvt {
    public final boolean a;
    public final boolean b;
    public final String c;

    public lnc(boolean z, boolean z2, String str) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnc)) {
            return false;
        }
        lnc lncVar = (lnc) obj;
        return this.a == lncVar.a && this.b == lncVar.b && Intrinsics.g(this.c, lncVar.c);
    }

    public final int hashCode() {
        int iA = mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return uf80.a(cwz.a("DailyStreakBanner(isDiamond=", ", showNew=", ", streakDisplayValue=", this.a, this.b), this.c, ")");
    }
}
