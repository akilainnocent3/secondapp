package defpackage;

import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mtc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mtc(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                oyc oycVar = (oyc) obj;
                Long lF = oycVar.f();
                lF.getClass();
                long jLongValue = lF.longValue();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(jLongValue);
                Long lE = oycVar.e();
                lE.getClass();
                long jLongValue2 = lE.longValue();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(jLongValue2);
                ((Function2) obj2).invoke(calendar, calendar2);
                return Unit.a;
            default:
                j590 j590Var = (j590) obj2;
                v5b v5bVar = (v5b) obj;
                if (j590Var.e.d.invoke(k590.c).booleanValue()) {
                    ej5.c(v5bVar, null, null, new r1w(j590Var, null), 3);
                }
                return Boolean.TRUE;
        }
    }
}
