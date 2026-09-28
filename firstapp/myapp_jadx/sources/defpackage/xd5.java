package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xd5 extends pf implements iaj<List<? extends GiftDetails>, m780, String, v1b<? super fe5>, Object> {
    @Override // defpackage.iaj
    public final Object d(List<? extends GiftDetails> list, m780 m780Var, String str, v1b<? super fe5> v1bVar) {
        List<? extends GiftDetails> list2 = list;
        m780 m780Var2 = m780Var;
        String str2 = str;
        ((be5) this.a).getClass();
        if (!list2.isEmpty()) {
            if (m780Var2 == null) {
                StringUiText stringUiText = vch0.a;
                Iterator it = b.k(new ResourceUiText(R.string.common_functions__gifts), new StringUiText(" x"), vch0.d(String.valueOf(list2.size()))).iterator();
                if (!it.hasNext()) {
                    zkh.a("Empty collection can't be reduced.");
                    return null;
                }
                Object next = it.next();
                while (it.hasNext()) {
                    next = ((UiText) next).h((UiText) it.next());
                }
                return new fe5.b((UiText) next);
            }
            BigDecimal bigDecimalG = kotlin.text.b.g(m780Var2.a);
            if (bigDecimalG != null) {
                BigDecimal bigDecimalG2 = kotlin.text.b.g(str2);
                if (bigDecimalG2 == null) {
                    bigDecimalG2 = BigDecimal.ZERO;
                }
                BigDecimal bigDecimalMin = bigDecimalG.min(bigDecimalG2);
                StringUiText stringUiText2 = vch0.a;
                Iterator it2 = b.k(new ResourceUiText(R.string.common_functions__gifts), new StringUiText(" -"), new StringUiText(bjb0.L(bigDecimalMin, Locale.US))).iterator();
                if (!it2.hasNext()) {
                    zkh.a("Empty collection can't be reduced.");
                    return null;
                }
                Object next2 = it2.next();
                while (it2.hasNext()) {
                    next2 = ((UiText) next2).h((UiText) it2.next());
                }
                return new fe5.a((UiText) next2);
            }
        }
        return null;
    }
}
