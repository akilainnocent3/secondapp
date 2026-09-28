package defpackage;

import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ops implements Function1 {
    public final /* synthetic */ LivePageActivity a;

    public /* synthetic */ ops(LivePageActivity livePageActivity) {
        this.a = livePageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        int i = LivePageActivity.b0;
        list.getClass();
        LivePageActivity livePageActivity = this.a;
        RegularMarketRule regularMarketRule = livePageActivity.G1().i0;
        if (regularMarketRule == null) {
            return Unit.a;
        }
        djh0 djh0Var = livePageActivity.R;
        if (djh0Var != null) {
            djh0Var.r.clear();
        }
        djh0 djh0Var2 = livePageActivity.R;
        if (djh0Var2 != null) {
            sih0 sih0Var = djh0Var2.u;
            OneUpTwoUpSwitch oneUpTwoUpSwitch = sih0Var != null ? sih0Var.y : null;
            if (oneUpTwoUpSwitch != null) {
                hih0.c(oneUpTwoUpSwitch, avy.c, false, true);
            }
        }
        djh0 djh0Var3 = livePageActivity.R;
        if (djh0Var3 != null) {
            sih0 sih0Var2 = djh0Var3.u;
            OUEarlyGoalsSwitch oUEarlyGoalsSwitch = sih0Var2 != null ? sih0Var2.z : null;
            if (oUEarlyGoalsSwitch != null) {
                oUEarlyGoalsSwitch.setState(false, false, true);
            }
        }
        djh0 djh0Var4 = livePageActivity.R;
        if (djh0Var4 != null) {
            djh0Var4.w = regularMarketRule;
            k48.a(djh0Var4.l, list);
        }
        return Unit.a;
    }
}
