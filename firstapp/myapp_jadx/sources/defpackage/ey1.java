package defpackage;

import com.sporty.android.core.model.patron.NameConfirmationStatus;
import com.sportybet.android.auth.BaseAccountAuthenticatorActivity;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ey1 implements lsm {
    public static int b(ijf0 ijf0Var, int i, int i2) {
        return (ijf0Var.hashCode() + i) * i2;
    }

    @Override // defpackage.lsm
    public void a(Object obj) {
        BaseAccountAuthenticatorActivity.lambda$onRegistrationKYCResult$0((NameConfirmationStatus) obj);
    }
}
