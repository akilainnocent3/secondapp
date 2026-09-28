package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.cms.CMSLanguage;
import com.sporty.android.core.model.realsports.StakeConfig;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
public final class dr1 extends w7b {
    public static final Locale j = new Locale("pt", "br");

    public dr1(String str, String str2, int i) {
        super(CountryCodeName.BRAZIL, str, str2, "+55", i, TimeZone.getDefault().getDisplayName(false, 0), hp0.A.getString(R.string.oper_id_br), 11);
    }

    @Override // defpackage.w7b
    public final boolean C(String str) {
        str.getClass();
        return true;
    }

    @Override // defpackage.w7b
    public final boolean D() {
        return true;
    }

    @Override // defpackage.w7b
    public final UiText c() {
        return vch0.a;
    }

    @Override // defpackage.w7b
    public final int d() {
        return R.string.common_functions__contact_email__BR;
    }

    @Override // defpackage.w7b
    public final int e() {
        return R.string.common_functions__telephone__BR;
    }

    @Override // defpackage.w7b
    public final CMSLanguage f() {
        return CMSLanguage.PORTUGUESE_BRAZIL;
    }

    @Override // defpackage.w7b
    public final a700 g() {
        return new a700("int_deposit_min", "int_deposit_max", "int_withdraw_min", "int_withdraw_max");
    }

    @Override // defpackage.w7b
    public final StakeConfig h() {
        return StakeConfig.Companion.fallback$default(StakeConfig.INSTANCE, 20.0d, 20.0d, 500000.0d, 1000000.0d, 15.0d, 100000.0d, 0, Double.valueOf(4.5E8d), 5000, 64, null);
    }

    @Override // defpackage.w7b
    public final int i() {
        return R.string.app_common__sporty_display_url__BR;
    }

    @Override // defpackage.w7b
    public final int j() {
        return R.drawable.flag_br;
    }

    @Override // defpackage.w7b
    public final UiText k() {
        return null;
    }

    @Override // defpackage.w7b
    public final Locale l() {
        return j;
    }

    @Override // defpackage.w7b
    public final int m() {
        return R.string.common_functions__brazil;
    }

    @Override // defpackage.w7b
    public final UiText o() {
        return vch0.a;
    }

    @Override // defpackage.w7b
    public final ResourceUiText p() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.page_load_code__country);
    }

    @Override // defpackage.w7b
    public final int q() {
        return R.string.common_helps__license_statement;
    }

    @Override // defpackage.w7b
    public final boolean s() {
        return false;
    }

    @Override // defpackage.w7b
    public final boolean w() {
        return true;
    }
}
