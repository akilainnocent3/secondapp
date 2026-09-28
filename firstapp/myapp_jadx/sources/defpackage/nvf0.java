package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class nvf0 {
    public final Map<Integer, Integer> a = kpu.f(new Pair(1, 10), new Pair(2, 20), new Pair(3, 30), new Pair(4, 45), new Pair(5, 60));

    public final auf0 a(auf0 auf0Var, boolean z) {
        auf0Var.getClass();
        if (!z) {
            return new auf0(0);
        }
        if (auf0Var.a != 0) {
            return auf0Var;
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.S(this.a.entrySet());
        int iIntValue = ((Number) entry.getKey()).intValue();
        int iIntValue2 = ((Number) entry.getValue()).intValue();
        Object[] objArr = {entry.getValue()};
        StringUiText stringUiText = vch0.a;
        return new auf0(iIntValue, iIntValue2, new ResourceUiText(R.string.page_time_alerts__vnum_minutes, ay0.S(objArr)));
    }
}
