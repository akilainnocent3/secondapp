package defpackage;

import android.accounts.Account;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hx7 {
    public final Account a;

    public hx7(Account account) {
        this.a = account;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hx7) && Intrinsics.g(this.a, ((hx7) obj).a);
    }

    public final int hashCode() {
        Account account = this.a;
        if (account == null) {
            return 0;
        }
        return account.hashCode();
    }

    public final String toString() {
        return "AccountChanged(account=" + this.a + ")";
    }
}
