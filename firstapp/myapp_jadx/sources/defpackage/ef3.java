package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportybet.plugin.realsports.data.Event;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ef3 implements Function1 {
    public final /* synthetic */ BetslipActivity a;
    public final /* synthetic */ BigDecimal b;

    public /* synthetic */ ef3(BetslipActivity betslipActivity, BigDecimal bigDecimal) {
        this.a = betslipActivity;
        this.b = bigDecimal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        x8z x8zVar = (x8z) obj;
        Set<g08> set = BetslipActivity.X2;
        x8zVar.getClass();
        boolean z = x8zVar instanceof x8z.b;
        BetslipActivity betslipActivity = this.a;
        if (z) {
            betslipActivity.T1 = true;
            q73 q73VarQ1 = betslipActivity.Q1();
            x8z.b bVar = (x8z.b) x8zVar;
            List<Event> list = bVar.a;
            aak aakVar = aak.a;
            List<Selection> list2 = bVar.b;
            long j = bVar.c;
            long j2 = bVar.d;
            list.getClass();
            list2.getClass();
            ej5.c(o8i0.d(q73VarQ1), null, null, new a83(q73VarQ1, list, list2, j, j2, null), 3);
        } else {
            betslipActivity.v3(true, this.b);
        }
        return Unit.a;
    }
}
