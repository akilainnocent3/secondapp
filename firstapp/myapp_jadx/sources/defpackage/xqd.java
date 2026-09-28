package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xqd implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c000 b;

    public /* synthetic */ xqd(c000 c000Var, int i) {
        this.a = i;
        this.b = c000Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        c000 c000Var = this.b;
        switch (i) {
            case 0:
                lrd lrdVar = (lrd) c000Var;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ah30.b((jh30) lrdVar.U.getValue(), aVar, 8);
                } else {
                    aVar.G();
                }
                break;
            default:
                PixBtgWithdrawFragment pixBtgWithdrawFragment = (PixBtgWithdrawFragment) c000Var;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = PixBtgWithdrawFragment.c0;
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    pixBtgWithdrawFragment.b1(6, com.sportybet.android.globalpay.pixBtg.withdraw.a.a, aVar2);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
