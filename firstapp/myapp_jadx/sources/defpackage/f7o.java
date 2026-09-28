package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f7o implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f7o(Object obj, int i) {
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
            default:
                tqd0 tqd0VarJ0 = ((umd0) obj).j0();
                tqd0VarJ0.getClass();
                ej5.c(o8i0.d(tqd0VarJ0), null, null, new dqd0(tqd0VarJ0, null), 3);
                break;
        }
        return Unit.a;
    }
}
