package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class oa1 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        bxz bxzVar = (bxz) obj;
        yw90 yw90Var = (yw90) obj2;
        bxzVar.getClass();
        ((asr) obj3).getClass();
        bxzVar.a(Float.intBitsToFloat((int) (yw90Var.a >> 32)) / 2.0f, 0.0f);
        long j = yw90Var.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        int i = (int) (j & 4294967295L);
        bxzVar.c(fIntBitsToFloat, Float.intBitsToFloat(i));
        bxzVar.c(0.0f, Float.intBitsToFloat(i));
        bxzVar.close();
        return Unit.a;
    }
}
