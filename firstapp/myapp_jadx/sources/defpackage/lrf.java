package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.playtimecontrol.confirmation.viewmodel.EditPlayTimeConfirmationViewModel", f = "EditPlayTimeConfirmationViewModel.kt", l = {131, 134, 142}, m = "callSelfExclusion", v = 2)
public final class lrf extends x1b {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mrf c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrf(mrf mrfVar, x1b x1bVar) {
        super(x1bVar);
        this.c = mrfVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.z1(0, this);
    }
}
