package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r5z implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r5z(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(new q5z.e((qd4.c) obj));
                break;
            default:
                ylb0 ylb0Var = (ylb0) obj2;
                z83 z83Var = (z83) obj;
                z83Var.getClass();
                ylb0Var.r2(z83Var, ylb0Var.S0());
                break;
        }
        return Unit.a;
    }
}
