package defpackage;

import android.util.Pair;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.settings.notification.matchalert.presentation.MatchAlertViewModel$clickSearchEvents$1", f = "MatchAlertViewModel.kt", l = {165}, m = "invokeSuspend", v = 2)
public final class svu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rvu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svu(rvu rvuVar, v1b<? super svu> v1bVar) {
        super(2, v1bVar);
        this.b = rvuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new svu(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((svu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objF;
        y5b y5bVar = y5b.a;
        int i = this.a;
        rvu rvuVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            if (((Boolean) rvuVar.y.getValue()).booleanValue()) {
                rvuVar.c.k(wae.EVENT_LIST_HOST, new Pair[]{new Pair("sportId", "sr:sport:1"), new Pair("timeline", "-1")}, null);
                return Unit.a;
            }
            ku90<a> ku90Var = rvuVar.e;
            StringUiText stringUiText = vch0.a;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.wap_setting__enable_notification_alert_title);
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.wap_setting__enable_notification_alert_content);
            ResourceUiText resourceUiText3 = new ResourceUiText(R.string.wap_setting__go_to_settings);
            ResourceUiText resourceUiText4 = new ResourceUiText(R.string.common_functions__later);
            this.a = 1;
            objF = b.f(ku90Var, resourceUiText, null, resourceUiText2, resourceUiText3, resourceUiText4, null, null, this, 226);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objF = obj;
        }
        if (((AlertDialogCallbackType) objF) instanceof AlertDialogCallbackType.Positive) {
            rvuVar.y1();
        }
        return Unit.a;
    }
}
