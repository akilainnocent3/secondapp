package defpackage;

import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.share.manager.ShareImageProviderImpl", f = "ShareImageProviderImpl.kt", l = {162}, m = "saveMxImage", v = 2)
public final class z090 extends x1b {
    public ResponseBody a;
    public tuw b;
    public /* synthetic */ Object c;
    public final /* synthetic */ u090 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z090(u090 u090Var, x1b x1bVar) {
        super(x1bVar);
        this.d = u090Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(null, this);
    }
}
