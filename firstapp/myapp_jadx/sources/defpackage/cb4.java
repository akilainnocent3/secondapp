package defpackage;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcb4;", "Lj8i0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cb4 extends j8i0 {
    public final oc4 a;
    public final uqm b;
    public final String c;
    public final wwd0 d;
    public final v340 e;

    public cb4(oc4 oc4Var, uqm uqmVar, vu60 vu60Var) {
        oc4Var.getClass();
        uqmVar.getClass();
        vu60Var.getClass();
        this.a = oc4Var;
        this.b = uqmVar;
        Object objB = vu60Var.b("bio_auth_token");
        if (objB == null) {
            ib5.a("Required value was null.");
            throw null;
        }
        this.c = (String) objB;
        wwd0 wwd0VarA = xwd0.a(new ya4(0));
        this.d = wwd0VarA;
        this.e = e1i.b(wwd0VarA);
        ej5.c(o8i0.d(this), null, null, new ab4(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x1(String str, String str2, qd4.c cVar, x1b x1bVar) {
        bb4 bb4Var;
        Object value;
        if (x1bVar instanceof bb4) {
            bb4Var = (bb4) x1bVar;
            int i = bb4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bb4Var.c = i - Integer.MIN_VALUE;
            } else {
                bb4Var = new bb4(this, x1bVar);
            }
        } else {
            bb4Var = new bb4(this, x1bVar);
        }
        Object obj = bb4Var.a;
        y5b y5bVar = y5b.a;
        int i2 = bb4Var.c;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                oc4 oc4Var = this.a;
                bb4Var.c = 1;
                if (oc4Var.e(str, cVar, str2, bb4Var) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            wwd0 wwd0Var = this.d;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, ya4.a((ya4) value, null, 0L, true, 3)));
            f00 f00Var = vgb0.a;
            Bundle bundle = new Bundle();
            bundle.putString("phone", this.b.getPhoneNumber());
            Unit unit = Unit.a;
            vgb0.b("bio_register_count", bundle);
        } catch (Exception e) {
            itf0.a.d("Error storing token: " + e, new Object[0]);
        }
        return Unit.a;
    }
}
