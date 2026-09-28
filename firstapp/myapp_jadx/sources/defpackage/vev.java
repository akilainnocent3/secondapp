package defpackage;

import android.content.Context;
import com.sporty.android.core.model.bet.edit.ErrorDataInfo;
import com.sportygames.sportyherocompose.components.SHRangeComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vev implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vev(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ErrorDataInfo) obj).getClass();
                ((wev) obj2).a.e(o7d.a(wae.ME_SPORTS_BET_HISTORY_IN_MAIN_TAB));
                return Unit.a;
            default:
                a6c0 a6c0Var = (a6c0) obj2;
                Context context = (Context) obj;
                context.getClass();
                SHRangeComponent sHRangeComponent = new SHRangeComponent(context, null);
                a6c0Var.l = sHRangeComponent;
                a6c0Var.d();
                return sHRangeComponent;
        }
    }
}
