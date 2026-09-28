package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f560 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f560(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                l560 l560Var = (l560) obj2;
                int iIntValue = ((Integer) obj).intValue();
                mke mkeVar = l560Var.v0;
                if (mkeVar != null) {
                    mkeVar.S0(iIntValue);
                }
                l560Var.J0();
                break;
            default:
                f1e0 f1e0Var = (f1e0) obj;
                f1e0Var.getClass();
                ((foa0) obj2).v.j(f1e0Var.c);
                break;
        }
        return Unit.a;
    }
}
