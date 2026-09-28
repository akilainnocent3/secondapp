package defpackage;

import android.widget.CheckBox;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f23 implements Function2 {
    public final /* synthetic */ BetSlipFooter a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ CheckBox c;

    public /* synthetic */ f23(BetSlipFooter betSlipFooter, TextView textView, CheckBox checkBox) {
        this.a = betSlipFooter;
        this.b = textView;
        this.c = checkBox;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        huy huyVar;
        huy huyVar2 = (huy) obj;
        avy avyVar = (avy) obj2;
        int i = BetSlipFooter.j0;
        BetSlipFooter betSlipFooter = this.a;
        betSlipFooter.getClass();
        TextView textView = this.b;
        BetSlipFooter.o(textView, true);
        if (huyVar2 == null || avyVar == null) {
            return Unit.a;
        }
        betSlipFooter.a0 = true;
        betSlipFooter.d0 = betSlipFooter.c0;
        int iOrdinal = avyVar.ordinal();
        CheckBox checkBox = this.c;
        if (iOrdinal == 0) {
            checkBox.setChecked(true);
            textView.setText(sn5.c(betSlipFooter, R.string.common_bet_ways__1up, new Object[0]));
            huyVar = huy.a;
        } else if (iOrdinal != 1) {
            checkBox.setChecked(false);
            huyVar = betSlipFooter.W;
        } else {
            checkBox.setChecked(true);
            textView.setText(sn5.c(betSlipFooter, R.string.common_bet_ways__2up, new Object[0]));
            huyVar = huy.b;
        }
        betSlipFooter.W = huyVar;
        betSlipFooter.c0 = avyVar;
        betSlipFooter.b0 = avyVar;
        betSlipFooter.f0.onClick(checkBox);
        to3 to3Var = betSlipFooter.H;
        if (to3Var != null) {
            to3Var.B(avyVar);
        }
        return Unit.a;
    }
}
