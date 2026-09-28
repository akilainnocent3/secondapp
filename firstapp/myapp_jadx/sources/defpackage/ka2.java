package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ka2 implements oef0 {
    public final op8 a;
    public final puw b = new puw();
    public final ytw c = m.b(null);

    public final class a implements tef0 {
        public final bef0 a;
        public final tb5 b = d77.b(0, 7, null);

        public a(bef0 bef0Var) {
            this.a = bef0Var;
        }

        @Override // defpackage.tef0
        public final void close() {
            this.b.c(Unit.a);
        }
    }

    public ka2(op8 op8Var) {
        this.a = op8Var;
    }

    @Override // defpackage.oef0
    public final Object a(bef0 bef0Var, tje0 tje0Var) {
        Object objA = puw.a(this.b, new la2(this, new a(bef0Var), null), tje0Var);
        return objA == y5b.a ? objA : Unit.a;
    }

    public final void b(Function0<? extends urr> function0, androidx.compose.runtime.a aVar, int i) {
        Function0<? extends urr> function1;
        b bVarI = aVar.i(723898654);
        int i2 = (bVarI.M(this) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            a aVar2 = (a) ((x5a0) this.c).getValue();
            if (aVar2 == null) {
                e eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new ia2(this, function0, i);
                    return;
                }
                return;
            }
            function1 = function0;
            this.a.l(aVar2, aVar2.a, function1, bVarI, 384);
        } else {
            function1 = function0;
            bVarI.G();
        }
        e eVarZ2 = bVarI.Z();
        if (eVarZ2 != null) {
            eVarZ2.d = new ja2(this, function1, i);
        }
    }
}
