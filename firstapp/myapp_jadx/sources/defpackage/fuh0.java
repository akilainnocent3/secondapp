package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.domain.ValidateUserCpfUseCase", f = "ValidateUserCpfUseCase.kt", l = {12}, m = "invoke-gIAlu-s", v = 2)
public final class fuh0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ guh0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fuh0(guh0 guh0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = guh0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Serializable serializableA = this.b.a(null, this);
        return serializableA == y5b.a ? serializableA : new zi50(serializableA);
    }
}
