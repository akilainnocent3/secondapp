package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.platform.features.security.newdevicelogin.loginalert.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class aht implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ aht(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(a.C0209a.a);
                f00 f00Var = vgb0.a;
                vgb0.a(AnalyticsEvent.FORCE_LOGOUT_CANCEL);
                break;
            default:
                function1.invoke(new vc60.g(false));
                break;
        }
        return Unit.a;
    }
}
