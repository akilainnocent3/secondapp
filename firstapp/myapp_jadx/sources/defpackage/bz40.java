package defpackage;

import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.register.presentation.RegistrationSuccessfulViewModel", f = "RegistrationSuccessfulViewModel.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING}, m = "applyPendingReferralCode", v = 2)
public final class bz40 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ az40 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz40(az40 az40Var, x1b x1bVar) {
        super(x1bVar);
        this.b = az40Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.x1(this);
    }
}
