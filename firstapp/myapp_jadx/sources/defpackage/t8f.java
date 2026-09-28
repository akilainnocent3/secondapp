package defpackage;

import com.sporty.android.book.domain.entity.Selection;
import com.sporty.android.platform.features.loyalty.LoyaltyActivity;
import com.sportybet.plugin.event.e;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t8f implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t8f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                m020 m020Var = (m020) obj;
                ((Function2) obj2).invoke(m020Var, Float.valueOf(Float.intBitsToFloat((int) (ovo.h(m020Var, false) & 4294967295L))));
                m020Var.a();
                return Unit.a;
            case 1:
                wae waeVar = (wae) obj;
                int i2 = LoyaltyActivity.f;
                waeVar.getClass();
                azm azmVar = ((LoyaltyActivity) obj2).c;
                if (azmVar != null) {
                    azmVar.d(waeVar);
                    return Unit.a;
                }
                Intrinsics.n("iRouter");
                throw null;
            default:
                Selection selection = (Selection) obj;
                int i3 = PreMatchEventActivity.a2;
                selection.getClass();
                ((e) obj2).S1(new com.sportybet.plugin.realsports.betslip.Selection(apg.i(selection.getEvent()), vpu.k(selection.getMarket()), i8z.c(selection.getOutcome())), false);
                return Unit.a;
        }
    }
}
