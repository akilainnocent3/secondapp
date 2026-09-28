package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.update.SportyAppUpdateManager", f = "SportyAppUpdateManager.kt", l = {161}, m = "startAutoDownloadProcess", v = 2)
public final class ehb0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ fhb0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehb0(fhb0 fhb0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = fhb0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.h(this);
    }
}
