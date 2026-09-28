package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.searchv2.data.repository.SearchRepositoryImpl", f = "SearchRepositoryImpl.kt", l = {68}, m = "getSearchConfig", v = 2)
public final class hx70 extends x1b {
    public BOConfigParam a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lx70 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx70(lx70 lx70Var, x1b x1bVar) {
        super(x1bVar);
        this.c = lx70Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
