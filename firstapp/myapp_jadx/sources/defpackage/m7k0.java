package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import com.google.protobuf.Reader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class m7k0 extends d.c implements psr {
    public rqe D;
    public boolean E;
    public Function2<? super jxo, ? super asr, iwo> F;

    public m7k0() {
        throw null;
    }

    @Override // defpackage.psr
    public final biv e(final t tVar, vhv vhvVar, long j) {
        rqe rqeVar = this.D;
        rqe rqeVar2 = rqe.a;
        int iK = rqeVar != rqeVar2 ? 0 : kxa.k(j);
        rqe rqeVar3 = this.D;
        rqe rqeVar4 = rqe.b;
        int iJ = rqeVar3 == rqeVar4 ? kxa.j(j) : 0;
        rqe rqeVar5 = this.D;
        int iH = Reader.READ_DONE;
        int i = (rqeVar5 == rqeVar2 || !this.E) ? kxa.i(j) : Integer.MAX_VALUE;
        if (this.D == rqeVar4 || !this.E) {
            iH = kxa.h(j);
        }
        final y yVarD0 = vhvVar.d0(oxa.a(iK, i, iJ, iH));
        final int iE = f.e(yVarD0.a, kxa.k(j), kxa.i(j));
        final int iE2 = f.e(yVarD0.b, kxa.j(j), kxa.h(j));
        return t.z1(tVar, iE, iE2, new Function1() { // from class: l7k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Function2<? super jxo, ? super asr, iwo> function2 = this.a.F;
                y yVar = yVarD0;
                y.a.x((y.a) obj, yVar, function2.invoke(new jxo((((long) (iE - yVar.a)) << 32) | (((long) (iE2 - yVar.b)) & 4294967295L)), tVar.getLayoutDirection()).a);
                return Unit.a;
            }
        });
    }
}
