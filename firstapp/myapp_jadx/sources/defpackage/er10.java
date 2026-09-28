package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class er10 {
    public final cr10 a;
    public final String b;
    public final boolean c;
    public final String d;

    public /* synthetic */ er10(int i, String str, boolean z) {
        this(cr10.TIME_OUT, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er10)) {
            return false;
        }
        er10 er10Var = (er10) obj;
        return this.a == er10Var.a && Intrinsics.g(this.b, er10Var.b) && this.c == er10Var.c && Intrinsics.g(this.d, er10Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iA = mtg0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return iA + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaytimeControlMainUiState(selectedFeature=");
        sb.append(this.a);
        sb.append(", remainingTimeOut=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return nyf.a(", cooldownTime=", this.d, ")", sb, this.c);
    }

    public er10() {
        this(15, null, false);
    }

    public er10(cr10 cr10Var, String str, boolean z, String str2) {
        cr10Var.getClass();
        this.a = cr10Var;
        this.b = str;
        this.c = z;
        this.d = str2;
    }
}
