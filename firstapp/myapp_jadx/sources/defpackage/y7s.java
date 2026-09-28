package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y7s implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fs50 fs50Var = (fs50) obj;
                fs50Var.getClass();
                ((ytw) obj2).setValue(fs50Var);
                break;
            default:
                ((tuw) obj2).f(null);
                break;
        }
        return Unit.a;
    }
}
