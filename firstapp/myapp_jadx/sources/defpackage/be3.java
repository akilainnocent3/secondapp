package defpackage;

import androidx.fragment.app.e;
import com.appsflyer.internal.u;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.instantwin.presentation.instantwin.view.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class be3 implements a.InterfaceC0272a {
    public final /* synthetic */ yd3 a;

    public be3(yd3 yd3Var) {
        this.a = yd3Var;
    }

    @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a.InterfaceC0272a
    public final void a() {
        yd3 yd3Var = this.a;
        if (yd3Var.i == null) {
            Intrinsics.n("legacyInstantWinUtil");
            throw null;
        }
        uqm uqmVar = yd3Var.f;
        if (uqmVar == null) {
            Intrinsics.n("accountHelper");
            throw null;
        }
        e eVarRequireActivity = yd3Var.requireActivity();
        eVarRequireActivity.getClass();
        i5s.c(uqmVar, eVarRequireActivity, new xd3(yd3Var), false);
        rdd0 rdd0Var = yd3Var.L;
        if (rdd0Var != null) {
            rdd0Var.a(new a5o.g0(u.a(AnalyticsParam.CONTENT_TYPE, "bet_history_event_page"), 0), k00.b, k00.a, k00.c);
        } else {
            Intrinsics.n("sportyTrackingUseCase");
            throw null;
        }
    }
}
