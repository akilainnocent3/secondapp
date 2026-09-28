package defpackage;

import androidx.compose.ui.layout.y;
import com.sportybet.android.globalpay.pixBtg.deposit.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dmi implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dmi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                ((isw) obj2).A(Float.intBitsToFloat((int) (eb9.d(urrVar) & 4294967295L)));
                return Unit.a;
            case 1:
                long jLongValue = ((Long) obj).longValue();
                s9e0 s9e0Var = s9e0.a;
                String strH = ((g) obj2).i.h(jLongValue);
                s9e0Var.getClass();
                return c.p(strH, " ", "", false);
            case 2:
                y.a.A((y.a) obj, (y) obj2, 0, 0);
                return Unit.a;
            default:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(str.equalsIgnoreCase((String) ((dq40) obj2).a));
        }
    }
}
