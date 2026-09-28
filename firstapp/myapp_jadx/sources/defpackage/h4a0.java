package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class h4a0 implements gaj<e160, a, Integer, Unit> {
    public final /* synthetic */ String a;

    public h4a0(String str) {
        this.a = str;
    }

    @Override // defpackage.gaj
    public final Unit invoke(e160 e160Var, a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            lkf0.d(this.a, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 262142);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
