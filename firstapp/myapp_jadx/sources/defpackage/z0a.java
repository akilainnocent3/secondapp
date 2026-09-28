package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class z0a implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lkf0.d(cb40.a(R.string.common_functions__amount_label, new Object[]{aVar.O(bij0.b)}, aVar), h.h(d.a.b, 16.0f, 0.0f, 2), c68.a(R.color.text_primary, aVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar), aVar, 48, 0, 131064);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new okj((jzm) qn70Var.a(jq40.a(jzm.class), null, null), (kzm) qn70Var.a(jq40.a(kzm.class), null, null), (lzm) qn70Var.a(jq40.a(lzm.class), null, null), (msm) qn70Var.a(jq40.a(msm.class), null, null), (zsm) qn70Var.a(jq40.a(zsm.class), null, null));
        }
    }
}
