package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class too implements Function1<tcf, Unit> {
    public final /* synthetic */ long a;

    public too(long j) {
        this.a = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(tcf tcfVar) {
        tcf tcfVar2 = tcfVar;
        tcfVar2.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar2.d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar2.d() & 4294967295L));
        j90 j90VarA = m90.a();
        j90VarA.a(0.0f, fIntBitsToFloat2);
        j90VarA.c(fIntBitsToFloat, fIntBitsToFloat2);
        j90VarA.c(fIntBitsToFloat / 2.0f, 0.0f);
        j90VarA.close();
        tcf.Q1(tcfVar2, j90VarA, this.a, 0.0f, null, 60);
        return Unit.a;
    }
}
