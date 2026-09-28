package defpackage;

import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.prematch.data.EventDetailsNavigation;
import com.sportybet.plugin.realsports.prematch.data.NavigationUiEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mr6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mr6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Event event;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((rr6) obj).dismissAllowingStateLoss();
                break;
            case 1:
                ((ywj) obj).q0().x1();
                break;
            default:
                of20 of20Var = ((PreMatchEventActivity) obj).R0;
                if (of20Var != null && (event = of20Var.m0) != null) {
                    of20Var.e0.m(new NavigationUiEvent.PreMatchNavigation(event, EventDetailsNavigation.NEXT));
                }
                break;
        }
        return Unit.a;
    }
}
