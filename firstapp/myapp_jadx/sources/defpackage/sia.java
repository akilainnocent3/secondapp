package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sia implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sia(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((mmd) obj).getClass();
                return new iwo(((long) ycv.b(((Number) ((twd0) obj2).getValue()).floatValue())) << 32);
            default:
                r320 r320Var = (r320) obj2;
                if (((Boolean) obj).booleanValue() && r320Var.r0().a0 == 0) {
                    r320.u0(r320Var, my7.b);
                }
                return Unit.a;
        }
    }
}
