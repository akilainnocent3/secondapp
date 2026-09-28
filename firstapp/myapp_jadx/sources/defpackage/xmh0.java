package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.environment.UrlConfigDataSource", f = "UrlConfigDataSource.kt", l = {72}, m = "readCachedRemoteDto", v = 2)
public final class xmh0 extends x1b {
    public CountryCodeName a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zmh0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmh0(zmh0 zmh0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = zmh0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
