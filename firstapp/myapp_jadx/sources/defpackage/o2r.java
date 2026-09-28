package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$betPanelStakeWarningHint$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o2r extends tje0 implements gaj<qrd0, qxp, v1b<? super s2q>, Object> {
    public /* synthetic */ qrd0 a;
    public /* synthetic */ qxp b;

    @Override // defpackage.gaj
    public final Object invoke(qrd0 qrd0Var, qxp qxpVar, v1b<? super s2q> v1bVar) {
        o2r o2rVar = new o2r(3, v1bVar);
        o2rVar.a = qrd0Var;
        o2rVar.b = qxpVar;
        return o2rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qrd0 qrd0Var = this.a;
        qxp qxpVar = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!(qrd0Var instanceof qrd0.c)) {
            return s2q.a.a;
        }
        Object[] objArr = {ukd0.a(2, qxpVar.f, false, true)};
        StringUiText stringUiText = vch0.a;
        return new s2q.b(new ResourceUiText(R.string.component_betslip__total_stake_cannot_exceed_vmaxstake, ay0.S(objArr)));
    }
}
