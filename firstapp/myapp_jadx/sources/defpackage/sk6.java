package defpackage;

import androidx.fragment.app.e;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.cashoutphase3.CashoutFloatView;
import com.sportybet.android.cashoutphase3.a;
import com.sportybet.android.cashoutphase3.b;
import com.sportybet.android.cashoutphase3.h;
import com.sportybet.android.globalpay.nuvei.deposit.NuveiDepositRouter$JumpBankScreen;
import com.sportybet.plugin.webcontainer.WebViewWrapperServiceImpl;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sk6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sk6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj3;
                a aVar = (a) obj2;
                if (((AlertDialogCallbackType) obj) instanceof AlertDialogCallbackType.Positive) {
                    CashoutFloatView cashoutFloatViewU0 = bVar.u0();
                    if (cashoutFloatViewU0 != null) {
                        cashoutFloatViewU0.setVisibility(8);
                    }
                    h hVarS0 = bVar.s0();
                    String str = ((a.c.e) aVar).a.a.id;
                    str.getClass();
                    hVarS0.L1(str, true);
                }
                break;
            case 1:
                fuj fujVar = (fuj) obj3;
                fujVar.v.put(Long.valueOf(((Long) obj2).longValue()), AnalyticsEvent.BI_TRACKING_KIND_ERROR);
                fujVar.w.j(new HashMap<>(fujVar.v));
                break;
            default:
                final hjx hjxVar = (hjx) obj3;
                final com.sportybet.android.globalpay.nuvei.deposit.a aVar2 = (com.sportybet.android.globalpay.nuvei.deposit.a) obj2;
                ghx ghxVar = (ghx) obj;
                ghxVar.getClass();
                op8 op8Var = new op8(1214682120, new iaj() { // from class: i6y
                    @Override // defpackage.iaj
                    public final Object d(Object obj4, Object obj5, Object obj6, Object obj7) {
                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj6;
                        ((Integer) obj7).getClass();
                        ((pf0) obj4).getClass();
                        ((ifx) obj5).getClass();
                        w8i0 w8i0VarA = zdt.a(aVar3);
                        if (w8i0VarA == null) {
                            ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return null;
                        }
                        c8y c8yVar = (c8y) p8i0.a(jq40.a(c8y.class), w8i0VarA, null, cll.a(w8i0VarA, aVar3), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, aVar3);
                        Unit unit = Unit.a;
                        hjx hjxVar2 = hjxVar;
                        boolean zA = aVar3.A(hjxVar2) | aVar3.A(c8yVar);
                        Object objY = aVar3.y();
                        androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new com.sportybet.android.globalpay.nuvei.deposit.a.C0229a(hjxVar2, c8yVar, null);
                            aVar3.r(objY);
                        }
                        xvf.e(aVar3, unit, (Function2) objY);
                        final com.sportybet.android.globalpay.nuvei.deposit.a aVar4 = aVar2;
                        boolean zA2 = aVar3.A(aVar4);
                        Object objY2 = aVar3.y();
                        if (zA2 || objY2 == c0042a) {
                            com.sportybet.android.globalpay.nuvei.deposit.a.b bVar2 = new com.sportybet.android.globalpay.nuvei.deposit.a.b(1, aVar4, com.sportybet.android.globalpay.nuvei.deposit.a.class, "processSideEffect", "processSideEffect(Lcom/sportybet/android/globalpay/base/PayBaseSideEffect;)V", 0);
                            aVar3.r(bVar2);
                            objY2 = bVar2;
                        }
                        Function1 function1 = (Function1) ((chp) objY2);
                        boolean zA3 = aVar3.A(hjxVar2);
                        Object objY3 = aVar3.y();
                        if (zA3 || objY3 == c0042a) {
                            objY3 = new ftj(hjxVar2, 1);
                            aVar3.r(objY3);
                        }
                        Function1 function2 = (Function1) objY3;
                        boolean zA4 = aVar3.A(aVar4);
                        Object objY4 = aVar3.y();
                        if (zA4 || objY4 == c0042a) {
                            objY4 = new Function0() { // from class: k6y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    com.sportybet.android.globalpay.nuvei.deposit.a aVar5 = aVar4;
                                    d900 d900Var = aVar5.H;
                                    if (d900Var == null) {
                                        Intrinsics.n("paymentRouter");
                                        throw null;
                                    }
                                    e eVarRequireActivity = aVar5.requireActivity();
                                    eVarRequireActivity.getClass();
                                    d900Var.d(eVarRequireActivity);
                                    return Unit.a;
                                }
                            };
                            aVar3.r(objY4);
                        }
                        z6y.b(c8yVar, function1, function2, (Function0) objY4, aVar3, 8);
                        return unit;
                    }
                }, true);
                o2g o2gVar = o2g.a;
                o2gVar.getClass();
                m2g m2gVar = m2g.a;
                hhx.a(ghxVar, jq40.a(n6y.class), o2gVar, m2gVar, null, null, null, null, op8Var);
                hhx.a(ghxVar, jq40.a(NuveiDepositRouter$JumpBankScreen.class), o2gVar, m2gVar, null, null, null, null, new op8(-468092865, new iaj() { // from class: j6y
                    @Override // defpackage.iaj
                    public final Object d(Object obj4, Object obj5, Object obj6, Object obj7) {
                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj6;
                        ((Integer) obj7).getClass();
                        ((pf0) obj4).getClass();
                        ((ifx) obj5).getClass();
                        com.sportybet.android.globalpay.nuvei.deposit.a aVar4 = aVar2;
                        WebViewWrapperServiceImpl webViewWrapperServiceImpl = aVar4.G;
                        if (webViewWrapperServiceImpl == null) {
                            Intrinsics.n("webViewWrapperService");
                            throw null;
                        }
                        hjx hjxVar2 = hjxVar;
                        boolean zA = aVar3.A(hjxVar2);
                        Object objY = aVar3.y();
                        androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new l6y(hjxVar2, 0);
                            aVar3.r(objY);
                        }
                        Function0 function0 = (Function0) objY;
                        boolean zA2 = aVar3.A(aVar4);
                        Object objY2 = aVar3.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new n5f(aVar4, 1);
                            aVar3.r(objY2);
                        }
                        igp.b(webViewWrapperServiceImpl, function0, (Function0) objY2, null, aVar3, 0);
                        return Unit.a;
                    }
                }, true));
                break;
        }
        return Unit.a;
    }
}
