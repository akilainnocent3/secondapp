package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class pmt extends d.c implements psr {
    public int D;
    public int E;

    public static final class a extends qlr implements Function1<y.a, Unit> {
        public final /* synthetic */ y a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar) {
            super(1);
            this.a = yVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(y.a aVar) {
            y.a aVar2 = aVar;
            aVar2.getClass();
            y.a.A(aVar2, this.a, 0, 0);
            return Unit.a;
        }
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        long jA;
        vhvVar.getClass();
        long jD = oxa.d(j, kc6.a(this.D, this.E));
        if (kxa.h(j) == Integer.MAX_VALUE && kxa.i(j) != Integer.MAX_VALUE) {
            int i = (int) (jD >> 32);
            int i2 = (this.E * i) / this.D;
            jA = oxa.a(i, i, i2, i2);
        } else if (kxa.i(j) != Integer.MAX_VALUE || kxa.h(j) == Integer.MAX_VALUE) {
            int i3 = (int) (jD >> 32);
            int i4 = (int) (jD & 4294967295L);
            jA = oxa.a(i3, i3, i4, i4);
        } else {
            int i5 = (int) (jD & 4294967295L);
            int i6 = (this.D * i5) / this.E;
            jA = oxa.a(i6, i6, i5, i5);
        }
        y yVarD0 = vhvVar.d0(jA);
        return t.z1(tVar, yVarD0.a, yVarD0.b, new a(yVarD0));
    }
}
