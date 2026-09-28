package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class agw implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ agw(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(((ngw) obj).a().getColor(R.color.icon_inverse_brand_sub_secondary));
            case 1:
                ((Function1) obj).invoke(q5z.c.a);
                return Unit.a;
            case 2:
                return Integer.valueOf(((qcn) obj).size());
            default:
                int i2 = TxListActivity.K;
                o7h0 o7h0VarA1 = ((TxListActivity) obj).A1();
                ej5.c(o8i0.d(o7h0VarA1), null, null, new u7h0(null, o7h0VarA1), 3);
                return Unit.a;
        }
    }
}
