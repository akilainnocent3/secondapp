package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.share.manager.WonPopupSharingManagerImpl", f = "WonPopupSharingManagerImpl.kt", l = {145}, m = "generateWinningPopupShareUriFromData", v = 2)
public final class iuj0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ euj0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iuj0(euj0 euj0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = euj0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, null, this);
    }
}
