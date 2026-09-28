package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.biometric.data.repository.BiometricCryptoRepositoryImpl", f = "BiometricCryptoRepositoryImpl.kt", l = {173}, m = "validateCryptoLayer", v = 2)
public final class xc4 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ yc4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc4(yc4 yc4Var, x1b x1bVar) {
        super(x1bVar);
        this.b = yc4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.h(null, this);
    }
}
