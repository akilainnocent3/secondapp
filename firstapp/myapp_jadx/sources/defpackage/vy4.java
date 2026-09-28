package defpackage;

import androidx.recyclerview.widget.r;
import com.sportybet.android.globalpay.pixBtg.deposit.f;
import com.sportybet.android.globalpay.pixBtg.deposit.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vy4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vy4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        fz4 fz4Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                yy4 yy4Var = (yy4) obj2;
                gz4 gz4VarK = yy4.k(yy4Var, ((Integer) obj).intValue());
                if (gz4VarK != null && (fz4Var = yy4Var.b) != null) {
                    fz4Var.a(new ez4.b(gz4VarK.a));
                }
                return Unit.a;
            default:
                g gVar = (g) obj2;
                f.c cVar = (f.c) obj;
                cVar.getClass();
                String strF = gVar.f.f();
                shl shlVar = cVar.c;
                s9e0 s9e0Var = s9e0.a;
                xsm xsmVar = gVar.i;
                String strI = xsmVar.i(z600.a().c.a, true);
                s9e0Var.getClass();
                return f.c.a(cVar, strF, 0.0d, shl.a(shlVar, null, c.p(strI, " ", "", false), c.p(xsmVar.i(z600.a().c.b, true), " ", "", false), null, 57), null, null, null, null, null, r.d.DEFAULT_SWIPE_ANIMATION_DURATION);
        }
    }
}
