package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class xl90 implements yl90 {
    public final int a;

    public xl90(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xl90) && this.a == ((xl90) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(R.color.custom_brand_secondary_variable_type3_type1) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return pe4.b(this.a, "SimulationBetHistoryInsureOneCutState(iconResId=", ", iconTintResId=2131100100)");
    }
}
