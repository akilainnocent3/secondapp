package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.cms.CMSLanguage;
import com.sporty.android.core.model.realsports.StakeConfig;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ugu extends w7b {
    @Override // defpackage.w7b
    public final boolean B() {
        return true;
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
        return R.string.int_email;
    }

    @Override // defpackage.w7b
    public final int e() {
        return R.string.int_telephone;
    }

    @Override // defpackage.w7b
    public final CMSLanguage f() {
        return CMSLanguage.SPANISH_MX;
    }

    @Override // defpackage.w7b
    public final a700 g() {
        return new a700("int_deposit_min", "int_deposit_max", "int_withdraw_min", "int_withdraw_max");
    }

    @Override // defpackage.w7b
    public final StakeConfig h() {
        return StakeConfig.Companion.fallback$default(StakeConfig.INSTANCE, 20.0d, 20.0d, 500000.0d, 1000000.0d, 15.0d, 100000.0d, 0, null, 0, 448, null);
    }

    @Override // defpackage.w7b
    public final int i() {
        return R.string.app_common__sporty_display_url__MX;
    }

    @Override // defpackage.w7b
    public final int j() {
        return R.drawable.flag_mx;
    }

    @Override // defpackage.w7b
    public final UiText k() {
        StringUiText stringUiText = vch0.a;
        ConcatUiText concatUiTextH = jz4.a(new ResourceUiText(R.string.main_footer__wap_18_age_tip__MX), "<br><br>").h(new ResourceUiText(R.string.main_footer__licence__mx)).h(new StringUiText("<br>"));
        String string = hp0.A.getString(R.string.mx_support_email);
        string.getClass();
        return concatUiTextH.h(new ResourceUiText(R.string.main_footer__mail_to, ay0.S(new Object[]{string}))).h(new StringUiText("<br>"));
    }

    @Override // defpackage.w7b
    public final int m() {
        return R.string.common_functions__mexico;
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
    public final boolean t() {
        return true;
    }

    @Override // defpackage.w7b
    public final boolean u() {
        return true;
    }

    @Override // defpackage.w7b
    public final boolean v() {
        return true;
    }

    @Override // defpackage.w7b
    public final boolean w() {
        return true;
    }
}
