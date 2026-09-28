package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.globalpay.stp.spei.withdraw.pending.WithdrawalPendingActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ylb0.t;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class plb0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ plb0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        a.C0041a.C0042a c0042a = a.C0041a.a;
        Object obj3 = this.b;
        int i2 = 2;
        switch (i) {
            case 0:
                final ylb0 ylb0Var = (ylb0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ytw ytwVarC = wyh.c(ylb0Var.D3().A, aVar, 0, 7);
                    ytw ytwVarC2 = wyh.c(ylb0Var.D3().C, aVar, 0, 7);
                    ytw ytwVarC3 = wyh.c(ylb0Var.D3().E, aVar, 0, 7);
                    Boolean boolValueOf = Boolean.valueOf(((List) ytwVarC.getValue()).isEmpty());
                    boolean zM = aVar.M(ytwVarC) | aVar.A(ylb0Var);
                    Object objY = aVar.y();
                    if (zM || objY == c0042a) {
                        objY = ylb0Var.new t(ytwVarC, null);
                        aVar.r(objY);
                    }
                    xvf.e(aVar, boolValueOf, (Function2) objY);
                    if (((List) ytwVarC.getValue()).isEmpty()) {
                        aVar.N(-211471960);
                    } else {
                        aVar.N(-181317206);
                        List list = (List) ytwVarC.getValue();
                        String str = (String) ytwVarC2.getValue();
                        boolean zBooleanValue = ((Boolean) ytwVarC3.getValue()).booleanValue();
                        boolean zA = aVar.A(ylb0Var);
                        Object objY2 = aVar.y();
                        if (zA || objY2 == c0042a) {
                            objY2 = new rd7(ylb0Var, i2);
                            aVar.r(objY2);
                        }
                        Function1 function1 = (Function1) objY2;
                        boolean zA2 = aVar.A(ylb0Var);
                        Object objY3 = aVar.y();
                        if (zA2 || objY3 == c0042a) {
                            objY3 = new Function0() { // from class: dlb0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    ylb0Var.D3().z1(true);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY3);
                        }
                        ur4.b(list, str, zBooleanValue, function1, (Function0) objY3, aVar, 0);
                    }
                    aVar.H();
                } else {
                    aVar.G();
                }
                break;
            default:
                WithdrawalPendingActivity withdrawalPendingActivity = (WithdrawalPendingActivity) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i3 = WithdrawalPendingActivity.c;
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    vsj0 vsj0Var = (vsj0) withdrawalPendingActivity.b.getValue();
                    boolean zA3 = aVar2.A(withdrawalPendingActivity);
                    Object objY4 = aVar2.y();
                    if (zA3 || objY4 == c0042a) {
                        objY4 = new af2(withdrawalPendingActivity, 1);
                        aVar2.r(objY4);
                    }
                    Function0 function0 = (Function0) objY4;
                    boolean zA4 = aVar2.A(withdrawalPendingActivity);
                    Object objY5 = aVar2.y();
                    if (zA4 || objY5 == c0042a) {
                        objY5 = new bf2(withdrawalPendingActivity, 2);
                        aVar2.r(objY5);
                    }
                    tsj0.e(vsj0Var, function0, (Function0) objY5, aVar2, 8);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
