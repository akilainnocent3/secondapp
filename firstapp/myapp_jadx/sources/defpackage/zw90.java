package defpackage;

import androidx.compose.animation.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zw90 extends rsr {
    public xi0<jxo> D;
    public ht E;
    public boolean H;
    public long F = -9223372034707292160L;
    public long G = oxa.b(0, 0, 0, 15);
    public final ytw I = m.b(null);

    public static final class a {
        public final wd0<jxo, jj0> a;
        public long b;

        public a(long j, wd0 wd0Var) {
            this.a = wd0Var;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.a == aVar.a && jxo.b(this.b, aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AnimData(anim=" + this.a + ", startSize=" + ((Object) jxo.c(this.b)) + ')';
        }
    }

    public static final class b extends qlr implements Function1<y.a, Unit> {
        public final /* synthetic */ long b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ t e;
        public final /* synthetic */ y f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, int i, int i2, t tVar, y yVar) {
            super(1);
            this.b = j;
            this.c = i;
            this.d = i2;
            this.e = tVar;
            this.f = yVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(y.a aVar) {
            y.a.x(aVar, this.f, zw90.this.E.a(this.b, (((long) this.d) & 4294967295L) | (((long) this.c) << 32), this.e.getLayoutDirection()));
            return Unit.a;
        }
    }

    public zw90(fkd0 fkd0Var, n54 n54Var) {
        this.D = fkd0Var;
        this.E = n54Var;
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        y yVarD0;
        a aVar;
        long jD;
        a aVar2;
        if (tVar.q0()) {
            this.G = j;
            this.H = true;
            yVarD0 = vhvVar.d0(j);
        } else {
            yVarD0 = vhvVar.d0(this.H ? this.G : j);
        }
        y yVar = yVarD0;
        char c = ' ';
        long j2 = (((long) yVar.b) & 4294967295L) | (((long) yVar.a) << 32);
        if (tVar.q0()) {
            this.F = j2;
            c = ' ';
            jD = j2;
            j2 = jD;
        } else {
            long j3 = e.b(this.F) ? this.F : j2;
            ytw ytwVar = this.I;
            a aVar3 = (a) ((x5a0) ytwVar).getValue();
            if (aVar3 != null) {
                wd0<jxo, jj0> wd0Var = aVar3.a;
                boolean z = (jxo.b(j3, wd0Var.d().a) || wd0Var.e()) ? false : true;
                if (!jxo.b(j3, ((jxo) ((x5a0) wd0Var.e).getValue()).a) || z) {
                    aVar3.b = wd0Var.d().a;
                    aVar2 = aVar3;
                    ej5.c(d2(), null, null, new ax90(aVar2, j3, this, null), 3);
                } else {
                    aVar2 = aVar3;
                }
                aVar = aVar2;
            } else {
                long j4 = j3;
                aVar = new a(j4, new wd0(new jxo(j4), gjs.i, new jxo(4294967297L), 8));
            }
            ((x5a0) ytwVar).setValue(aVar);
            jD = oxa.d(j, aVar.a.d().a);
        }
        int i = (int) (jD >> c);
        int i2 = (int) (jD & 4294967295L);
        return t.z1(tVar, i, i2, new b(j2, i, i2, tVar, yVar));
    }

    @Override // androidx.compose.ui.d.c
    public final void h2() {
        this.F = -9223372034707292160L;
        this.H = false;
    }

    @Override // androidx.compose.ui.d.c
    public final void j2() {
        ((x5a0) this.I).setValue(null);
    }
}
