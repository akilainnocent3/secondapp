package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ur90 implements vr90 {
    public final int a;

    public ur90(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ur90) && this.a == ((ur90) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(R.color.custom_brand_secondary_variable_type3_type1) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return pe4.b(this.a, "SimulationTicketDetailInsureOneCutState(iconResId=", ", iconTintResId=2131100100)");
    }
}
