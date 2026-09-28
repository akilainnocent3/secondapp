package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class r95 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        q95 q95Var;
        if (x1bVar instanceof q95) {
            q95Var = (q95) x1bVar;
            int i = q95Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q95Var.c = i - Integer.MIN_VALUE;
            } else {
                q95Var = new q95(this, x1bVar);
            }
        } else {
            q95Var = new q95(this, x1bVar);
        }
        Object obj = q95Var.a;
        y5b y5bVar = y5b.a;
        int i2 = q95Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            if (str.length() == 11) {
                return null;
            }
            q95Var.c = 1;
            if (hkd.b(1000L, q95Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.common_feedback__please_enter_a_valid_mobile_number);
    }
}
