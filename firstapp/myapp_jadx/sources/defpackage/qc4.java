package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.biometric.data.repository.BiometricCryptoRepositoryImpl", f = "BiometricCryptoRepositoryImpl.kt", l = {168, 169}, m = "clearToken", v = 2)
public final class qc4 extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ yc4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc4(yc4 yc4Var, x1b x1bVar) {
        super(x1bVar);
        this.c = yc4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(null, this);
    }
}
