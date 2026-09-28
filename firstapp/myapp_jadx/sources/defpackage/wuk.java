package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wuk implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ twd0 b;

    public /* synthetic */ wuk(twd0 twd0Var, int i) {
        this.a = i;
        this.b = twd0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        twd0 twd0Var = this.b;
        switch (i) {
            case 0:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.u(((Number) twd0Var.getValue()).floatValue());
                break;
            case 1:
                lza lzaVar = (lza) obj;
                lzaVar.getClass();
                lzaVar.b2();
                float fC1 = lzaVar.C1(8.0f);
                tcf.d1(lzaVar, j58.c(((Number) twd0Var.getValue()).floatValue(), j58.b), 0L, 0L, (((long) Float.floatToRawIntBits(fC1)) << 32) | (((long) Float.floatToRawIntBits(fC1)) & 4294967295L), null, 0.0f, 246);
                break;
            default:
                ((isw) twd0Var).A((int) (((jxo) obj).a >> 32));
                break;
        }
        return Unit.a;
    }
}
