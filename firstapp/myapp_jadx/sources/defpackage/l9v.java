package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l9v implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ytw b;

    public /* synthetic */ l9v(ytw ytwVar, int i) {
        this.a = i;
        this.b = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        ytw ytwVar = this.b;
        switch (i) {
            case 0:
                hav havVar = (hav) obj;
                havVar.getClass();
                ytwVar.setValue(havVar);
                break;
            default:
                n4g0 n4g0Var = (n4g0) obj;
                n4g0Var.getClass();
                ytwVar.setValue(n4g0Var);
                break;
        }
        return Unit.a;
    }
}
