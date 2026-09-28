package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.realsports.StakeConfig;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class wcj extends w7b {
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
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.app_common__district);
    }

    @Override // defpackage.w7b
    public final int d() {
        return R.string.common_functions__contact_email__GH;
    }

    @Override // defpackage.w7b
    public final int e() {
        return R.string.common_functions__telephone__GH;
    }

    @Override // defpackage.w7b
    public final a700 g() {
        return new a700("gh_deposit_min", "gh_deposit_max", "gh_withdraw_min", "gh_withdraw_max");
    }

    @Override // defpackage.w7b
    public final StakeConfig h() {
        return StakeConfig.fallback(1.0d, 1.0d, 12500.0d, 25000.0d, 1.0d, 2500.0d);
    }

    @Override // defpackage.w7b
    public final int i() {
        return R.string.app_common__sporty_display_url;
    }

    @Override // defpackage.w7b
    public final int j() {
        return R.drawable.flag_gh;
    }

    @Override // defpackage.w7b
    public final UiText k() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.main_footer__wap_18_age_tip__GH);
    }

    @Override // defpackage.w7b
    public final int m() {
        return R.string.common_functions__ghana;
    }

    @Override // defpackage.w7b
    public final int n() {
        return R.string.page_payment__online_deposit_has_been_initiated_on_your_phone_tip__GH;
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
        return R.string.main_footer__licence__GH;
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
