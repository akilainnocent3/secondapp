package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.bethistory.presentation.LNBetHistoryViewModel$settledFilter$1", f = "LNBetHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class uyp extends tje0 implements gaj<ojq, rjq, v1b<? super pjq>, Object> {
    public /* synthetic */ ojq a;
    public /* synthetic */ rjq b;

    @Override // defpackage.gaj
    public final Object invoke(ojq ojqVar, rjq rjqVar, v1b<? super pjq> v1bVar) {
        uyp uypVar = new uyp(3, v1bVar);
        uypVar.a = ojqVar;
        uypVar.b = rjqVar;
        return uypVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        tjq.b bVar;
        ojq ojqVar = this.a;
        rjq rjqVar = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = rjqVar instanceof rjq.b;
        ojqVar.getClass();
        int iOrdinal = ojqVar.ordinal();
        if (iOrdinal == 0) {
            StringUiText stringUiText = vch0.a;
            bVar = new tjq.b(new ResourceUiText(R.string.common_functions__all), ojqVar);
        } else if (iOrdinal == 1) {
            StringUiText stringUiText2 = vch0.a;
            bVar = new tjq.b(new ResourceUiText(R.string.bet_history__unsettled), ojqVar);
        } else {
            if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                uhc.a();
                return null;
            }
            StringUiText stringUiText3 = vch0.a;
            bVar = new tjq.b(new ResourceUiText(R.string.bet_history__settled), ojqVar);
        }
        return new pjq(bVar, z, true, true);
    }
}
