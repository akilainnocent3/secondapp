package defpackage;

import android.accounts.Account;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.patron.NameConfirmationStatus;
import com.sporty.android.core.model.security.twofa.TwoFAIndicatorPage;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class nev {
    public final /* synthetic */ t990 a;
    public final mgb0 b;
    public final uqm c;
    public final lyz d;
    public final m2l e;
    public final zfk f;
    public final z3k g;
    public final lyh<AccountInfo> h;
    public final lyh<Account> i;
    public final lyh<Integer> j;

    public nev(mgb0 mgb0Var, uqm uqmVar, lyz lyzVar, m2l m2lVar, zfk zfkVar, z3k z3kVar, t990 t990Var) {
        mgb0Var.getClass();
        uqmVar.getClass();
        lyzVar.getClass();
        m2lVar.getClass();
        zfkVar.getClass();
        z3kVar.getClass();
        this.a = t990Var;
        this.b = mgb0Var;
        this.c = uqmVar;
        this.d = lyzVar;
        this.e = m2lVar;
        this.f = zfkVar;
        this.g = z3kVar;
        this.h = mgb0Var.getAccountInfoFlow();
        this.i = mgb0Var.getAccountFlow();
        this.j = mgb0Var.getUserCertStatusFlow();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        lev levVar;
        if (x1bVar instanceof lev) {
            levVar = (lev) x1bVar;
            int i = levVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                levVar.c = i - Integer.MIN_VALUE;
            } else {
                levVar = new lev(this, x1bVar);
            }
        } else {
            levVar = new lev(this, x1bVar);
        }
        Object obj = levVar.a;
        y5b y5bVar = y5b.a;
        int i2 = levVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            if (!this.b.isLogin()) {
                return Unit.a;
            }
            lyh<lk50<NameConfirmationStatus>> lyhVarJ0 = this.d.j0(pu0.c.a);
            levVar.c = 1;
            if (bm50.p(lyhVarJ0, levVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) {
        mev mevVar;
        if (x1bVar instanceof mev) {
            mevVar = (mev) x1bVar;
            int i = mevVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mevVar.c = i - Integer.MIN_VALUE;
            } else {
                mevVar = new mev(this, x1bVar);
            }
        } else {
            mevVar = new mev(this, x1bVar);
        }
        Object obj = mevVar.a;
        y5b y5bVar = y5b.a;
        int i2 = mevVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            TwoFAIndicatorPage twoFAIndicatorPage = TwoFAIndicatorPage.Me;
            mevVar.c = 1;
            if (this.d.b0(twoFAIndicatorPage, mevVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
