package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d81 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d81(Object obj, int i) {
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
                vb00 vb00Var = (vb00) obj;
                return Boolean.valueOf((vb00Var.a.getValue() == null || vb00Var.b.getValue() == null || vb00Var.c.getValue() == null || vb00Var.d.getValue() == null || vb00Var.e.getValue() == null) ? false : true);
            default:
                a1b0 a1b0Var = (a1b0) obj;
                op5 op5Var = op5.a;
                String string = a1b0Var.getString(R.string.key_fbg_only_one_market);
                string.getClass();
                String string2 = a1b0Var.getString(R.string.free_bet_gift_use_allows_only_one_market);
                string2.getClass();
                op5Var.getClass();
                a1b0Var.P0(op5.b(string, string2, null));
                return Unit.a;
        }
    }
}
