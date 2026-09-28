package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.patron.KycSource;
import com.sporty.android.core.model.realsports.StakeConfig;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class n9k0 extends w7b {
    @Override // defpackage.w7b
    public final boolean C(String str) {
        return true;
    }

    @Override // defpackage.w7b
    public final boolean D() {
        return false;
    }

    @Override // defpackage.w7b
    public final boolean a(KycSource kycSource) {
        return true;
    }

    @Override // defpackage.w7b
    public final UiText c() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.app_common__district);
    }

    @Override // defpackage.w7b
    public final int d() {
        return R.string.common_functions__contact_email__ZA;
    }

    @Override // defpackage.w7b
    public final int e() {
        return R.string.common_functions__telephone__ZA;
    }

    @Override // defpackage.w7b
    public final a700 g() {
        return new a700("za_deposit_min", "za_deposit_max", "za_withdraw_min", "za_withdraw_max");
    }

    @Override // defpackage.w7b
    public final StakeConfig h() {
        return StakeConfig.Companion.fallback$default(StakeConfig.INSTANCE, 1.0d, 1.0d, 12500.0d, 25000.0d, 1.0d, 2500.0d, 0, null, 0, 448, null);
    }

    @Override // defpackage.w7b
    public final int i() {
        return R.string.app_common__sporty_display_url__ZA;
    }

    @Override // defpackage.w7b
    public final int j() {
        return R.drawable.flag_za;
    }

    @Override // defpackage.w7b
    public final UiText k() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.main_footer__wap_18_age_tip__ZA);
    }

    @Override // defpackage.w7b
    public final int m() {
        return R.string.common_functions__south_africa;
    }

    @Override // defpackage.w7b
    public final UiText o() {
        return vch0.a;
    }

    @Override // defpackage.w7b
    public final ResourceUiText p() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.common_functions__region);
    }

    @Override // defpackage.w7b
    public final int q() {
        return R.string.main_footer__licence__ZA;
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
