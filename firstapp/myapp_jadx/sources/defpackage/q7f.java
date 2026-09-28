package defpackage;

import androidx.compose.ui.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q7f extends d.c implements hvg0, s7f, mrr {
    public final o7f D;
    public q7f E;
    public s7f F;
    public long G;

    public static final class a extends qlr implements Function1<q7f, gvg0> {
        public final /* synthetic */ m7f a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m7f m7fVar) {
            super(1);
            this.a = m7fVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final gvg0 invoke(q7f q7fVar) {
            q7f q7fVar2 = q7fVar;
            if (!q7fVar2.a.C) {
                return gvg0.b;
            }
            s7f s7fVar = q7fVar2.F;
            if (s7fVar != null) {
                s7fVar.a0(this.a);
            }
            q7fVar2.F = null;
            q7fVar2.E = null;
            return gvg0.a;
        }
    }

    public static final class b extends qlr implements Function1<q7f, gvg0> {
        public final /* synthetic */ dq40 a;
        public final /* synthetic */ q7f b;
        public final /* synthetic */ m7f c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(dq40 dq40Var, q7f q7fVar, m7f m7fVar) {
            super(1);
            this.a = dq40Var;
            this.b = q7fVar;
            this.c = m7fVar;
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [T, hvg0] */
        @Override // kotlin.jvm.functions.Function1
        public final gvg0 invoke(q7f q7fVar) {
            q7f q7fVar2 = q7fVar;
            q7f q7fVar3 = q7fVar2;
            if (!pkd.g(this.b).getDragAndDropManager().a(q7fVar3) || !r7f.a(q7fVar3, u7f.a(this.c))) {
                return gvg0.a;
            }
            this.a.a = q7fVar2;
            return gvg0.c;
        }
    }

    public q7f(Object obj) {
        this.D = o7f.a;
        this.G = 0L;
    }

    @Override // defpackage.s7f
    public final void D1(m7f m7fVar) {
        s7f s7fVar = this.F;
        if (s7fVar != null) {
            s7fVar.D1(m7fVar);
        }
        q7f q7fVar = this.E;
        if (q7fVar != null) {
            q7fVar.D1(m7fVar);
        }
        this.E = null;
    }

    @Override // defpackage.hvg0
    public final Object J() {
        return this.D;
    }

    @Override // defpackage.s7f
    public final boolean K0(m7f m7fVar) {
        q7f q7fVar = this.E;
        if (q7fVar != null) {
            return q7fVar.K0(m7fVar);
        }
        s7f s7fVar = this.F;
        if (s7fVar != null) {
            return s7fVar.K0(m7fVar);
        }
        return false;
    }

    @Override // defpackage.s7f
    public final void L1(m7f m7fVar) {
        hvg0 hvg0Var;
        q7f q7fVar;
        q7f q7fVar2 = this.E;
        if (q7fVar2 == null || !r7f.a(q7fVar2, u7f.a(m7fVar))) {
            if (this.a.C) {
                dq40 dq40Var = new dq40();
                obl0.d(this, new b(dq40Var, this, m7fVar));
                hvg0Var = (hvg0) dq40Var.a;
            } else {
                hvg0Var = null;
            }
            q7fVar = (q7f) hvg0Var;
        } else {
            q7fVar = q7fVar2;
        }
        if (q7fVar != null && q7fVar2 == null) {
            q7fVar.T(m7fVar);
            q7fVar.L1(m7fVar);
            s7f s7fVar = this.F;
            if (s7fVar != null) {
                s7fVar.D1(m7fVar);
            }
        } else if (q7fVar == null && q7fVar2 != null) {
            s7f s7fVar2 = this.F;
            if (s7fVar2 != null) {
                s7fVar2.T(m7fVar);
                s7fVar2.L1(m7fVar);
            }
            q7fVar2.D1(m7fVar);
        } else if (!Intrinsics.g(q7fVar, q7fVar2)) {
            if (q7fVar != null) {
                q7fVar.T(m7fVar);
                q7fVar.L1(m7fVar);
            }
            if (q7fVar2 != null) {
                q7fVar2.D1(m7fVar);
            }
        } else if (q7fVar != null) {
            q7fVar.L1(m7fVar);
        } else {
            s7f s7fVar3 = this.F;
            if (s7fVar3 != null) {
                s7fVar3.L1(m7fVar);
            }
        }
        this.E = q7fVar;
    }

    @Override // defpackage.mrr
    public final void M(long j) {
        this.G = j;
    }

    @Override // defpackage.s7f
    public final void T(m7f m7fVar) {
        s7f s7fVar = this.F;
        if (s7fVar != null) {
            s7fVar.T(m7fVar);
            return;
        }
        q7f q7fVar = this.E;
        if (q7fVar != null) {
            q7fVar.T(m7fVar);
        }
    }

    @Override // defpackage.s7f
    public final void a0(m7f m7fVar) {
        a aVar = new a(m7fVar);
        if (aVar.invoke(this) != gvg0.a) {
            return;
        }
        obl0.d(this, aVar);
    }

    @Override // androidx.compose.ui.d.c
    public final void i2() {
        this.F = null;
        this.E = null;
    }

    @Override // defpackage.s7f
    public final void u0(m7f m7fVar) {
        s7f s7fVar = this.F;
        if (s7fVar != null) {
            s7fVar.u0(m7fVar);
            return;
        }
        q7f q7fVar = this.E;
        if (q7fVar != null) {
            q7fVar.u0(m7fVar);
        }
    }

    public q7f() {
        this(null);
    }
}
