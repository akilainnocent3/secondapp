package defpackage;

import android.accounts.Account;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nuu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nuu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                tuu tuuVar = (tuu) obj;
                kde0 kde0VarX = tuuVar.c.x();
                Account account = tuuVar.d.getAccount();
                return kde0VarX.a(account != null ? account.name : null);
            default:
                ((qub0) obj).e2();
                return Unit.a;
        }
    }
}
