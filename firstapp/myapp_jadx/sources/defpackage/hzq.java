package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class hzq implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hzq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(new jp60.a(((Boolean) obj).booleanValue()));
                break;
            default:
                x7c0 x7c0Var = (x7c0) obj2;
                z83 z83Var = (z83) obj;
                z83Var.getClass();
                x7c0Var.r2(z83Var, x7c0Var.R0());
                break;
        }
        return Unit.a;
    }
}
