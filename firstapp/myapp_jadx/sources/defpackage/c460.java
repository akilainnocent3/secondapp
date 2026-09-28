package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c460 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c460(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                eo80 eo80Var = ((l560) obj2).l0;
                if (zBooleanValue) {
                    if (eo80Var != null) {
                        eo80Var.v0.setVisibility(8);
                    }
                } else if (eo80Var != null) {
                    eo80Var.v0.setVisibility(0);
                }
                break;
            default:
                f1e0 f1e0Var = (f1e0) obj;
                f1e0Var.getClass();
                ((goa0) obj2).i.j(f1e0Var.c);
                break;
        }
        return Unit.a;
    }
}
