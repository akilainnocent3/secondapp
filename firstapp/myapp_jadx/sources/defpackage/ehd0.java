package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.UserNote;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.viewholder.SprCashOutMatchBriefPhase3ComposeViewKt$getCashOutMatchBriefData$2", f = "SprCashOutMatchBriefPhase3ComposeView.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ehd0 extends tje0 implements Function2<v5b, v1b<? super yl6>, Object> {
    public final /* synthetic */ hwu a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ xo6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehd0(hwu hwuVar, Context context, xo6 xo6Var, v1b<? super ehd0> v1bVar) {
        super(2, v1bVar);
        this.a = hwuVar;
        this.b = context;
        this.c = xo6Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ehd0(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super yl6> v1bVar) {
        return ((ehd0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        mn6 aVar;
        mn6.a aVar2;
        mn6 mn6Var;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        hwu hwuVar = this.a;
        pl6 pl6Var = hwuVar.a;
        if (pl6Var == null) {
            return new yl6(null, null, null, null, null, 63);
        }
        j7g j7gVar = new j7g();
        Context context = this.b;
        Pair pair = (Pair) CollectionsKt.U(((LinkedHashMap) pl6Var.b(context)).values());
        if (pair == null || (charSequence = (CharSequence) pair.a) == null) {
            charSequence = "";
        }
        j7gVar.e(context.getColor(R.color.absolute_type2), charSequence);
        int color = context.getColor(R.color.text_type1_secondary);
        Bet bet = pl6Var.a;
        j7g j7gVar2 = new j7g();
        j7gVar2.e(color, sn5.b(context, R.string.common_functions__stake, new Object[0]));
        j7gVar2.a(" ");
        String str = bet.stake;
        Locale locale = Locale.US;
        j7gVar2.b(bjb0.P(str, locale));
        String str2 = pl6Var.a.orderId;
        str2.getClass();
        UserNote userNote = pl6Var.a.userNote;
        String noteText = userNote != null ? userNote.getNoteText() : null;
        pl6 pl6Var2 = hwuVar.a;
        if (pl6Var2 != null) {
            Bet bet2 = pl6Var2.a;
            if (pl6Var2.v) {
                aVar2 = new mn6.a(24, Boolean.FALSE, c.p(sn5.b(context, R.string.cashout__cashout_succeeded, new Object[0]), " ", "\n", false), null);
            } else {
                boolean z = bet2.isCalcByFE ? bet2.isCashAbleJS : bet2.isCashable;
                if (bet2.isJsCalcFailed || bet2.isCashoutAmountNotAcquired) {
                    aVar = new mn6.a(24, Boolean.TRUE, sn5.b(context, R.string.cashout__cashout, new Object[0]), "");
                } else if (z) {
                    xo6 xo6Var = this.c;
                    if (rm2.e(bet2, xo6Var)) {
                        aVar2 = new mn6.a(8, Boolean.FALSE, c.p(sn5.b(context, R.string.cashout__cashout_unavailable, new Object[0]), " ", "\n", false), bet2.maxCashOutAmount);
                    } else if (hwuVar.b) {
                        aVar2 = new mn6.a(16, Boolean.TRUE, c.s(sn5.b(context, R.string.cashout__cashout_amount_card, a8b.d(), bjb0.P(bet2.maxCashOutAmount, locale)), " ", "\n"), bet2.maxCashOutAmount);
                    } else if (rm2.g(bet2, xo6Var)) {
                        aVar = new mn6.a(24, Boolean.TRUE, sn5.b(context, R.string.cashout__cashout, new Object[0]), "");
                    } else {
                        aVar2 = new mn6.a(24, Boolean.TRUE, c.s(sn5.b(context, R.string.cashout__cashout_amount_card, a8b.d(), bjb0.P(bet2.maxCashOutAmount, locale)), " ", "\n"), bet2.maxCashOutAmount);
                    }
                } else {
                    aVar2 = new mn6.a(8, Boolean.FALSE, c.p(sn5.b(context, R.string.cashout__cashout_unavailable, new Object[0]), " ", "\n", false), bet2.maxCashOutAmount);
                }
            }
            mn6Var = aVar2;
            return new yl6(j7gVar, j7gVar2, str2, noteText, mn6Var, 4);
        }
        aVar = mn6.b.a;
        mn6Var = aVar;
        return new yl6(j7gVar, j7gVar2, str2, noteText, mn6Var, 4);
    }
}
