package defpackage;

import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.biometric.data.repository.BiometricCryptoRepositoryImpl", f = "BiometricCryptoRepositoryImpl.kt", l = {100, HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS}, m = "storeDataAndIV", v = 2)
public final class vc4 extends x1b {
    public String a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yc4 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc4(yc4 yc4Var, x1b x1bVar) {
        super(x1bVar);
        this.d = yc4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(null, null, null, this);
    }
}
