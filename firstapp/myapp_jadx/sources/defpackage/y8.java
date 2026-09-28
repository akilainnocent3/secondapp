package defpackage;

import android.accounts.Account;

/* JADX INFO: loaded from: classes6.dex */
public final class y8 implements x8 {
    public final uqm a;

    public y8(uqm uqmVar) {
        this.a = uqmVar;
    }

    @Override // defpackage.x8
    public final v8 getAccountInfo() {
        Account account = this.a.getAccount();
        if (account == null) {
            return null;
        }
        String str = account.name;
        str.getClass();
        return new v8(str);
    }
}
