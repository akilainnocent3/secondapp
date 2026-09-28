package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jms implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jms(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(((xms) obj).c.getColor(R.color.absolute_type2));
            default:
                s6x s6xVar = (s6x) obj;
                ej5.c(o8i0.d(s6xVar), null, null, new t6x(true, s6xVar, new q6x(), null), 3);
                return Unit.a;
        }
    }
}
