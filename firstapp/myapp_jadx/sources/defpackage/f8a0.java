package defpackage;

import android.app.Dialog;
import android.content.Context;
import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f8a0 implements u1k.b {
    public final /* synthetic */ op8 a;

    public /* synthetic */ f8a0(op8 op8Var) {
        this.a = op8Var;
    }

    @Override // u1k.b
    public final Dialog a(Context context) {
        context.getClass();
        final Dialog dialog = new Dialog(context);
        final op8 op8Var = this.a;
        dialog.setContentView(mla.a(context, new op8(1975729060, new Function2() { // from class: g8a0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    op8Var.invoke(dialog, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true)));
        return dialog;
    }
}
