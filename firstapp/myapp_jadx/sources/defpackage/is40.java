package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class is40 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public /* synthetic */ is40(int i) {
        this((i & 1) != 0 ? R.string.page_login__registration_successful : R.string.page_login__congratulations, (i & 2) != 0 ? R.string.page_login__register_success_default_body : R.string.page_login__feel_free_to_explore_sportybet_facial_recognition_later);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is40)) {
            return false;
        }
        is40 is40Var = (is40) obj;
        return this.a == is40Var.a && this.b == is40Var.b && this.c == is40Var.c && this.d == is40Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + gpp.a(this.c, gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return b7f.a(dy5.a("RegSuccessBottomSheetCopy(titleRes=", this.a, this.b, ", bodyRes=", ", primaryButtonRes="), this.c, ", loyaltyBannerPillRes=", this.d, ")");
    }

    public is40(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = R.string.reg_succ__registration_success_dposit_now;
        this.d = R.string.page_login__register_success_loyalty_pill;
    }
}
