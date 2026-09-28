package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.network.metadata.ShouldCollectMaidUseCase", f = "ShouldCollectMaidUseCase.kt", l = {19}, m = "invoke", v = 2)
public final class t890 extends x1b {
    public BOConfigParam a;
    public Boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ u890 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t890(u890 u890Var, x1b x1bVar) {
        super(x1bVar);
        this.d = u890Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
