package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fp40 extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object value;
        pp40 pp40Var = (pp40) this.receiver;
        wwd0 wwd0Var = pp40Var.b;
        String str = ((np40) wwd0Var.getValue()).a.a.b;
        if (StringsKt.U(str)) {
            do {
                value = wwd0Var.getValue();
                StringUiText stringUiText = vch0.a;
            } while (!wwd0Var.g(value, np40.a((np40) value, null, false, new ResourceUiText(R.string.gift__gift_code_is_required), 3)));
        } else {
            ej5.c(o8i0.d(pp40Var), null, null, new op40(pp40Var, str, null), 3);
        }
        return Unit.a;
    }
}
