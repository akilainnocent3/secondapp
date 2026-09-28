package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.common.framework.datastore.PreferenceDataStoreImpl", f = "PreferenceDataStoreImpl.kt", l = {28}, m = "getValue", v = 1)
public final class kn20<T> extends x1b {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mn20 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn20(mn20 mn20Var, x1b x1bVar) {
        super(x1bVar);
        this.c = mn20Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(null, null, this);
    }
}
