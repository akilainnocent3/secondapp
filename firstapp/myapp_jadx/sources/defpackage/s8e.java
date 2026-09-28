package defpackage;

import com.sporty.android.core.model.pocket.deposit.DepositRequest;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.uiprocess.DepositUiProcess", f = "DepositUiProcess.kt", l = {182, 202, 212, 217}, m = "invoke", v = 2)
public final class s8e extends x1b {
    public DepositRequest a;
    public vtw b;
    public vtw c;
    public w7e d;
    public /* synthetic */ Object e;
    public final /* synthetic */ f9e f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8e(f9e f9eVar, x1b x1bVar) {
        super(x1bVar);
        this.f = f9eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.a(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this);
    }
}
