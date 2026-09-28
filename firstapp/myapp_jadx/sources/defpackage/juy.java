package defpackage;

import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.onetwoup.data.OneUpTwoUpConfigManagerImpl", f = "OneUpTwoUpConfigManagerImpl.kt", l = {HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS, 43}, m = "fetchOneXTwoUpConfig", v = 2)
public final class juy extends x1b {
    public quw a;
    public /* synthetic */ Object b;
    public final /* synthetic */ luy c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juy(luy luyVar, x1b x1bVar) {
        super(x1bVar);
        this.c = luyVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(this);
    }
}
