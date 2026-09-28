package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$betPanelTopWarningHint$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q2r extends tje0 implements jaj<String, s2q, qxp, yxq, v1b<? super s2q>, Object> {
    public /* synthetic */ String a;
    public /* synthetic */ s2q b;
    public /* synthetic */ qxp c;
    public /* synthetic */ yxq d;
    public final /* synthetic */ f2r e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2r(v1b v1bVar, f2r f2rVar) {
        super(5, v1bVar);
        this.e = f2rVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        String str = this.a;
        s2q s2qVar = this.b;
        qxp qxpVar = this.c;
        yxq yxqVar = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (s2qVar instanceof s2q.b) {
            return s2q.a.a;
        }
        try {
            zi50.a aVar = zi50.b;
            bVar = new rkd0(new BigDecimal(str));
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        rkd0 rkd0Var = (rkd0) bVar;
        BigDecimal bigDecimal = rkd0Var != null ? rkd0Var.a : null;
        if (bigDecimal == null) {
            rkd0.Companion.getClass();
            bigDecimal = rkd0.b;
        }
        BigDecimal bigDecimal2 = qxpVar.h;
        if (bigDecimal2 != null && yxqVar != null) {
            BigDecimal bigDecimalMultiply = yxqVar.f.multiply(bigDecimal);
            bigDecimalMultiply.getClass();
            rkd0.a aVar3 = rkd0.Companion;
            if (bigDecimal2.compareTo(bigDecimalMultiply) < 0) {
                StringUiText stringUiText = vch0.a;
                return new s2q.b(new ResourceUiText(R.string.page_lucky_numbers__max_payout_reached_warning));
            }
        }
        return s2q.a.a;
    }

    @Override // defpackage.jaj
    public final Object l(String str, s2q s2qVar, qxp qxpVar, yxq yxqVar, v1b<? super s2q> v1bVar) {
        q2r q2rVar = new q2r(v1bVar, this.e);
        q2rVar.a = str;
        q2rVar.b = s2qVar;
        q2rVar.c = qxpVar;
        q2rVar.d = yxqVar;
        return q2rVar.invokeSuspend(Unit.a);
    }
}
