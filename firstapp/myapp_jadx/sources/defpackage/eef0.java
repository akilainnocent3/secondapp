package defpackage;

import androidx.compose.runtime.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class eef0 extends tkd implements yma, l2l {
    public Function1<? super v1b<? super Unit>, ? extends Object> F;
    public final ytw G = m.a(null, epx.a);

    public final class a implements bef0 {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        @Override // defpackage.bef0
        public final long Q0(urr urrVar) {
            urr urrVar2 = (urr) ((x5a0) eef0.this.G).getValue();
            if (urrVar2 != null) {
                return urrVar.M(urrVar2, this.a);
            }
            zkn.d("Tried to open context menu before the anchor was placed.");
            fkd.a();
            return 0L;
        }

        @Override // defpackage.bef0
        public final lk40 S0(urr urrVar) {
            return pk40.b(Q0(urrVar), 0L);
        }

        @Override // defpackage.bef0
        public final aef0 k0() {
            return nef0.a(eef0.this);
        }
    }

    public eef0(bif0 bif0Var) {
        this.F = bif0Var;
        def0 def0Var = new def0(this);
        b020 b020Var = wje0.a;
        p2(new cke0(null, null, null, def0Var));
    }

    @Override // defpackage.l2l
    public final void r0(ywx ywxVar) {
        ((x5a0) this.G).setValue(ywxVar);
    }
}
