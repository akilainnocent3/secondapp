package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.account.telegram.TelegramBindingActionType;
import com.sporty.android.core.model.account.telegram.TelegramBotInfo;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvaf0;", "Lj8i0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vaf0 extends j8i0 {
    public final t340 A;
    public final lyz a;
    public final uqm b;
    public final psm c;
    public final bnh0 d;
    public final mgb0 e;
    public boolean f;
    public final wwd0 i;
    public final v340 v;
    public final wwd0 w;
    public final v340 y;
    public final ku90<naf0> z;

    public vaf0(lyz lyzVar, uqm uqmVar, psm psmVar, bnh0 bnh0Var, mgb0 mgb0Var) {
        lyzVar.getClass();
        uqmVar.getClass();
        psmVar.getClass();
        bnh0Var.getClass();
        mgb0Var.getClass();
        this.a = lyzVar;
        this.b = uqmVar;
        this.c = psmVar;
        this.d = bnh0Var;
        this.e = mgb0Var;
        wwd0 wwd0VarA = xwd0.a(new qaf0(0));
        this.i = wwd0VarA;
        this.v = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.w = wwd0VarA2;
        this.y = e1i.b(wwd0VarA2);
        ku90<naf0> ku90Var = new ku90<>();
        this.z = ku90Var;
        this.A = e1i.a(ku90Var);
    }

    public final void x1(paf0 paf0Var) {
        wwd0 wwd0Var;
        Object value;
        paf0Var.getClass();
        if (paf0Var instanceof paf0.a) {
            ej5.c(o8i0.d(this), null, null, new taf0(this, TelegramBindingActionType.Bind, null), 3);
            return;
        }
        if (paf0Var instanceof paf0.e) {
            ej5.c(o8i0.d(this), null, null, new taf0(this, TelegramBindingActionType.Unbind, null), 3);
            return;
        }
        boolean z = paf0Var instanceof paf0.b;
        lyz lyzVar = this.a;
        if (z) {
            lyh<BaseResponse<TelegramBotInfo>> lyhVarF0 = lyzVar.F0();
            StringUiText stringUiText = vch0.a;
            kzh.d(new saf0(bm50.b(lyhVarF0, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again)), this), o8i0.d(this));
        } else if (paf0Var instanceof paf0.c) {
            lyh<BaseResponse<Unit>> lyhVarC = lyzVar.C();
            StringUiText stringUiText2 = vch0.a;
            kzh.d(new uaf0(bm50.c(lyhVarC, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again)), this), o8i0.d(this));
        } else {
            if (!(paf0Var instanceof paf0.d)) {
                uhc.a();
                return;
            }
            do {
                wwd0Var = this.w;
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, null));
            Unit unit = Unit.a;
        }
    }
}
