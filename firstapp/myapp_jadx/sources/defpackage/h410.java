package defpackage;

import com.sportybet.android.cashoutphase3.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h410 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h410(int i, Object obj, Object obj2) {
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
                m410 m410Var = (m410) obj2;
                cgb.a(m410Var.P0(), m410Var.F0, "placeBet", (String) obj);
                break;
            default:
                xsw xswVar = (xsw) obj2;
                mjh0 mjh0Var = (mjh0) obj;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - xswVar.u() >= 350) {
                    xswVar.K(jCurrentTimeMillis);
                    b bVar = mjh0Var.c.a;
                    if (bVar.r0) {
                        ej5.c(ebs.a(bVar.getLifecycle()), null, null, new fl6(bVar, null), 3);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
