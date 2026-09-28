package defpackage;

import com.sportybet.android.globalpay.pixBtg.deposit.a;
import com.sportybet.android.globalpay.pixBtg.deposit.c;
import com.sportybet.android.globalpay.pixBtg.deposit.e;
import com.sportybet.android.globalpay.pixBtg.deposit.f;
import com.sportybet.android.globalpay.pixBtg.deposit.g;
import com.sportybet.android.globalpay.pixBtg.deposit.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x710 extends saj implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x710(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                aVar.getClass();
                g gVar = (g) this.receiver;
                gVar.getClass();
                if (aVar.equals(a.d.a)) {
                    gVar.H1(new iz4(1));
                } else if (aVar.equals(a.e.a)) {
                    gVar.H1(new y810(0));
                    gVar.F1(false);
                } else if (aVar.equals(a.f.a)) {
                    gVar.H1(new trn(1));
                } else if (aVar.equals(a.g.a)) {
                    gVar.H1(new urn(1));
                    gVar.F1(true);
                } else if (aVar.equals(a.h.a)) {
                    gVar.H1(new m810());
                } else if (aVar.equals(a.i.a)) {
                    gVar.H1(new n810());
                    gVar.F1(true);
                } else if (aVar.equals(a.j.a)) {
                    gVar.H1(new o810());
                } else if (aVar.equals(a.C0231a.a)) {
                    ej5.c(o8i0.d(gVar), null, null, new m910(gVar, null), 3);
                } else if (aVar.equals(a.b.a)) {
                    gVar.H1(new x810());
                } else if (aVar.equals(a.l.a) || aVar.equals(a.m.a)) {
                    qe10 qe10VarA1 = gVar.A1();
                    int i = qe10VarA1.i;
                    ebk.a aVar2 = qe10VarA1.g;
                    if (aVar2 == null) {
                        Intrinsics.n("pendingDepositsResult");
                        throw null;
                    }
                    if (i >= aVar2.b) {
                        qe10VarA1.c.invoke(c.f.a);
                    } else {
                        pe10 pe10Var = new pe10();
                        ztw<f> ztwVar = qe10VarA1.b;
                        et7 et7Var = qe10VarA1.a;
                        ztwVar.getClass();
                        e.a(ztwVar, et7Var, new h810(pe10Var, 0));
                    }
                } else if (aVar instanceof a.k) {
                    ej5.c(o8i0.d(gVar), null, null, new m(gVar, aVar, null), 3);
                } else {
                    if (!aVar.equals(a.c.a)) {
                        uhc.a();
                        return null;
                    }
                    gVar.H1(new p810());
                }
                return Unit.a;
            default:
                ss90 ss90Var = (ss90) obj;
                ss90Var.getClass();
                ((jr90) this.receiver).h1(ss90Var);
                return Unit.a;
        }
    }
}
