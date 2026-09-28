package defpackage;

import com.sporty.android.core.model.account.AccountActivationData;
import com.sportybet.android.account.AccountActivationActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AccountActivationActivity accountActivationActivity = (AccountActivationActivity) obj2;
                String str = (String) obj;
                if (str != null) {
                    AccountActivationData accountActivationData = accountActivationActivity.y;
                    if (accountActivationData == null) {
                        Intrinsics.n("accountActivationData");
                        throw null;
                    }
                    accountActivationData.setStatus(str);
                    accountActivationActivity.A1();
                } else {
                    int i2 = AccountActivationActivity.z;
                }
                return Unit.a;
            default:
                gz00 gz00Var = (gz00) obj;
                gz00Var.getClass();
                ((Function1) obj2).invoke(new q5z.t(gz00Var));
                return Unit.a;
        }
    }
}
