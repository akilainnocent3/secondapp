package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class juo {
    public final psm a;
    public final StringUiText b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.GHANA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public juo(psm psmVar) {
        psmVar.getClass();
        this.a = psmVar;
        StringUiText stringUiText = vch0.a;
        this.b = new StringUiText("<br><br>");
    }

    public final ConcatUiText a() {
        int i = a.a[this.a.getCountryCode().ordinal()];
        StringUiText stringUiText = this.b;
        if (i == 1) {
            StringUiText stringUiText2 = vch0.a;
            return new ResourceUiText(R.string.page_payment__insufficient_balance_description, ay0.S(new Object[0])).h(stringUiText).h(new ResourceUiText(R.string.page_payment__insufficient_balance_description_2__GH, ay0.S(new Object[0])));
        }
        StringUiText stringUiText3 = vch0.a;
        return new ResourceUiText(R.string.page_payment__insufficient_balance_description, ay0.S(new Object[0])).h(stringUiText).h(new ResourceUiText(R.string.page_payment__insufficient_balance_description_2, ay0.S(new Object[0])));
    }
}
