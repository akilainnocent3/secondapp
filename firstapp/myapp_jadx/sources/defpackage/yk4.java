package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yk4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yk4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                km4 km4Var = (km4) obj;
                yn4 yn4Var = ((zk4) obj2).a;
                if (yn4Var.z) {
                    return yn4Var.A;
                }
                yn4Var.u = km4Var;
                if (yn4Var.f == hl4.b && km4Var != null) {
                    if (yn4Var.s != null) {
                        yn4Var.v = km4Var;
                    } else {
                        yn4Var.n(km4Var);
                    }
                }
                il4 il4VarD = yn4Var.d();
                yn4Var.A = il4VarD;
                return il4VarD;
            default:
                ((Function1) obj2).invoke(((yd90) obj).e);
                return Unit.a;
        }
    }
}
