package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ojk implements njk {
    @Override // defpackage.njk
    public final int a(awk awkVar) {
        int iOrdinal = awkVar.ordinal();
        if (iOrdinal == 0) {
            return R.color.brand_tertiary;
        }
        if (iOrdinal == 1) {
            return R.color.brand_secondary_variable_type2;
        }
        if (iOrdinal == 2) {
            return R.color.bg_discount_gift_secondary;
        }
        if (iOrdinal == 3) {
            return R.color.bg_free_bet_gift_secondary;
        }
        if (iOrdinal == 4) {
            return R.color.brand_tertiary;
        }
        if (iOrdinal == 5) {
            return R.color.text_virtual_build_and_go;
        }
        uhc.a();
        return 0;
    }

    @Override // defpackage.njk
    public final pjk c(awk awkVar, boolean z) {
        if (!z) {
            return new pjk(R.color.text_disable_type1_primary, R.color.custom_brand_secondary_disable_type1, R.color.text_disable_type1_primary, R.color.brand_tertiary);
        }
        int iOrdinal = awkVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return new pjk(R.color.bg_cash_gift_primary, R.color.brand_quaternary, R.color.brand_tertiary, R.color.bg_cash_gift_primary);
            }
            if (iOrdinal == 2) {
                return new pjk(R.color.bg_discount_gift_primary, R.color.bg_discount_gift_primary, R.color.brand_tertiary, R.color.bg_discount_gift_primary);
            }
            if (iOrdinal == 3) {
                return new pjk(R.color.bg_free_bet_gift_primary, R.color.bg_free_bet_gift_primary, R.color.brand_tertiary, R.color.bg_free_bet_gift_primary);
            }
            if (iOrdinal != 4) {
                if (iOrdinal == 5) {
                    return new pjk(R.color.text_virtual_build_and_go, R.color.text_virtual_build_and_go, R.color.brand_tertiary, R.color.text_virtual_build_and_go);
                }
                uhc.a();
                return null;
            }
        }
        return new pjk(R.color.custom_other002_typ1, R.color.custom_other002_typ1, R.color.brand_tertiary, R.color.custom_other002_typ1);
    }

    @Override // defpackage.njk
    public final pjk d(l25 l25Var, boolean z) {
        return z ? new pjk(R.color.text_warning, R.color.text_warning, R.color.brand_tertiary, R.color.text_warning) : new pjk(R.color.text_disable_type1_primary, R.color.custom_brand_secondary_disable_type1, R.color.text_disable_type1_primary, R.color.brand_tertiary);
    }

    @Override // defpackage.njk
    public final void b(l25 l25Var) {
    }
}
