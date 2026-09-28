package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.b;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class reo {
    public static UiText a(int i, int i2, ResourceUiText resourceUiText) {
        StringUiText stringUiText = vch0.a;
        Iterator it = b.k(resourceUiText, new StringUiText(" "), new StringUiText(d40.a(i, i2, ":"))).iterator();
        if (!it.hasNext()) {
            zkh.a("Empty collection can't be reduced.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = ((UiText) next).h((UiText) it.next());
        }
        return (UiText) next;
    }

    public static qeo b(String str) {
        jeo bVar;
        if (str == null || StringsKt.U(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == 'A') {
                i++;
                bVar = jeo.c.a;
            } else if (cCharAt == 'B') {
                i2++;
                bVar = jeo.a.a;
            } else if (cCharAt != 'H') {
                bVar = null;
            } else {
                StringUiText stringUiText = vch0.a;
                bVar = new jeo.b(a(i, i2, new ResourceUiText(R.string.bet_history__ht_abbreviation)));
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        StringUiText stringUiText2 = vch0.a;
        return new qeo(a4h.b(arrayList), a(i, i2, new ResourceUiText(R.string.bet_history__ft_abbreviation)));
    }
}
