package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qa60 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a7l a7lVar = (a7l) obj;
        a7lVar.getClass();
        double dC1 = ((double) (a7lVar.C1(90.0f) + Float.intBitsToFloat((int) (a7lVar.d() >> 32)))) / ((((double) Float.intBitsToFloat((int) (a7lVar.d() & 4294967295L))) / 260.0d) * 1072.0d);
        a7lVar.z0(n09.a(0.5f, 0.5f));
        float f = (float) dC1;
        a7lVar.k(f);
        a7lVar.v(f);
        return Unit.a;
    }
}
