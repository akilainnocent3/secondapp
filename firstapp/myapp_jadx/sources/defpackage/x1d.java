package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x1d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x1d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yfx.h((hjx) obj, c2d.s.INSTANCE, null, 6);
                break;
            case 1:
                ((Function1) obj).invoke(o6z.o.a);
                break;
            default:
                fd90 fd90Var = (fd90) obj;
                fd90Var.m();
                boolean zN = fd90Var.n();
                qub0 qub0Var = fd90Var.a;
                if (zN) {
                    qub0Var.E0();
                } else {
                    qub0Var.J0();
                }
                break;
        }
        return Unit.a;
    }
}
