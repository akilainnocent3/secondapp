package defpackage;

import com.google.protobuf.RuntimeVersion;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.sportypicks.domain.usecase.SportyPicksConfigUseCase", f = "SportyPicksConfigUseCase.kt", l = {RuntimeVersion.MINOR}, m = "getConfig", v = 2)
public final class p6d0 extends x1b {
    public BOConfigParam a;
    public /* synthetic */ Object b;
    public final /* synthetic */ q6d0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6d0(q6d0 q6d0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = q6d0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
