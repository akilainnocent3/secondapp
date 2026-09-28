package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.GhKycDialogAnTestManager", f = "GhKycDialogAnTestManager.kt", l = {24}, m = "resolveVariant", v = 2)
public final class fhk extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ hhk b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhk(hhk hhkVar, x1b x1bVar) {
        super(x1bVar);
        this.b = hhkVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
