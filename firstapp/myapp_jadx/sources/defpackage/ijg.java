package defpackage;

import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.event.view.LiveEventMatchWebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ijg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ py1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ijg(py1 py1Var, Object obj, int i) {
        this.a = i;
        this.b = py1Var;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        py1 py1Var = this.b;
        switch (i) {
            case 0:
                EventActivity eventActivity = (EventActivity) py1Var;
                LiveEventMatchWebView liveEventMatchWebView = (LiveEventMatchWebView) obj;
                int i2 = EventActivity.U0;
                if (!eventActivity.isFinishing() && !eventActivity.m0 && liveEventMatchWebView.getVisibility() == 8) {
                    liveEventMatchWebView.setActive(false);
                }
                liveEventMatchWebView.setOnPageFinishedListener(null);
                break;
            default:
                MatchEventActivity matchEventActivity = (MatchEventActivity) py1Var;
                int i3 = MatchEventActivity.a0;
                matchEventActivity.I1().L.a();
                matchEventActivity.M1((String) obj);
                break;
        }
        return Unit.a;
    }
}
