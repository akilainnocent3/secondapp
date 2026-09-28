package defpackage;

import androidx.compose.animation.a;
import androidx.compose.animation.d;
import androidx.compose.animation.f;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g1n implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((d) obj).getClass();
                return a.d(f.f(null, 3).b(f.q(new qoz())), f.g(null, 3).b(f.u(new n84(1))));
            default:
                tcf tcfVar = (tcf) obj;
                tcfVar.getClass();
                float fC1 = tcfVar.C1(4.0f);
                float f = -fC1;
                hfs hfsVarA = ya5.a.a(f, 0.0f, 8, b.k(new j58(j58.l), new j58(j58.c(0.1f, j58.b))));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                tcf.V1(tcfVar, hfsVarA, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fC1)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), 0.0f, null, null, 0, 120);
                return Unit.a;
        }
    }
}
