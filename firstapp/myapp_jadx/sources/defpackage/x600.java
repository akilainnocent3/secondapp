package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.android.data.SimpleConverterResponseWrapper;

/* JADX INFO: loaded from: classes5.dex */
public final class x600 extends SimpleConverterResponseWrapper<Object, w600> {
    public final /* synthetic */ z600 a;

    public x600(z600 z600Var) {
        this.a = z600Var;
    }

    @Override // com.sportybet.android.data.SimpleConverterResponseWrapper
    public final w600 convert(bcp bcpVar) {
        z600 z600Var = this.a;
        psm psmVar = z600Var.a;
        if (psmVar.r()) {
            z600Var.d = bcpVar;
            String strB = psmVar.B();
            if (strB.isEmpty()) {
                return null;
            }
            ap0.g().U(strB).G(new y600(z600Var));
            return null;
        }
        w600.a aVar = new w600.a();
        aVar.a = dc8.e(0, bcpVar, z600Var.b.a * 10000) / 10000;
        aVar.b = dc8.e(1, bcpVar, z600Var.b.b * 10000) / 10000;
        aVar.c = dc8.e(2, bcpVar, z600Var.b.c * 10000) / 10000;
        long jE = dc8.e(3, bcpVar, z600Var.b.d * 10000) / 10000;
        long j = aVar.c;
        if (j >= 0) {
            long j2 = aVar.a;
            if (j2 >= 0 && jE >= 0) {
                long j3 = aVar.b;
                if (j3 >= 0) {
                    return new w600(j2, j3, j, jE);
                }
            }
        }
        ib5.a("incorrect payment config");
        return null;
    }

    @Override // com.sportybet.android.data.SimpleConverterResponseWrapper
    public final String getIdentifier() {
        return w600.class.getSimpleName();
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onFailure(Throwable th) {
        this.a.f.j(Boolean.FALSE);
    }

    @Override // com.sportybet.android.data.CallbackWrapper
    public final void onResponse() {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_CONFIG);
        aVar.a("payment config before sync: %s", z600.a().toString());
    }

    @Override // com.sportybet.android.data.CallbackWrapper
    public final void onResponseComplete() {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_CONFIG);
        aVar.a("payment config after sync: %s", z600.a().toString());
    }

    @Override // com.sportybet.android.data.SimpleConverterResponseWrapper
    public final void onSuccessData(w600 w600Var) {
        z600 z600Var = this.a;
        z600Var.b = w600Var;
        z600Var.g = System.currentTimeMillis();
        z600Var.f.j(Boolean.TRUE);
    }
}
