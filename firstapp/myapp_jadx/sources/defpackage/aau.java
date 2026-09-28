package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class aau implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aau(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(x8u.a.a);
                break;
            case 1:
                ((Function2) obj).invoke(0, vch0.a);
                break;
            default:
                ((irj0) obj).y1();
                f00 f00Var = vgb0.a;
                vgb0.a(AnalyticsEvent.WITHDRAWAL_REVIEW_CONFIRM_CLICKED);
                break;
        }
        return Unit.a;
    }
}
