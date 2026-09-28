package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class dv0 {
    public final DecimalFormat a = new DecimalFormat("#.##");

    public final ev0 a(long j, List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((bv0) next).a != l25.RakeBack);
        bv0 bv0Var = (bv0) next;
        if (bv0Var != null) {
            return b(bv0Var, j);
        }
        return null;
    }

    public final ev0 b(bv0 bv0Var, long j) {
        long j2 = bv0Var.b - j;
        if (j2 < 0) {
            j2 = 0;
        }
        String str = this.a.format((((double) bv0Var.c) / 100.0d) + 1.0d);
        str.getClass();
        StringUiText stringUiText = vch0.a;
        return new ev0(new StringUiText(str), new ConcatUiText(new UiText[]{new ResourceUiText(R.string.page_loyalty__boost_left), new StringUiText(" "), new StringUiText(w250.a(j2))}));
    }
}
