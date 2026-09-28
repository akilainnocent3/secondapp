package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public final class qnc {
    public static cwf0 a(int i, int i2, String str) {
        str.getClass();
        if (str.length() == 0) {
            return cwf0.b.a;
        }
        try {
            int i3 = Integer.parseInt(str);
            if (i3 < i) {
                Object[] objArr = {Integer.valueOf(i)};
                StringUiText stringUiText = vch0.a;
                return new cwf0.a(new ResourceUiText(R.string.page_limits__the_minimum_time_limit_that_can_be_set_must_be_vnum_minutes, ay0.S(objArr)));
            }
            if (i3 <= i2) {
                return cwf0.b.a;
            }
            Object[] objArr2 = {Integer.valueOf(i2)};
            StringUiText stringUiText2 = vch0.a;
            return new cwf0.a(new ResourceUiText(R.string.page_limits__the_amount_must_be_higher_than_the_weekly_limit, ay0.S(objArr2)));
        } catch (NumberFormatException unused) {
            StringUiText stringUiText3 = vch0.a;
            return new cwf0.a(new ResourceUiText(R.string.page_limits__invalid_value_error));
        }
    }
}
