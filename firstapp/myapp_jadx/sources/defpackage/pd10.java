package defpackage;

import com.sportybet.android.globalpay.pixBtg.withdraw.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pd10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pd10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                s9e0 s9e0Var = s9e0.a;
                String strH = ((h) obj2).f.h(jLongValue);
                s9e0Var.getClass();
                return c.p(strH, " ", "", false);
            default:
                ((osw) obj2).k((int) (((jxo) obj).a & 4294967295L));
                return Unit.a;
        }
    }
}
