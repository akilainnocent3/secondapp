package defpackage;

import com.google.protobuf.RuntimeVersion;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.domain.UpdateStreamUseCase", f = "UpdateStreamUseCase.kt", l = {RuntimeVersion.MINOR}, m = "invoke", v = 2)
public final class xkh0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ wkh0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkh0(wkh0 wkh0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = wkh0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
