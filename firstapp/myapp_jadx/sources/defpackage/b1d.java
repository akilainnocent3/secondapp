package defpackage;

import com.sporty.android.sportynews.ui.SportyMediaHostFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b1d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b1d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yfx.h((hjx) obj, c2d.n.INSTANCE, null, 6);
                return Unit.a;
            case 1:
                return Long.valueOf(((x890) obj).b.c("ongoing_session_reminder_days"));
            default:
                return Boolean.valueOf(((hrc0) ((SportyMediaHostFragment) obj).y.getValue()).d);
        }
    }
}
