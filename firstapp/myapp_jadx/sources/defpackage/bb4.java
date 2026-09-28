package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.biometric.presentation.verification.BioAuthVerificationViewModel", f = "BioAuthVerificationViewModel.kt", l = {72}, m = "startBiometricTokenEnrollment", v = 2)
public final class bb4 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ cb4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb4(cb4 cb4Var, x1b x1bVar) {
        super(x1bVar);
        this.b = cb4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.x1(null, null, null, this);
    }
}
