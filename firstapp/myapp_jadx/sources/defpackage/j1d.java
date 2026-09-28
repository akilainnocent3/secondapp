package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j1d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j1d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yfx.h((hjx) obj, c2d.p.INSTANCE, null, 6);
                break;
            default:
                vx00 vx00Var = (vx00) obj;
                vx00Var.getClass();
                ej5.c(o8i0.d(vx00Var), null, null, new py00(vx00Var, null), 3);
                break;
        }
        return Unit.a;
    }
}
