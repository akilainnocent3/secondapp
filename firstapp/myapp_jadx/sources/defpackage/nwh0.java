package defpackage;

import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class nwh0 extends crz {
    public int A;
    public final ytw f;
    public final ytw i;
    public final uvh0 v;
    public final osw w;
    public float y;
    public l58 z;

    public static final class a extends qlr implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            nwh0 nwh0Var = nwh0.this;
            int i = nwh0Var.A;
            u5a0 u5a0Var = (u5a0) nwh0Var.w;
            if (i == u5a0Var.D()) {
                u5a0Var.k(u5a0Var.D() + 1);
            }
            return Unit.a;
        }
    }

    public nwh0(b8l b8lVar) {
        this.f = m.b(new yw90(0L));
        this.i = m.b(Boolean.FALSE);
        uvh0 uvh0Var = new uvh0(b8lVar);
        uvh0Var.f = new a();
        this.v = uvh0Var;
        this.w = k.a(0);
        this.y = 1.0f;
        this.A = -1;
    }

    @Override // defpackage.crz
    public final boolean a(float f) {
        this.y = f;
        return true;
    }

    @Override // defpackage.crz
    public final boolean b(l58 l58Var) {
        this.z = l58Var;
        return true;
    }

    @Override // defpackage.crz
    public final long i() {
        return ((yw90) ((x5a0) this.f).getValue()).a;
    }

    @Override // defpackage.crz
    public final void j(tcf tcfVar) {
        l58 l58Var = this.z;
        uvh0 uvh0Var = this.v;
        if (l58Var == null) {
            l58Var = (l58) ((x5a0) uvh0Var.g).getValue();
        }
        if (((Boolean) ((x5a0) this.i).getValue()).booleanValue() && tcfVar.getLayoutDirection() == asr.b) {
            long jR1 = tcfVar.R1();
            qc6.b bVarF1 = tcfVar.F1();
            long jD = bVarF1.d();
            bVarF1.a().p();
            try {
                bVarF1.a.g(-1.0f, 1.0f, jR1);
                uvh0Var.e(tcfVar, this.y, l58Var);
                hrh.a(bVarF1, jD);
            } catch (Throwable th) {
                hrh.a(bVarF1, jD);
                throw th;
            }
        } else {
            uvh0Var.e(tcfVar, this.y, l58Var);
        }
        this.A = ((u5a0) this.w).D();
    }

    public nwh0() {
        this(new b8l());
    }
}
