package defpackage;

import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nhf0 extends c62<nhf0> {
    public final ijf0 h;
    public final vkf0 i;

    public nhf0(ijf0 ijf0Var, mly mlyVar, vkf0 vkf0Var, tlf0 tlf0Var) {
        super(ijf0Var.a, ijf0Var.b, vkf0Var != null ? vkf0Var.a : null, mlyVar, tlf0Var);
        this.h = ijf0Var;
        this.i = vkf0Var;
    }

    public final List<mof> q(Function1<? super nhf0, ? extends mof> function1) {
        if (!ulf0.c(this.f)) {
            return b.k(new ba8("", 0), new mi80(ulf0.f(this.f), ulf0.f(this.f)));
        }
        mof mofVarInvoke = function1.invoke(this);
        if (mofVarInvoke != null) {
            return a.c(mofVarInvoke);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final int r(vkf0 vkf0Var, int i) {
        lk40 lk40VarP;
        urr urrVar = vkf0Var.b;
        ukf0 ukf0Var = vkf0Var.a;
        if (urrVar == null) {
            lk40VarP = lk40.e;
        } else {
            urr urrVar2 = vkf0Var.c;
            lk40VarP = urrVar2 != null ? urrVar2.P(urrVar, true) : null;
            if (lk40VarP == null) {
                lk40VarP = lk40.e;
            }
        }
        long j = this.h.b;
        int i2 = ulf0.c;
        mly mlyVar = this.d;
        lk40 lk40VarC = ukf0Var.c(mlyVar.b((int) (j & 4294967295L)));
        float f = lk40VarC.a;
        return mlyVar.a(ukf0Var.b.g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lk40VarP.d() & 4294967295L)) * i) + lk40VarC.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }
}
