package defpackage;

import eoa0.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xja0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xja0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                f1e0 f1e0Var = (f1e0) obj;
                f1e0Var.getClass();
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, ((eoa0) obj2).new b(f1e0Var, null), 3);
                break;
            default:
                wae waeVar = (wae) obj;
                waeVar.getClass();
                ((Function1) obj2).invoke(new kli0.l(waeVar));
                break;
        }
        return Unit.a;
    }
}
