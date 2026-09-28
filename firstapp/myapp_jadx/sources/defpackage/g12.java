package defpackage;

import android.view.View;
import com.sportybet.android.fileprovider.MyFileProvider;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity.e;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity.f;
import com.sportybet.plugin.realsports.prematch.widget.MarketsTabs;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g12 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ py1 b;

    public /* synthetic */ g12(py1 py1Var, int i) {
        this.a = i;
        this.b = py1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        py1 py1Var = this.b;
        switch (i) {
            case 0:
                i12 i12Var = (i12) py1Var;
                int i2 = i12.f;
                String strH = yrh0.h(i12Var);
                int i3 = MyFileProvider.v;
                return mkh.c(i12Var, strH, new File(MyFileProvider.b.a(), i12Var.z1()));
            default:
                PreMatchSportActivity preMatchSportActivity = (PreMatchSportActivity) py1Var;
                hjd0 hjd0Var = preMatchSportActivity.b;
                if (hjd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                MarketsTabs marketsTabs = hjd0Var.F;
                if (hjd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                OneUpTwoUpSwitch oneUpTwoUpSwitch = hjd0Var.G;
                if (hjd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                OUEarlyGoalsSwitch oUEarlyGoalsSwitch = hjd0Var.H;
                if (hjd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                View view = hjd0Var.D;
                if (hjd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                BubbleView bubbleView = hjd0Var.E;
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
                npg npgVar = preMatchSportActivity.J;
                if (npgVar == null) {
                    Intrinsics.n("eventListDeepLinkMarketResolver");
                    throw null;
                }
                xhh0 xhh0Var = preMatchSportActivity.F;
                if (xhh0Var == null) {
                    Intrinsics.n("upMarketTabUseCase");
                    throw null;
                }
                zhh0 zhh0Var = preMatchSportActivity.G;
                if (zhh0Var == null) {
                    Intrinsics.n("upPageToggleStateUseCase");
                    throw null;
                }
                a8z a8zVar = preMatchSportActivity.c;
                if (a8zVar == null) {
                    Intrinsics.n("outcomeBoostResolver");
                    throw null;
                }
                muh muhVar = preMatchSportActivity.d;
                if (muhVar != null) {
                    return new ej20(marketsTabs, oneUpTwoUpSwitch, oUEarlyGoalsSwitch, view, bubbleView, iuyVar, mjfVar, npgVar, xhh0Var, zhh0Var, a8zVar, muhVar, new bl20(preMatchSportActivity), new cl20(preMatchSportActivity), new dl20(preMatchSportActivity), preMatchSportActivity.new e(), preMatchSportActivity.new f(), (ity) preMatchSportActivity.O.getValue());
                }
                Intrinsics.n("flashBoostViewTracker");
                throw null;
        }
    }
}
