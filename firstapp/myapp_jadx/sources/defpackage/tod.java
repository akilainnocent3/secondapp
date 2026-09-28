package defpackage;

import com.sportybet.android.instantwin.presentation.racingevent.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tod implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tod(Object obj, int i) {
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
                wwd0 wwd0Var = ((jpd) obj).P0().A0;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, rw1.c));
                break;
            default:
                Function1 function1 = (Function1) obj;
                function1.invoke(c.j.a.a);
                function1.invoke(c.i.a);
                break;
        }
        return Unit.a;
    }
}
