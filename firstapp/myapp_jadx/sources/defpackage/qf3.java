package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportybet.plugin.realsports.betslip.widget.f;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class qf3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qf3(a.i iVar, e eVar) {
        this.a = 1;
        this.b = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        f.a aVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                BetslipActivity betslipActivity = (BetslipActivity) obj;
                Set<g08> set = BetslipActivity.X2;
                betslipActivity.S1().J.setVisibility(8);
                HashSet<f.a> hashSet = f.a;
                f.b(f.a.c);
                Stack<f.a> stack = f.b;
                if (stack.isEmpty()) {
                    aVar = f.a.a;
                } else {
                    f.a aVarPeek = stack.peek();
                    aVarPeek.getClass();
                    aVar = aVarPeek;
                }
                if (aVar == f.a.d) {
                    betslipActivity.S1().L.setVisibility(0);
                } else {
                    betslipActivity.S1().E.setRemoveAllBtnEnabled(!(betslipActivity.S1().U.a.getVisibility() == 0));
                    betslipActivity.S1().V.a.setVisibility(0);
                }
                break;
            case 1:
                ((a.i) obj).f.invoke();
                break;
            default:
                q1c0 q1c0Var = (q1c0) obj;
                if (q1c0Var.K1()) {
                    q1c0Var.Q0 = q1c0.a.c;
                    q1c0Var.a2();
                } else {
                    q1c0Var.Y1(false);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ qf3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
