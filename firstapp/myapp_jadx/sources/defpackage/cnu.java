package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.ManageAccountUiManagerImpl", f = "ManageAccountUiManager.kt", l = {158}, m = "requestSetAssetIdOrder", v = 2)
public final class cnu extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xmu c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnu(xmu xmuVar, x1b x1bVar) {
        super(x1bVar);
        this.c = xmuVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
