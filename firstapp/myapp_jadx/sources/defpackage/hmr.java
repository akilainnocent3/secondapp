package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.language.LanguageUtil", f = "LanguageUtil.kt", l = {141, 145, 173}, m = "refreshLanguageList", v = 2)
public final class hmr extends x1b {
    public CountryCodeName a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jmr d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmr(jmr jmrVar, x1b x1bVar) {
        super(x1bVar);
        this.d = jmrVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(null, this);
    }
}
