package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ucb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ucb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        xbg xbgVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                fgb fgbVar = (fgb) obj;
                xbg xbgVar2 = fgbVar.G0;
                if ((xbgVar2 != null ? xbgVar2.isShowing() : false) && (xbgVar = fgbVar.G0) != null) {
                    xbgVar.dismiss();
                }
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new vgb(fgbVar, null), 3);
                break;
            case 1:
                ytw ytwVar = (ytw) obj;
                ytwVar.setValue(Boolean.valueOf(!((Boolean) ytwVar.getValue()).booleanValue()));
                break;
            default:
                ((Function1) obj).invoke(x8u.b.a);
                break;
        }
        return Unit.a;
    }
}
