package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.push.PushManager", f = "PushManager.kt", l = {33}, m = "createToken", v = 2)
public final class ia30 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ka30 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia30(ka30 ka30Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ka30Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
