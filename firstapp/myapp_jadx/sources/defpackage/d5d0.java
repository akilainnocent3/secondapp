package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class d5d0 {
    public final int a;
    public final ColoredUiText b;

    public d5d0(int i, ColoredUiText coloredUiText) {
        this.a = i;
        this.b = coloredUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5d0)) {
            return false;
        }
        d5d0 d5d0Var = (d5d0) obj;
        return this.a == d5d0Var.a && this.b.equals(d5d0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SportyPenaltyStatsRecordResultState(backgroundColorResId=" + this.a + ", resultUiText=" + this.b + ")";
    }
}
