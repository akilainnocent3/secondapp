package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g7o implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g7o(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                break;
            case 1:
                ((Function1) obj).invoke(igm.k.a);
                break;
            default:
                tqd0 tqd0VarJ0 = ((umd0) obj).j0();
                tqd0VarJ0.getClass();
                ej5.c(o8i0.d(tqd0VarJ0), null, null, new nqd0(tqd0VarJ0, null), 3);
                break;
        }
        return Unit.a;
    }
}
