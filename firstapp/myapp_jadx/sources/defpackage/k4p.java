package defpackage;

import android.accounts.Account;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class k4p {
    public final uqm a;
    public final eko b;

    public k4p(uqm uqmVar, eko ekoVar) {
        uqmVar.getClass();
        ekoVar.getClass();
        this.a = uqmVar;
        this.b = ekoVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, zdo zdoVar, x1b x1bVar) {
        h4p h4pVar;
        if (x1bVar instanceof h4p) {
            h4pVar = (h4p) x1bVar;
            int i = h4pVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                h4pVar.d = i - Integer.MIN_VALUE;
            } else {
                h4pVar = new h4p(this, x1bVar);
            }
        } else {
            h4pVar = new h4p(this, x1bVar);
        }
        Object objA = h4pVar.b;
        Object obj = y5b.a;
        int i2 = h4pVar.d;
        if (i2 == 0) {
            uj50.b(objA);
            uqm uqmVar = this.a;
            Account account = uqmVar.getAccount();
            String lastAccessToken = uqmVar.getLastAccessToken();
            if (account == null || lastAccessToken == null || lastAccessToken.length() == 0) {
                zdoVar.invoke();
                return Unit.a;
            }
            h4pVar.a = zdoVar;
            h4pVar.d = 1;
            objA = this.b.a(lastAccessToken, str);
            if (objA != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objA);
                return objA;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        zdoVar = h4pVar.a;
        uj50.b(objA);
        yzh yzhVar = new yzh(new g1i(bm50.a((lyh) objA), new i4p(zdoVar, null)), new j4p(zdoVar, null));
        h4pVar.a = null;
        h4pVar.d = 2;
        Object objA2 = kzh.a(yzhVar, h4pVar);
        return objA2 == obj ? obj : objA2;
    }
}
