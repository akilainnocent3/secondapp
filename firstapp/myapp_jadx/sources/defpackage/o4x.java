package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.realsports.StakeConfig;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class o4x extends w7b {
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
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.common_functions__government);
    }

    @Override // defpackage.w7b
    public final int d() {
        return R.string.common_functions__contact_email__NG;
    }

    @Override // defpackage.w7b
    public final int e() {
        return R.string.common_functions__telephone__NG;
    }

    @Override // defpackage.w7b
    public final a700 g() {
        return new a700("ng_deposit_min", "ng_trans_max", "ng_withdraw_min", "ng_withdraw_max");
    }

    @Override // defpackage.w7b
    public final StakeConfig h() {
        return StakeConfig.fallback(100.0d, 30.0d, 2000000.0d, 7000000.0d, 20.0d, 500000.0d);
    }

    @Override // defpackage.w7b
    public final int i() {
        return R.string.app_common__sporty_display_url;
    }

    @Override // defpackage.w7b
    public final int j() {
        return R.drawable.flag_ng;
    }

    @Override // defpackage.w7b
    public final UiText k() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.main_footer__wap_18_age_tip__NG);
    }

    @Override // defpackage.w7b
    public final int m() {
        return R.string.common_functions__nigeria;
    }

    @Override // defpackage.w7b
    public final UiText o() {
        return vch0.a;
    }

    @Override // defpackage.w7b
    public final ResourceUiText p() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.common_functions__state);
    }

    @Override // defpackage.w7b
    public final int q() {
        return R.string.main_footer__licence__NG;
    }

    @Override // defpackage.w7b
    public final boolean s() {
        return true;
    }

    @Override // defpackage.w7b
    public final boolean w() {
        return true;
    }

    @Override // defpackage.w7b
    public final boolean y() {
        return true;
    }

    @Override // defpackage.w7b
    public final boolean z() {
        return true;
    }
}
