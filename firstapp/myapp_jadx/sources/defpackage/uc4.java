package defpackage;

import com.sporty.android.core.model.security.biometric.CryptoPurpose;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.biometric.data.repository.BiometricCryptoRepositoryImpl", f = "BiometricCryptoRepositoryImpl.kt", l = {128}, m = "prepareAuthContext", v = 2)
public final class uc4 extends x1b {
    public CryptoPurpose a;
    public /* synthetic */ Object b;
    public final /* synthetic */ yc4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc4(yc4 yc4Var, x1b x1bVar) {
        super(x1bVar);
        this.c = yc4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
