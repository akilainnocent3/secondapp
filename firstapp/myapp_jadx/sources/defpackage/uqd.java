package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawFragment;
import com.sportybet.android.globalpay.pixBtg.withdraw.c;
import com.sportybet.android.globalpay.pixBtg.withdraw.e;
import com.sportybet.android.globalpay.pixBtg.withdraw.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uqd implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c000 b;

    public /* synthetic */ uqd(c000 c000Var, int i) {
        this.a = i;
        this.b = c000Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        c000 c000Var = this.b;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                lrd lrdVar = (lrd) c000Var;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(-93848010, new xqd(lrdVar, objArr == true ? 1 : 0), aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                break;
            default:
                final PixBtgWithdrawFragment pixBtgWithdrawFragment = (PixBtgWithdrawFragment) c000Var;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = PixBtgWithdrawFragment.c0;
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Unit unit = Unit.a;
                    boolean zA = aVar2.A(pixBtgWithdrawFragment);
                    Object objY = aVar2.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new c(pixBtgWithdrawFragment, null);
                        aVar2.r(objY);
                    }
                    xvf.e(aVar2, unit, (Function2) objY);
                    pixBtgWithdrawFragment.b1(6, pp8.b(-1256661484, new gaj() { // from class: rb10
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            e.c cVar = (e.c) obj3;
                            a aVar3 = (a) obj4;
                            int iIntValue3 = ((Integer) obj5).intValue();
                            ohp<Object>[] ohpVarArr2 = PixBtgWithdrawFragment.c0;
                            cVar.getClass();
                            if ((iIntValue3 & 6) == 0) {
                                iIntValue3 |= (iIntValue3 & 8) == 0 ? aVar3.M(cVar) : aVar3.A(cVar) ? 4 : 2;
                            }
                            if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                jme jmeVar = cVar.f;
                                h hVarD1 = pixBtgWithdrawFragment.d1();
                                boolean zA2 = aVar3.A(hVarD1);
                                Object objY2 = aVar3.y();
                                if (zA2 || objY2 == a.C0041a.a) {
                                    jc10 jc10Var = new jc10(1, hVarD1, h.class, "onDialogAction", "onDialogAction(Lcom/sportybet/android/globalpay/pixBtg/withdraw/PixBtgWithdrawDialogUiAction;)V", 0);
                                    aVar3.r(jc10Var);
                                    objY2 = jc10Var;
                                }
                                nb10.a(jmeVar, (Function1) ((chp) objY2), aVar3, 0);
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, aVar2), aVar2);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
