package defpackage;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class am3 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ytw b;
    public final /* synthetic */ ytw c;

    public /* synthetic */ am3(xsw xswVar, ytw ytwVar) {
        this.c = xswVar;
        this.b = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        ytw ytwVar = this.c;
        ytw ytwVar2 = this.b;
        switch (i) {
            case 0:
                ((xsw) ytwVar).K(SystemClock.uptimeMillis());
                ytwVar2.setValue(Boolean.TRUE);
                break;
            default:
                ht7 ht7Var = (ht7) obj;
                ht7Var.getClass();
                ytwVar2.setValue(Boolean.TRUE);
                ytwVar.setValue(ht7Var);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ am3(ytw ytwVar, ytw ytwVar2) {
        this.b = ytwVar;
        this.c = ytwVar2;
    }
}
