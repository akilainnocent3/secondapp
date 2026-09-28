package defpackage;

import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class iu10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iu10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lu10 lu10Var = (lu10) obj2;
                ((View) obj).getClass();
                s820 s820Var = (s820) lu10Var.b;
                if (s820Var != null) {
                    s820Var.c.setClickable(false);
                }
                s820 s820Var2 = (s820) lu10Var.b;
                if (s820Var2 != null) {
                    s820Var2.c.setAlpha(0.5f);
                }
                fb7.a.j(Boolean.TRUE);
                break;
            default:
                eoa0 eoa0Var = (eoa0) obj2;
                eoa0Var.x1();
                eoa0Var.c.j(AnalyticsEvent.BI_TRACKING_KIND_ERROR);
                break;
        }
        return Unit.a;
    }
}
