package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class pcs {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public pcs(int i) {
        int i2 = i & 1;
        int i3 = R.style.B1_M;
        int i4 = i2 != 0 ? R.style.B2_M : R.style.B1_M;
        i3 = (i & 4) != 0 ? R.style.B2_R : i3;
        int i5 = (i & 8) != 0 ? R.style.B2_R : R.style.B1_B;
        this.a = i4;
        this.b = R.style.B2_R;
        this.c = i3;
        this.d = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcs)) {
            return false;
        }
        pcs pcsVar = (pcs) obj;
        return this.a == pcsVar.a && this.b == pcsVar.b && this.c == pcsVar.c && this.d == pcsVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + gpp.a(this.c, gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return b7f.a(dy5.a("LimitProgressBarStyle(title=", this.a, this.b, ", subTitle=", ", amountIndicator="), this.c, ", amountIndicatorLimitReached=", this.d, ")");
    }
}
