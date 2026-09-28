package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.datastore.Preference", f = "PreferenceDataStoreExt.kt", l = {65, 69, 70, 71, 72, 73, 74}, m = "get", v = 2)
public final class xm20 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ wm20<Object> b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm20(wm20 wm20Var, x1b x1bVar) {
        super(x1bVar);
        this.b = wm20Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(this);
    }
}
