package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.bookingcode.presentation.viewmodel.SocialShareViewModel", f = "SocialShareViewModel.kt", l = {199, 202}, m = "resolveShare", v = 2)
public final class uia0 extends x1b {
    public aga0 a;
    public x190 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ via0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uia0(via0 via0Var, x1b x1bVar) {
        super(x1bVar);
        this.d = via0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.y1(null, this);
    }
}
