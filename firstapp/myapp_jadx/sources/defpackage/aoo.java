package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public final class aoo implements boo {
    public final int a;

    public aoo(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aoo) && this.a == ((aoo) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(R.color.custom_brand_secondary_variable_type3_type1) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return pe4.b(this.a, "InstantWinTicketDetailInsureOneCutState(iconResId=", ", iconTintResId=2131100100)");
    }
}
