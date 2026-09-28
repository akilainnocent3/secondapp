package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ju3 implements ut3 {
    public final String a;
    public final String b;

    public ju3(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju3)) {
            return false;
        }
        ju3 ju3Var = (ju3) obj;
        return Intrinsics.g(this.a, ju3Var.a) && this.b.equals(ju3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + gpp.a(R.color.text_primary, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return tx5.a("BetslipSelectionRacingLabelContentState(oddsText=", this.a, ", oddsTextColorResId=2131101788, text=", this.b, ")");
    }
}
