package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.globalpay.stp.spei.SpeiByStpDepositFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class fva0 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ SpeiByStpDepositFragment a;

    public fva0(SpeiByStpDepositFragment speiByStpDepositFragment) {
        this.a = speiByStpDepositFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            SpeiByStpDepositFragment speiByStpDepositFragment = this.a;
            boolean zA = aVar2.A(speiByStpDepositFragment);
            Object objY = aVar2.y();
            if (zA || objY == a.C0041a.a) {
                objY = new eva0(speiByStpDepositFragment);
                aVar2.r(objY);
            }
            b0e.a((Function0) objY, aVar2, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
