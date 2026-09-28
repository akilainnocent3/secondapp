package defpackage;

import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public final class oih0 implements u8z.a {
    public final /* synthetic */ qih0 a;

    public oih0(qih0 qih0Var) {
        this.a = qih0Var;
    }

    @Override // u8z.a
    public final boolean a(Outcome outcome) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        ajh0 ajh0Var = this.a.d;
        if (ajh0Var == null || (bigDecimal = ajh0Var.e().a) == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        if (ajh0Var == null || (bigDecimal2 = ajh0Var.e().b) == null) {
            bigDecimal2 = BigDecimal.ZERO;
        }
        bigDecimal.getClass();
        bigDecimal2.getClass();
        String str = outcome.odds;
        str.getClass();
        return zog.i(str, bigDecimal, bigDecimal2);
    }

    @Override // u8z.a
    public final void b(OutcomeButton outcomeButton) {
        this.a.a(outcomeButton);
    }
}
