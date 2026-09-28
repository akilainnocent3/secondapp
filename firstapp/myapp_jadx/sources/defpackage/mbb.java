package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mbb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mbb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                fgb fgbVar = (fgb) obj;
                fgbVar.v0(fgbVar.S0(), null);
                break;
            default:
                hxp hxpVar = (hxp) obj;
                if (hxpVar.a.isLogin()) {
                    dcr.a(hxpVar.e, new nvp.d(wae.ME));
                } else {
                    ej5.c(o8i0.d(hxpVar), null, null, new fxp(hxpVar, null), 3);
                }
                break;
        }
        return Unit.a;
    }
}
