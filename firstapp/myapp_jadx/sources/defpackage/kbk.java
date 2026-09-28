package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.domain.GetPixQrCodeUseCase", f = "GetPixQrCodeUseCase.kt", l = {17, 20}, m = "invoke-gIAlu-s", v = 2)
public final class kbk extends x1b {
    public String a;
    public qf10 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ lbk d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbk(lbk lbkVar, x1b x1bVar) {
        super(x1bVar);
        this.d = lbkVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objA = this.d.a(null, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
