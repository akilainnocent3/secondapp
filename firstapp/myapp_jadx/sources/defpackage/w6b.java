package defpackage;

import android.view.View;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity.c;
import com.sportybet.plugin.realsports.prematch.widget.LiveEventsRecyclerView;
import com.sportybet.plugin.realsports.prematch.widget.LiveTogglesContainer;
import com.sportybet.plugin.realsports.prematch.widget.MarketsTabs;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w6b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w6b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                return Unit.a;
            default:
                PreMatchSportActivity preMatchSportActivity = (PreMatchSportActivity) obj;
                hjd0 hjd0Var = preMatchSportActivity.b;
                if (hjd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                LiveTogglesContainer liveTogglesContainer = hjd0Var.B;
                if (hjd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                MarketsTabs marketsTabs = hjd0Var.v;
                if (hjd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                gid0 gid0Var = hjd0Var.w;
                if (hjd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                LiveEventsRecyclerView liveEventsRecyclerView = hjd0Var.A;
                if (hjd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                LoadingView loadingView = hjd0Var.e;
                if (hjd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                OneUpTwoUpSwitch oneUpTwoUpSwitch = hjd0Var.y;
                if (hjd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                OUEarlyGoalsSwitch oUEarlyGoalsSwitch = hjd0Var.z;
                if (hjd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                View view = hjd0Var.f;
                if (hjd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                BubbleView bubbleView = hjd0Var.i;
                iuy iuyVar = preMatchSportActivity.D;
                if (iuyVar == null) {
                    Intrinsics.n("oneUpTwoUpConfigManager");
                    throw null;
                }
                mjf mjfVar = preMatchSportActivity.E;
                if (mjfVar == null) {
                    Intrinsics.n("earlyPayoutConfigManager");
                    throw null;
                }
                xhh0 xhh0Var = preMatchSportActivity.F;
                if (xhh0Var == null) {
                    Intrinsics.n("upMarketTabUseCase");
                    throw null;
                }
                zhh0 zhh0Var = preMatchSportActivity.G;
                if (zhh0Var != null) {
                    return new its(preMatchSportActivity, liveTogglesContainer, marketsTabs, gid0Var, liveEventsRecyclerView, loadingView, oneUpTwoUpSwitch, oUEarlyGoalsSwitch, view, bubbleView, iuyVar, mjfVar, xhh0Var, zhh0Var, new p5b(preMatchSportActivity, 1), new wk20(preMatchSportActivity), new xk20(preMatchSportActivity, 0), preMatchSportActivity.new c());
                }
                Intrinsics.n("upPageToggleStateUseCase");
                throw null;
        }
    }
}
