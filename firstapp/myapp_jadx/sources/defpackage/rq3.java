package defpackage;

import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rq3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rq3(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                wq3 wq3Var = (wq3) obj3;
                ComposeView composeView = (ComposeView) obj2;
                gm3 gm3Var = (gm3) obj;
                if (wq3Var.U) {
                    iai0.a(composeView);
                    gm3Var.b = null;
                    wq3Var.G = null;
                    wq3Var.P = null;
                }
                wq3Var.U = false;
                break;
            default:
                ((ci00) obj3).z1(AnalyticsEvent.SOCIAL_CODECHAT_CTA_OPENBETS_CLICKED);
                ((Function1) obj2).invoke(((hv7) obj).a);
                break;
        }
        return Unit.a;
    }
}
