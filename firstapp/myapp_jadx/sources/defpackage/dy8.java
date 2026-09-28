package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dy8 implements gaj {
    public final /* synthetic */ int a;

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e160) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    lkf0.d("Fetch Effective", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar, 6, 0, 262142);
                } else {
                    aVar.G();
                }
                break;
            default:
                bxz bxzVar = (bxz) obj;
                yw90 yw90Var = (yw90) obj2;
                bxzVar.getClass();
                ((asr) obj3).getClass();
                bxzVar.a(0.0f, 0.0f);
                bxzVar.c(Float.intBitsToFloat((int) (yw90Var.a >> 32)) * 0.8f, 0.0f);
                long j = yw90Var.a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * 0.2f;
                int i = (int) (j & 4294967295L);
                bxzVar.c(fIntBitsToFloat, Float.intBitsToFloat(i));
                bxzVar.c(0.0f, Float.intBitsToFloat(i));
                bxzVar.close();
                break;
        }
        return Unit.a;
    }
}
