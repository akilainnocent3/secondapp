package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class svc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ svc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fxc fxcVar = (fxc) obj2;
                mse mseVar = (mse) obj;
                int i2 = mseVar.a;
                Long lE = fxcVar.e();
                if (lE != null) {
                    fxcVar.c(fxcVar.c.f(lE.longValue()).e);
                }
                ((x5a0) fxcVar.g).setValue(mseVar);
                break;
            default:
                kr00 kr00Var = (kr00) obj2;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                kr00Var.z = bool;
                kr00Var.F.postDelayed(kr00Var.I, 500L);
                break;
        }
        return Unit.a;
    }
}
