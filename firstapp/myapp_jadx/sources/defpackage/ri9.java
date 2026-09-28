package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ri9 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ ri9(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h9n.a(erz.a(2131231622, 0, aVar), null, h.h(d.a.b, 12.0f, 0.0f, 2), null, null, 0.0f, null, aVar, 432, 120);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new mp5((Context) qn70Var.a(jq40.a(Context.class), null, null));
        }
    }
}
