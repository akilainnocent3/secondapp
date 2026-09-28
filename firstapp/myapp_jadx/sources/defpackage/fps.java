package defpackage;

import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fps implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ LivePageActivity b;
    public final /* synthetic */ mfb0 c;

    public /* synthetic */ fps(boolean z, LivePageActivity livePageActivity, mfb0 mfb0Var) {
        this.a = z;
        this.b = livePageActivity;
        this.c = mfb0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RegularMarketRule regularMarketRule;
        List list = (List) obj;
        int i = LivePageActivity.b0;
        list.getClass();
        boolean z = this.a;
        LivePageActivity livePageActivity = this.b;
        if (z) {
            regularMarketRule = livePageActivity.G1().f0;
            if (regularMarketRule == null) {
                return Unit.a;
            }
        } else {
            regularMarketRule = livePageActivity.G1().C;
            if (regularMarketRule == null) {
                return Unit.a;
            }
        }
        if (z) {
            livePageActivity.G1().C = regularMarketRule;
        }
        xss xssVar = livePageActivity.Q;
        if (xssVar != null) {
            xssVar.C.clear();
            aos aosVar = xssVar.G;
            OneUpTwoUpSwitch oneUpTwoUpSwitch = aosVar != null ? aosVar.w : null;
            if (oneUpTwoUpSwitch != null) {
                hih0.c(oneUpTwoUpSwitch, avy.c, false, true);
            }
            aos aosVar2 = xssVar.G;
            OUEarlyGoalsSwitch oUEarlyGoalsSwitch = aosVar2 != null ? aosVar2.y : null;
            if (oUEarlyGoalsSwitch != null) {
                oUEarlyGoalsSwitch.setState(false, false, true);
            }
            xssVar.E = this.c;
            xss.D(xssVar, regularMarketRule, list, z, 4);
        }
        return Unit.a;
    }
}
