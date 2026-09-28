package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.showoff.InstantVirtualShowOffDialogFragment", f = "InstantVirtualShowOffDialogFragment.kt", l = {337}, m = "generateBitmapWithPicture", v = 2)
public final class r5o extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ q5o b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5o(q5o q5oVar, x1b x1bVar) {
        super(x1bVar);
        this.b = q5oVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.m0(null, this);
    }
}
