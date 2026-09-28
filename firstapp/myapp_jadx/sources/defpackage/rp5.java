package defpackage;

import java.io.Reader;
import okhttp3.Response;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.cms.CMSUpdateUseCase", f = "CMSUpdateUseCase.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING}, m = "downloadPage", v = 2)
public final class rp5 extends x1b {
    public Response a;
    public Reader b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xp5 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp5(xp5 xp5Var, x1b x1bVar) {
        super(x1bVar);
        this.d = xp5Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(0L, null, null, this);
    }
}
