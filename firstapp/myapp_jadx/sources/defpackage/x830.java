package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x830 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        lza lzaVar = (lza) obj;
        lzaVar.getClass();
        qc6.b bVarF1 = lzaVar.F1();
        long jD = bVarF1.d();
        bVarF1.a().p();
        try {
            bVarF1.a.b(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
            lzaVar.b2();
            return Unit.a;
        } finally {
            hrh.a(bVarF1, jD);
        }
    }
}
