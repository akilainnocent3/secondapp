package defpackage;

import com.sporty.android.sportynews.ui.SportyNewsArticleDetailFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bw00 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bw00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((vx00) obj).y1();
                return Unit.a;
            default:
                ohp<Object>[] ohpVarArr = SportyNewsArticleDetailFragment.N;
                return Integer.valueOf(((asc0) ((SportyNewsArticleDetailFragment) obj).y.getValue()).b);
        }
    }
}
