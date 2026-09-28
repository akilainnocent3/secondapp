package defpackage;

import com.sporty.android.core.model.config.VersionData;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.update.viewmodel.VersionCheckViewModel", f = "VersionCheckViewModel.kt", l = {133, 138}, m = "checkAndGetUpdateData", v = 2)
public final class x1i0 extends x1b {
    public VersionData a;
    public /* synthetic */ Object b;
    public final /* synthetic */ y1i0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1i0(y1i0 y1i0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = y1i0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.x1(this);
    }
}
