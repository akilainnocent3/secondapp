package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.realsports.StakeConfig;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class bbk0 extends w7b {
    @Override // defpackage.w7b
    public final boolean A() {
        return true;
    }

    @Override // defpackage.w7b
    public final boolean C(String str) {
        return true;
    }

    @Override // defpackage.w7b
    public final boolean D() {
        return false;
    }

    @Override // defpackage.w7b
    public final UiText c() {
        return vch0.a;
    }

    @Override // defpackage.w7b
    public final int d() {
        return R.string.common_functions__contact_email__ZM;
    }

    @Override // defpackage.w7b
    public final int e() {
        return R.string.common_functions__telephone__ZM;
    }

    @Override // defpackage.w7b
    public final a700 g() {
        return new a700("zm_deposit_min", "zm_deposit_max", "zm_withdraw_min", "zm_withdraw_max");
    }

    @Override // defpackage.w7b
    public final StakeConfig h() {
        return StakeConfig.fallback(2.0d, 2.0d, 25000.0d, 50000.0d, 2.0d, 5000.0d);
    }

    @Override // defpackage.w7b
    public final int i() {
        return R.string.app_common__sporty_display_url;
    }

    @Override // defpackage.w7b
    public final int j() {
        return R.drawable.flag_zm;
    }

    @Override // defpackage.w7b
    public final UiText k() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.main_footer__wap_18_age_tip__ZM);
    }

    @Override // defpackage.w7b
    public final int m() {
        return R.string.common_functions__zambia;
    }

    @Override // defpackage.w7b
    public final UiText o() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.page_login__can_only_be_registered_thru_providers_for_now__ZM);
    }

    @Override // defpackage.w7b
    public final ResourceUiText p() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.common_functions__region);
    }

    @Override // defpackage.w7b
    public final int q() {
        return R.string.main_footer__licence__ZM;
    }

    @Override // defpackage.w7b
    public final boolean s() {
        return false;
    }

    @Override // defpackage.w7b
    public final boolean w() {
        return false;
    }
}
