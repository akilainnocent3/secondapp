package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nfg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nfg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((fgg) obj).s0();
                break;
            case 1:
                ((Function1) obj).invoke(Boolean.TRUE);
                break;
            default:
                qr70 qr70Var = (qr70) obj;
                tfz tfzVar = (tfz) zma.a(qr70Var, ufz.a);
                qr70Var.Q = tfzVar;
                qr70Var.R = tfzVar != null ? tfzVar.a() : null;
                break;
        }
        return Unit.a;
    }
}
