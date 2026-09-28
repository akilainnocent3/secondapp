package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class px10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ px10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zy10 zy10Var = (zy10) obj2;
                if (((Boolean) obj).booleanValue()) {
                    zy10Var.w0();
                }
                break;
            default:
                ((foa0) obj2).c.j(AnalyticsEvent.BI_TRACKING_KIND_ERROR);
                break;
        }
        return Unit.a;
    }
}
