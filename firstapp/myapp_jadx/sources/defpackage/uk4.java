package defpackage;

import com.sportybet.android.instantwin.presentation.penalty.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class uk4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uk4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        xj4 xj4Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zk4 zk4Var = (zk4) obj;
                yn4 yn4Var = zk4Var.a;
                il4 il4Var = yn4Var.A;
                if (il4Var.l != null) {
                    return il4Var;
                }
                if (zk4Var.j) {
                    xj4Var = xj4.c;
                } else {
                    xj4Var = zk4Var.k ? xj4.b : xj4.a;
                }
                hl4 hl4Var = yn4Var.f;
                hl4 hl4Var2 = hl4.c;
                if (hl4Var != hl4Var2) {
                    yn4Var.f = hl4Var2;
                    yn4Var.g = xj4Var;
                    yn4Var.u = null;
                    yn4Var.v = null;
                }
                il4 il4VarD = yn4Var.d();
                yn4Var.A = il4VarD;
                return il4VarD;
            case 1:
                ((m410) obj).i1();
                return Unit.a;
            default:
                ((Function1) obj).invoke(b.c.a.a);
                return Unit.a;
        }
    }
}
