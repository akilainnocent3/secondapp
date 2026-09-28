package defpackage;

import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;
import com.sportybet.plugin.realsports.betslip.widget.header.BetSlipHeader;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o43 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o43(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                cz3 cz3Var = (cz3) obj;
                int i2 = BetSlipHeader.U;
                cz3Var.getClass();
                Function1<? super cz3, Unit> function1 = ((BetSlipHeader) obj2).onBetSlipTypeChanged;
                if (function1 != null) {
                    function1.invoke(cz3Var);
                }
                return Unit.a;
            case 1:
                ((snp) obj).getClass();
                ((k4i) obj2).t(false);
                return Unit.a;
            case 2:
                MatchEventDetailActivity matchEventDetailActivity = (MatchEventDetailActivity) obj2;
                int iIntValue = ((Integer) obj).intValue();
                int i3 = MatchEventDetailActivity.U;
                List<rh2> listE = matchEventDetailActivity.I1().b.e();
                if (iIntValue >= 0 && iIntValue < listE.size()) {
                    matchEventDetailActivity.I1().b(listE.get(iIntValue));
                }
                return Unit.a;
            default:
                zpz zpzVar = (zpz) obj2;
                dlx dlxVar = (dlx) obj;
                c5a0.e.getClass();
                c5a0 c5a0VarA = c5a0.a.a();
                Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
                c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
                try {
                    dlxVar.a(zpzVar.e);
                    Unit unit = Unit.a;
                    return Unit.a;
                } finally {
                    c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                }
        }
    }
}
