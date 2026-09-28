package defpackage;

import android.content.Context;
import com.sportybet.plugin.realsports.search.SearchFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vy2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vy2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(vc60.c.a);
                break;
            case 1:
                ohp<Object>[] ohpVarArr = SearchFragment.V;
                Context context = ((uhd0) obj).a.getContext();
                context.getClass();
                gby.c(context);
                break;
            default:
                ((yp40) obj).a = false;
                break;
        }
        return Unit.a;
    }
}
