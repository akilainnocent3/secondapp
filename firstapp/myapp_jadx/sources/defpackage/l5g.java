package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootball.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l5g implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l5g(Object obj, int i) {
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
                return ((n5g) obj).a.getAll();
            case 1:
                ((Function1) obj).invoke(b.q.c.a);
                return Unit.a;
            default:
                fpb0 fpb0Var = (fpb0) obj;
                fpb0Var.f.invoke(3);
                wwd0 wwd0Var = fpb0Var.h.a;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, xqb0.a((xqb0) value, wqb0.d, vqb0.d.a, null, 4)));
                lei0 lei0Var = fpb0Var.e;
                lei0Var.getClass();
                ej5.c(o8i0.d(lei0Var), null, null, new jei0(lei0Var, null), 3);
                return Unit.a;
        }
    }
}
