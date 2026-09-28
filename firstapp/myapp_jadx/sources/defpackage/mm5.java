package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.cms.CMSLanguage;
import com.sporty.android.core.model.patron.KycSource;
import com.sporty.android.core.model.realsports.StakeConfig;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class mm5 extends w7b {
    public static final Regex j = new Regex("^6[0-9]\\d{7}$");

    @Override // defpackage.w7b
    public final boolean C(String str) {
        str.getClass();
        Set<String> set = px40.a;
        return px40.a(str, a.c(j), a.c(new px40.a(this.h)));
    }

    @Override // defpackage.w7b
    public final boolean D() {
        return true;
    }

    @Override // defpackage.w7b
    public final boolean a(KycSource kycSource) {
        kycSource.getClass();
        return false;
    }

    @Override // defpackage.w7b
    public final List b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (!StringsKt.M((String) obj, "visa", false)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // defpackage.w7b
    public final UiText c() {
        return vch0.a;
    }

    @Override // defpackage.w7b
    public final int d() {
        return R.string.common_functions__contact_email__CM;
    }

    @Override // defpackage.w7b
    public final int e() {
        return R.string.common_functions__telephone__CM;
    }

    @Override // defpackage.w7b
    public final CMSLanguage f() {
        return CMSLanguage.FR;
    }

    @Override // defpackage.w7b
    public final a700 g() {
        return new a700("cm_deposit_min", "cm_deposit_max", "cm_withdraw_min", "cm_withdraw_max");
    }

    @Override // defpackage.w7b
    public final StakeConfig h() {
        return StakeConfig.Companion.fallback$default(StakeConfig.INSTANCE, 1.0d, 1.0d, 12500.0d, 25000.0d, 1.0d, 2500.0d, 0, null, 0, 448, null);
    }

    @Override // defpackage.w7b
    public final int i() {
        return R.string.app_common__sporty_display_url__CM;
    }

    @Override // defpackage.w7b
    public final int j() {
        return R.drawable.flag_cm;
    }

    @Override // defpackage.w7b
    public final UiText k() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.main_footer__licence__CM);
    }

    @Override // defpackage.w7b
    public final int m() {
        return R.string.common_functions__cameroon;
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
        return R.string.main_footer__licence__CM;
    }

    @Override // defpackage.w7b
    public final boolean s() {
        return false;
    }

    @Override // defpackage.w7b
    public final boolean w() {
        return true;
    }

    @Override // defpackage.w7b
    public final boolean x() {
        return true;
    }
}
