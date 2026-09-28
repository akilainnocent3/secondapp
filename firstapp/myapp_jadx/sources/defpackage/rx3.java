package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.BetslipThemeMissionBottomSheetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rx3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rx3(BetslipThemeMissionBottomSheetActivity betslipThemeMissionBottomSheetActivity, ytw ytwVar) {
        this.a = 0;
        this.b = betslipThemeMissionBottomSheetActivity;
        this.c = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                final BetslipThemeMissionBottomSheetActivity betslipThemeMissionBottomSheetActivity = (BetslipThemeMissionBottomSheetActivity) obj4;
                final twd0 twd0Var = (twd0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = BetslipThemeMissionBottomSheetActivity.d;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ay3 ay3Var = (ay3) twd0Var.getValue();
                    boolean zA = aVar.A(betslipThemeMissionBottomSheetActivity);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new sx3(betslipThemeMissionBottomSheetActivity, 0);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zM = aVar.M(twd0Var) | aVar.A(betslipThemeMissionBottomSheetActivity);
                    Object objY2 = aVar.y();
                    if (zM || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: tx3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i3 = BetslipThemeMissionBottomSheetActivity.d;
                                by3 by3Var = ((ay3) twd0Var.getValue()).e;
                                by3 by3Var2 = by3.a;
                                BetslipThemeMissionBottomSheetActivity betslipThemeMissionBottomSheetActivity2 = betslipThemeMissionBottomSheetActivity;
                                if (by3Var == by3Var2) {
                                    betslipThemeMissionBottomSheetActivity2.z1().x1(com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.a.C0384a.a);
                                } else {
                                    betslipThemeMissionBottomSheetActivity2.z1().x1(com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.a.c.a);
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA2 = aVar.A(betslipThemeMissionBottomSheetActivity);
                    Object objY3 = aVar.y();
                    if (zA2 || objY3 == c0042a) {
                        objY3 = new ux3(betslipThemeMissionBottomSheetActivity, 0);
                        aVar.r(objY3);
                    }
                    zx3.a(null, ay3Var, function0, function1, (Function0) objY3, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                bdr.b(qj40.a(1), (a) obj, (Function0) obj4, (Function1) obj3);
                break;
            default:
                ((Integer) obj2).getClass();
                fm00.j((ijf0) obj4, (Function1) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ rx3(Object obj, Function1 function1, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = function1;
    }
}
