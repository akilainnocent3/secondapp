package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sgj implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        lza lzaVar = (lza) obj;
        lzaVar.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) * 0.67f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() >> 32));
        qc6.b bVarF1 = lzaVar.F1();
        long jD = bVarF1.d();
        bVarF1.a().p();
        try {
            bVarF1.a.b(0.0f, 0.0f, fIntBitsToFloat2, fIntBitsToFloat, 1);
            lzaVar.b2();
            return Unit.a;
        } finally {
            hrh.a(bVarF1, jD);
        }
    }
}
