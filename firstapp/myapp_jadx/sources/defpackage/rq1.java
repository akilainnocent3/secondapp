package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.config.BOConfigSourceImpl", f = "BOConfigSourceImpl.kt", l = {52, 53}, m = "fetchConfigBundle", v = 2)
public final class rq1 extends x1b {
    public BOConfigValueBundle a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uq1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq1(uq1 uq1Var, x1b x1bVar) {
        super(x1bVar);
        this.c = uq1Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
