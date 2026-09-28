package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.multifactorauth.MFAViewModel", f = "MFAViewModel.kt", l = {347, 348}, m = "safelyEmitMFAEvent", v = 2)
public final class ycu extends x1b {
    public fcu a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ocu c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycu(ocu ocuVar, x1b x1bVar) {
        super(x1bVar);
        this.c = ocuVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.y1(null, this);
    }
}
