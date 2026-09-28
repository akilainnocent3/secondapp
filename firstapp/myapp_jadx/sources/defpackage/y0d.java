package defpackage;

import com.sporty.android.sportynews.ui.SportyMediaHostFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y0d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y0d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yfx.h((hjx) obj, c2d.i.INSTANCE, null, 6);
                return Unit.a;
            case 1:
                return ((hrc0) ((SportyMediaHostFragment) obj).y.getValue()).a;
            default:
                ((Function0) obj).invoke();
                return Unit.a;
        }
    }
}
