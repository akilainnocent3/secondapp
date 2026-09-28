package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class z5g implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z5g(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(((qmt) obj).getValue().floatValue());
            default:
                fpb0 fpb0Var = (fpb0) obj;
                fpb0Var.f.invoke(2);
                Unit unit = Unit.a;
                wwd0 wwd0Var = fpb0Var.h.a;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, xqb0.a((xqb0) value, wqb0.c, vqb0.d.a, null, 4)));
                m28 m28Var = fpb0Var.c;
                String string = fpb0Var.a.getString(R.string.payout_amount);
                string.getClass();
                m28Var.getClass();
                ej5.c(o8i0.d(m28Var), null, null, new j28(m28Var, string, null), 3);
                return Unit.a;
        }
    }
}
