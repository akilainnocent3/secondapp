package defpackage;

import com.sporty.android.sportynews.ui.SportyNewsVideoDetailFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d7n implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d7n(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(new uw00.b(lx00.c.a));
                return Unit.a;
            default:
                ohp<Object>[] ohpVarArr = SportyNewsVideoDetailFragment.X;
                return Integer.valueOf(((muc0) ((SportyNewsVideoDetailFragment) obj).y.getValue()).b);
        }
    }
}
