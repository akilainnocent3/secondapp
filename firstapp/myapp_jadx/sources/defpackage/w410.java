package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w410 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w410(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                m410 m410Var = (m410) obj;
                xbg xbgVar = m410Var.c0;
                if (xbgVar == null) {
                    Intrinsics.n("errorDialog");
                    throw null;
                }
                if (xbgVar.isShowing()) {
                    xbg xbgVar2 = m410Var.c0;
                    if (xbgVar2 == null) {
                        Intrinsics.n("errorDialog");
                        throw null;
                    }
                    xbgVar2.dismiss();
                }
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new y410.a(m410Var, null), 3);
                return Unit.a;
            default:
                ((Function1) obj).invoke(pq90.c.a);
                return Unit.a;
        }
    }
}
