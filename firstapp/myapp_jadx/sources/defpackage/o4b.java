package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o4b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o4b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                tsr tsrVarF = pkd.f((t4b) obj);
                if (!tsrVarF.I) {
                    xsr.a(tsrVarF).c(tsrVarF);
                }
                break;
            case 1:
                ((Function0) obj).invoke();
                break;
            default:
                kab0 kab0Var = (kab0) obj;
                kab0Var.Z = 1;
                kab0Var.w0().z1();
                break;
        }
        return Unit.a;
    }
}
