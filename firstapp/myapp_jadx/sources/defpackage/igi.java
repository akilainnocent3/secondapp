package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class igi implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                tcf tcfVar = (tcf) obj;
                tcfVar.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) / 20.0f;
                float f = fIntBitsToFloat * 3.81f;
                float f2 = 1.82f * fIntBitsToFloat;
                float f3 = 1.8f * fIntBitsToFloat;
                j90 j90VarA = m90.a();
                j90VarA.a(f2, f3);
                float f4 = 1.92f * fIntBitsToFloat;
                float f5 = fIntBitsToFloat * 0.78f;
                float f6 = fIntBitsToFloat * 2.78f;
                j90VarA.b(f4, f5, f6, 0.0f, f, 0.0f);
                j90VarA.c(Float.intBitsToFloat((int) (tcfVar.d() >> 32)) - f, 0.0f);
                j90VarA.b(Float.intBitsToFloat((int) (tcfVar.d() >> 32)) - f6, 0.0f, Float.intBitsToFloat((int) (tcfVar.d() >> 32)) - f4, f5, Float.intBitsToFloat((int) (tcfVar.d() >> 32)) - f2, f3);
                j90VarA.c(Float.intBitsToFloat((int) (tcfVar.d() >> 32)), Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)));
                j90VarA.c(0.0f, Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)));
                j90VarA.close();
                tcf.Q1(tcfVar, j90VarA, j58.c(0.3f, j58.b), 0.0f, null, 60);
                break;
            default:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                break;
        }
        return Unit.a;
    }
}
