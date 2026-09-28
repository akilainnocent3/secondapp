package defpackage;

import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yvx implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yvx(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Window window = (Window) obj;
                if (window != null) {
                    window.setGravity(80);
                }
                return Unit.a;
            default:
                zy10 zy10Var = (zy10) obj;
                xbg xbgVar = zy10Var.y0;
                if (xbgVar == null) {
                    Intrinsics.n("errorDialog");
                    throw null;
                }
                if (xbgVar.isShowing()) {
                    xbg xbgVar2 = zy10Var.y0;
                    if (xbgVar2 == null) {
                        Intrinsics.n("errorDialog");
                        throw null;
                    }
                    xbgVar2.dismiss();
                }
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new qz10.a(zy10Var, null), 3);
                return Unit.a;
        }
    }
}
