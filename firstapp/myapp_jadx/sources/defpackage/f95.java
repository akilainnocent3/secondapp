package defpackage;

import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.register.presentation.br.BrRegistrationSuccessfulViewModel", f = "BrRegistrationSuccessfulViewModel.kt", l = {92, HttpStatusCodesKt.HTTP_EARLY_HINTS}, m = "loadContent", v = 2)
public final class f95 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ d95 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f95(d95 d95Var, x1b x1bVar) {
        super(x1bVar);
        this.b = d95Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        int i = d95.B;
        return this.b.y1(this);
    }
}
