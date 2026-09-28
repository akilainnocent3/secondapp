package defpackage;

import androidx.compose.animation.e;
import androidx.compose.animation.i;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qy90 extends d.c implements psr {
    public final ytw D;
    public final ytw E;
    public kxa F;
    public long G = -9223372034707292160L;

    public static final class a extends qlr implements Function1<y.a, Unit> {
        public final /* synthetic */ y a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar) {
            super(1);
            this.a = yVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(y.a aVar) {
            aVar.s(this.a, 0, 0, 0.0f);
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function1<y.a, Unit> {
        public final /* synthetic */ y b;
        public final /* synthetic */ long c;
        public final /* synthetic */ t d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y yVar, long j, t tVar) {
            super(1);
            this.b = yVar;
            this.c = j;
            this.d = tVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(y.a aVar) {
            long jFloatToRawIntBits;
            y.a aVar2 = aVar;
            qy90 qy90Var = qy90.this;
            if (((i) ((x5a0) qy90Var.D).getValue()) == null) {
                aVar2.s(this.b, 0, 0, 0.0f);
            } else {
                long j = qy90Var.G;
                int i = (int) (j >> 32);
                long j2 = this.c;
                if (i == 0 || ((int) (j & 4294967295L)) == 0) {
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i2 = yy60.a;
                } else {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (kc6.d(j2) >> 32)) / Float.intBitsToFloat((int) (kc6.d(j) >> 32));
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                    int i3 = yy60.a;
                }
                long jB = (((long) ycv.b(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) * ((int) (qy90Var.G >> 32)))) << 32) | (((long) ycv.b(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) * ((int) (qy90Var.G & 4294967295L)))) & 4294967295L);
                long jRound = (((long) Math.round(((this.d.getLayoutDirection() == asr.a ? 0.0f : (-1.0f) * 0.0f) + 1.0f) * ((((int) (j2 >> 32)) - ((int) (jB >> 32))) / 2.0f))) << 32) | (((long) Math.round((1.0f + 0.0f) * ((((int) (j2 & 4294967295L)) - ((int) (jB & 4294967295L))) / 2.0f))) & 4294967295L);
                y.a.J(aVar2, this.b, (int) (jRound >> 32), (int) (jRound & 4294967295L), new ry90(jFloatToRawIntBits), 4);
            }
            return Unit.a;
        }
    }

    public qy90(i iVar, Function0<Boolean> function0) {
        this.D = m.b(iVar);
        this.E = m.b(function0);
    }

    @Override // defpackage.psr
    public final int C(xkt xktVar, mzo mzoVar, int i) {
        return (xktVar.q0() || !e.b(this.G)) ? mzoVar.b0(i) : (int) (this.G >> 32);
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        y yVarD0;
        if (tVar.q0()) {
            this.F = new kxa(j);
        }
        if (!((Boolean) ((Function0) ((x5a0) this.E).getValue()).invoke()).booleanValue()) {
            y yVarD1 = vhvVar.d0(j);
            return t.z1(tVar, yVarD1.a, yVarD1.b, new a(yVarD1));
        }
        if (tVar.q0()) {
            yVarD0 = vhvVar.d0(j);
            this.G = (((long) yVarD0.a) << 32) | (((long) yVarD0.b) & 4294967295L);
        } else {
            kxa kxaVar = this.F;
            kxaVar.getClass();
            yVarD0 = vhvVar.d0(kxaVar.a);
        }
        y yVar = yVarD0;
        long jD = oxa.d(j, this.G);
        return t.z1(tVar, (int) (jD >> 32), (int) (jD & 4294967295L), new b(yVar, jD, tVar));
    }

    @Override // defpackage.psr
    public final int o(xkt xktVar, mzo mzoVar, int i) {
        return (xktVar.q0() || !e.b(this.G)) ? mzoVar.a0(i) : (int) (this.G >> 32);
    }

    @Override // defpackage.psr
    public final int s(xkt xktVar, mzo mzoVar, int i) {
        return (xktVar.q0() || !e.b(this.G)) ? mzoVar.x(i) : (int) (this.G & 4294967295L);
    }

    @Override // defpackage.psr
    public final int w(xkt xktVar, mzo mzoVar, int i) {
        return (xktVar.q0() || !e.b(this.G)) ? mzoVar.R(i) : (int) (this.G & 4294967295L);
    }
}
