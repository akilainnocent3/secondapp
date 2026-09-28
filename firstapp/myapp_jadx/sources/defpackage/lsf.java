package defpackage;

import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class lsf {
    public final cr10 a;
    public final i2z b;
    public final boolean c;
    public final int d;
    public final uf00<i2z> e;
    public final uf00<Integer> f;

    public lsf(cr10 cr10Var, i2z i2zVar) {
        int i;
        uf00<i2z> uf00Var;
        uf00<Integer> uf00VarA;
        cr10Var.getClass();
        this.a = cr10Var;
        this.b = i2zVar;
        this.c = i2zVar != null;
        int iOrdinal = cr10Var.ordinal();
        if (iOrdinal == 0) {
            i = R.string.playtime_control__self_exclusion_period;
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                throw null;
            }
            i = R.string.playtime_control__time_out_period;
        }
        this.d = i;
        int iOrdinal2 = cr10Var.ordinal();
        if (iOrdinal2 == 0) {
            uf00Var = msf.b;
        } else {
            if (iOrdinal2 != 1) {
                uhc.a();
                throw null;
            }
            uf00Var = msf.a;
        }
        this.e = uf00Var;
        int iOrdinal3 = cr10Var.ordinal();
        if (iOrdinal3 == 0) {
            uf00VarA = a4h.a(Integer.valueOf(R.string.playtime_control__in_a_self_exclusion_it_will_not_be_possible_to_operate_your_account_desc), Integer.valueOf(R.string.playtime_control__it_is_not_possible_to_cancel_a_self_exclusion_desc));
        } else {
            if (iOrdinal3 != 1) {
                uhc.a();
                throw null;
            }
            uf00VarA = a4h.a(Integer.valueOf(R.string.playtime_control__in_a_time_out_period_it_will_still_be_possible_to_log_in_and_make_a_withdrawal_desc), Integer.valueOf(R.string.playtime_control__if_you_wish_to_cancel_your_time_out_period_desc));
        }
        this.f = uf00VarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsf)) {
            return false;
        }
        lsf lsfVar = (lsf) obj;
        return this.a == lsfVar.a && Intrinsics.g(this.b, lsfVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        i2z i2zVar = this.b;
        return iHashCode + (i2zVar == null ? 0 : i2zVar.hashCode());
    }

    public final String toString() {
        return "EditPlayTimeControlUI(type=" + this.a + ", timePeriodSelected=" + this.b + lobGSRIlnSGJY.qyKXMkQWzbbr;
    }
}
