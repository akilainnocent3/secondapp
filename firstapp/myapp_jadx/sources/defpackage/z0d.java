package defpackage;

import com.sporty.android.sportynews.ui.SportyMediaHostFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z0d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z0d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yfx.h((hjx) obj, c2d.d.INSTANCE, null, 6);
                return Unit.a;
            default:
                return ((hrc0) ((SportyMediaHostFragment) obj).y.getValue()).b;
        }
    }
}
