package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fif implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8i0 b;

    public /* synthetic */ fif(j8i0 j8i0Var, int i) {
        this.a = i;
        this.b = j8i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        j8i0 j8i0Var = this.b;
        switch (i) {
            case 0:
                AccountInfo accountInfo = ((sif) j8i0Var).T0.getAccountInfo();
                return accountInfo != null ? oxc.a(accountInfo.getFirstName(), " ", accountInfo.getLastName()) : "";
            default:
                ujp ujpVar = (ujp) j8i0Var;
                d100 d100Var = ujpVar.a;
                log0 log0Var = ujpVar.b;
                if (log0Var != null) {
                    return e1i.e(new zl50(d100Var.H(log0Var)), o8i0.d(ujpVar), q490.a.a, null);
                }
                Intrinsics.n("tradeType");
                throw null;
        }
    }
}
