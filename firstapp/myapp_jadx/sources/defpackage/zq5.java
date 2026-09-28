package defpackage;

import com.google.protobuf.RuntimeVersion;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.latam.signup.domain.CURPValidator", f = "CURPValidator.kt", l = {RuntimeVersion.MINOR}, m = "validate", v = 2)
public final class zq5 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ar5 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq5(ar5 ar5Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ar5Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, false, null, this);
    }
}
