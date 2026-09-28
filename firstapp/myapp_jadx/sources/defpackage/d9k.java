package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import java.io.Serializable;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class d9k {
    public final mgb0 a;
    public final psm b;

    public d9k(psm psmVar, mgb0 mgb0Var) {
        mgb0Var.getClass();
        psmVar.getClass();
        this.a = mgb0Var;
        this.b = psmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(x1b x1bVar) {
        c9k c9kVar;
        if (x1bVar instanceof c9k) {
            c9kVar = (c9k) x1bVar;
            int i = c9kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c9kVar.c = i - Integer.MIN_VALUE;
            } else {
                c9kVar = new c9k(this, x1bVar);
            }
        } else {
            c9kVar = new c9k(this, x1bVar);
        }
        Object objC = c9kVar.a;
        y5b y5bVar = y5b.a;
        int i2 = c9kVar.c;
        if (i2 == 0) {
            uj50.b(objC);
            if (!this.b.F()) {
                zi50.a aVar = zi50.b;
                return new zi50.b(new vzg());
            }
            lyh<AccountInfo> accountInfoFlow = this.a.getAccountInfoFlow();
            c9kVar.c = 1;
            objC = s0i.c(accountInfoFlow, c9kVar);
            if (objC == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objC);
        }
        AccountInfo accountInfo = (AccountInfo) objC;
        int i3 = 0;
        if (accountInfo != null && !StringsKt.U(accountInfo.getFirstName()) && !StringsKt.U(accountInfo.getLastName())) {
            i3 = 1;
        }
        zi50.a aVar2 = zi50.b;
        return new Integer(i3 ^ 1);
    }
}
