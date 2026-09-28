package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.feature.luckynumber.winningpopup.presentation.LNWinningPopupActivity;
import com.sportybet.feature.luckynumber.winningpopup.presentation.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zjr implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                final LNWinningPopupActivity lNWinningPopupActivity = (LNWinningPopupActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = LNWinningPopupActivity.d;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final phx phxVarC = mr10.c(new vkx[0], aVar);
                    kkr kkrVar = kkr.INSTANCE;
                    boolean zA = aVar.A(lNWinningPopupActivity) | aVar.A(phxVarC);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new Function1() { // from class: akr
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                ghx ghxVar = (ghx) obj4;
                                int i3 = LNWinningPopupActivity.d;
                                ghxVar.getClass();
                                bkr bkrVar = new bkr();
                                ckr ckrVar = new ckr();
                                dkr dkrVar = new dkr();
                                h0n h0nVar = new h0n(1);
                                final LNWinningPopupActivity lNWinningPopupActivity2 = lNWinningPopupActivity;
                                final phx phxVar = phxVarC;
                                op8 op8Var = new op8(309852767, new iaj() { // from class: ekr
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // defpackage.iaj
                                    public final Object d(Object obj5, Object obj6, Object obj7, Object obj8) {
                                        a aVar2 = (a) obj7;
                                        ((Integer) obj8).getClass();
                                        int i4 = LNWinningPopupActivity.d;
                                        ((pf0) obj5).getClass();
                                        ((ifx) obj6).getClass();
                                        LNWinningPopupActivity lNWinningPopupActivity3 = lNWinningPopupActivity2;
                                        int i5 = 0;
                                        ytw ytwVarC = wyh.c(lNWinningPopupActivity3.z1().e, aVar2, 0, 7);
                                        ku90<b> ku90Var = lNWinningPopupActivity3.z1().d;
                                        phx phxVar2 = phxVar;
                                        boolean zA2 = aVar2.A(phxVar2) | aVar2.A(lNWinningPopupActivity3);
                                        Object objY2 = aVar2.y();
                                        a.C0041a.C0042a c0042a = a.C0041a.a;
                                        if (zA2 || objY2 == c0042a) {
                                            objY2 = new LNWinningPopupActivity.a(phxVar2, lNWinningPopupActivity3, null);
                                            aVar2.r(objY2);
                                        }
                                        abs.b(ku90Var, null, null, (gaj) objY2, aVar2, 0);
                                        clr clrVar = (clr) ytwVarC.getValue();
                                        boolean zA3 = aVar2.A(lNWinningPopupActivity3);
                                        Object objY3 = aVar2.y();
                                        if (zA3 || objY3 == c0042a) {
                                            objY3 = new vjr(lNWinningPopupActivity3, 0);
                                            aVar2.r(objY3);
                                        }
                                        Function0 function0 = (Function0) objY3;
                                        boolean zA4 = aVar2.A(lNWinningPopupActivity3);
                                        Object objY4 = aVar2.y();
                                        if (zA4 || objY4 == c0042a) {
                                            objY4 = new wjr(lNWinningPopupActivity3, i5);
                                            aVar2.r(objY4);
                                        }
                                        Function0 function1 = (Function0) objY4;
                                        boolean zA5 = aVar2.A(lNWinningPopupActivity3);
                                        Object objY5 = aVar2.y();
                                        if (zA5 || objY5 == c0042a) {
                                            objY5 = new xjr(lNWinningPopupActivity3, i5);
                                            aVar2.r(objY5);
                                        }
                                        Function0 function2 = (Function0) objY5;
                                        boolean zA6 = aVar2.A(lNWinningPopupActivity3);
                                        Object objY6 = aVar2.y();
                                        if (zA6 || objY6 == c0042a) {
                                            objY6 = new r64(lNWinningPopupActivity3, 1);
                                            aVar2.r(objY6);
                                        }
                                        Function0 function3 = (Function0) objY6;
                                        boolean zA7 = aVar2.A(lNWinningPopupActivity3);
                                        Object objY7 = aVar2.y();
                                        if (zA7 || objY7 == c0042a) {
                                            objY7 = new yjr(lNWinningPopupActivity3, i5);
                                            aVar2.r(objY7);
                                        }
                                        blr.b(clrVar, function0, function1, function2, function3, (Function0) objY7, aVar2, 0, 0);
                                        return Unit.a;
                                    }
                                }, true);
                                o2g o2gVar = o2g.a;
                                o2gVar.getClass();
                                hhx.a(ghxVar, jq40.a(kkr.class), o2gVar, m2g.a, bkrVar, ckrVar, dkrVar, h0nVar, op8Var);
                                gdr.a(ghxVar, new Function0() { // from class: fkr
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i4 = LNWinningPopupActivity.d;
                                        phxVar.k();
                                        return Unit.a;
                                    }
                                }, new Function1() { // from class: gkr
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        jdr jdrVar = (jdr) obj5;
                                        int i4 = LNWinningPopupActivity.d;
                                        jdrVar.getClass();
                                        yfx.h(phxVar, jdrVar, null, 6);
                                        return Unit.a;
                                    }
                                });
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    uix.b(phxVarC, kkrVar, null, null, null, null, null, null, null, (Function1) objY, aVar, 48, 2044);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                qr00.a((Function0) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ zjr(LNWinningPopupActivity lNWinningPopupActivity) {
        this.b = lNWinningPopupActivity;
    }
}
